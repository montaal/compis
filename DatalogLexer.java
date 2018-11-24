// Generated from Datalog.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DatalogLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "MULTIPLICATION", "DIVISION", "ADD", "MINUS", "GREATER_THAN",
		"GREATER_THAN_OR_EQUAL", "LESSER_THAN", "LESSER_THAN_OR_EQUAL", "EQUAL",
		"NOT_EQUAL", "LEFT_PARENTHESIS", "RIGHT_PARENTHESIS", "COMMA", "DOT",
		"TILDE", "QUESTION_MARK", "COLON_DASH", "DOUBLE_QUOTE", "ID", "VAR", "STRING",
		"LINE_COMMENT", "COMMMENT", "WS", "ESC_SEQ"
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


	public DatalogLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Datalog.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u00a4\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\7\25i\n\25\f\25\16\25l\13\25\3\26\3\26"+
		"\7\26p\n\26\f\26\16\26s\13\26\3\27\3\27\3\27\7\27x\n\27\f\27\16\27{\13"+
		"\27\3\27\3\27\3\30\3\30\7\30\u0081\n\30\f\30\16\30\u0084\13\30\3\30\5"+
		"\30\u0087\n\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\7\31\u0091\n\31"+
		"\f\31\16\31\u0094\13\31\3\31\3\31\3\31\3\31\3\31\3\32\6\32\u009c\n\32"+
		"\r\32\16\32\u009d\3\32\3\32\3\33\3\33\3\33\3\u0092\2\34\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\2\3\2\n\5\2\62;aac|\6\2\62;C"+
		"\\aac|\3\2C\\\5\2\62;C\\c|\5\2\f\f$$^^\4\2\f\f\17\17\5\2\13\f\17\17\""+
		"\"\n\2$$))^^ddhhppttvv\2\u00aa\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\3\67\3\2\2\2"+
		"\5>\3\2\2\2\7@\3\2\2\2\tB\3\2\2\2\13D\3\2\2\2\rF\3\2\2\2\17H\3\2\2\2\21"+
		"K\3\2\2\2\23M\3\2\2\2\25P\3\2\2\2\27R\3\2\2\2\31U\3\2\2\2\33W\3\2\2\2"+
		"\35Y\3\2\2\2\37[\3\2\2\2!]\3\2\2\2#_\3\2\2\2%a\3\2\2\2\'d\3\2\2\2)f\3"+
		"\2\2\2+m\3\2\2\2-t\3\2\2\2/~\3\2\2\2\61\u008c\3\2\2\2\63\u009b\3\2\2\2"+
		"\65\u00a1\3\2\2\2\678\7V\2\289\7c\2\29:\7d\2\2:;\7n\2\2;<\7g\2\2<=\7<"+
		"\2\2=\4\3\2\2\2>?\7,\2\2?\6\3\2\2\2@A\7\61\2\2A\b\3\2\2\2BC\7-\2\2C\n"+
		"\3\2\2\2DE\7/\2\2E\f\3\2\2\2FG\7@\2\2G\16\3\2\2\2HI\7@\2\2IJ\7?\2\2J\20"+
		"\3\2\2\2KL\7>\2\2L\22\3\2\2\2MN\7>\2\2NO\7?\2\2O\24\3\2\2\2PQ\7?\2\2Q"+
		"\26\3\2\2\2RS\7#\2\2ST\7?\2\2T\30\3\2\2\2UV\7*\2\2V\32\3\2\2\2WX\7+\2"+
		"\2X\34\3\2\2\2YZ\7.\2\2Z\36\3\2\2\2[\\\7\60\2\2\\ \3\2\2\2]^\7\u0080\2"+
		"\2^\"\3\2\2\2_`\7A\2\2`$\3\2\2\2ab\7<\2\2bc\7/\2\2c&\3\2\2\2de\7$\2\2"+
		"e(\3\2\2\2fj\t\2\2\2gi\t\3\2\2hg\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2"+
		"k*\3\2\2\2lj\3\2\2\2mq\t\4\2\2np\t\5\2\2on\3\2\2\2ps\3\2\2\2qo\3\2\2\2"+
		"qr\3\2\2\2r,\3\2\2\2sq\3\2\2\2ty\7$\2\2ux\5\65\33\2vx\n\6\2\2wu\3\2\2"+
		"\2wv\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z|\3\2\2\2{y\3\2\2\2|}\7$\2"+
		"\2}.\3\2\2\2~\u0082\7%\2\2\177\u0081\n\7\2\2\u0080\177\3\2\2\2\u0081\u0084"+
		"\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0086\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0085\u0087\7\17\2\2\u0086\u0085\3\2\2\2\u0086\u0087\3"+
		"\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\7\f\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\u008b\b\30\2\2\u008b\60\3\2\2\2\u008c\u008d\7%\2\2\u008d\u008e\7~\2\2"+
		"\u008e\u0092\3\2\2\2\u008f\u0091\13\2\2\2\u0090\u008f\3\2\2\2\u0091\u0094"+
		"\3\2\2\2\u0092\u0093\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0095\3\2\2\2\u0094"+
		"\u0092\3\2\2\2\u0095\u0096\7~\2\2\u0096\u0097\7%\2\2\u0097\u0098\3\2\2"+
		"\2\u0098\u0099\b\31\2\2\u0099\62\3\2\2\2\u009a\u009c\t\b\2\2\u009b\u009a"+
		"\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\u00a0\b\32\2\2\u00a0\64\3\2\2\2\u00a1\u00a2\7^\2"+
		"\2\u00a2\u00a3\t\t\2\2\u00a3\66\3\2\2\2\13\2jqwy\u0082\u0086\u0092\u009d"+
		"\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
