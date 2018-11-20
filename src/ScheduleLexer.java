// Generated from E:/Semester 7/RPLSD/ClassSchedulingDSL/src\Schedule.g4 by ANTLR 4.7

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.VocabularyImpl;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ScheduleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, HARI=6, JAM=7, PREFORW=8, ALPHA=9, 
		ALPHANUM=10, NUM=11, COMMA=12, WS=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "HARI", "JAM", "PREFORW", "ALPHA", 
		"ALPHANUM", "NUM", "COMMA", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Schedule {'", "'}'", "'->'", "'('", "')'", null, null, null, null, 
		null, null, "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "HARI", "JAM", "PREFORW", "ALPHA", 
		"ALPHANUM", "NUM", "COMMA", "WS"
	};
	public static final VocabularyImpl VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

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

	public VocabularyImpl getVocabulary() {
		return VOCABULARY;
	}


	public ScheduleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Schedule.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17\u0087\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7V\n\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5"+
		"\bl\n\b\3\t\3\t\3\n\6\nq\n\n\r\n\16\nr\3\13\6\13v\n\13\r\13\16\13w\3\f"+
		"\6\f{\n\f\r\f\16\f|\3\r\3\r\3\16\6\16\u0082\n\16\r\16\16\16\u0083\3\16"+
		"\3\16\2\2\17\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\3\2\7\4\2RRYY\4\2C\\c|\5\2\62;C\\c|\3\2\62;\5\2\13\f\17\17\"\""+
		"\2\u0099\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\3\35\3\2\2\2\5(\3\2\2\2\7*\3\2\2\2"+
		"\t-\3\2\2\2\13/\3\2\2\2\rU\3\2\2\2\17k\3\2\2\2\21m\3\2\2\2\23p\3\2\2\2"+
		"\25u\3\2\2\2\27z\3\2\2\2\31~\3\2\2\2\33\u0081\3\2\2\2\35\36\7U\2\2\36"+
		"\37\7e\2\2\37 \7j\2\2 !\7g\2\2!\"\7f\2\2\"#\7w\2\2#$\7n\2\2$%\7g\2\2%"+
		"&\7\"\2\2&\'\7}\2\2\'\4\3\2\2\2()\7\177\2\2)\6\3\2\2\2*+\7/\2\2+,\7@\2"+
		"\2,\b\3\2\2\2-.\7*\2\2.\n\3\2\2\2/\60\7+\2\2\60\f\3\2\2\2\61\62\7U\2\2"+
		"\62\63\7g\2\2\63\64\7p\2\2\64\65\7k\2\2\65V\7p\2\2\66\67\7U\2\2\678\7"+
		"g\2\289\7n\2\29:\7c\2\2:;\7u\2\2;V\7c\2\2<=\7T\2\2=>\7c\2\2>?\7d\2\2?"+
		"V\7w\2\2@A\7M\2\2AB\7c\2\2BC\7o\2\2CD\7k\2\2DV\7u\2\2EF\7L\2\2FG\7w\2"+
		"\2GH\7o\2\2HI\7c\2\2IV\7v\2\2JK\7U\2\2KL\7c\2\2LM\7d\2\2MN\7v\2\2NV\7"+
		"w\2\2OP\7O\2\2PQ\7k\2\2QR\7p\2\2RS\7i\2\2ST\7i\2\2TV\7w\2\2U\61\3\2\2"+
		"\2U\66\3\2\2\2U<\3\2\2\2U@\3\2\2\2UE\3\2\2\2UJ\3\2\2\2UO\3\2\2\2V\16\3"+
		"\2\2\2WX\7\62\2\2Xl\7\63\2\2YZ\7\62\2\2Zl\7\64\2\2[\\\7\62\2\2\\l\7\65"+
		"\2\2]^\7\62\2\2^l\7\66\2\2_`\7\62\2\2`l\7\67\2\2ab\7\62\2\2bl\78\2\2c"+
		"d\7\62\2\2dl\79\2\2ef\7\62\2\2fl\7:\2\2gh\7\62\2\2hl\7;\2\2ij\7\63\2\2"+
		"jl\7\62\2\2kW\3\2\2\2kY\3\2\2\2k[\3\2\2\2k]\3\2\2\2k_\3\2\2\2ka\3\2\2"+
		"\2kc\3\2\2\2ke\3\2\2\2kg\3\2\2\2ki\3\2\2\2l\20\3\2\2\2mn\t\2\2\2n\22\3"+
		"\2\2\2oq\t\3\2\2po\3\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2\2\2s\24\3\2\2\2t"+
		"v\t\4\2\2ut\3\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\26\3\2\2\2y{\t\5\2"+
		"\2zy\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\30\3\2\2\2~\177\7.\2\2\177"+
		"\32\3\2\2\2\u0080\u0082\t\6\2\2\u0081\u0080\3\2\2\2\u0082\u0083\3\2\2"+
		"\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086"+
		"\b\16\2\2\u0086\34\3\2\2\2\t\2Ukrw|\u0083\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}