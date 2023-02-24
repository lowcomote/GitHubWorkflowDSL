package githubwf.githubwf.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEnvOneOf0AdditionalPropertiesOneOf2Lexer extends Lexer {
    public static final int RULE_ID=10;
    public static final int RULE_WS=13;
    public static final int True=5;
    public static final int RULE_E_INT=8;
    public static final int RULE_STRING=7;
    public static final int False=4;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_SL_COMMENT=12;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=11;
    public static final int RULE_E_DOUBLE=9;
    public static final int EOF=-1;

    // delegates
    // delegators

    public InternalEnvOneOf0AdditionalPropertiesOneOf2Lexer() {;} 
    public InternalEnvOneOf0AdditionalPropertiesOneOf2Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalEnvOneOf0AdditionalPropertiesOneOf2Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalEnvOneOf0AdditionalPropertiesOneOf2Lexer.g"; }

    // $ANTLR start "False"
    public final void mFalse() throws RecognitionException {
        try {
            int _type = False;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEnvOneOf0AdditionalPropertiesOneOf2Lexer.g:14:7: ( 'false' )
            // InternalEnvOneOf0AdditionalPropertiesOneOf2Lexer.g:14:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "False"

    // $ANTLR start "True"
    public final void mTrue() throws RecognitionException {
        try {
            int _type = True;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEnvOneOf0AdditionalPropertiesOneOf2Lexer.g:16:6: ( 'true' )
            // InternalEnvOneOf0AdditionalPropertiesOneOf2Lexer.g:16:8: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "True"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            // InternalEnvOneOf0AdditionalPropertiesOneOf2Lexer.g:18:19: ( ( '0' | '1' .. '9' ( '0' .. '9' )* ) )
            // InternalEnvOneOf0AdditionalPropertiesOneOf2Lexer.g:18:21: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            {
            // InternalEnvOneOf0AdditionalPropertiesOneOf2Lexer.g:18:21: ( '0' | '1' .. '9' ( '0' .. '9' )* )
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
                    // InternalEnvOneOf0AdditionalPropertiesOneOf2Lexer.g:18:22: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // InternalEnvOneOf0AdditionalPropertiesOneOf2Lexer.g:18:26: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
                    // InternalEnvOneOf0AdditionalPropertiesOneOf2Lexer.g:18:35: ( '0' .. '9' )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalEnvOneOf0AdditionalPropertiesOneOf2Lexer.g:18:36: '0' .. '9'
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
            // InternalEnvOneOf0AdditionalPropertiesOneOf2Lexer.g:20:13: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalEnvOneOf0AdditionalPropertiesOneOf2Lexer.g:20:15: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalEnvOneOf0AdditionalPropertiesOneOf2Lexer.g:20:19: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
            	    // InternalEnvOneOf0AdditionalPropertiesOneOf2Lexer.g:20:20: '\\\\' .
            	    {
            	    match('\\'); 
            	    matchAny(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalEnvOneOf0AdditionalPropertiesOneOf2Lexer.g:20:27: ~ ( ( '\\\\' | '\"' ) )
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
            // InternalEnvOneOf0AdditionalPropertiesOneOf2Lexer.g:22:12: ( ( '-' )? RULE_INT )
            // InternalEnvOneOf0AdditionalPropertiesOneOf2Lexer.g:22:14: ( '-' )? RULE_INT
            {
            // InternalEnvOneOf0AdditionalPropertiesOneOf2Lexer.g:22:14: ( '-' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='-') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalEnvOneOf0AdditionalPropertiesOneOf2Lexer.g:22:14: '-'
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
            // InternalEnvOneOf0AdditionalPropertiesOneOf2Lexer.g:24:15: ( ( '-' )? RULE_INT ( '.' ( RULE_INT )+ )? ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )? )
            // InternalEnvOneOf0AdditionalPropertiesOneOf2Lexer.g:24:17: ( '-' )? RULE_INT ( '.' ( RULE_INT )+ )? ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )?
            {
            // InternalEnvOneOf0AdditionalPropertiesOneOf2Lexer.g:24:17: ( '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='-') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalEnvOneOf0AdditionalPropertiesOneOf2Lexer.g:24:17: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            mRULE_INT(); 
            // InternalEnvOneOf0AdditionalPropertiesOneOf2Lexer.g:24:31: ( '.' ( RULE_INT )+ )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='.') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalEnvOneOf0AdditionalPropertiesOneOf2Lexer.g:24:32: '.' ( RULE_INT )+
                    {
                    match('.'); 
                    // InternalEnvOneOf0AdditionalPropertiesOneOf2Lexer.g:24:36: ( RULE_INT )+
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
                    	    // InternalEnvOneOf0AdditionalPropertiesOneOf2Lexer.g:24:36: RULE_INT
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

            // InternalEnvOneOf0AdditionalPropertiesOneOf2Lexer.g:24:48: ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='E'||LA9_0=='e') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalEnvOneOf0AdditionalPropertiesOneOf2Lexer.g:24:49: ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalEnvOneOf0AdditionalPropertiesOneOf2Lexer.g:24:59: ( '+' | '-' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='+'||LA8_0=='-') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalEnvOneOf0AdditionalPropertiesOneOf2Lexer.g:
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
            // InternalEnvOneOf0AdditionalPropertiesOneOf2Lexer.g:26:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalEnvOneOf0AdditionalPropertiesOneOf2Lexer.g:26:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalEnvOneOf0AdditionalPropertiesOneOf2Lexer.g:26:11: ( '^' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='^') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalEnvOneOf0AdditionalPropertiesOneOf2Lexer.g:26:11: '^'
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

            // InternalEnvOneOf0AdditionalPropertiesOneOf2Lexer.g:26:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')||(LA11_0>='A' && LA11_0<='Z')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='z')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalEnvOneOf0AdditionalPropertiesOneOf2Lexer.g:
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
            // InternalEnvOneOf0AdditionalPropertiesOneOf2Lexer.g:28:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalEnvOneOf0AdditionalPropertiesOneOf2Lexer.g:28:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalEnvOneOf0AdditionalPropertiesOneOf2Lexer.g:28:24: ( options {greedy=false; } : . )*
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
            	    // InternalEnvOneOf0AdditionalPropertiesOneOf2Lexer.g:28:52: .
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
            // InternalEnvOneOf0AdditionalPropertiesOneOf2Lexer.g:30:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalEnvOneOf0AdditionalPropertiesOneOf2Lexer.g:30:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalEnvOneOf0AdditionalPropertiesOneOf2Lexer.g:30:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalEnvOneOf0AdditionalPropertiesOneOf2Lexer.g:30:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalEnvOneOf0AdditionalPropertiesOneOf2Lexer.g:30:40: ( ( '\\r' )? '\\n' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\n'||LA15_0=='\r') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalEnvOneOf0AdditionalPropertiesOneOf2Lexer.g:30:41: ( '\\r' )? '\\n'
                    {
                    // InternalEnvOneOf0AdditionalPropertiesOneOf2Lexer.g:30:41: ( '\\r' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='\r') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalEnvOneOf0AdditionalPropertiesOneOf2Lexer.g:30:41: '\\r'
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
            // InternalEnvOneOf0AdditionalPropertiesOneOf2Lexer.g:32:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalEnvOneOf0AdditionalPropertiesOneOf2Lexer.g:32:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalEnvOneOf0AdditionalPropertiesOneOf2Lexer.g:32:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // InternalEnvOneOf0AdditionalPropertiesOneOf2Lexer.g:
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
            // InternalEnvOneOf0AdditionalPropertiesOneOf2Lexer.g:34:16: ( . )
            // InternalEnvOneOf0AdditionalPropertiesOneOf2Lexer.g:34:18: .
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
        // InternalEnvOneOf0AdditionalPropertiesOneOf2Lexer.g:1:8: ( False | True | RULE_STRING | RULE_E_INT | RULE_E_DOUBLE | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt17=10;
        alt17 = dfa17.predict(input);
        switch (alt17) {
            case 1 :
                // InternalEnvOneOf0AdditionalPropertiesOneOf2Lexer.g:1:10: False
                {
                mFalse(); 

                }
                break;
            case 2 :
                // InternalEnvOneOf0AdditionalPropertiesOneOf2Lexer.g:1:16: True
                {
                mTrue(); 

                }
                break;
            case 3 :
                // InternalEnvOneOf0AdditionalPropertiesOneOf2Lexer.g:1:21: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 4 :
                // InternalEnvOneOf0AdditionalPropertiesOneOf2Lexer.g:1:33: RULE_E_INT
                {
                mRULE_E_INT(); 

                }
                break;
            case 5 :
                // InternalEnvOneOf0AdditionalPropertiesOneOf2Lexer.g:1:44: RULE_E_DOUBLE
                {
                mRULE_E_DOUBLE(); 

                }
                break;
            case 6 :
                // InternalEnvOneOf0AdditionalPropertiesOneOf2Lexer.g:1:58: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 7 :
                // InternalEnvOneOf0AdditionalPropertiesOneOf2Lexer.g:1:66: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 8 :
                // InternalEnvOneOf0AdditionalPropertiesOneOf2Lexer.g:1:82: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 9 :
                // InternalEnvOneOf0AdditionalPropertiesOneOf2Lexer.g:1:98: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 10 :
                // InternalEnvOneOf0AdditionalPropertiesOneOf2Lexer.g:1:106: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA17_eotS =
        "\1\uffff\2\15\2\13\2\22\1\13\1\uffff\1\13\2\uffff\1\15\1\uffff\1\15\1\uffff\2\22\2\uffff\1\22\3\uffff\3\15\1\35\1\36\2\uffff";
    static final String DFA17_eofS =
        "\37\uffff";
    static final String DFA17_minS =
        "\1\0\1\141\1\162\1\0\1\60\2\56\1\101\1\uffff\1\52\2\uffff\1\154\1\uffff\1\165\1\uffff\2\56\2\uffff\1\56\3\uffff\1\163\2\145\2\60\2\uffff";
    static final String DFA17_maxS =
        "\1\uffff\1\141\1\162\1\uffff\1\71\2\145\1\172\1\uffff\1\57\2\uffff\1\154\1\uffff\1\165\1\uffff\2\145\2\uffff\1\145\3\uffff\1\163\2\145\2\172\2\uffff";
    static final String DFA17_acceptS =
        "\10\uffff\1\6\1\uffff\1\11\1\12\1\uffff\1\6\1\uffff\1\3\2\uffff\1\4\1\5\1\uffff\1\7\1\10\1\11\5\uffff\1\2\1\1";
    static final String DFA17_specialS =
        "\1\1\2\uffff\1\0\33\uffff}>";
    static final String[] DFA17_transitionS = {
            "\11\13\2\12\2\13\1\12\22\13\1\12\1\13\1\3\12\13\1\4\1\13\1\11\1\5\11\6\7\13\32\10\3\13\1\7\1\10\1\13\5\10\1\1\15\10\1\2\6\10\uff85\13",
            "\1\14",
            "\1\16",
            "\0\17",
            "\1\20\11\21",
            "\1\23\26\uffff\1\23\37\uffff\1\23",
            "\1\23\1\uffff\12\24\13\uffff\1\23\37\uffff\1\23",
            "\32\15\4\uffff\1\15\1\uffff\32\15",
            "",
            "\1\25\4\uffff\1\26",
            "",
            "",
            "\1\30",
            "",
            "\1\31",
            "",
            "\1\23\26\uffff\1\23\37\uffff\1\23",
            "\1\23\1\uffff\12\24\13\uffff\1\23\37\uffff\1\23",
            "",
            "",
            "\1\23\1\uffff\12\24\13\uffff\1\23\37\uffff\1\23",
            "",
            "",
            "",
            "\1\32",
            "\1\33",
            "\1\34",
            "\12\15\7\uffff\32\15\4\uffff\1\15\1\uffff\32\15",
            "\12\15\7\uffff\32\15\4\uffff\1\15\1\uffff\32\15",
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
            return "1:1: Tokens : ( False | True | RULE_STRING | RULE_E_INT | RULE_E_DOUBLE | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_3 = input.LA(1);

                        s = -1;
                        if ( ((LA17_3>='\u0000' && LA17_3<='\uFFFF')) ) {s = 15;}

                        else s = 11;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_0 = input.LA(1);

                        s = -1;
                        if ( (LA17_0=='f') ) {s = 1;}

                        else if ( (LA17_0=='t') ) {s = 2;}

                        else if ( (LA17_0=='\"') ) {s = 3;}

                        else if ( (LA17_0=='-') ) {s = 4;}

                        else if ( (LA17_0=='0') ) {s = 5;}

                        else if ( ((LA17_0>='1' && LA17_0<='9')) ) {s = 6;}

                        else if ( (LA17_0=='^') ) {s = 7;}

                        else if ( ((LA17_0>='A' && LA17_0<='Z')||LA17_0=='_'||(LA17_0>='a' && LA17_0<='e')||(LA17_0>='g' && LA17_0<='s')||(LA17_0>='u' && LA17_0<='z')) ) {s = 8;}

                        else if ( (LA17_0=='/') ) {s = 9;}

                        else if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {s = 10;}

                        else if ( ((LA17_0>='\u0000' && LA17_0<='\b')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\u001F')||LA17_0=='!'||(LA17_0>='#' && LA17_0<=',')||LA17_0=='.'||(LA17_0>=':' && LA17_0<='@')||(LA17_0>='[' && LA17_0<=']')||LA17_0=='`'||(LA17_0>='{' && LA17_0<='\uFFFF')) ) {s = 11;}

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