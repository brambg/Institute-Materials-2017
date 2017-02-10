// Generated from C:/Users/bramb/workspaces/alexandria/Institute-Materials-2017/alexandria/lmnl-grammar/src/main/antlr\LMNLb.g4 by ANTLR 4.6
package lmnl_antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LMNLbLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, BEGIN_OPEN=5, END_OPEN=6, BEGIN_CLOSE=7, 
		END_CLOSE=8, TagName=9, IdentitySpec=10, Identifier=11, AbbreviatedAnnotationEndTag=12, 
		AnnotationName=13, VersionInfo=14, VersionNum=15, EncodingDecl=16, EncName=17, 
		NSDeclaration=18, Comment=19, S=20, Char=21, QName=22, Prefix=23, LocalPart=24, 
		Name=25, NameStartChar=26, NameChar=27, Eq=28, IRILiteral=29;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "BEGIN_OPEN", "END_OPEN", "BEGIN_CLOSE", 
		"END_CLOSE", "CharData", "TagName", "IdentitySpec", "Identifier", "AbbreviatedAnnotationEndTag", 
		"AnnotationName", "VersionInfo", "VersionNum", "EncodingDecl", "EncName", 
		"NSDeclaration", "Comment", "S", "Char", "QName", "Prefix", "LocalPart", 
		"Name", "NameStartChar", "NameChar", "Eq", "IRILiteral"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{{'", "'}}'", "'{{#x'", "'9'", "'['", "'}'", "'{'", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "BEGIN_OPEN", "END_OPEN", "BEGIN_CLOSE", 
		"END_CLOSE", "TagName", "IdentitySpec", "Identifier", "AbbreviatedAnnotationEndTag", 
		"AnnotationName", "VersionInfo", "VersionNum", "EncodingDecl", "EncName", 
		"NSDeclaration", "Comment", "S", "Char", "QName", "Prefix", "LocalPart", 
		"Name", "NameStartChar", "NameChar", "Eq", "IRILiteral"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public LMNLbLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LMNLb.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\37\u00e1\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\n\7\nV\n\n\f\n\16\nY\13\n\3\13\3\13\3\f\3\f\5\f_\n\f\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\6\21y\n\21\r\21\16\21z\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\7\23\u008e\n\23\f\23\16\23\u0091\13\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\5\24\u009c\n\24\3\24\3\24\5\24\u00a0\n\24\3"+
		"\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u00aa\n\25\f\25\16\25\u00ad"+
		"\13\25\3\25\3\25\3\25\3\25\3\26\6\26\u00b4\n\26\r\26\16\26\u00b5\3\27"+
		"\3\27\3\30\3\30\3\30\5\30\u00bd\n\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\7\33\u00c7\n\33\f\33\16\33\u00ca\13\33\3\34\3\34\3\35\3\35\5\35"+
		"\u00d0\n\35\3\36\5\36\u00d3\n\36\3\36\3\36\5\36\u00d7\n\36\3\37\3\37\7"+
		"\37\u00db\n\37\f\37\16\37\u00de\13\37\3\37\3\37\2\2 \3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\2\25\13\27\f\31\r\33\16\35\17\37\20!\21#\22%\23\'"+
		"\24)\25+\26-\27/\30\61\31\63\32\65\33\67\349\35;\36=\37\3\2\13\5\2]]`"+
		"`}}\7\2/\60\62<C\\aac|\4\2C\\c|\7\2/\60\62;C\\aac|\4\2\13\f\"\"\b\2\13"+
		"\f\17\17\"\u0080\u0087\u0087\u00a2\ud801\ue002\uffff\r\2C\\aac|\u00c2"+
		"\u0301\u0372\u037f\u0381\u2001\u200e\u200f\u2072\u2191\u2c02\u2ff1\u3003"+
		"\ud801\uf902\1\7\2/\60\62;\u00b9\u00b9\u0302\u0371\u2041\u2042\4\2$$`"+
		"`\u00ed\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\3?\3\2\2\2\5B\3\2\2\2\7E\3\2\2\2\tJ\3\2\2\2\13L\3\2\2\2\r"+
		"N\3\2\2\2\17P\3\2\2\2\21R\3\2\2\2\23W\3\2\2\2\25Z\3\2\2\2\27\\\3\2\2\2"+
		"\31b\3\2\2\2\33d\3\2\2\2\35g\3\2\2\2\37i\3\2\2\2!x\3\2\2\2#|\3\2\2\2%"+
		"\u008b\3\2\2\2\'\u0092\3\2\2\2)\u00a3\3\2\2\2+\u00b3\3\2\2\2-\u00b7\3"+
		"\2\2\2/\u00bc\3\2\2\2\61\u00c0\3\2\2\2\63\u00c2\3\2\2\2\65\u00c4\3\2\2"+
		"\2\67\u00cb\3\2\2\29\u00cf\3\2\2\2;\u00d2\3\2\2\2=\u00d8\3\2\2\2?@\7}"+
		"\2\2@A\7}\2\2A\4\3\2\2\2BC\7\177\2\2CD\7\177\2\2D\6\3\2\2\2EF\7}\2\2F"+
		"G\7}\2\2GH\7%\2\2HI\7z\2\2I\b\3\2\2\2JK\7;\2\2K\n\3\2\2\2LM\7]\2\2M\f"+
		"\3\2\2\2NO\7\177\2\2O\16\3\2\2\2PQ\7}\2\2Q\20\3\2\2\2RS\7_\2\2S\22\3\2"+
		"\2\2TV\t\2\2\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\24\3\2\2\2YW\3"+
		"\2\2\2Z[\5/\30\2[\26\3\2\2\2\\^\7?\2\2]_\5+\26\2^]\3\2\2\2^_\3\2\2\2_"+
		"`\3\2\2\2`a\5\31\r\2a\30\3\2\2\2bc\5\65\33\2c\32\3\2\2\2de\5\17\b\2ef"+
		"\5\21\t\2f\34\3\2\2\2gh\5/\30\2h\36\3\2\2\2ij\5+\26\2jk\7x\2\2kl\7g\2"+
		"\2lm\7t\2\2mn\7u\2\2no\7k\2\2op\7q\2\2pq\7p\2\2qr\3\2\2\2rs\5;\36\2st"+
		"\7$\2\2tu\5!\21\2uv\7$\2\2v \3\2\2\2wy\t\3\2\2xw\3\2\2\2yz\3\2\2\2zx\3"+
		"\2\2\2z{\3\2\2\2{\"\3\2\2\2|}\5+\26\2}~\7g\2\2~\177\7p\2\2\177\u0080\7"+
		"e\2\2\u0080\u0081\7q\2\2\u0081\u0082\7f\2\2\u0082\u0083\7k\2\2\u0083\u0084"+
		"\7p\2\2\u0084\u0085\7i\2\2\u0085\u0086\3\2\2\2\u0086\u0087\5;\36\2\u0087"+
		"\u0088\7$\2\2\u0088\u0089\5%\23\2\u0089\u008a\7$\2\2\u008a$\3\2\2\2\u008b"+
		"\u008f\t\4\2\2\u008c\u008e\t\5\2\2\u008d\u008c\3\2\2\2\u008e\u0091\3\2"+
		"\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090&\3\2\2\2\u0091\u008f"+
		"\3\2\2\2\u0092\u0093\7]\2\2\u0093\u0094\7#\2\2\u0094\u0095\7p\2\2\u0095"+
		"\u0096\7u\2\2\u0096\u0097\3\2\2\2\u0097\u009b\5+\26\2\u0098\u0099\5\61"+
		"\31\2\u0099\u009a\5;\36\2\u009a\u009c\3\2\2\2\u009b\u0098\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\5=\37\2\u009e\u00a0\5+"+
		"\26\2\u009f\u009e\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u00a2\7_\2\2\u00a2(\3\2\2\2\u00a3\u00a4\7]\2\2\u00a4\u00a5\7#\2\2\u00a5"+
		"\u00a6\7/\2\2\u00a6\u00a7\7/\2\2\u00a7\u00ab\3\2\2\2\u00a8\u00aa\5-\27"+
		"\2\u00a9\u00a8\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac"+
		"\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00af\7/\2\2\u00af"+
		"\u00b0\7/\2\2\u00b0\u00b1\7_\2\2\u00b1*\3\2\2\2\u00b2\u00b4\t\6\2\2\u00b3"+
		"\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2"+
		"\2\2\u00b6,\3\2\2\2\u00b7\u00b8\t\7\2\2\u00b8.\3\2\2\2\u00b9\u00ba\5\61"+
		"\31\2\u00ba\u00bb\7<\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00b9\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\5\63\32\2\u00bf\60\3\2"+
		"\2\2\u00c0\u00c1\5\65\33\2\u00c1\62\3\2\2\2\u00c2\u00c3\5\65\33\2\u00c3"+
		"\64\3\2\2\2\u00c4\u00c8\5\67\34\2\u00c5\u00c7\59\35\2\u00c6\u00c5\3\2"+
		"\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\66\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cc\t\b\2\2\u00cc8\3\2\2\2\u00cd"+
		"\u00d0\5\67\34\2\u00ce\u00d0\t\t\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00ce\3"+
		"\2\2\2\u00d0:\3\2\2\2\u00d1\u00d3\5+\26\2\u00d2\u00d1\3\2\2\2\u00d2\u00d3"+
		"\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d6\7?\2\2\u00d5\u00d7\5+\26\2\u00d6"+
		"\u00d5\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7<\3\2\2\2\u00d8\u00dc\7$\2\2\u00d9"+
		"\u00db\t\n\2\2\u00da\u00d9\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2"+
		"\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df\3\2\2\2\u00de\u00dc\3\2\2\2\u00df"+
		"\u00e0\7$\2\2\u00e0>\3\2\2\2\23\2W^xz\u008d\u008f\u009b\u009f\u00ab\u00b5"+
		"\u00bc\u00c8\u00cf\u00d2\u00d6\u00dc\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}