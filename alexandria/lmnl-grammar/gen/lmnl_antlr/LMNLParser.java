// Generated from C:/Users/bramb/workspaces/alexandria/Institute-Materials-2017/alexandria/lmnl-grammar/src/main/java/lmnl_antlr\LMNLParser.g4 by ANTLR 4.6
package lmnl_antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LMNLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BEGIN_OPEN_RANGE=1, BEGIN_CLOSE_RANGE=2, TEXT=3, END_ANONYMOUS_RANGE=4, 
		END_OPEN_RANGE=5, BEGIN_OPEN_ANNO=6, Name_Open_Range=7, RANGE_S=8, END_CLOSE_RANGE=9, 
		Name_Close_Range=10, END_ANONYMOUS_ANNO=11, END_OPEN_ANNO=12, OPEN_ANNO_IN_ANNO=13, 
		Name_Open_Annotation=14, ANNO_S=15, END_CLOSE_ANNO=16, Name_Close_Annotation=17, 
		BEGIN_CLOSE_ANNO=18, ANNO_TEXT=19;
	public static final int
		RULE_document = 0, RULE_rangeStartTag = 1, RULE_rangeEndTag = 2, RULE_annotation = 3, 
		RULE_annotationStartTag = 4, RULE_annotationEndTag = 5;
	public static final String[] ruleNames = {
		"document", "rangeStartTag", "rangeEndTag", "annotation", "annotationStartTag", 
		"annotationEndTag"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BEGIN_OPEN_RANGE", "BEGIN_CLOSE_RANGE", "TEXT", "END_ANONYMOUS_RANGE", 
		"END_OPEN_RANGE", "BEGIN_OPEN_ANNO", "Name_Open_Range", "RANGE_S", "END_CLOSE_RANGE", 
		"Name_Close_Range", "END_ANONYMOUS_ANNO", "END_OPEN_ANNO", "OPEN_ANNO_IN_ANNO", 
		"Name_Open_Annotation", "ANNO_S", "END_CLOSE_ANNO", "Name_Close_Annotation", 
		"BEGIN_CLOSE_ANNO", "ANNO_TEXT"
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

	@Override
	public String getGrammarFileName() { return "LMNLParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LMNLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class DocumentContext extends ParserRuleContext {
		public List<RangeStartTagContext> rangeStartTag() {
			return getRuleContexts(RangeStartTagContext.class);
		}
		public RangeStartTagContext rangeStartTag(int i) {
			return getRuleContext(RangeStartTagContext.class,i);
		}
		public List<TerminalNode> TEXT() { return getTokens(LMNLParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(LMNLParser.TEXT, i);
		}
		public List<RangeEndTagContext> rangeEndTag() {
			return getRuleContexts(RangeEndTagContext.class);
		}
		public RangeEndTagContext rangeEndTag(int i) {
			return getRuleContext(RangeEndTagContext.class,i);
		}
		public DocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMNLParserListener ) ((LMNLParserListener)listener).enterDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMNLParserListener ) ((LMNLParserListener)listener).exitDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMNLParserVisitor ) return ((LMNLParserVisitor<? extends T>)visitor).visitDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocumentContext document() throws RecognitionException {
		DocumentContext _localctx = new DocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_document);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(15);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BEGIN_OPEN_RANGE:
					{
					setState(12);
					rangeStartTag();
					}
					break;
				case TEXT:
					{
					setState(13);
					match(TEXT);
					}
					break;
				case BEGIN_CLOSE_RANGE:
					{
					setState(14);
					rangeEndTag();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(17); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BEGIN_OPEN_RANGE) | (1L << BEGIN_CLOSE_RANGE) | (1L << TEXT))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RangeStartTagContext extends ParserRuleContext {
		public TerminalNode BEGIN_OPEN_RANGE() { return getToken(LMNLParser.BEGIN_OPEN_RANGE, 0); }
		public TerminalNode Name_Open_Range() { return getToken(LMNLParser.Name_Open_Range, 0); }
		public TerminalNode END_OPEN_RANGE() { return getToken(LMNLParser.END_OPEN_RANGE, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public RangeStartTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeStartTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMNLParserListener ) ((LMNLParserListener)listener).enterRangeStartTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMNLParserListener ) ((LMNLParserListener)listener).exitRangeStartTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMNLParserVisitor ) return ((LMNLParserVisitor<? extends T>)visitor).visitRangeStartTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeStartTagContext rangeStartTag() throws RecognitionException {
		RangeStartTagContext _localctx = new RangeStartTagContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_rangeStartTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			match(BEGIN_OPEN_RANGE);
			setState(20);
			match(Name_Open_Range);
			setState(24);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BEGIN_OPEN_ANNO) {
				{
				{
				setState(21);
				annotation();
				}
				}
				setState(26);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(27);
			match(END_OPEN_RANGE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RangeEndTagContext extends ParserRuleContext {
		public TerminalNode BEGIN_CLOSE_RANGE() { return getToken(LMNLParser.BEGIN_CLOSE_RANGE, 0); }
		public TerminalNode Name_Open_Range() { return getToken(LMNLParser.Name_Open_Range, 0); }
		public TerminalNode END_CLOSE_RANGE() { return getToken(LMNLParser.END_CLOSE_RANGE, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public RangeEndTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeEndTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMNLParserListener ) ((LMNLParserListener)listener).enterRangeEndTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMNLParserListener ) ((LMNLParserListener)listener).exitRangeEndTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMNLParserVisitor ) return ((LMNLParserVisitor<? extends T>)visitor).visitRangeEndTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeEndTagContext rangeEndTag() throws RecognitionException {
		RangeEndTagContext _localctx = new RangeEndTagContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_rangeEndTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(BEGIN_CLOSE_RANGE);
			setState(30);
			match(Name_Open_Range);
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BEGIN_OPEN_ANNO) {
				{
				{
				setState(31);
				annotation();
				}
				}
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(37);
			match(END_CLOSE_RANGE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationContext extends ParserRuleContext {
		public AnnotationStartTagContext annotationStartTag() {
			return getRuleContext(AnnotationStartTagContext.class,0);
		}
		public TerminalNode ANNO_TEXT() { return getToken(LMNLParser.ANNO_TEXT, 0); }
		public AnnotationEndTagContext annotationEndTag() {
			return getRuleContext(AnnotationEndTagContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMNLParserListener ) ((LMNLParserListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMNLParserListener ) ((LMNLParserListener)listener).exitAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMNLParserVisitor ) return ((LMNLParserVisitor<? extends T>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_annotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			annotationStartTag();
			setState(40);
			match(ANNO_TEXT);
			setState(41);
			annotationEndTag();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationStartTagContext extends ParserRuleContext {
		public TerminalNode BEGIN_OPEN_ANNO() { return getToken(LMNLParser.BEGIN_OPEN_ANNO, 0); }
		public TerminalNode END_OPEN_ANNO() { return getToken(LMNLParser.END_OPEN_ANNO, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public AnnotationStartTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationStartTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMNLParserListener ) ((LMNLParserListener)listener).enterAnnotationStartTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMNLParserListener ) ((LMNLParserListener)listener).exitAnnotationStartTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMNLParserVisitor ) return ((LMNLParserVisitor<? extends T>)visitor).visitAnnotationStartTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationStartTagContext annotationStartTag() throws RecognitionException {
		AnnotationStartTagContext _localctx = new AnnotationStartTagContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_annotationStartTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(BEGIN_OPEN_ANNO);
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BEGIN_OPEN_ANNO) {
				{
				{
				setState(44);
				annotation();
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
			match(END_OPEN_ANNO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationEndTagContext extends ParserRuleContext {
		public TerminalNode BEGIN_CLOSE_ANNO() { return getToken(LMNLParser.BEGIN_CLOSE_ANNO, 0); }
		public TerminalNode END_CLOSE_ANNO() { return getToken(LMNLParser.END_CLOSE_ANNO, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public AnnotationEndTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationEndTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMNLParserListener ) ((LMNLParserListener)listener).enterAnnotationEndTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMNLParserListener ) ((LMNLParserListener)listener).exitAnnotationEndTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMNLParserVisitor ) return ((LMNLParserVisitor<? extends T>)visitor).visitAnnotationEndTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationEndTagContext annotationEndTag() throws RecognitionException {
		AnnotationEndTagContext _localctx = new AnnotationEndTagContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_annotationEndTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(BEGIN_CLOSE_ANNO);
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BEGIN_OPEN_ANNO) {
				{
				{
				setState(53);
				annotation();
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59);
			match(END_CLOSE_ANNO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\25@\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\6\2\22\n\2\r\2\16\2\23"+
		"\3\3\3\3\3\3\7\3\31\n\3\f\3\16\3\34\13\3\3\3\3\3\3\4\3\4\3\4\7\4#\n\4"+
		"\f\4\16\4&\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\7\6\60\n\6\f\6\16\6\63"+
		"\13\6\3\6\3\6\3\7\3\7\7\79\n\7\f\7\16\7<\13\7\3\7\3\7\3\7\2\2\b\2\4\6"+
		"\b\n\f\2\2@\2\21\3\2\2\2\4\25\3\2\2\2\6\37\3\2\2\2\b)\3\2\2\2\n-\3\2\2"+
		"\2\f\66\3\2\2\2\16\22\5\4\3\2\17\22\7\5\2\2\20\22\5\6\4\2\21\16\3\2\2"+
		"\2\21\17\3\2\2\2\21\20\3\2\2\2\22\23\3\2\2\2\23\21\3\2\2\2\23\24\3\2\2"+
		"\2\24\3\3\2\2\2\25\26\7\3\2\2\26\32\7\t\2\2\27\31\5\b\5\2\30\27\3\2\2"+
		"\2\31\34\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33\35\3\2\2\2\34\32\3\2\2"+
		"\2\35\36\7\7\2\2\36\5\3\2\2\2\37 \7\4\2\2 $\7\t\2\2!#\5\b\5\2\"!\3\2\2"+
		"\2#&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\'\3\2\2\2&$\3\2\2\2\'(\7\13\2\2(\7"+
		"\3\2\2\2)*\5\n\6\2*+\7\25\2\2+,\5\f\7\2,\t\3\2\2\2-\61\7\b\2\2.\60\5\b"+
		"\5\2/.\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\64\3\2\2\2\63"+
		"\61\3\2\2\2\64\65\7\16\2\2\65\13\3\2\2\2\66:\7\24\2\2\679\5\b\5\28\67"+
		"\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;=\3\2\2\2<:\3\2\2\2=>\7\22\2\2"+
		">\r\3\2\2\2\b\21\23\32$\61:";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}