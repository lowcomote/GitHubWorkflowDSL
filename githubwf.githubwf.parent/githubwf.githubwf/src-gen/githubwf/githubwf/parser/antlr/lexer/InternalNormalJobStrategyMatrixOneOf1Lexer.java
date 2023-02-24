package githubwf.githubwf.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalNormalJobStrategyMatrixOneOf1Lexer extends Lexer {
    public static final int RULE_ID=10;
    public static final int RULE_WS=13;
    public static final int RULE_E_INT=8;
    public static final int RULE_STRING=7;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_SL_COMMENT=12;
    public static final int Matrix=4;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=11;
    public static final int Colon=5;
    public static final int RULE_E_DOUBLE=9;
    public static final int EOF=-1;

    // delegates
    // delegators

    public InternalNormalJobStrategyMatrixOneOf1Lexer() {;} 
    public InternalNormalJobStrategyMatrixOneOf1Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalNormalJobStrategyMatrixOneOf1Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalNormalJobStrategyMatrixOneOf1Lexer.g"; }

    // $ANTLR start "Matrix"
    public final void mMatrix() throws RecognitionException {
        try {
            int _type = Matrix;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNormalJobStrategyMatrixOneOf1Lexer.g:14:8: ( '\"matrix\"' )
            // InternalNormalJobStrategyMatrixOneOf1Lexer.g:14:10: '\"matrix\"'
            {
            match("\"matrix\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Matrix"

    // $ANTLR start "Colon"
    public final void mColon() throws RecognitionException {
        try {
            int _type = Colon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNormalJobStrategyMatrixOneOf1Lexer.g:16:7: ( ':' )
            // InternalNormalJobStrategyMatrixOneOf1Lexer.g:16:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Colon"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            // InternalNormalJobStrategyMatrixOneOf1Lexer.g:18:19: ( ( '0' | '1' .. '9' ( '0' .. '9' )* ) )
            // InternalNormalJobStrategyMatrixOneOf1Lexer.g:18:21: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            {
            // InternalNormalJobStrategyMatrixOneOf1Lexer.g:18:21: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='0') ) {
                alt2=1;
            }
            else if ( ((LA2_0>='1' && LA2_0<='9')) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalNormalJobStrategyMatrixOneOf1Lexer.g:18:22: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // InternalNormalJobStrategyMatrixOneOf1Lexer.g:18:26: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
                    // InternalNormalJobStrategyMatrixOneOf1Lexer.g:18:35: ( '0' .. '9' )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalNormalJobStrategyMatrixOneOf1Lexer.g:18:36: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNormalJobStrategyMatrixOneOf1Lexer.g:20:13: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalNormalJobStrategyMatrixOneOf1Lexer.g:20:15: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalNormalJobStrategyMatrixOneOf1Lexer.g:20:19: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\\') ) {
                    alt3=1;
                }
                else if ( ((LA3_0>='\u0000' && LA3_0<='!')||(LA3_0>='#' && LA3_0<='[')||(LA3_0>=']' && LA3_0<='\uFFFF')) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalNormalJobStrategyMatrixOneOf1Lexer.g:20:20: '\\\\' .
            	    {
            	    match('\\'); 
            	    matchAny(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalNormalJobStrategyMatrixOneOf1Lexer.g:20:27: ~ ( ( '\\\\' | '\"' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_E_INT"
    public final void mRULE_E_INT() throws RecognitionException {
        try {
            int _type = RULE_E_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNormalJobStrategyMatrixOneOf1Lexer.g:22:12: ( ( '-' )? RULE_INT )
            // InternalNormalJobStrategyMatrixOneOf1Lexer.g:22:14: ( '-' )? RULE_INT
            {
            // InternalNormalJobStrategyMatrixOneOf1Lexer.g:22:14: ( '-' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='-') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalNormalJobStrategyMatrixOneOf1Lexer.g:22:14: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_E_INT"

    // $ANTLR start "RULE_E_DOUBLE"
    public final void mRULE_E_DOUBLE() throws RecognitionException {
        try {
            int _type = RULE_E_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNormalJobStrategyMatrixOneOf1Lexer.g:24:15: ( ( '-' )? RULE_INT ( '.' ( RULE_INT )+ )? ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )? )
            // InternalNormalJobStrategyMatrixOneOf1Lexer.g:24:17: ( '-' )? RULE_INT ( '.' ( RULE_INT )+ )? ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )?
            {
            // InternalNormalJobStrategyMatrixOneOf1Lexer.g:24:17: ( '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='-') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalNormalJobStrategyMatrixOneOf1Lexer.g:24:17: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            mRULE_INT(); 
            // InternalNormalJobStrategyMatrixOneOf1Lexer.g:24:31: ( '.' ( RULE_INT )+ )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='.') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalNormalJobStrategyMatrixOneOf1Lexer.g:24:32: '.' ( RULE_INT )+
                    {
                    match('.'); 
                    // InternalNormalJobStrategyMatrixOneOf1Lexer.g:24:36: ( RULE_INT )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalNormalJobStrategyMatrixOneOf1Lexer.g:24:36: RULE_INT
                    	    {
                    	    mRULE_INT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);


                    }
                    break;

            }

            // InternalNormalJobStrategyMatrixOneOf1Lexer.g:24:48: ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='E'||LA9_0=='e') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalNormalJobStrategyMatrixOneOf1Lexer.g:24:49: ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalNormalJobStrategyMatrixOneOf1Lexer.g:24:59: ( '+' | '-' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='+'||LA8_0=='-') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalNormalJobStrategyMatrixOneOf1Lexer.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    mRULE_INT(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_E_DOUBLE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNormalJobStrategyMatrixOneOf1Lexer.g:26:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalNormalJobStrategyMatrixOneOf1Lexer.g:26:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalNormalJobStrategyMatrixOneOf1Lexer.g:26:11: ( '^' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='^') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalNormalJobStrategyMatrixOneOf1Lexer.g:26:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalNormalJobStrategyMatrixOneOf1Lexer.g:26:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')||(LA11_0>='A' && LA11_0<='Z')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='z')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalNormalJobStrategyMatrixOneOf1Lexer.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNormalJobStrategyMatrixOneOf1Lexer.g:28:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalNormalJobStrategyMatrixOneOf1Lexer.g:28:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalNormalJobStrategyMatrixOneOf1Lexer.g:28:24: ( options {greedy=false; } : . )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='*') ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1=='/') ) {
                        alt12=2;
                    }
                    else if ( ((LA12_1>='\u0000' && LA12_1<='.')||(LA12_1>='0' && LA12_1<='\uFFFF')) ) {
                        alt12=1;
                    }


                }
                else if ( ((LA12_0>='\u0000' && LA12_0<=')')||(LA12_0>='+' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalNormalJobStrategyMatrixOneOf1Lexer.g:28:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNormalJobStrategyMatrixOneOf1Lexer.g:30:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalNormalJobStrategyMatrixOneOf1Lexer.g:30:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalNormalJobStrategyMatrixOneOf1Lexer.g:30:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalNormalJobStrategyMatrixOneOf1Lexer.g:30:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // InternalNormalJobStrategyMatrixOneOf1Lexer.g:30:40: ( ( '\\r' )? '\\n' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\n'||LA15_0=='\r') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalNormalJobStrategyMatrixOneOf1Lexer.g:30:41: ( '\\r' )? '\\n'
                    {
                    // InternalNormalJobStrategyMatrixOneOf1Lexer.g:30:41: ( '\\r' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='\r') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalNormalJobStrategyMatrixOneOf1Lexer.g:30:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNormalJobStrategyMatrixOneOf1Lexer.g:32:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalNormalJobStrategyMatrixOneOf1Lexer.g:32:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalNormalJobStrategyMatrixOneOf1Lexer.g:32:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalNormalJobStrategyMatrixOneOf1Lexer.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNormalJobStrategyMatrixOneOf1Lexer.g:34:16: ( . )
            // InternalNormalJobStrategyMatrixOneOf1Lexer.g:34:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalNormalJobStrategyMatrixOneOf1Lexer.g:1:8: ( Matrix | Colon | RULE_STRING | RULE_E_INT | RULE_E_DOUBLE | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt17=10;
        alt17 = dfa17.predict(input);
        switch (alt17) {
            case 1 :
                // InternalNormalJobStrategyMatrixOneOf1Lexer.g:1:10: Matrix
                {
                mMatrix(); 

                }
                break;
            case 2 :
                // InternalNormalJobStrategyMatrixOneOf1Lexer.g:1:17: Colon
                {
                mColon(); 

                }
                break;
            case 3 :
                // InternalNormalJobStrategyMatrixOneOf1Lexer.g:1:23: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 4 :
                // InternalNormalJobStrategyMatrixOneOf1Lexer.g:1:35: RULE_E_INT
                {
                mRULE_E_INT(); 

                }
                break;
            case 5 :
                // InternalNormalJobStrategyMatrixOneOf1Lexer.g:1:46: RULE_E_DOUBLE
                {
                mRULE_E_DOUBLE(); 

                }
                break;
            case 6 :
                // InternalNormalJobStrategyMatrixOneOf1Lexer.g:1:60: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 7 :
                // InternalNormalJobStrategyMatrixOneOf1Lexer.g:1:68: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 8 :
                // InternalNormalJobStrategyMatrixOneOf1Lexer.g:1:84: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 9 :
                // InternalNormalJobStrategyMatrixOneOf1Lexer.g:1:100: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 10 :
                // InternalNormalJobStrategyMatrixOneOf1Lexer.g:1:108: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA17_eotS =
        "\1\uffff\1\12\1\uffff\1\12\2\20\1\12\1\uffff\1\12\5\uffff\2\20\2\uffff\1\20\13\uffff";
    static final String DFA17_eofS =
        "\36\uffff";
    static final String DFA17_minS =
        "\2\0\1\uffff\1\60\2\56\1\101\1\uffff\1\52\2\uffff\1\0\2\uffff\2\56\2\uffff\1\56\4\uffff\5\0\2\uffff";
    static final String DFA17_maxS =
        "\2\uffff\1\uffff\1\71\2\145\1\172\1\uffff\1\57\2\uffff\1\uffff\2\uffff\2\145\2\uffff\1\145\4\uffff\5\uffff\2\uffff";
    static final String DFA17_acceptS =
        "\2\uffff\1\2\4\uffff\1\6\1\uffff\1\11\1\12\1\uffff\1\3\1\2\2\uffff\1\4\1\5\1\uffff\1\6\1\7\1\10\1\11\5\uffff\2\1";
    static final String DFA17_specialS =
        "\1\7\1\0\11\uffff\1\1\13\uffff\1\2\1\3\1\4\1\5\1\6\2\uffff}>";
    static final String[] DFA17_transitionS = {
            "\11\12\2\11\2\12\1\11\22\12\1\11\1\12\1\1\12\12\1\3\1\12\1\10\1\4\11\5\1\2\6\12\32\7\3\12\1\6\1\7\1\12\32\7\uff85\12",
            "\155\14\1\13\uff92\14",
            "",
            "\1\16\11\17",
            "\1\21\26\uffff\1\21\37\uffff\1\21",
            "\1\21\1\uffff\12\22\13\uffff\1\21\37\uffff\1\21",
            "\32\23\4\uffff\1\23\1\uffff\32\23",
            "",
            "\1\24\4\uffff\1\25",
            "",
            "",
            "\141\14\1\27\uff9e\14",
            "",
            "",
            "\1\21\26\uffff\1\21\37\uffff\1\21",
            "\1\21\1\uffff\12\22\13\uffff\1\21\37\uffff\1\21",
            "",
            "",
            "\1\21\1\uffff\12\22\13\uffff\1\21\37\uffff\1\21",
            "",
            "",
            "",
            "",
            "\164\14\1\30\uff8b\14",
            "\162\14\1\31\uff8d\14",
            "\151\14\1\32\uff96\14",
            "\170\14\1\33\uff87\14",
            "\42\14\1\34\uffdd\14",
            "",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( Matrix | Colon | RULE_STRING | RULE_E_INT | RULE_E_DOUBLE | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_1 = input.LA(1);

                        s = -1;
                        if ( (LA17_1=='m') ) {s = 11;}

                        else if ( ((LA17_1>='\u0000' && LA17_1<='l')||(LA17_1>='n' && LA17_1<='\uFFFF')) ) {s = 12;}

                        else s = 10;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_11 = input.LA(1);

                        s = -1;
                        if ( (LA17_11=='a') ) {s = 23;}

                        else if ( ((LA17_11>='\u0000' && LA17_11<='`')||(LA17_11>='b' && LA17_11<='\uFFFF')) ) {s = 12;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_23 = input.LA(1);

                        s = -1;
                        if ( (LA17_23=='t') ) {s = 24;}

                        else if ( ((LA17_23>='\u0000' && LA17_23<='s')||(LA17_23>='u' && LA17_23<='\uFFFF')) ) {s = 12;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA17_24 = input.LA(1);

                        s = -1;
                        if ( (LA17_24=='r') ) {s = 25;}

                        else if ( ((LA17_24>='\u0000' && LA17_24<='q')||(LA17_24>='s' && LA17_24<='\uFFFF')) ) {s = 12;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA17_25 = input.LA(1);

                        s = -1;
                        if ( (LA17_25=='i') ) {s = 26;}

                        else if ( ((LA17_25>='\u0000' && LA17_25<='h')||(LA17_25>='j' && LA17_25<='\uFFFF')) ) {s = 12;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA17_26 = input.LA(1);

                        s = -1;
                        if ( (LA17_26=='x') ) {s = 27;}

                        else if ( ((LA17_26>='\u0000' && LA17_26<='w')||(LA17_26>='y' && LA17_26<='\uFFFF')) ) {s = 12;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA17_27 = input.LA(1);

                        s = -1;
                        if ( (LA17_27=='\"') ) {s = 28;}

                        else if ( ((LA17_27>='\u0000' && LA17_27<='!')||(LA17_27>='#' && LA17_27<='\uFFFF')) ) {s = 12;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA17_0 = input.LA(1);

                        s = -1;
                        if ( (LA17_0=='\"') ) {s = 1;}

                        else if ( (LA17_0==':') ) {s = 2;}

                        else if ( (LA17_0=='-') ) {s = 3;}

                        else if ( (LA17_0=='0') ) {s = 4;}

                        else if ( ((LA17_0>='1' && LA17_0<='9')) ) {s = 5;}

                        else if ( (LA17_0=='^') ) {s = 6;}

                        else if ( ((LA17_0>='A' && LA17_0<='Z')||LA17_0=='_'||(LA17_0>='a' && LA17_0<='z')) ) {s = 7;}

                        else if ( (LA17_0=='/') ) {s = 8;}

                        else if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {s = 9;}

                        else if ( ((LA17_0>='\u0000' && LA17_0<='\b')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\u001F')||LA17_0=='!'||(LA17_0>='#' && LA17_0<=',')||LA17_0=='.'||(LA17_0>=';' && LA17_0<='@')||(LA17_0>='[' && LA17_0<=']')||LA17_0=='`'||(LA17_0>='{' && LA17_0<='\uFFFF')) ) {s = 10;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}