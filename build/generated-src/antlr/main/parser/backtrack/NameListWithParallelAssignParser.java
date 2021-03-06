// Generated from parser/backtrack/NameListWithParallelAssign.g4 by ANTLR 4.9.2

    package parser.backtrack;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NameListWithParallelAssignParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LBRACK=1, RBRACK=2, COMMA=3, ASSIGN=4, NAME=5, WS=6;
	public static final int
		RULE_stat = 0, RULE_assign = 1, RULE_list = 2, RULE_elements = 3, RULE_element = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"stat", "assign", "list", "elements", "element"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", "','", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LBRACK", "RBRACK", "COMMA", "ASSIGN", "NAME", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "NameListWithParallelAssign.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public NameListWithParallelAssignParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StatContext extends ParserRuleContext {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public TerminalNode EOF() { return getToken(NameListWithParallelAssignParser.EOF, 0); }
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NameListWithParallelAssignListener ) ((NameListWithParallelAssignListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NameListWithParallelAssignListener ) ((NameListWithParallelAssignListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NameListWithParallelAssignVisitor ) return ((NameListWithParallelAssignVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_stat);
		try {
			setState(16);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(10);
				list();
				setState(11);
				match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(13);
				assign();
				setState(14);
				match(EOF);
				}
				break;
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

	public static class AssignContext extends ParserRuleContext {
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(NameListWithParallelAssignParser.ASSIGN, 0); }
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NameListWithParallelAssignListener ) ((NameListWithParallelAssignListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NameListWithParallelAssignListener ) ((NameListWithParallelAssignListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NameListWithParallelAssignVisitor ) return ((NameListWithParallelAssignVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			list();
			setState(19);
			match(ASSIGN);
			setState(20);
			list();
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

	public static class ListContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(NameListWithParallelAssignParser.LBRACK, 0); }
		public ElementsContext elements() {
			return getRuleContext(ElementsContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(NameListWithParallelAssignParser.RBRACK, 0); }
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NameListWithParallelAssignListener ) ((NameListWithParallelAssignListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NameListWithParallelAssignListener ) ((NameListWithParallelAssignListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NameListWithParallelAssignVisitor ) return ((NameListWithParallelAssignVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(LBRACK);
			setState(23);
			elements();
			setState(24);
			match(RBRACK);
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

	public static class ElementsContext extends ParserRuleContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(NameListWithParallelAssignParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NameListWithParallelAssignParser.COMMA, i);
		}
		public ElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NameListWithParallelAssignListener ) ((NameListWithParallelAssignListener)listener).enterElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NameListWithParallelAssignListener ) ((NameListWithParallelAssignListener)listener).exitElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NameListWithParallelAssignVisitor ) return ((NameListWithParallelAssignVisitor<? extends T>)visitor).visitElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementsContext elements() throws RecognitionException {
		ElementsContext _localctx = new ElementsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_elements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			element();
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(27);
				match(COMMA);
				setState(28);
				element();
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class ElementContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(NameListWithParallelAssignParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(NameListWithParallelAssignParser.NAME, i);
		}
		public TerminalNode ASSIGN() { return getToken(NameListWithParallelAssignParser.ASSIGN, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NameListWithParallelAssignListener ) ((NameListWithParallelAssignListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NameListWithParallelAssignListener ) ((NameListWithParallelAssignListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NameListWithParallelAssignVisitor ) return ((NameListWithParallelAssignVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_element);
		try {
			setState(39);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				match(NAME);
				setState(35);
				match(ASSIGN);
				setState(36);
				match(NAME);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				match(NAME);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(38);
				list();
				}
				break;
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\b,\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\2\3\2\3\2\5\2\23\n\2\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\7\5 \n\5\f\5\16\5#\13\5\3\6\3\6\3"+
		"\6\3\6\3\6\5\6*\n\6\3\6\2\2\7\2\4\6\b\n\2\2\2*\2\22\3\2\2\2\4\24\3\2\2"+
		"\2\6\30\3\2\2\2\b\34\3\2\2\2\n)\3\2\2\2\f\r\5\6\4\2\r\16\7\2\2\3\16\23"+
		"\3\2\2\2\17\20\5\4\3\2\20\21\7\2\2\3\21\23\3\2\2\2\22\f\3\2\2\2\22\17"+
		"\3\2\2\2\23\3\3\2\2\2\24\25\5\6\4\2\25\26\7\6\2\2\26\27\5\6\4\2\27\5\3"+
		"\2\2\2\30\31\7\3\2\2\31\32\5\b\5\2\32\33\7\4\2\2\33\7\3\2\2\2\34!\5\n"+
		"\6\2\35\36\7\5\2\2\36 \5\n\6\2\37\35\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\""+
		"\3\2\2\2\"\t\3\2\2\2#!\3\2\2\2$%\7\7\2\2%&\7\6\2\2&*\7\7\2\2\'*\7\7\2"+
		"\2(*\5\6\4\2)$\3\2\2\2)\'\3\2\2\2)(\3\2\2\2*\13\3\2\2\2\5\22!)";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}