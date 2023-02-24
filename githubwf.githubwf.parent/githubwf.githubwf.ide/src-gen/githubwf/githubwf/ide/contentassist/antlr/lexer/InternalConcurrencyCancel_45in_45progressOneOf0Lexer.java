package githubwf.githubwf.ide.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalConcurrencyCancel_45in_45progressOneOf0Lexer extends Lexer {
    public static final int RULE_ID=12;
    public static final int RULE_WS=15;
    public static final int True=6;
    public static final int RULE_E_INT=10;
    public static final int RULE_STRING=9;
    public static final int False=5;
    public static final int RULE_ANY_OTHER=16;
    public static final int CancelInProgress=4;
    public static final int RULE_SL_COMMENT=14;
    public static final int RULE_INT=8;
    public static final int RULE_ML_COMMENT=13;
    public static final int Colon=7;
    public static final int RULE_E_DOUBLE=11;
    public static final int EOF=-1;

    // delegates
    // delegators

    public InternalConcurrencyCancel_45in_45progressOneOf0Lexer() {;} 
    public InternalConcurrencyCancel_45in_45progressOneOf0Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalConcurrencyCancel_45in_45progressOneOf0Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalConcurrencyCancel_45in_45progressOneOf0Lexer.g"; }

    // $ANTLR start "CancelInProgress"
    public final void mCancelInProgress() throws RecognitionException {
        try {
            int _type = CancelInProgress;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalConcurrencyCancel_45in_45progressOneOf0Lexer.g:14:18: ( '\"cancel-in-progress\"' )
            // InternalConcurrencyCancel_45in_45progressOneOf0Lexer.g:14:20: '\"cancel-in-progress\"'
            {
            match("\"cancel-in-progress\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CancelInProgress"

    // $ANTLR start "False"
    public final void mFalse() throws RecognitionException {
        try {
            int _type = False;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalConcurrencyCancel_45in_45progressOneOf0Lexer.g:16:7: ( 'false' )
            // InternalConcurrencyCancel_45in_45progressOneOf0Lexer.g:16:9: 'false'
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
            // InternalConcurrencyCancel_45in_45progressOneOf0Lexer.g:18:6: ( 'true' )
            // InternalConcurrencyCancel_45in_45progressOneOf0Lexer.g:18:8: 'true'
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

    // $ANTLR start "Colon"
    public final void mColon() throws RecognitionException {
        try {
            int _type = Colon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalConcurrencyCancel_45in_45progressOneOf0Lexer.g:20:7: ( ':' )
            // InternalConcurrencyCancel_45in_45progressOneOf0Lexer.g:20:9: ':'
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
            // InternalConcurrencyCancel_45in_45progressOneOf0Lexer.g:22:19: ( ( '0' | '1' .. '9' ( '0' .. '9' )* ) )
            // InternalConcurrencyCancel_45in_45progressOneOf0Lexer.g:22:21: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            {
            // InternalConcurrencyCancel_45in_45progressOneOf0Lexer.g:22:21: ( '0' | '1' .. '9' ( '0' .. '9' )* )
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
                    // InternalConcurrencyCancel_45in_45progressOneOf0Lexer.g:22:22: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // InternalConcurrencyCancel_45in_45progressOneOf0Lexer.g:22:26: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
                    // InternalConcurrencyCancel_45in_45progressOneOf0Lexer.g:22:35: ( '0' .. '9' )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalConcurrencyCancel_45in_45progressOneOf0Lexer.g:22:36: '0' .. '9'
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
            // InternalConcurrencyCancel_45in_45progressOneOf0Lexer.g:24:13: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalConcurrencyCancel_45in_45progressOneOf0Lexer.g:24:15: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalConcurrencyCancel_45in_45progressOneOf0Lexer.g:24:19: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
            	    // InternalConcurrencyCancel_45in_45progressOneOf0Lexer.g:24:20: '\\\\' .
            	    {
            	    match('\\'); 
            	    matchAny(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalConcurrencyCancel_45in_45progressOneOf0Lexer.g:24:27: ~ ( ( '\\\\' | '\"' ) )
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
            // InternalConcurrencyCancel_45in_45progressOneOf0Lexer.g:26:12: ( ( '-' )? RULE_INT )
            // InternalConcurrencyCancel_45in_45progressOneOf0Lexer.g:26:14: ( '-' )? RULE_INT
            {
            // InternalConcurrencyCancel_45in_45progressOneOf0Lexer.g:26:14: ( '-' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='-') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalConcurrencyCancel_45in_45progressOneOf0Lexer.g:26:14: '-'
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
            // InternalConcurrencyCancel_45in_45progressOneOf0Lexer.g:28:15: ( ( '-' )? RULE_INT ( '.' ( RULE_INT )+ )? ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )? )
            // InternalConcurrencyCancel_45in_45progressOneOf0Lexer.g:28:17: ( '-' )? RULE_INT ( '.' ( RULE_INT )+ )? ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )?
            {
            // InternalConcurrencyCancel_45in_45progressOneOf0Lexer.g:28:17: ( '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='-') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalConcurrencyCancel_45in_45progressOneOf0Lexer.g:28:17: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            mRULE_INT(); 
            // InternalConcurrencyCancel_45in_45progressOneOf0Lexer.g:28:31: ( '.' ( RULE_INT )+ )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='.') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalConcurrencyCancel_45in_45progressOneOf0Lexer.g:28:32: '.' ( RULE_INT )+
                    {
                    match('.'); 
                    // InternalConcurrencyCancel_45in_45progressOneOf0Lexer.g:28:36: ( RULE_INT )+
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
                    	    // InternalConcurrencyCancel_45in_45progressOneOf0Lexer.g:28:36: RULE_INT
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

            // InternalConcurrencyCancel_45in_45progressOneOf0Lexer.g:28:48: ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='E'||LA9_0=='e') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalConcurrencyCancel_45in_45progressOneOf0Lexer.g:28:49: ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalConcurrencyCancel_45in_45progressOneOf0Lexer.g:28:59: ( '+' | '-' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='+'||LA8_0=='-') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalConcurrencyCancel_45in_45progressOneOf0Lexer.g:
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
            // InternalConcurrencyCancel_45in_45progressOneOf0Lexer.g:30:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalConcurrencyCancel_45in_45progressOneOf0Lexer.g:30:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalConcurrencyCancel_45in_45progressOneOf0Lexer.g:30:11: ( '^' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='^') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalConcurrencyCancel_45in_45progressOneOf0Lexer.g:30:11: '^'
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

            // InternalConcurrencyCancel_45in_45progressOneOf0Lexer.g:30:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')||(LA11_0>='A' && LA11_0<='Z')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='z')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalConcurrencyCancel_45in_45progressOneOf0Lexer.g:
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
            // InternalConcurrencyCancel_45in_45progressOneOf0Lexer.g:32:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalConcurrencyCancel_45in_45progressOneOf0Lexer.g:32:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalConcurrencyCancel_45in_45progressOneOf0Lexer.g:32:24: ( options {greedy=false; } : . )*
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
            	    // InternalConcurrencyCancel_45in_45progressOneOf0Lexer.g:32:52: .
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
            // InternalConcurrencyCancel_45in_45progressOneOf0Lexer.g:34:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalConcurrencyCancel_45in_45progressOneOf0Lexer.g:34:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalConcurrencyCancel_45in_45progressOneOf0Lexer.g:34:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalConcurrencyCancel_45in_45progressOneOf0Lexer.g:34:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalConcurrencyCancel_45in_45progressOneOf0Lexer.g:34:40: ( ( '\\r' )? '\\n' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\n'||LA15_0=='\r') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalConcurrencyCancel_45in_45progressOneOf0Lexer.g:34:41: ( '\\r' )? '\\n'
                    {
                    // InternalConcurrencyCancel_45in_45progressOneOf0Lexer.g:34:41: ( '\\r' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='\r') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalConcurrencyCancel_45in_45progressOneOf0Lexer.g:34:41: '\\r'
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
            // InternalConcurrencyCancel_45in_45progressOneOf0Lexer.g:36:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalConcurrencyCancel_45in_45progressOneOf0Lexer.g:36:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalConcurrencyCancel_45in_45progressOneOf0Lexer.g:36:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // InternalConcurrencyCancel_45in_45progressOneOf0Lexer.g:
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
            // InternalConcurrencyCancel_45in_45progressOneOf0Lexer.g:38:16: ( . )
            // InternalConcurrencyCancel_45in_45progressOneOf0Lexer.g:38:18: .
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
        // InternalConcurrencyCancel_45in_45progressOneOf0Lexer.g:1:8: ( CancelInProgress | False | True | Colon | RULE_STRING | RULE_E_INT | RULE_E_DOUBLE | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt17=12;
        alt17 = dfa17.predict(input);
        switch (alt17) {
            case 1 :
                // InternalConcurrencyCancel_45in_45progressOneOf0Lexer.g:1:10: CancelInProgress
                {
                mCancelInProgress(); 

                }
                break;
            case 2 :
                // InternalConcurrencyCancel_45in_45progressOneOf0Lexer.g:1:27: False
                {
                mFalse(); 

                }
                break;
            case 3 :
                // InternalConcurrencyCancel_45in_45progressOneOf0Lexer.g:1:33: True
                {
                mTrue(); 

                }
                break;
            case 4 :
                // InternalConcurrencyCancel_45in_45progressOneOf0Lexer.g:1:38: Colon
                {
                mColon(); 

                }
                break;
            case 5 :
                // InternalConcurrencyCancel_45in_45progressOneOf0Lexer.g:1:44: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 6 :
                // InternalConcurrencyCancel_45in_45progressOneOf0Lexer.g:1:56: RULE_E_INT
                {
                mRULE_E_INT(); 

                }
                break;
            case 7 :
                // InternalConcurrencyCancel_45in_45progressOneOf0Lexer.g:1:67: RULE_E_DOUBLE
                {
                mRULE_E_DOUBLE(); 

                }
                break;
            case 8 :
                // InternalConcurrencyCancel_45in_45progressOneOf0Lexer.g:1:81: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 9 :
                // InternalConcurrencyCancel_45in_45progressOneOf0Lexer.g:1:89: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 10 :
                // InternalConcurrencyCancel_45in_45progressOneOf0Lexer.g:1:105: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 11 :
                // InternalConcurrencyCancel_45in_45progressOneOf0Lexer.g:1:121: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 12 :
                // InternalConcurrencyCancel_45in_45progressOneOf0Lexer.g:1:129: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA17_eotS =
        "\1\uffff\1\14\2\20\1\uffff\1\14\2\25\1\14\1\uffff\1\14\4\uffff\1\20\1\uffff\1\20\1\uffff\2\25\2\uffff\1\25\4\uffff\2\20\1\uffff\1\20\1\43\1\uffff\1\45\22\uffff";
    static final String DFA17_eofS =
        "\65\uffff";
    static final String DFA17_minS =
        "\2\0\1\141\1\162\1\uffff\1\60\2\56\1\101\1\uffff\1\52\2\uffff\1\0\1\uffff\1\154\1\uffff\1\165\1\uffff\2\56\2\uffff\1\56\3\uffff\1\0\1\163\1\145\1\0\1\145\1\60\1\0\1\60\1\uffff\1\0\1\uffff\15\0\2\uffff";
    static final String DFA17_maxS =
        "\2\uffff\1\141\1\162\1\uffff\1\71\2\145\1\172\1\uffff\1\57\2\uffff\1\uffff\1\uffff\1\154\1\uffff\1\165\1\uffff\2\145\2\uffff\1\145\3\uffff\1\uffff\1\163\1\145\1\uffff\1\145\1\172\1\uffff\1\172\1\uffff\1\uffff\1\uffff\15\uffff\2\uffff";
    static final String DFA17_acceptS =
        "\4\uffff\1\4\4\uffff\1\10\1\uffff\1\13\1\14\1\uffff\1\5\1\uffff\1\10\1\uffff\1\4\2\uffff\1\6\1\7\1\uffff\1\11\1\12\1\13\10\uffff\1\3\1\uffff\1\2\15\uffff\2\1";
    static final String DFA17_specialS =
        "\1\23\1\0\13\uffff\1\1\15\uffff\1\2\2\uffff\1\3\2\uffff\1\4\2\uffff\1\5\1\uffff\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\2\uffff}>";
    static final String[] DFA17_transitionS = {
            "\11\14\2\13\2\14\1\13\22\14\1\13\1\14\1\1\12\14\1\5\1\14\1\12\1\6\11\7\1\4\6\14\32\11\3\14\1\10\1\11\1\14\5\11\1\2\15\11\1\3\6\11\uff85\14",
            "\143\16\1\15\uff9c\16",
            "\1\17",
            "\1\21",
            "",
            "\1\23\11\24",
            "\1\26\26\uffff\1\26\37\uffff\1\26",
            "\1\26\1\uffff\12\27\13\uffff\1\26\37\uffff\1\26",
            "\32\20\4\uffff\1\20\1\uffff\32\20",
            "",
            "\1\30\4\uffff\1\31",
            "",
            "",
            "\141\16\1\33\uff9e\16",
            "",
            "\1\34",
            "",
            "\1\35",
            "",
            "\1\26\26\uffff\1\26\37\uffff\1\26",
            "\1\26\1\uffff\12\27\13\uffff\1\26\37\uffff\1\26",
            "",
            "",
            "\1\26\1\uffff\12\27\13\uffff\1\26\37\uffff\1\26",
            "",
            "",
            "",
            "\156\16\1\36\uff91\16",
            "\1\37",
            "\1\40",
            "\143\16\1\41\uff9c\16",
            "\1\42",
            "\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32\20",
            "\145\16\1\44\uff9a\16",
            "\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32\20",
            "",
            "\154\16\1\46\uff93\16",
            "",
            "\55\16\1\47\uffd2\16",
            "\151\16\1\50\uff96\16",
            "\156\16\1\51\uff91\16",
            "\55\16\1\52\uffd2\16",
            "\160\16\1\53\uff8f\16",
            "\162\16\1\54\uff8d\16",
            "\157\16\1\55\uff90\16",
            "\147\16\1\56\uff98\16",
            "\162\16\1\57\uff8d\16",
            "\145\16\1\60\uff9a\16",
            "\163\16\1\61\uff8c\16",
            "\163\16\1\62\uff8c\16",
            "\42\16\1\63\uffdd\16",
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
            return "1:1: Tokens : ( CancelInProgress | False | True | Colon | RULE_STRING | RULE_E_INT | RULE_E_DOUBLE | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_1 = input.LA(1);

                        s = -1;
                        if ( (LA17_1=='c') ) {s = 13;}

                        else if ( ((LA17_1>='\u0000' && LA17_1<='b')||(LA17_1>='d' && LA17_1<='\uFFFF')) ) {s = 14;}

                        else s = 12;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_13 = input.LA(1);

                        s = -1;
                        if ( (LA17_13=='a') ) {s = 27;}

                        else if ( ((LA17_13>='\u0000' && LA17_13<='`')||(LA17_13>='b' && LA17_13<='\uFFFF')) ) {s = 14;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_27 = input.LA(1);

                        s = -1;
                        if ( (LA17_27=='n') ) {s = 30;}

                        else if ( ((LA17_27>='\u0000' && LA17_27<='m')||(LA17_27>='o' && LA17_27<='\uFFFF')) ) {s = 14;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA17_30 = input.LA(1);

                        s = -1;
                        if ( (LA17_30=='c') ) {s = 33;}

                        else if ( ((LA17_30>='\u0000' && LA17_30<='b')||(LA17_30>='d' && LA17_30<='\uFFFF')) ) {s = 14;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA17_33 = input.LA(1);

                        s = -1;
                        if ( (LA17_33=='e') ) {s = 36;}

                        else if ( ((LA17_33>='\u0000' && LA17_33<='d')||(LA17_33>='f' && LA17_33<='\uFFFF')) ) {s = 14;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA17_36 = input.LA(1);

                        s = -1;
                        if ( (LA17_36=='l') ) {s = 38;}

                        else if ( ((LA17_36>='\u0000' && LA17_36<='k')||(LA17_36>='m' && LA17_36<='\uFFFF')) ) {s = 14;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA17_38 = input.LA(1);

                        s = -1;
                        if ( (LA17_38=='-') ) {s = 39;}

                        else if ( ((LA17_38>='\u0000' && LA17_38<=',')||(LA17_38>='.' && LA17_38<='\uFFFF')) ) {s = 14;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA17_39 = input.LA(1);

                        s = -1;
                        if ( (LA17_39=='i') ) {s = 40;}

                        else if ( ((LA17_39>='\u0000' && LA17_39<='h')||(LA17_39>='j' && LA17_39<='\uFFFF')) ) {s = 14;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA17_40 = input.LA(1);

                        s = -1;
                        if ( (LA17_40=='n') ) {s = 41;}

                        else if ( ((LA17_40>='\u0000' && LA17_40<='m')||(LA17_40>='o' && LA17_40<='\uFFFF')) ) {s = 14;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA17_41 = input.LA(1);

                        s = -1;
                        if ( (LA17_41=='-') ) {s = 42;}

                        else if ( ((LA17_41>='\u0000' && LA17_41<=',')||(LA17_41>='.' && LA17_41<='\uFFFF')) ) {s = 14;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA17_42 = input.LA(1);

                        s = -1;
                        if ( (LA17_42=='p') ) {s = 43;}

                        else if ( ((LA17_42>='\u0000' && LA17_42<='o')||(LA17_42>='q' && LA17_42<='\uFFFF')) ) {s = 14;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA17_43 = input.LA(1);

                        s = -1;
                        if ( (LA17_43=='r') ) {s = 44;}

                        else if ( ((LA17_43>='\u0000' && LA17_43<='q')||(LA17_43>='s' && LA17_43<='\uFFFF')) ) {s = 14;}

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA17_44 = input.LA(1);

                        s = -1;
                        if ( (LA17_44=='o') ) {s = 45;}

                        else if ( ((LA17_44>='\u0000' && LA17_44<='n')||(LA17_44>='p' && LA17_44<='\uFFFF')) ) {s = 14;}

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA17_45 = input.LA(1);

                        s = -1;
                        if ( (LA17_45=='g') ) {s = 46;}

                        else if ( ((LA17_45>='\u0000' && LA17_45<='f')||(LA17_45>='h' && LA17_45<='\uFFFF')) ) {s = 14;}

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA17_46 = input.LA(1);

                        s = -1;
                        if ( (LA17_46=='r') ) {s = 47;}

                        else if ( ((LA17_46>='\u0000' && LA17_46<='q')||(LA17_46>='s' && LA17_46<='\uFFFF')) ) {s = 14;}

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA17_47 = input.LA(1);

                        s = -1;
                        if ( (LA17_47=='e') ) {s = 48;}

                        else if ( ((LA17_47>='\u0000' && LA17_47<='d')||(LA17_47>='f' && LA17_47<='\uFFFF')) ) {s = 14;}

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA17_48 = input.LA(1);

                        s = -1;
                        if ( (LA17_48=='s') ) {s = 49;}

                        else if ( ((LA17_48>='\u0000' && LA17_48<='r')||(LA17_48>='t' && LA17_48<='\uFFFF')) ) {s = 14;}

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA17_49 = input.LA(1);

                        s = -1;
                        if ( (LA17_49=='s') ) {s = 50;}

                        else if ( ((LA17_49>='\u0000' && LA17_49<='r')||(LA17_49>='t' && LA17_49<='\uFFFF')) ) {s = 14;}

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA17_50 = input.LA(1);

                        s = -1;
                        if ( (LA17_50=='\"') ) {s = 51;}

                        else if ( ((LA17_50>='\u0000' && LA17_50<='!')||(LA17_50>='#' && LA17_50<='\uFFFF')) ) {s = 14;}

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA17_0 = input.LA(1);

                        s = -1;
                        if ( (LA17_0=='\"') ) {s = 1;}

                        else if ( (LA17_0=='f') ) {s = 2;}

                        else if ( (LA17_0=='t') ) {s = 3;}

                        else if ( (LA17_0==':') ) {s = 4;}

                        else if ( (LA17_0=='-') ) {s = 5;}

                        else if ( (LA17_0=='0') ) {s = 6;}

                        else if ( ((LA17_0>='1' && LA17_0<='9')) ) {s = 7;}

                        else if ( (LA17_0=='^') ) {s = 8;}

                        else if ( ((LA17_0>='A' && LA17_0<='Z')||LA17_0=='_'||(LA17_0>='a' && LA17_0<='e')||(LA17_0>='g' && LA17_0<='s')||(LA17_0>='u' && LA17_0<='z')) ) {s = 9;}

                        else if ( (LA17_0=='/') ) {s = 10;}

                        else if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {s = 11;}

                        else if ( ((LA17_0>='\u0000' && LA17_0<='\b')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\u001F')||LA17_0=='!'||(LA17_0>='#' && LA17_0<=',')||LA17_0=='.'||(LA17_0>=';' && LA17_0<='@')||(LA17_0>='[' && LA17_0<=']')||LA17_0=='`'||(LA17_0>='{' && LA17_0<='\uFFFF')) ) {s = 12;}

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