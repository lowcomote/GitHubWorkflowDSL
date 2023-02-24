package githubwf.githubwf.ide.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJobNeedsOneOf0Lexer extends Lexer {
    public static final int RULE_ID=11;
    public static final int RULE_WS=14;
    public static final int RULE_E_INT=9;
    public static final int RULE_STRING=8;
    public static final int RULE_ANY_OTHER=15;
    public static final int RULE_SL_COMMENT=13;
    public static final int Comma=4;
    public static final int RULE_INT=7;
    public static final int RULE_ML_COMMENT=12;
    public static final int LeftSquareBracket=5;
    public static final int RULE_E_DOUBLE=10;
    public static final int EOF=-1;
    public static final int RightSquareBracket=6;

    // delegates
    // delegators

    public InternalJobNeedsOneOf0Lexer() {;} 
    public InternalJobNeedsOneOf0Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalJobNeedsOneOf0Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalJobNeedsOneOf0Lexer.g"; }

    // $ANTLR start "Comma"
    public final void mComma() throws RecognitionException {
        try {
            int _type = Comma;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJobNeedsOneOf0Lexer.g:14:7: ( ',' )
            // InternalJobNeedsOneOf0Lexer.g:14:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Comma"

    // $ANTLR start "LeftSquareBracket"
    public final void mLeftSquareBracket() throws RecognitionException {
        try {
            int _type = LeftSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJobNeedsOneOf0Lexer.g:16:19: ( '[' )
            // InternalJobNeedsOneOf0Lexer.g:16:21: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftSquareBracket"

    // $ANTLR start "RightSquareBracket"
    public final void mRightSquareBracket() throws RecognitionException {
        try {
            int _type = RightSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJobNeedsOneOf0Lexer.g:18:20: ( ']' )
            // InternalJobNeedsOneOf0Lexer.g:18:22: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightSquareBracket"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            // InternalJobNeedsOneOf0Lexer.g:20:19: ( ( '0' | '1' .. '9' ( '0' .. '9' )* ) )
            // InternalJobNeedsOneOf0Lexer.g:20:21: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            {
            // InternalJobNeedsOneOf0Lexer.g:20:21: ( '0' | '1' .. '9' ( '0' .. '9' )* )
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
                    // InternalJobNeedsOneOf0Lexer.g:20:22: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // InternalJobNeedsOneOf0Lexer.g:20:26: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
                    // InternalJobNeedsOneOf0Lexer.g:20:35: ( '0' .. '9' )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalJobNeedsOneOf0Lexer.g:20:36: '0' .. '9'
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
            // InternalJobNeedsOneOf0Lexer.g:22:13: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalJobNeedsOneOf0Lexer.g:22:15: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalJobNeedsOneOf0Lexer.g:22:19: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
            	    // InternalJobNeedsOneOf0Lexer.g:22:20: '\\\\' .
            	    {
            	    match('\\'); 
            	    matchAny(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalJobNeedsOneOf0Lexer.g:22:27: ~ ( ( '\\\\' | '\"' ) )
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
            // InternalJobNeedsOneOf0Lexer.g:24:12: ( ( '-' )? RULE_INT )
            // InternalJobNeedsOneOf0Lexer.g:24:14: ( '-' )? RULE_INT
            {
            // InternalJobNeedsOneOf0Lexer.g:24:14: ( '-' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='-') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalJobNeedsOneOf0Lexer.g:24:14: '-'
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
            // InternalJobNeedsOneOf0Lexer.g:26:15: ( ( '-' )? RULE_INT ( '.' ( RULE_INT )+ )? ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )? )
            // InternalJobNeedsOneOf0Lexer.g:26:17: ( '-' )? RULE_INT ( '.' ( RULE_INT )+ )? ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )?
            {
            // InternalJobNeedsOneOf0Lexer.g:26:17: ( '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='-') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalJobNeedsOneOf0Lexer.g:26:17: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            mRULE_INT(); 
            // InternalJobNeedsOneOf0Lexer.g:26:31: ( '.' ( RULE_INT )+ )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='.') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalJobNeedsOneOf0Lexer.g:26:32: '.' ( RULE_INT )+
                    {
                    match('.'); 
                    // InternalJobNeedsOneOf0Lexer.g:26:36: ( RULE_INT )+
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
                    	    // InternalJobNeedsOneOf0Lexer.g:26:36: RULE_INT
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

            // InternalJobNeedsOneOf0Lexer.g:26:48: ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='E'||LA9_0=='e') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalJobNeedsOneOf0Lexer.g:26:49: ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalJobNeedsOneOf0Lexer.g:26:59: ( '+' | '-' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='+'||LA8_0=='-') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalJobNeedsOneOf0Lexer.g:
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
            // InternalJobNeedsOneOf0Lexer.g:28:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalJobNeedsOneOf0Lexer.g:28:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalJobNeedsOneOf0Lexer.g:28:11: ( '^' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='^') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalJobNeedsOneOf0Lexer.g:28:11: '^'
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

            // InternalJobNeedsOneOf0Lexer.g:28:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')||(LA11_0>='A' && LA11_0<='Z')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='z')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalJobNeedsOneOf0Lexer.g:
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
            // InternalJobNeedsOneOf0Lexer.g:30:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalJobNeedsOneOf0Lexer.g:30:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalJobNeedsOneOf0Lexer.g:30:24: ( options {greedy=false; } : . )*
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
            	    // InternalJobNeedsOneOf0Lexer.g:30:52: .
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
            // InternalJobNeedsOneOf0Lexer.g:32:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalJobNeedsOneOf0Lexer.g:32:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalJobNeedsOneOf0Lexer.g:32:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalJobNeedsOneOf0Lexer.g:32:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalJobNeedsOneOf0Lexer.g:32:40: ( ( '\\r' )? '\\n' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\n'||LA15_0=='\r') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalJobNeedsOneOf0Lexer.g:32:41: ( '\\r' )? '\\n'
                    {
                    // InternalJobNeedsOneOf0Lexer.g:32:41: ( '\\r' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='\r') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalJobNeedsOneOf0Lexer.g:32:41: '\\r'
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
            // InternalJobNeedsOneOf0Lexer.g:34:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalJobNeedsOneOf0Lexer.g:34:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalJobNeedsOneOf0Lexer.g:34:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // InternalJobNeedsOneOf0Lexer.g:
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
            // InternalJobNeedsOneOf0Lexer.g:36:16: ( . )
            // InternalJobNeedsOneOf0Lexer.g:36:18: .
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
        // InternalJobNeedsOneOf0Lexer.g:1:8: ( Comma | LeftSquareBracket | RightSquareBracket | RULE_STRING | RULE_E_INT | RULE_E_DOUBLE | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt17=11;
        alt17 = dfa17.predict(input);
        switch (alt17) {
            case 1 :
                // InternalJobNeedsOneOf0Lexer.g:1:10: Comma
                {
                mComma(); 

                }
                break;
            case 2 :
                // InternalJobNeedsOneOf0Lexer.g:1:16: LeftSquareBracket
                {
                mLeftSquareBracket(); 

                }
                break;
            case 3 :
                // InternalJobNeedsOneOf0Lexer.g:1:34: RightSquareBracket
                {
                mRightSquareBracket(); 

                }
                break;
            case 4 :
                // InternalJobNeedsOneOf0Lexer.g:1:53: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 5 :
                // InternalJobNeedsOneOf0Lexer.g:1:65: RULE_E_INT
                {
                mRULE_E_INT(); 

                }
                break;
            case 6 :
                // InternalJobNeedsOneOf0Lexer.g:1:76: RULE_E_DOUBLE
                {
                mRULE_E_DOUBLE(); 

                }
                break;
            case 7 :
                // InternalJobNeedsOneOf0Lexer.g:1:90: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 8 :
                // InternalJobNeedsOneOf0Lexer.g:1:98: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 9 :
                // InternalJobNeedsOneOf0Lexer.g:1:114: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 10 :
                // InternalJobNeedsOneOf0Lexer.g:1:130: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 11 :
                // InternalJobNeedsOneOf0Lexer.g:1:138: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA17_eotS =
        "\4\uffff\2\14\2\23\1\14\1\uffff\1\14\6\uffff\2\23\2\uffff\1\23\4\uffff";
    static final String DFA17_eofS =
        "\32\uffff";
    static final String DFA17_minS =
        "\1\0\3\uffff\1\0\1\60\2\56\1\101\1\uffff\1\52\6\uffff\2\56\2\uffff\1\56\4\uffff";
    static final String DFA17_maxS =
        "\1\uffff\3\uffff\1\uffff\1\71\2\145\1\172\1\uffff\1\57\6\uffff\2\145\2\uffff\1\145\4\uffff";
    static final String DFA17_acceptS =
        "\1\uffff\1\1\1\2\1\3\5\uffff\1\7\1\uffff\1\12\1\13\1\1\1\2\1\3\1\4\2\uffff\1\5\1\6\1\uffff\1\7\1\10\1\11\1\12";
    static final String DFA17_specialS =
        "\1\1\3\uffff\1\0\25\uffff}>";
    static final String[] DFA17_transitionS = {
            "\11\14\2\13\2\14\1\13\22\14\1\13\1\14\1\4\11\14\1\1\1\5\1\14\1\12\1\6\11\7\7\14\32\11\1\2\1\14\1\3\1\10\1\11\1\14\32\11\uff85\14",
            "",
            "",
            "",
            "\0\20",
            "\1\21\11\22",
            "\1\24\26\uffff\1\24\37\uffff\1\24",
            "\1\24\1\uffff\12\25\13\uffff\1\24\37\uffff\1\24",
            "\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "\1\27\4\uffff\1\30",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\24\26\uffff\1\24\37\uffff\1\24",
            "\1\24\1\uffff\12\25\13\uffff\1\24\37\uffff\1\24",
            "",
            "",
            "\1\24\1\uffff\12\25\13\uffff\1\24\37\uffff\1\24",
            "",
            "",
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
            return "1:1: Tokens : ( Comma | LeftSquareBracket | RightSquareBracket | RULE_STRING | RULE_E_INT | RULE_E_DOUBLE | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_4 = input.LA(1);

                        s = -1;
                        if ( ((LA17_4>='\u0000' && LA17_4<='\uFFFF')) ) {s = 16;}

                        else s = 12;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_0 = input.LA(1);

                        s = -1;
                        if ( (LA17_0==',') ) {s = 1;}

                        else if ( (LA17_0=='[') ) {s = 2;}

                        else if ( (LA17_0==']') ) {s = 3;}

                        else if ( (LA17_0=='\"') ) {s = 4;}

                        else if ( (LA17_0=='-') ) {s = 5;}

                        else if ( (LA17_0=='0') ) {s = 6;}

                        else if ( ((LA17_0>='1' && LA17_0<='9')) ) {s = 7;}

                        else if ( (LA17_0=='^') ) {s = 8;}

                        else if ( ((LA17_0>='A' && LA17_0<='Z')||LA17_0=='_'||(LA17_0>='a' && LA17_0<='z')) ) {s = 9;}

                        else if ( (LA17_0=='/') ) {s = 10;}

                        else if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {s = 11;}

                        else if ( ((LA17_0>='\u0000' && LA17_0<='\b')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\u001F')||LA17_0=='!'||(LA17_0>='#' && LA17_0<='+')||LA17_0=='.'||(LA17_0>=':' && LA17_0<='@')||LA17_0=='\\'||LA17_0=='`'||(LA17_0>='{' && LA17_0<='\uFFFF')) ) {s = 12;}

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