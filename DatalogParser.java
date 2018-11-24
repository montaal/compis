// Generated from Datalog.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DatalogParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, MULTIPLICATION=2, DIVISION=3, ADD=4, MINUS=5, GREATER_THAN=6, 
		GREATER_THAN_OR_EQUAL=7, LESSER_THAN=8, LESSER_THAN_OR_EQUAL=9, EQUAL=10, 
		NOT_EQUAL=11, LEFT_PARENTHESIS=12, RIGHT_PARENTHESIS=13, COMMA=14, DOT=15, 
		TILDE=16, QUESTION_MARK=17, COLON_DASH=18, DOUBLE_QUOTE=19, ID=20, VAR=21, 
		STRING=22, LINE_COMMENT=23, COMMMENT=24, WS=25;
	public static final int
		RULE_prog = 0, RULE_datalogProgram = 1, RULE_query = 2, RULE_table = 3, 
		RULE_idList = 4, RULE_fact = 5, RULE_action = 6, RULE_headPredicate = 7, 
		RULE_predicate = 8, RULE_predicateList = 9, RULE_parameter = 10, RULE_parameterList = 11, 
		RULE_stringIdList = 12, RULE_varList = 13, RULE_predParam = 14, RULE_tableParam = 15, 
		RULE_factParam = 16, RULE_headParam = 17, RULE_expression = 18, RULE_operator = 19;
	public static final String[] ruleNames = {
		"prog", "datalogProgram", "query", "table", "idList", "fact", "action", 
		"headPredicate", "predicate", "predicateList", "parameter", "parameterList", 
		"stringIdList", "varList", "predParam", "tableParam", "factParam", "headParam", 
		"expression", "operator"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Table:'", "'*'", "'/'", "'+'", "'-'", "'>'", "'>='", "'<'", "'<='", 
		"'='", "'!='", "'('", "')'", "','", "'.'", "'~'", "'?'", "':-'", "'\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "MULTIPLICATION", "DIVISION", "ADD", "MINUS", "GREATER_THAN", 
		"GREATER_THAN_OR_EQUAL", "LESSER_THAN", "LESSER_THAN_OR_EQUAL", "EQUAL", 
		"NOT_EQUAL", "LEFT_PARENTHESIS", "RIGHT_PARENTHESIS", "COMMA", "DOT", 
		"TILDE", "QUESTION_MARK", "COLON_DASH", "DOUBLE_QUOTE", "ID", "VAR", "STRING", 
		"LINE_COMMENT", "COMMMENT", "WS"
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
	public String getGrammarFileName() { return "Datalog.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DatalogParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<DatalogProgramContext> datalogProgram() {
			return getRuleContexts(DatalogProgramContext.class);
		}
		public DatalogProgramContext datalogProgram(int i) {
			return getRuleContext(DatalogProgramContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(40);
				datalogProgram();
				}
				}
				setState(43); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 || _la==ID );
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

	public static class DatalogProgramContext extends ParserRuleContext {
		public DatalogProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datalogProgram; }
	 
		public DatalogProgramContext() { }
		public void copyFrom(DatalogProgramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TabledecContext extends DatalogProgramContext {
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public TabledecContext(DatalogProgramContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterTabledec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitTabledec(this);
		}
	}
	public static class QuerydecContext extends DatalogProgramContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public QuerydecContext(DatalogProgramContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterQuerydec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitQuerydec(this);
		}
	}
	public static class FactdecContext extends DatalogProgramContext {
		public FactContext fact() {
			return getRuleContext(FactContext.class,0);
		}
		public FactdecContext(DatalogProgramContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterFactdec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitFactdec(this);
		}
	}
	public static class ActiondecContext extends DatalogProgramContext {
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public ActiondecContext(DatalogProgramContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterActiondec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitActiondec(this);
		}
	}

	public final DatalogProgramContext datalogProgram() throws RecognitionException {
		DatalogProgramContext _localctx = new DatalogProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_datalogProgram);
		try {
			setState(50);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new TabledecContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				match(T__0);
				setState(46);
				table();
				}
				break;
			case 2:
				_localctx = new FactdecContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				fact();
				}
				break;
			case 3:
				_localctx = new ActiondecContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				action();
				}
				break;
			case 4:
				_localctx = new QuerydecContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(49);
				query();
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

	public static class QueryContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DatalogParser.ID, 0); }
		public TerminalNode LEFT_PARENTHESIS() { return getToken(DatalogParser.LEFT_PARENTHESIS, 0); }
		public PredParamContext predParam() {
			return getRuleContext(PredParamContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(DatalogParser.RIGHT_PARENTHESIS, 0); }
		public TerminalNode QUESTION_MARK() { return getToken(DatalogParser.QUESTION_MARK, 0); }
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitQuery(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(ID);
			setState(53);
			match(LEFT_PARENTHESIS);
			setState(54);
			predParam();
			setState(55);
			match(RIGHT_PARENTHESIS);
			setState(56);
			match(QUESTION_MARK);
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

	public static class TableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DatalogParser.ID, 0); }
		public TerminalNode LEFT_PARENTHESIS() { return getToken(DatalogParser.LEFT_PARENTHESIS, 0); }
		public TableParamContext tableParam() {
			return getRuleContext(TableParamContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(DatalogParser.RIGHT_PARENTHESIS, 0); }
		public TableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitTable(this);
		}
	}

	public final TableContext table() throws RecognitionException {
		TableContext _localctx = new TableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(ID);
			setState(59);
			match(LEFT_PARENTHESIS);
			setState(60);
			tableParam();
			setState(61);
			match(RIGHT_PARENTHESIS);
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

	public static class IdListContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(DatalogParser.COMMA, 0); }
		public TerminalNode ID() { return getToken(DatalogParser.ID, 0); }
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public IdListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterIdList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitIdList(this);
		}
	}

	public final IdListContext idList() throws RecognitionException {
		IdListContext _localctx = new IdListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_idList);
		try {
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				match(COMMA);
				setState(64);
				match(ID);
				setState(65);
				idList();
				}
				break;
			case RIGHT_PARENTHESIS:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class FactContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DatalogParser.ID, 0); }
		public TerminalNode LEFT_PARENTHESIS() { return getToken(DatalogParser.LEFT_PARENTHESIS, 0); }
		public FactParamContext factParam() {
			return getRuleContext(FactParamContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(DatalogParser.RIGHT_PARENTHESIS, 0); }
		public TerminalNode DOT() { return getToken(DatalogParser.DOT, 0); }
		public FactContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fact; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterFact(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitFact(this);
		}
	}

	public final FactContext fact() throws RecognitionException {
		FactContext _localctx = new FactContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_fact);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(ID);
			setState(70);
			match(LEFT_PARENTHESIS);
			setState(71);
			factParam();
			setState(72);
			match(RIGHT_PARENTHESIS);
			setState(73);
			match(DOT);
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

	public static class ActionContext extends ParserRuleContext {
		public HeadPredicateContext headPredicate() {
			return getRuleContext(HeadPredicateContext.class,0);
		}
		public TerminalNode COLON_DASH() { return getToken(DatalogParser.COLON_DASH, 0); }
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public PredicateListContext predicateList() {
			return getRuleContext(PredicateListContext.class,0);
		}
		public TerminalNode DOT() { return getToken(DatalogParser.DOT, 0); }
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitAction(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			headPredicate();
			setState(76);
			match(COLON_DASH);
			setState(77);
			predicate();
			setState(78);
			predicateList();
			setState(79);
			match(DOT);
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

	public static class HeadPredicateContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DatalogParser.ID, 0); }
		public TerminalNode LEFT_PARENTHESIS() { return getToken(DatalogParser.LEFT_PARENTHESIS, 0); }
		public HeadParamContext headParam() {
			return getRuleContext(HeadParamContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(DatalogParser.RIGHT_PARENTHESIS, 0); }
		public HeadPredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_headPredicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterHeadPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitHeadPredicate(this);
		}
	}

	public final HeadPredicateContext headPredicate() throws RecognitionException {
		HeadPredicateContext _localctx = new HeadPredicateContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_headPredicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(ID);
			setState(82);
			match(LEFT_PARENTHESIS);
			setState(83);
			headParam();
			setState(84);
			match(RIGHT_PARENTHESIS);
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

	public static class PredicateContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DatalogParser.ID, 0); }
		public TerminalNode LEFT_PARENTHESIS() { return getToken(DatalogParser.LEFT_PARENTHESIS, 0); }
		public PredParamContext predParam() {
			return getRuleContext(PredParamContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(DatalogParser.RIGHT_PARENTHESIS, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitPredicate(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_predicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(ID);
			setState(87);
			match(LEFT_PARENTHESIS);
			setState(88);
			predParam();
			setState(89);
			match(RIGHT_PARENTHESIS);
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

	public static class PredicateListContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(DatalogParser.COMMA, 0); }
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public PredicateListContext predicateList() {
			return getRuleContext(PredicateListContext.class,0);
		}
		public PredicateListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicateList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterPredicateList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitPredicateList(this);
		}
	}

	public final PredicateListContext predicateList() throws RecognitionException {
		PredicateListContext _localctx = new PredicateListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_predicateList);
		try {
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				match(COMMA);
				setState(92);
				predicate();
				setState(93);
				predicateList();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(DatalogParser.STRING, 0); }
		public TerminalNode ID() { return getToken(DatalogParser.ID, 0); }
		public TerminalNode VAR() { return getToken(DatalogParser.VAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_parameter);
		try {
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				match(STRING);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				match(ID);
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(100);
				match(VAR);
				}
				break;
			case LEFT_PARENTHESIS:
				enterOuterAlt(_localctx, 4);
				{
				setState(101);
				expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ParameterListContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(DatalogParser.COMMA, 0); }
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitParameterList(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_parameterList);
		try {
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				match(COMMA);
				setState(105);
				parameter();
				setState(106);
				parameterList();
				}
				break;
			case RIGHT_PARENTHESIS:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class StringIdListContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(DatalogParser.COMMA, 0); }
		public StringIdListContext stringIdList() {
			return getRuleContext(StringIdListContext.class,0);
		}
		public TerminalNode ID() { return getToken(DatalogParser.ID, 0); }
		public TerminalNode STRING() { return getToken(DatalogParser.STRING, 0); }
		public StringIdListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringIdList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterStringIdList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitStringIdList(this);
		}
	}

	public final StringIdListContext stringIdList() throws RecognitionException {
		StringIdListContext _localctx = new StringIdListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_stringIdList);
		int _la;
		try {
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				match(COMMA);
				setState(112);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==STRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(113);
				stringIdList();
				}
				break;
			case RIGHT_PARENTHESIS:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class VarListContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(DatalogParser.COMMA, 0); }
		public TerminalNode VAR() { return getToken(DatalogParser.VAR, 0); }
		public VarListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterVarList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitVarList(this);
		}
	}

	public final VarListContext varList() throws RecognitionException {
		VarListContext _localctx = new VarListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_varList);
		try {
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				match(COMMA);
				setState(118);
				match(VAR);
				}
				break;
			case RIGHT_PARENTHESIS:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class PredParamContext extends ParserRuleContext {
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public PredParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterPredParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitPredParam(this);
		}
	}

	public final PredParamContext predParam() throws RecognitionException {
		PredParamContext _localctx = new PredParamContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_predParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			parameter();
			setState(123);
			parameterList();
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

	public static class TableParamContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DatalogParser.ID, 0); }
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public TableParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterTableParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitTableParam(this);
		}
	}

	public final TableParamContext tableParam() throws RecognitionException {
		TableParamContext _localctx = new TableParamContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_tableParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(ID);
			setState(126);
			idList();
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

	public static class FactParamContext extends ParserRuleContext {
		public StringIdListContext stringIdList() {
			return getRuleContext(StringIdListContext.class,0);
		}
		public TerminalNode STRING() { return getToken(DatalogParser.STRING, 0); }
		public TerminalNode ID() { return getToken(DatalogParser.ID, 0); }
		public FactParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterFactParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitFactParam(this);
		}
	}

	public final FactParamContext factParam() throws RecognitionException {
		FactParamContext _localctx = new FactParamContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_factParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(129);
			stringIdList();
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

	public static class HeadParamContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(DatalogParser.VAR, 0); }
		public VarListContext varList() {
			return getRuleContext(VarListContext.class,0);
		}
		public HeadParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_headParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterHeadParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitHeadParam(this);
		}
	}

	public final HeadParamContext headParam() throws RecognitionException {
		HeadParamContext _localctx = new HeadParamContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_headParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(VAR);
			setState(132);
			varList();
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

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode LEFT_PARENTHESIS() { return getToken(DatalogParser.LEFT_PARENTHESIS, 0); }
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(DatalogParser.RIGHT_PARENTHESIS, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(LEFT_PARENTHESIS);
			setState(135);
			parameter();
			setState(136);
			operator();
			setState(137);
			parameter();
			setState(138);
			match(RIGHT_PARENTHESIS);
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

	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(DatalogParser.ADD, 0); }
		public TerminalNode MULTIPLICATION() { return getToken(DatalogParser.MULTIPLICATION, 0); }
		public TerminalNode DIVISION() { return getToken(DatalogParser.DIVISION, 0); }
		public TerminalNode MINUS() { return getToken(DatalogParser.MINUS, 0); }
		public TerminalNode GREATER_THAN() { return getToken(DatalogParser.GREATER_THAN, 0); }
		public TerminalNode GREATER_THAN_OR_EQUAL() { return getToken(DatalogParser.GREATER_THAN_OR_EQUAL, 0); }
		public TerminalNode LESSER_THAN() { return getToken(DatalogParser.LESSER_THAN, 0); }
		public TerminalNode LESSER_THAN_OR_EQUAL() { return getToken(DatalogParser.LESSER_THAN_OR_EQUAL, 0); }
		public TerminalNode EQUAL() { return getToken(DatalogParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(DatalogParser.NOT_EQUAL, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitOperator(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTIPLICATION) | (1L << DIVISION) | (1L << ADD) | (1L << MINUS) | (1L << GREATER_THAN) | (1L << GREATER_THAN_OR_EQUAL) | (1L << LESSER_THAN) | (1L << LESSER_THAN_OR_EQUAL) | (1L << EQUAL) | (1L << NOT_EQUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33\u0091\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\6\2,\n\2\r\2\16\2-\3\3\3\3\3\3\3\3"+
		"\3\3\5\3\65\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\5\6F\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\5\13c\n\13"+
		"\3\f\3\f\3\f\3\f\5\fi\n\f\3\r\3\r\3\r\3\r\3\r\5\rp\n\r\3\16\3\16\3\16"+
		"\3\16\5\16v\n\16\3\17\3\17\3\17\5\17{\n\17\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3"+
		"\25\3\25\2\2\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\4\4\2\26"+
		"\26\30\30\3\2\4\r\2\u0088\2+\3\2\2\2\4\64\3\2\2\2\6\66\3\2\2\2\b<\3\2"+
		"\2\2\nE\3\2\2\2\fG\3\2\2\2\16M\3\2\2\2\20S\3\2\2\2\22X\3\2\2\2\24b\3\2"+
		"\2\2\26h\3\2\2\2\30o\3\2\2\2\32u\3\2\2\2\34z\3\2\2\2\36|\3\2\2\2 \177"+
		"\3\2\2\2\"\u0082\3\2\2\2$\u0085\3\2\2\2&\u0088\3\2\2\2(\u008e\3\2\2\2"+
		"*,\5\4\3\2+*\3\2\2\2,-\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\3\3\2\2\2/\60\7\3"+
		"\2\2\60\65\5\b\5\2\61\65\5\f\7\2\62\65\5\16\b\2\63\65\5\6\4\2\64/\3\2"+
		"\2\2\64\61\3\2\2\2\64\62\3\2\2\2\64\63\3\2\2\2\65\5\3\2\2\2\66\67\7\26"+
		"\2\2\678\7\16\2\289\5\36\20\29:\7\17\2\2:;\7\23\2\2;\7\3\2\2\2<=\7\26"+
		"\2\2=>\7\16\2\2>?\5 \21\2?@\7\17\2\2@\t\3\2\2\2AB\7\20\2\2BC\7\26\2\2"+
		"CF\5\n\6\2DF\3\2\2\2EA\3\2\2\2ED\3\2\2\2F\13\3\2\2\2GH\7\26\2\2HI\7\16"+
		"\2\2IJ\5\"\22\2JK\7\17\2\2KL\7\21\2\2L\r\3\2\2\2MN\5\20\t\2NO\7\24\2\2"+
		"OP\5\22\n\2PQ\5\24\13\2QR\7\21\2\2R\17\3\2\2\2ST\7\26\2\2TU\7\16\2\2U"+
		"V\5$\23\2VW\7\17\2\2W\21\3\2\2\2XY\7\26\2\2YZ\7\16\2\2Z[\5\36\20\2[\\"+
		"\7\17\2\2\\\23\3\2\2\2]^\7\20\2\2^_\5\22\n\2_`\5\24\13\2`c\3\2\2\2ac\3"+
		"\2\2\2b]\3\2\2\2ba\3\2\2\2c\25\3\2\2\2di\7\30\2\2ei\7\26\2\2fi\7\27\2"+
		"\2gi\5&\24\2hd\3\2\2\2he\3\2\2\2hf\3\2\2\2hg\3\2\2\2i\27\3\2\2\2jk\7\20"+
		"\2\2kl\5\26\f\2lm\5\30\r\2mp\3\2\2\2np\3\2\2\2oj\3\2\2\2on\3\2\2\2p\31"+
		"\3\2\2\2qr\7\20\2\2rs\t\2\2\2sv\5\32\16\2tv\3\2\2\2uq\3\2\2\2ut\3\2\2"+
		"\2v\33\3\2\2\2wx\7\20\2\2x{\7\27\2\2y{\3\2\2\2zw\3\2\2\2zy\3\2\2\2{\35"+
		"\3\2\2\2|}\5\26\f\2}~\5\30\r\2~\37\3\2\2\2\177\u0080\7\26\2\2\u0080\u0081"+
		"\5\n\6\2\u0081!\3\2\2\2\u0082\u0083\t\2\2\2\u0083\u0084\5\32\16\2\u0084"+
		"#\3\2\2\2\u0085\u0086\7\27\2\2\u0086\u0087\5\34\17\2\u0087%\3\2\2\2\u0088"+
		"\u0089\7\16\2\2\u0089\u008a\5\26\f\2\u008a\u008b\5(\25\2\u008b\u008c\5"+
		"\26\f\2\u008c\u008d\7\17\2\2\u008d\'\3\2\2\2\u008e\u008f\t\3\2\2\u008f"+
		")\3\2\2\2\n-\64Ebhouz";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}