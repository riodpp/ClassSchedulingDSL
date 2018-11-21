// Generated from D:/tugas/sem7/rpsld/ClassSchedulingDSL/src\Schedule.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ScheduleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, SCHEDULE=4, HARI=5, JAM=6, PREFORW=7, ALPHA=8, 
		ALPHANUM=9, NUM=10, COMMA=11, ENTER=12, TAB=13, WS=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "SCHEDULE", "HARI", "JAM", "PREFORW", "ALPHA", 
		"ALPHANUM", "NUM", "COMMA", "ENTER", "TAB", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'->'", "'('", "')'", "'Schedule {'", null, null, null, null, null, 
		null, "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "SCHEDULE", "HARI", "JAM", "PREFORW", "ALPHA", 
		"ALPHANUM", "NUM", "COMMA", "ENTER", "TAB", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20\u008d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\3\3\3\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6V\n\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\5\7n\n\7\3\b\3\b\3\t\6\ts\n\t\r\t\16\tt\3\n\6\nx\n\n\r\n\16\n"+
		"y\3\13\6\13}\n\13\r\13\16\13~\3\f\3\f\3\r\3\r\3\16\3\16\3\17\6\17\u0088"+
		"\n\17\r\17\16\17\u0089\3\17\3\17\2\2\20\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\3\2\t\4\2RRYY\4\2C\\c|\5\2\62"+
		";C\\c|\3\2\62;\3\2\f\f\3\2\13\13\5\2\13\f\17\17\"\"\2\u00a0\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\3\37\3\2\2\2\5\"\3\2\2\2\7$\3\2\2\2\t&\3"+
		"\2\2\2\13U\3\2\2\2\rm\3\2\2\2\17o\3\2\2\2\21r\3\2\2\2\23w\3\2\2\2\25|"+
		"\3\2\2\2\27\u0080\3\2\2\2\31\u0082\3\2\2\2\33\u0084\3\2\2\2\35\u0087\3"+
		"\2\2\2\37 \7/\2\2 !\7@\2\2!\4\3\2\2\2\"#\7*\2\2#\6\3\2\2\2$%\7+\2\2%\b"+
		"\3\2\2\2&\'\7U\2\2\'(\7e\2\2()\7j\2\2)*\7g\2\2*+\7f\2\2+,\7w\2\2,-\7n"+
		"\2\2-.\7g\2\2./\7\"\2\2/\60\7}\2\2\60\n\3\2\2\2\61\62\7U\2\2\62\63\7g"+
		"\2\2\63\64\7p\2\2\64\65\7k\2\2\65V\7p\2\2\66\67\7U\2\2\678\7g\2\289\7"+
		"n\2\29:\7c\2\2:;\7u\2\2;V\7c\2\2<=\7T\2\2=>\7c\2\2>?\7d\2\2?V\7w\2\2@"+
		"A\7M\2\2AB\7c\2\2BC\7o\2\2CD\7k\2\2DV\7u\2\2EF\7L\2\2FG\7w\2\2GH\7o\2"+
		"\2HI\7c\2\2IV\7v\2\2JK\7U\2\2KL\7c\2\2LM\7d\2\2MN\7v\2\2NV\7w\2\2OP\7"+
		"O\2\2PQ\7k\2\2QR\7p\2\2RS\7i\2\2ST\7i\2\2TV\7w\2\2U\61\3\2\2\2U\66\3\2"+
		"\2\2U<\3\2\2\2U@\3\2\2\2UE\3\2\2\2UJ\3\2\2\2UO\3\2\2\2V\f\3\2\2\2WX\7"+
		"\62\2\2Xn\7\63\2\2YZ\7\62\2\2Zn\7\64\2\2[\\\7\62\2\2\\n\7\65\2\2]^\7\62"+
		"\2\2^n\7\66\2\2_`\7\62\2\2`n\7\67\2\2ab\7\62\2\2bn\78\2\2cd\7\62\2\2d"+
		"n\79\2\2ef\7\62\2\2fn\7:\2\2gh\7\62\2\2hn\7;\2\2ij\7\63\2\2jn\7\62\2\2"+
		"kl\7\63\2\2ln\7\63\2\2mW\3\2\2\2mY\3\2\2\2m[\3\2\2\2m]\3\2\2\2m_\3\2\2"+
		"\2ma\3\2\2\2mc\3\2\2\2me\3\2\2\2mg\3\2\2\2mi\3\2\2\2mk\3\2\2\2n\16\3\2"+
		"\2\2op\t\2\2\2p\20\3\2\2\2qs\t\3\2\2rq\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3"+
		"\2\2\2u\22\3\2\2\2vx\t\4\2\2wv\3\2\2\2xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2z"+
		"\24\3\2\2\2{}\t\5\2\2|{\3\2\2\2}~\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\26"+
		"\3\2\2\2\u0080\u0081\7.\2\2\u0081\30\3\2\2\2\u0082\u0083\t\6\2\2\u0083"+
		"\32\3\2\2\2\u0084\u0085\t\7\2\2\u0085\34\3\2\2\2\u0086\u0088\t\b\2\2\u0087"+
		"\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2"+
		"\2\2\u008a\u008b\3\2\2\2\u008b\u008c\b\17\2\2\u008c\36\3\2\2\2\t\2Umt"+
		"y~\u0089\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}