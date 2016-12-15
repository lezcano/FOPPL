// Generated from /home/lezkus/Documents/TFM/foppl/src/ox/foppl/grammar/foppl.g4 by ANTLR 4.5.3
package ox.foppl.gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class fopplLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, SAMPLE=5, OBSERVE=6, LET=7, DEFN=8, IDENTIFIER=9, 
		INT=10, FLOAT=11, LOOP=12, IF=13, VECTOR=14, NORMAL=15, GAMMA=16, SQRT=17, 
		FIRST=18, SECOND=19, LAST=20, ADD=21, SUB=22, MULT=23, DIV=24, TRASH=25;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "SAMPLE", "OBSERVE", "LET", "DEFN", "IDENTIFIER", 
		"INT", "FLOAT", "LOOP", "IF", "VECTOR", "NORMAL", "GAMMA", "SQRT", "FIRST", 
		"SECOND", "LAST", "ADD", "SUB", "MULT", "DIV", "WS", "COMMENT", "TRASH"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "'['", "']'", "')'", "'sample'", "'observe'", "'let'", "'defn'", 
		null, null, null, "'loop'", "'if'", "'vector'", "'normal'", "'gamma'", 
		"'sqrt'", "'first'", "'second'", "'last'", "'+'", "'-'", "'*'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "SAMPLE", "OBSERVE", "LET", "DEFN", "IDENTIFIER", 
		"INT", "FLOAT", "LOOP", "IF", "VECTOR", "NORMAL", "GAMMA", "SQRT", "FIRST", 
		"SECOND", "LAST", "ADD", "SUB", "MULT", "DIV", "TRASH"
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


	public fopplLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "foppl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\33\u00bb\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\n\5\n[\n\n\3\n\7\n^\n\n\f\n\16\na\13\n\3\13"+
		"\5\13d\n\13\3\13\6\13g\n\13\r\13\16\13h\3\f\3\f\3\f\6\fn\n\f\r\f\16\f"+
		"o\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30"+
		"\3\31\3\31\3\32\3\32\3\33\3\33\7\33\u00b1\n\33\f\33\16\33\u00b4\13\33"+
		"\3\34\3\34\5\34\u00b8\n\34\3\34\3\34\2\2\35\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\2\65\2\67\33\3\2\b\5\2C\\aac|\7\2//\62;C\\aac|\4"+
		"\2--//\3\2\62;\7\2\13\f\17\17\"\"..^^\4\2\f\f\17\17\u00be\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\67\3\2\2\2\39\3\2\2\2\5;\3\2\2\2\7=\3\2\2\2\t?\3\2\2\2\13A\3\2\2"+
		"\2\rH\3\2\2\2\17P\3\2\2\2\21T\3\2\2\2\23Z\3\2\2\2\25c\3\2\2\2\27j\3\2"+
		"\2\2\31q\3\2\2\2\33v\3\2\2\2\35y\3\2\2\2\37\u0080\3\2\2\2!\u0087\3\2\2"+
		"\2#\u008d\3\2\2\2%\u0092\3\2\2\2\'\u0098\3\2\2\2)\u009f\3\2\2\2+\u00a4"+
		"\3\2\2\2-\u00a6\3\2\2\2/\u00a8\3\2\2\2\61\u00aa\3\2\2\2\63\u00ac\3\2\2"+
		"\2\65\u00ae\3\2\2\2\67\u00b7\3\2\2\29:\7*\2\2:\4\3\2\2\2;<\7]\2\2<\6\3"+
		"\2\2\2=>\7_\2\2>\b\3\2\2\2?@\7+\2\2@\n\3\2\2\2AB\7u\2\2BC\7c\2\2CD\7o"+
		"\2\2DE\7r\2\2EF\7n\2\2FG\7g\2\2G\f\3\2\2\2HI\7q\2\2IJ\7d\2\2JK\7u\2\2"+
		"KL\7g\2\2LM\7t\2\2MN\7x\2\2NO\7g\2\2O\16\3\2\2\2PQ\7n\2\2QR\7g\2\2RS\7"+
		"v\2\2S\20\3\2\2\2TU\7f\2\2UV\7g\2\2VW\7h\2\2WX\7p\2\2X\22\3\2\2\2Y[\t"+
		"\2\2\2ZY\3\2\2\2[_\3\2\2\2\\^\t\3\2\2]\\\3\2\2\2^a\3\2\2\2_]\3\2\2\2_"+
		"`\3\2\2\2`\24\3\2\2\2a_\3\2\2\2bd\t\4\2\2cb\3\2\2\2cd\3\2\2\2df\3\2\2"+
		"\2eg\t\5\2\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2i\26\3\2\2\2jk\5\25"+
		"\13\2km\7\60\2\2ln\t\5\2\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2\2\2p\30"+
		"\3\2\2\2qr\7n\2\2rs\7q\2\2st\7q\2\2tu\7r\2\2u\32\3\2\2\2vw\7k\2\2wx\7"+
		"h\2\2x\34\3\2\2\2yz\7x\2\2z{\7g\2\2{|\7e\2\2|}\7v\2\2}~\7q\2\2~\177\7"+
		"t\2\2\177\36\3\2\2\2\u0080\u0081\7p\2\2\u0081\u0082\7q\2\2\u0082\u0083"+
		"\7t\2\2\u0083\u0084\7o\2\2\u0084\u0085\7c\2\2\u0085\u0086\7n\2\2\u0086"+
		" \3\2\2\2\u0087\u0088\7i\2\2\u0088\u0089\7c\2\2\u0089\u008a\7o\2\2\u008a"+
		"\u008b\7o\2\2\u008b\u008c\7c\2\2\u008c\"\3\2\2\2\u008d\u008e\7u\2\2\u008e"+
		"\u008f\7s\2\2\u008f\u0090\7t\2\2\u0090\u0091\7v\2\2\u0091$\3\2\2\2\u0092"+
		"\u0093\7h\2\2\u0093\u0094\7k\2\2\u0094\u0095\7t\2\2\u0095\u0096\7u\2\2"+
		"\u0096\u0097\7v\2\2\u0097&\3\2\2\2\u0098\u0099\7u\2\2\u0099\u009a\7g\2"+
		"\2\u009a\u009b\7e\2\2\u009b\u009c\7q\2\2\u009c\u009d\7p\2\2\u009d\u009e"+
		"\7f\2\2\u009e(\3\2\2\2\u009f\u00a0\7n\2\2\u00a0\u00a1\7c\2\2\u00a1\u00a2"+
		"\7u\2\2\u00a2\u00a3\7v\2\2\u00a3*\3\2\2\2\u00a4\u00a5\7-\2\2\u00a5,\3"+
		"\2\2\2\u00a6\u00a7\7/\2\2\u00a7.\3\2\2\2\u00a8\u00a9\7,\2\2\u00a9\60\3"+
		"\2\2\2\u00aa\u00ab\7\61\2\2\u00ab\62\3\2\2\2\u00ac\u00ad\t\6\2\2\u00ad"+
		"\64\3\2\2\2\u00ae\u00b2\7=\2\2\u00af\u00b1\n\7\2\2\u00b0\u00af\3\2\2\2"+
		"\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\66"+
		"\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b8\5\63\32\2\u00b6\u00b8\5\65\33"+
		"\2\u00b7\u00b5\3\2\2\2\u00b7\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba"+
		"\b\34\2\2\u00ba8\3\2\2\2\13\2Z]_cho\u00b2\u00b7\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}