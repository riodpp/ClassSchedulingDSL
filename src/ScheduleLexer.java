import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

public class ScheduleLexer extends Lexer {
    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static String[] modeNames = {
            "DEFAULT_MODE"
    };

    public static final String[] tokenNames = {
            "<INVALID>",
            "'->'", "')'", "'('", "'Graph {'", "'}'", "ID", "NUM", "WS"
    };
    public static final String[] ruleNames = {
            "T__4", "T__3", "T__2", "T__1", "T__0", "ID", "NUM", "WS"
    };

    public ScheduleLexer(CharStream input){
        super(input);
        _interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
    }

    @Override
    public String getGrammarFileName() { return "Graph.g4"; }

    @Override
    public String[] getTokenNames() { return tokenNames; }

    @Override
    public String[] getRuleNames() { return ruleNames; }

    @Override
    public String[] getModeNames() { return modeNames; }

    @Override
    public ATN getATN() { return _ATN; }

    @Override
    public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
        switch (ruleIndex) {
            case 7: WS_action((RuleContext)_localctx, actionIndex); break;
        }
    }
    private void WS_action(RuleContext _localctx, int actionIndex) {
        switch (actionIndex) {
            case 0: skip();  break;
        }
    }

    public static final String _serializedATN =
            "\2\4\n\65\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b"+
                    "\4\t\t\t\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
                    "\6\3\6\3\7\6\7&\n\7\r\7\16\7\'\3\b\6\b+\n\b\r\b\16\b,\3\t\6\t\60\n\t\r"+
                    "\t\16\t\61\3\t\3\t\2\n\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21"+
                    "\n\2\3\2\5\4C\\c|\3\62;\5\13\f\17\17\"\"\67\2\3\3\2\2\2\2\5\3\2\2\2\2"+
                    "\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
                    "\2\2\3\23\3\2\2\2\5\26\3\2\2\2\7\30\3\2\2\2\t\32\3\2\2\2\13\"\3\2\2\2"+
                    "\r%\3\2\2\2\17*\3\2\2\2\21/\3\2\2\2\23\24\7/\2\2\24\25\7@\2\2\25\4\3\2"+
                    "\2\2\26\27\7+\2\2\27\6\3\2\2\2\30\31\7*\2\2\31\b\3\2\2\2\32\33\7I\2\2"+
                    "\33\34\7t\2\2\34\35\7c\2\2\35\36\7r\2\2\36\37\7j\2\2\37 \7\"\2\2 !\7}"+
                    "\2\2!\n\3\2\2\2\"#\7\177\2\2#\f\3\2\2\2$&\t\2\2\2%$\3\2\2\2&\'\3\2\2\2"+
                    "\'%\3\2\2\2\'(\3\2\2\2(\16\3\2\2\2)+\t\3\2\2*)\3\2\2\2+,\3\2\2\2,*\3\2"+
                    "\2\2,-\3\2\2\2-\20\3\2\2\2.\60\t\4\2\2/.\3\2\2\2\60\61\3\2\2\2\61/\3\2"+
                    "\2\2\61\62\3\2\2\2\62\63\3\2\2\2\63\64\b\t\2\2\64\22\3\2\2\2\6\2\',\61";
    public static final ATN _ATN =
            ATNSimulator.deserialize(_serializedATN.toCharArray());
    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    }

}
