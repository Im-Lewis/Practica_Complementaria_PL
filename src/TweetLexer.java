// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class TweetLexer extends Lexer {
	int caracteres = 1;
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		S=1, URL=2, ARROBA=3, HASHTAG=4, ALPHA=5, SIGNOS=6, FINAL=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"S", "URL", "ARROBA", "HASHTAG", "ALPHA", "SIGNOS", "FINAL"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, "'#FIN@'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "S", "URL", "ARROBA", "HASHTAG", "ALPHA", "SIGNOS", "FINAL"
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


	public TweetLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Tweet.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 1:
			URL_action((RuleContext)_localctx, actionIndex);
			break;
		case 2:
			ARROBA_action((RuleContext)_localctx, actionIndex);
			break;
		case 3:
			HASHTAG_action((RuleContext)_localctx, actionIndex);
			break;
		case 4:
			ALPHA_action((RuleContext)_localctx, actionIndex);
			break;
		case 5:
			SIGNOS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void URL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:

			    if(caracteres<140){
			        if((140-caracteres) > getText().length()){
			            System.out.print("<SPAN CLASS=" + '"' + "link" + '"' + ">" + getText() + "</SPAN>");
			            caracteres += getText().length();
			        }
			        else{
			            System.out.print("<SPAN CLASS=" + '"' + "link" + '"' + ">");
			            for(int i = 0; i<(141-caracteres); i++){
			                System.out.print(getText().charAt(i));
			            }
			            System.out.print("</SPAN>");
			            System.out.print("<SPAN CLASS=" + '"' + "sobrante" + '"' + ">");
			            for(int k = (141-caracteres); k<getText().length(); k++){
			                System.out.print(getText().charAt(k));
			            }
			            System.out.print("</SPAN>");
			        }
			    }
			    else{
			        System.out.print("<SPAN CLASS=" + '"' + "sobrante" + '"' + ">");
			        for(int j = (140-caracteres); j<getText().length(); j++){
			            System.out.print(getText().charAt(j));
			        }
			        System.out.print("</SPAN>");
			    }

			break;
		}
	}
	private void ARROBA_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:

			    if(caracteres<140){
			        if((140-caracteres) > getText().length()){
			            System.out.print("<SPAN CLASS=" + '"' + "usr" + '"' + ">" + getText() + "</SPAN>");
			            caracteres += getText().length();
			        }
			        else{
			            System.out.print("<SPAN CLASS=" + '"' + "usr" + '"' + ">");
			            for(int i = 0; i<(141-caracteres); i++){
			                System.out.print(getText().charAt(i));
			            }
			            System.out.print("</SPAN>");
			            System.out.print("<SPAN CLASS=" + '"' + "sobrante" + '"' + ">");
			            for(int k = (141-caracteres); k<getText().length(); k++){
			                System.out.print(getText().charAt(k));
			            }
			            System.out.print("</SPAN>");
			        }
			    }
			    else{
			        System.out.print("<SPAN CLASS=" + '"' + "sobrante" + '"' + ">");
			        for(int j = (140-caracteres); j<getText().length(); j++){
			            System.out.print(getText().charAt(j));
			        }
			        System.out.print("</SPAN>");
			    }

			break;
		}
	}
	private void HASHTAG_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:

			    if(caracteres<140){
			        if((140-caracteres) > getText().length()){
			            System.out.print("<SPAN CLASS=" + '"' + "hashtag" + '"' + ">" + getText() + "</SPAN>");
			            caracteres += getText().length();
			        }
			        else{
			            System.out.print("<SPAN CLASS=" + '"' + "hashtag" + '"' + ">");
			            for(int i = 0; i<(141-caracteres); i++){
			                System.out.print(getText().charAt(i));
			            }
			            System.out.print("</SPAN>");

			            System.out.print("<SPAN CLASS=" + '"' + "sobrante" + '"' + ">");
			            for(int k = (141-caracteres); k<getText().length(); k++){
			                System.out.print(getText().charAt(k));
			            }
			            System.out.print("</SPAN>");
			        }
			    }
			    else{
			        System.out.print("<SPAN CLASS=" + '"' + "sobrante" + '"' + ">");
			        for(int j = (140-caracteres); j<getText().length(); j++){
			            System.out.print(getText().charAt(j));
			        }
			        System.out.print("</SPAN>");
			    }

			break;
		}
	}
	private void ALPHA_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:

			    if(caracteres < 140){
			        if((140-caracteres) > getText().length()){
			            System.out.print(getText());
			            caracteres += getText().length();
			        }
			        else{
			            for(int i = 0; i<(141-caracteres); i++){
			                System.out.print(getText().charAt(i));
			            }

			            System.out.print("<SPAN CLASS=" + '"' + "sobrante" + '"' + ">");
			            for(int k = (141-caracteres); k<getText().length(); k++){
			                System.out.print(getText().charAt(k));
			            }
			            System.out.print("</SPAN>");
			        }
			    }
			    else{
			        System.out.print("<SPAN CLASS=" + '"' + "sobrante" + '"' + ">");
			        for(int j = (140-caracteres); j<getText().length(); j++){
			            System.out.print(getText().charAt(j));
			        }
			        System.out.print("</SPAN>");
			    }

			break;
		}
	}
	private void SIGNOS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:

			    if(caracteres<140){
			        if((141-caracteres) >= 1){
			            System.out.print(getText());
			            caracteres += 1;
			        }
			    }
			    else{
			        System.out.print("<SPAN CLASS=" + '"' + "sobrante" + '"' + ">");
			        System.out.print(getText());
			        System.out.print("</SPAN>");
			    }

			break;
		}
	}

	public static final String _serializedATN =
		"\u0004\u0000\u0007L\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001!\b\u0001"+
		"\u000b\u0001\f\u0001\"\u0001\u0001\u0001\u0001\u0004\u0001\'\b\u0001\u000b"+
		"\u0001\f\u0001(\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0004"+
		"\u0002/\b\u0002\u000b\u0002\f\u00020\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0004\u00037\b\u0003\u000b\u0003\f\u00038\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0004\u0004>\b\u0004\u000b\u0004\f\u0004?\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0000\u0000\u0007\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u0001\u0000\u0003\u0002\u0000\t\t\r\r\u0002\u0000AZaz\u0004\u0000\n\n"+
		"  ,,..P\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0001\u000f\u0001\u0000\u0000\u0000\u0003"+
		"\u0013\u0001\u0000\u0000\u0000\u0005,\u0001\u0000\u0000\u0000\u00074\u0001"+
		"\u0000\u0000\u0000\t=\u0001\u0000\u0000\u0000\u000bC\u0001\u0000\u0000"+
		"\u0000\rF\u0001\u0000\u0000\u0000\u000f\u0010\u0007\u0000\u0000\u0000"+
		"\u0010\u0011\u0001\u0000\u0000\u0000\u0011\u0012\u0006\u0000\u0000\u0000"+
		"\u0012\u0002\u0001\u0000\u0000\u0000\u0013\u0014\u0005h\u0000\u0000\u0014"+
		"\u0015\u0005t\u0000\u0000\u0015\u0016\u0005t\u0000\u0000\u0016\u0017\u0005"+
		"p\u0000\u0000\u0017\u0018\u0005:\u0000\u0000\u0018\u0019\u0005/\u0000"+
		"\u0000\u0019\u001a\u0005/\u0000\u0000\u001a\u001b\u0005w\u0000\u0000\u001b"+
		"\u001c\u0005w\u0000\u0000\u001c\u001d\u0005w\u0000\u0000\u001d\u001e\u0005"+
		".\u0000\u0000\u001e \u0001\u0000\u0000\u0000\u001f!\u0003\t\u0004\u0000"+
		" \u001f\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\" \u0001\u0000"+
		"\u0000\u0000\"#\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$&\u0005"+
		".\u0000\u0000%\'\u0003\t\u0004\u0000&%\u0001\u0000\u0000\u0000\'(\u0001"+
		"\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000"+
		")*\u0001\u0000\u0000\u0000*+\u0006\u0001\u0001\u0000+\u0004\u0001\u0000"+
		"\u0000\u0000,.\u0005@\u0000\u0000-/\u0003\t\u0004\u0000.-\u0001\u0000"+
		"\u0000\u0000/0\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u000001\u0001"+
		"\u0000\u0000\u000012\u0001\u0000\u0000\u000023\u0006\u0002\u0002\u0000"+
		"3\u0006\u0001\u0000\u0000\u000046\u0005#\u0000\u000057\u0003\t\u0004\u0000"+
		"65\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u000086\u0001\u0000\u0000"+
		"\u000089\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:;\u0006\u0003"+
		"\u0003\u0000;\b\u0001\u0000\u0000\u0000<>\u0007\u0001\u0000\u0000=<\u0001"+
		"\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000"+
		"?@\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000AB\u0006\u0004\u0004"+
		"\u0000B\n\u0001\u0000\u0000\u0000CD\u0007\u0002\u0000\u0000DE\u0006\u0005"+
		"\u0005\u0000E\f\u0001\u0000\u0000\u0000FG\u0005#\u0000\u0000GH\u0005F"+
		"\u0000\u0000HI\u0005I\u0000\u0000IJ\u0005N\u0000\u0000JK\u0005@\u0000"+
		"\u0000K\u000e\u0001\u0000\u0000\u0000\u0006\u0000\"(08?\u0006\u0006\u0000"+
		"\u0000\u0001\u0001\u0000\u0001\u0002\u0001\u0001\u0003\u0002\u0001\u0004"+
		"\u0003\u0001\u0005\u0004";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}