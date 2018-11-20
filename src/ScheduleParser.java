import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ScheduleParser extends Parser{
    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static String[] modeNames = {
            "DEFAULT_MODE"
    };

    public static final String[] tokenNames = {
            "<INVALID>",
            "'Schedule {'", "'}'", "':'", "'->'", "'('", "'),'", "')'", "','",
            "HARI", "JAM", "PREFORW", "ALPHA", "ALPHAS", "ALPHANUM", "NUM", "WS"
    };
    public static final String[] ruleNames = {
            "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7",
            "HARI", "JAM", "PREFORW", "ALPHA", "ALPHAS", "ALPHANUM", "NUM", "WS"
    };

    @Override
    public String getGrammarFileName() { return "Schedule.g4"; }

    @Override
    public String[] getTokenNames() { return tokenNames; }

    @Override
    public String[] getRuleNames() { return ruleNames; }

    @Override
    public ATN getATN() { return _ATN; }

    public static final String _serializedATN =
            "\2\3\n\32\4\2\t\2\4\3\t\3\4\4\t\4\3\2\3\2\6\2\13\n\2\r\2\16\2\f\3\2\3"+
                    "\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\2\5\2\4\6\2\2\27\2\b\3\2\2"+
                    "\2\4\20\3\2\2\2\6\22\3\2\2\2\b\n\7\6\2\2\t\13\5\6\4\2\n\t\3\2\2\2\13\f"+
                    "\3\2\2\2\f\n\3\2\2\2\f\r\3\2\2\2\r\16\3\2\2\2\16\17\7\7\2\2\17\3\3\2\2"+
                    "\2\20\21\7\b\2\2\21\5\3\2\2\2\22\23\5\4\3\2\23\24\7\3\2\2\24\25\5\4\3"+
                    "\2\25\26\7\5\2\2\26\27\7\t\2\2\27\30\7\4\2\2\30\7\3\2\2\2\3\f";
    public static final ATN _ATN =
            ATNSimulator.deserialize(_serializedATN.toCharArray());
    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    }

    public ScheduleParser(TokenStream input){
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

}
