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
		RULE_idList = 4, RULE_headPredicate = 5, RULE_predicate = 6, RULE_predicateList = 7, 
		RULE_parameter = 8, RULE_parameterList = 9, RULE_stringIdList = 10, RULE_varList = 11, 
		RULE_predParam = 12, RULE_tableParam = 13, RULE_factParam = 14, RULE_headParam = 15, 
		RULE_expression = 16, RULE_operator = 17;
	public static final String[] ruleNames = {
		"prog", "datalogProgram", "query", "table", "idList", "headPredicate", 
		"predicate", "predicateList", "parameter", "parameterList", "stringIdList", 
		"varList", "predParam", "tableParam", "factParam", "headParam", "expression", 
		"operator"
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(36);
				datalogProgram();
				}
				}
				setState(39); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
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
	public static class QuerydecContext extends DatalogProgramContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public QuerydecContext(DatalogProgramContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitQuerydec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatalogProgramContext datalogProgram() throws RecognitionException {
		DatalogProgramContext _localctx = new DatalogProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_datalogProgram);
		try {
			_localctx = new QuerydecContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(T__0);
			setState(42);
			query();
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(ID);
			setState(45);
			match(LEFT_PARENTHESIS);
			setState(46);
			predParam();
			setState(47);
			match(RIGHT_PARENTHESIS);
			setState(48);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableContext table() throws RecognitionException {
		TableContext _localctx = new TableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(ID);
			setState(51);
			match(LEFT_PARENTHESIS);
			setState(52);
			tableParam();
			setState(53);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitIdList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdListContext idList() throws RecognitionException {
		IdListContext _localctx = new IdListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_idList);
		try {
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				match(COMMA);
				setState(56);
				match(ID);
				setState(57);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitHeadPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeadPredicateContext headPredicate() throws RecognitionException {
		HeadPredicateContext _localctx = new HeadPredicateContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_headPredicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(ID);
			setState(62);
			match(LEFT_PARENTHESIS);
			setState(63);
			headParam();
			setState(64);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_predicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(ID);
			setState(67);
			match(LEFT_PARENTHESIS);
			setState(68);
			predParam();
			setState(69);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitPredicateList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateListContext predicateList() throws RecognitionException {
		PredicateListContext _localctx = new PredicateListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_predicateList);
		try {
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				match(COMMA);
				setState(72);
				predicate();
				setState(73);
				predicateList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parameter);
		try {
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				match(STRING);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				match(ID);
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				match(VAR);
				}
				break;
			case LEFT_PARENTHESIS:
				enterOuterAlt(_localctx, 4);
				{
				setState(81);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_parameterList);
		try {
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				match(COMMA);
				setState(85);
				parameter();
				setState(86);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitStringIdList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringIdListContext stringIdList() throws RecognitionException {
		StringIdListContext _localctx = new StringIdListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_stringIdList);
		int _la;
		try {
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				match(COMMA);
				setState(92);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==STRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(93);
				stringIdList();
				}
				break;
			case EOF:
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitVarList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarListContext varList() throws RecognitionException {
		VarListContext _localctx = new VarListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_varList);
		try {
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				match(COMMA);
				setState(98);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitPredParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredParamContext predParam() throws RecognitionException {
		PredParamContext _localctx = new PredParamContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_predParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			parameter();
			setState(103);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitTableParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableParamContext tableParam() throws RecognitionException {
		TableParamContext _localctx = new TableParamContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tableParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(ID);
			setState(106);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitFactParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactParamContext factParam() throws RecognitionException {
		FactParamContext _localctx = new FactParamContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_factParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(109);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitHeadParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeadParamContext headParam() throws RecognitionException {
		HeadParamContext _localctx = new HeadParamContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_headParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(VAR);
			setState(112);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(LEFT_PARENTHESIS);
			setState(115);
			parameter();
			setState(116);
			operator();
			setState(117);
			parameter();
			setState(118);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33}\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\4\23"+
		"\t\23\3\2\6\2(\n\2\r\2\16\2)\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6>\n\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\tO\n\t\3\n\3\n\3\n\3\n\5\nU\n\n\3\13"+
		"\3\13\3\13\3\13\3\13\5\13\\\n\13\3\f\3\f\3\f\3\f\5\fb\n\f\3\r\3\r\3\r"+
		"\5\rg\n\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\2\2\24\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$\2\4\4\2\26\26\30\30\3\2\4\r\2s\2\'\3\2\2\2\4"+
		"+\3\2\2\2\6.\3\2\2\2\b\64\3\2\2\2\n=\3\2\2\2\f?\3\2\2\2\16D\3\2\2\2\20"+
		"N\3\2\2\2\22T\3\2\2\2\24[\3\2\2\2\26a\3\2\2\2\30f\3\2\2\2\32h\3\2\2\2"+
		"\34k\3\2\2\2\36n\3\2\2\2 q\3\2\2\2\"t\3\2\2\2$z\3\2\2\2&(\5\4\3\2\'&\3"+
		"\2\2\2()\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*\3\3\2\2\2+,\7\3\2\2,-\5\6\4\2-"+
		"\5\3\2\2\2./\7\26\2\2/\60\7\16\2\2\60\61\5\32\16\2\61\62\7\17\2\2\62\63"+
		"\7\23\2\2\63\7\3\2\2\2\64\65\7\26\2\2\65\66\7\16\2\2\66\67\5\34\17\2\67"+
		"8\7\17\2\28\t\3\2\2\29:\7\20\2\2:;\7\26\2\2;>\5\n\6\2<>\3\2\2\2=9\3\2"+
		"\2\2=<\3\2\2\2>\13\3\2\2\2?@\7\26\2\2@A\7\16\2\2AB\5 \21\2BC\7\17\2\2"+
		"C\r\3\2\2\2DE\7\26\2\2EF\7\16\2\2FG\5\32\16\2GH\7\17\2\2H\17\3\2\2\2I"+
		"J\7\20\2\2JK\5\16\b\2KL\5\20\t\2LO\3\2\2\2MO\3\2\2\2NI\3\2\2\2NM\3\2\2"+
		"\2O\21\3\2\2\2PU\7\30\2\2QU\7\26\2\2RU\7\27\2\2SU\5\"\22\2TP\3\2\2\2T"+
		"Q\3\2\2\2TR\3\2\2\2TS\3\2\2\2U\23\3\2\2\2VW\7\20\2\2WX\5\22\n\2XY\5\24"+
		"\13\2Y\\\3\2\2\2Z\\\3\2\2\2[V\3\2\2\2[Z\3\2\2\2\\\25\3\2\2\2]^\7\20\2"+
		"\2^_\t\2\2\2_b\5\26\f\2`b\3\2\2\2a]\3\2\2\2a`\3\2\2\2b\27\3\2\2\2cd\7"+
		"\20\2\2dg\7\27\2\2eg\3\2\2\2fc\3\2\2\2fe\3\2\2\2g\31\3\2\2\2hi\5\22\n"+
		"\2ij\5\24\13\2j\33\3\2\2\2kl\7\26\2\2lm\5\n\6\2m\35\3\2\2\2no\t\2\2\2"+
		"op\5\26\f\2p\37\3\2\2\2qr\7\27\2\2rs\5\30\r\2s!\3\2\2\2tu\7\16\2\2uv\5"+
		"\22\n\2vw\5$\23\2wx\5\22\n\2xy\7\17\2\2y#\3\2\2\2z{\t\3\2\2{%\3\2\2\2"+
		"\t)=NT[af";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}