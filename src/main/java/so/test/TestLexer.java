// Generated from so/test/TestLexer.g4 by ANTLR 4.3
package so.test;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TestLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LBR=1, STRING=2, RBR=3;
	public static final int InString = 1;
	public static String[] modeNames = {
		"DEFAULT_MODE", "InString"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'"
	};
	public static final String[] ruleNames = {
		"LBR", "STRING", "RBR"
	};


	public TestLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TestLexer.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\5\32\b\1\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\6\3\23\n\3\r\3\16"+
		"\3\24\3\4\3\4\3\4\3\4\2\2\5\4\3\6\4\b\5\4\2\3\3\3\2c|\33\2\4\3\2\2\2\3"+
		"\6\3\2\2\2\3\b\3\2\2\2\4\n\3\2\2\2\6\22\3\2\2\2\b\26\3\2\2\2\n\13\7]\2"+
		"\2\13\f\3\2\2\2\f\r\b\2\2\2\r\5\3\2\2\2\16\23\t\2\2\2\17\20\7^\2\2\20"+
		"\23\7_\2\2\21\23\7]\2\2\22\16\3\2\2\2\22\17\3\2\2\2\22\21\3\2\2\2\23\24"+
		"\3\2\2\2\24\22\3\2\2\2\24\25\3\2\2\2\25\7\3\2\2\2\26\27\7_\2\2\27\30\3"+
		"\2\2\2\30\31\b\4\3\2\31\t\3\2\2\2\6\2\3\22\24\4\7\3\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}