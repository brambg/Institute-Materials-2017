grammar LMNLb;
// Detailed LMNL syntax

// A document is in LMNL syntax if it satisfies the rules described in this page.
// A document in LMNL syntax maps to a LMNL document in a LMNL data model.

// ## Document

// Taken as a whole, a document in LMNL syntax must match the Document production.

// [1] Document ::= Prolog Content
document
  : prolog content
//  : content
  ;

// Note that as a consequence of these productions, an empty document is in fact recognised as a document
// in LMNL syntax. Indeed, any text document in UTF-8 or UTF-16 that does not contain any unescaped [ or {
// is recognised as a document in LMNL syntax.


// ## Character data and markup

// LMNL syntax contains intermixed character data and markup.

// Markup comes in two flavours: syntactic markup and semantic markup. Syntactic markup is markup that might not
// be passed through to an application, and consists of the LMNL declaration, namespace declarations, comments,
// and whitespace before the first character data or semantic markup in the document.
// Semantic markup must be passed through to an application, and consists o '{{#'and have tf start tags,
// end tags, empty tags, and atoms.

// Character data is all text in the document that is not markup.
BEGIN_OPEN
  : '['
  ;

END_OPEN
  : '}'
  ;

BEGIN_CLOSE
  : '{'
  ;

END_CLOSE
  : ']'
  ;

// [2] CharData ::= [^[{]*
fragment CharData
  : [^[{]*
  ;


// The character data will be part of the content of a Limen in the data model.


// ## Prolog

// The prolog of a document in LMNL syntax contains an optional LMNL declaration followed by any number
// of namespace declarations, and comments, which may be separated with whitespace.

// [3] Prolog ::= LMNLDeclaration? Misc*
prolog
  : lmnlDeclaration? misc*
  ;

// [4] Misc ::= NSDeclaration | Comment | S
misc
  : NSDeclaration
  | Comment
  | S
  ;

// Note: Production 5 no longer exists.


// ## Content

// The content of a document in LMNL syntax is any character data interspersed with tags, atoms,
// namespace declarations, and comments.

// [6] Content ::= CharData? ((Tag | Atom | NSDeclaration |
//                 Comment) CharData?)*
content
  : CharData? ((tag | atom | NSDeclaration | Comment) CharData?)*
  ;

// Within content, every start tag must have a matching end tag and vice versa. See the following section on
// tags for more details.

// ## Tags

// Tags indicate the starts and ends of ranges and annotations. There are three kinds of tags: start tags,
// which indicate the start of a range or annotation; end tags, which indicate the end of a range or annotation;
// and empty tags, which indicate a range with a length of 0 or an annotation whose value has no characters in
// its content.

// This section describes tags for ranges. Tags for annotations are described later.

// [7] Tag ::= StartTag | EndTag | EmptyTag
tag
  : startTag
  | endTag
  | emptyTag
  ;

// [8] StartTag ::= '[' TagContent '}'
startTag
  : BEGIN_OPEN tagContent END_OPEN
  ;

// [9] EndTag ::= '{' TagContent ']'
endTag
  : BEGIN_CLOSE tagContent END_CLOSE
  ;

// [10] EmptyTag ::= '[' TagContent ']'
emptyTag
  : BEGIN_OPEN tagContent END_CLOSE
  ;

// [11] TagContent ::= (TagName S?)? (IdentitySpec S?)? (S MetaData)? S?
tagContent
  : (TagName S?)? (IdentitySpec S?)? (S metadata)? S?
  ;

// Each StartTag must be paired with an EndTag that follows it within a piece of content.
// A StartTag and EndTag only match if they have matching tag names and matching tag identifiers.
// It is not an error if an EndTag matches more than one StartTag based on its name and identifier
// (although a parser should issue a warning if this occurs); in this case the EndTag matches the nearest
// StartTag (the one that occurs latest in the document prior to the EndTag).

// ## Tag Names

// The tag name indicates the name of the range represented by the EmptyTag or by the StartTag and EndTag pair. The tag name is a qualified name, which is resolved to provide the expanded name for the range.

// [12] TagName ::= QName
TagName
  : QName
  ;

// A StartTag and EndTag have matching tag names if the end tag does not have a tag name, or if neither tag
// has a tag name, or if the tag names of the two tags resolve to the same expanded name.

// Note that since, within a single document, a Prefix cannot be associated with more than one namespace name
// and a namespace name cannot be associated with more than one prefix, tag names can be matched on a
// character-by-character basis, without necessarily being resolved.

// ## Tag Identifiers

// The identifier of a tag is used to disambiguate situations where two ranges with the same name or two ranges
// without names overlap.

// [13] IdentitySpec ::= '=' S? Identifier
IdentitySpec
  : '=' S? Identifier
  ;

// [14] Identifier ::= Name
Identifier
  : Name
  ;

// A StartTag and EndTag have matching identifiers if neither tag has an identifier or if the two identifiers
// are equal.

// Tag identifiers must be unique within a document. Note that they are not carried through into the LMNL data
// model.

// ## Atoms

// The content of a document may contain atoms other than characters, such as images, audio, video and so on.
// Atoms have the notation:

// [15] Atom ::= '{{' (TagName S?)? (Metadata)? '}}' |
//               '{{#x' ( [0-9] | [A-F] | [a-f] )+ '}}' |
//               '{{#' ( 'lsqb' | 'lcub' | 'rsqb' | 'rcub' ) '}}'
atom
  : '{{' (TagName S?)? (metadata)? '}}'
  | '{{#x' ( '0'..'9' | 'A'..'F' | 'a'..'f' )+ '}}'
  | '{{#' ( 'lsqb' | 'lcub' | 'rsqb' | 'rcub' ) '}}'
  ;

// Atoms, like ranges, may have annotations, and are usually but not necessarily named.

// The first notation allows any atom to be specified. The second notation is shorthand for an atom whose name
// is lmnl:char and has a single codepoint annotation containing the hexadecimal number. Such atoms are exactly
// equivalent to the Unicode character which has that codepoint: {{#x41}} is the same as A in character content.
// This is how character data is treated in the data model as well.

// The notations
// {{#lsqb}}, {{#lcub}}, {{#rsqb}}, and {{#rcub}} are exactly equivalent to
// {{#x5B}}, {{#x5D}}, {{#x3C}}, and {{#x3E}} respectively, and therefore to
// the characters [, {, ], and } respectively.

// ## Metadata

// MetaData appears within tags and comprises namespace declarations, comments, and annotations, with
// intermingled whitespace.

// [16] MetaData ::= (NSDeclaration | Comment | Annotation | S)*
metadata
  : (NSDeclaration | Comment | annotation | S)*
  ;

// ## Annotations

// Annotations in LMNL syntax map on to annotations in the data model. The tags that delimit annotations within
// a tag are much like those used for ranges within content, but they are guaranteed to match. Therefore, they
// do not need identifiers and can in fact use an abbreviated syntax.

// [17] Annotation ::= (AnnotationStartTag content AnnotationEndTag) | EmptyAnnotationTag
annotation
  : (annotationStartTag content annotationEndTag)
  | emptyAnnotationTag
  ;

// [18] AnnotationStartTag ::= '[' AnnotationName (S MetaData)? S? '}'
annotationStartTag
  : BEGIN_OPEN AnnotationName (S metadata)? S? END_OPEN
  ;

// [19] AnnotationEndTag ::= AbbreviatedAnnotationEndTag | FullAnnotationEndTag
annotationEndTag
  : AbbreviatedAnnotationEndTag
  | fullAnnotationEndTag
  ;

// [20] AbbreviatedAnnotationEndTag ::= '{]'
AbbreviatedAnnotationEndTag
  : BEGIN_CLOSE END_CLOSE
  ;

// [21] FullAnnotationEndTag ::= '{' AnnotationName (S MetaData)? S? ']'
fullAnnotationEndTag
  : BEGIN_CLOSE AnnotationName (S metadata)? S? END_CLOSE
  ;

// [22] EmptyAnnotationTag ::= '[' AnnotationName (S MetaData)? S? ']'
emptyAnnotationTag
  : BEGIN_OPEN AnnotationName (S metadata)? S? END_CLOSE
  ;

// [23] AnnotationName ::= QName
AnnotationName
  : QName
  ;

// The name of the annotation is the expanded name you get from resolving the AnnotationName.

// ## Syntactic markup
//
// Syntactic markup affects the way in which semantic markup is interpreted, and thus the LMNL data model that
// is created from a document in LMNL syntax, but the constructs that it declares are not part of the LMNL data
// model and thus usually the information that it conveys (which prefix is associated with which namespace name,
// for example) is not retained when a document in LMNL syntax is parsed. To make this markup easy to identify,
// it starts with the characters [! and ends with the character ].

// ## LMNL Declaration

// Documents in LMNL syntax should begin with a LMNL declaration which specifies the version of LMNL syntax
// being used and the encoding of the document.

// [24] LMNLDeclaration ::= '[!lmnl' VersionInfo EncodingDecl? S? ']'
lmnlDeclaration
  : '[!lmnl' VersionInfo EncodingDecl? S? ']'
  ;

// The VersionNum for this version of the LMNL syntax is 0.4. A parser must raise an error if it encounters a
// document using a version of the LMNL syntax that it does not support.

// The LMNL version will remain less than 1.0 during the drafting phase.

// [25] VersionInfo ::= S 'version' Eq ('"' VersionNum '"')
VersionInfo
  : S 'version' Eq ('"' VersionNum '"')
  ;

// [26]    VersionNum  ::= ([a-zA-Z0-9_.:] | '-')+
VersionNum
  : ([a-zA-Z0-9_.:] | '-')+
  ;

// The EncodingDecl specifies the encoding used for a document in LMNL syntax. All LMNL parsers must be able to
// read documents in both the UTF-8 and UTF-16 encodings. Documents encoded in UTF-16 must begin with the Byte
// Order Mark in the same way as described for XML entities in the XML Recommendation, and the encoding
// declaration specifies the encoding used for the document as defined for XML.

// [27] EncodingDecl ::= S 'encoding' Eq ('"' EncName '"')
EncodingDecl
  : S 'encoding' Eq ('"' EncName '"')
  ;

// [28] EncName ::= [A-Za-z] ([A-Za-z0-9._] | '-')*
EncName
  : [A-Za-z] ([A-Za-z0-9._] | '-')*
  ;

// Note: Productions 29-35 no longer exist.

// ## Namespace Declarations

// A namespace declaration either associates a prefix with a namespace name (which is an IRI that identifies
// a markup language) or specifies a namespace name for names with no prefix. Namespace declarations are used
// when resolving a qualified name to give an expanded name. The expanded name might be a range identifier,
// a range name, or an annotation name.

// [36] NSDeclaration ::= '[!ns' S (Prefix Eq)? IRILiteral S? ']'
NSDeclaration
  : '[!ns' S (Prefix Eq)? IRILiteral S? ']'
  ;

// Namespace declarations can occur anywhere within the prolog or content of a document and within start tags,
// end tags, and empty tags. The "scope" of a namespace declaration is the entire document following
// the namespace declaration. It is not possible to "undeclare" a namespace. The special prefix lmnl need not
// be declared.

// It is an error if:

// a prefix is associated with more than one namespace name
// a namespace name is associated with more than one prefix
// an attempt is made to associate the prefix lmnl with a namespace name other than
// http:// lmnl.net/namespace/lmnl

// ## Comments

// Comments may appear pretty much anywhere in a document in LMNL syntax outside other syntactic markup.

// [37] Comment ::= '[!--' (Char - '--]')* '--]'
Comment
  : '[!--' Char* '--]'
  ;

// Note that comments in LMNL syntax do not have the XML restriction of not allowing "--" (double hyphen) within
// comments.

// Note: Productions 38-42 no longer exist.

// ## Common Syntactic Constructs

// This section describes some of the common syntactic constructs that are used in the LMNL syntax.
// Most of them should be familiar from the XML Recommendation and Namespaces in XML.

// ## Characters

// The legal characters in LMNL syntax are the same as the legal characters in the LMNL data model
// any Unicode character, excluding control characters and the surrogate blocks. As in the LMNL data model,
// documents in LMNL syntax must be Unicode normalized per Unicode Normalization Form NFC for reasons described
// in Character Model for the World Wide Web.

// ## Whitespace

// Whitespace is considered to be any sequence of space, tab, or line-feed characters.

// [44] S ::= (#x20 | #x9 | #xA)+
S
  : ('\u0020' | '\u0009' | '\u000A')+
  ;

// As in XML, line endings must be normalized by a LMNL parser as if before parsing it translated certain
// line-ending sequences into a single #xA character. These line-ending sequences are:

// #xD #xA
// #xD (not followed by #xA or #x85)
// #x85
// #xD #x85
// #2028
// [43] Char ::= #x9 | #xA | #xD | [#x20-#x7E] | #x85 | [#xA0-#xD7FF] |
//               [#xE000-#xFFFD] | [#x10000-#x10FFFF]
Char
  : '\u0009'
  | '\u000A'
  | '\u000D'
  | '\u0020'..'\u007E'
  | '\u0085'
  | '\u00A0'..'\uD7FF'
  | '\uE000'..'\uFFFD'
//  | '\u10000'..'\u10FFFF'
  ;


// ## Qualified Names

// LMNL syntax represents expanded names using qualified names. Qualified names consist of an optional Prefix
// followed by a LocalPart, both of which are names.

// Note that no Names in LMNL syntax can contain colons.

// [45] QName ::= (Prefix ':')? LocalPart
QName
  : (Prefix ':')? LocalPart
  ;

// [46] Prefix ::= Name
Prefix
  : Name
  ;

// [47] LocalPart ::= Name
LocalPart
  : Name
  ;

// [48] Name ::= NameStartChar (NameChar)*
Name
  : NameStartChar (NameChar)*
  ;

// [49] NameStartChar ::= [A-Z] | "_" | [a-z] | [#xC0-#x2FF] | [#x370-#x37D] |
//                        [#x37F-#x1FFF] | [#x200C-#x200D] | [#x2070-#x218F] |
//                        [#x2C00-#x2FEF] | [#x3001-#xD7FF] | [#xF900-#xEFFFF]
NameStartChar
  : 'A'..'Z'
  | 'a'..'z'
  | '_'
  | '\u00C0'..'\u02FF'
  | '\u0370'..'\u037D'
  | '\u037F'..'\u1FFF'
  | '\u200C'..'\u200D'
  | '\u2070'..'\u218F'
  | '\u2C00'..'\u2FEF'
  | '\u3001'..'\uD7FF'
  | '\uF900'..'\uFFFF'
  ;

// [50] NameChar ::= NameStartChar | "-" | "." | [0-9] | #xB7 |
//                   [#x0300-#x036F] | [#x203F-#x2040]
NameChar
  : NameStartChar
  | '-'
  | '.'
  | '0'..'9'
  | '\u00B7'
  | '\u0300'..'\u036F'
  | '\u203F'..'\u2040'
  ;

// A qualified name is resolved to an expanded name by identifying the namespace declaration that appears
// earlier in the document that associates the Prefix of the qualified name with a namespace name.
// It is an error if there is no namespace declaration for the specified Prefix appearing before the qualified
// name in the document. If the qualified name doesn't have a Prefix then the namespace name of the expanded
// name is the empty string. The expanded name represented by the qualified name is the pair of this namespace
// name and the LocalPart of the qualified name.

// Namespace declarations are scoped such that it doesn't matter what context a namespace declaration appears
// in â€” within a start tag, in the content of an annotation â€” it will always be in scope from that point on
// through the document. Namespaces declarations cut across the structures defined by the semantic markup in
// the document.

// ## Literals

// Literal data is any quoted string not containing a quotation mark (LMNL does not allow single quotes).
// IRILiterals are used for specifying namespace names.

// [51] Eq ::= S? '=' S?
Eq
  : S? '=' S?
  ;

// Note: Production 52 no longer exists.

// [53] IRILiteral ::= '"' [^"]* '"'
IRILiteral
  : '"' [^"]* '"'
  ;

// Note that IRILiterals can be parsed without scanning for markup. Their values (between the quotes) should be
// valid IRIs as defined in RFC 3987.

