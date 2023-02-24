package githubwf.githubwf.ide.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGithubwfRootConcurrencyOneOf1Lexer extends Lexer {
    public static final int Group=6;
    public static final int Null=8;
    public static final int True=9;
    public static final int RULE_STRING=17;
    public static final int False=7;
    public static final int CancelInProgress=4;
    public static final int RULE_SL_COMMENT=22;
    public static final int Comma=10;
    public static final int Concurrency=5;
    public static final int Colon=11;
    public static final int RightCurlyBracket=15;
    public static final int RULE_E_DOUBLE=19;
    public static final int EOF=-1;
    public static final int RightSquareBracket=13;
    public static final int RULE_ID=20;
    public static final int RULE_WS=23;
    public static final int LeftCurlyBracket=14;
    public static final int RULE_E_INT=18;
    public static final int RULE_ANY_OTHER=24;
    public static final int RULE_INT=16;
    public static final int RULE_ML_COMMENT=21;
    public static final int LeftSquareBracket=12;

    // delegates
    // delegators

    public InternalGithubwfRootConcurrencyOneOf1Lexer() {;} 
    public InternalGithubwfRootConcurrencyOneOf1Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalGithubwfRootConcurrencyOneOf1Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalGithubwfRootConcurrencyOneOf1Lexer.g"; }

    // $ANTLR start "CancelInProgress"
    public final void mCancelInProgress() throws RecognitionException {
        try {
            int _type = CancelInProgress;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGithubwfRootConcurrencyOneOf1Lexer.g:14:18: ( '\"cancel-in-progress\"' )
            // InternalGithubwfRootConcurrencyOneOf1Lexer.g:14:20: '\"cancel-in-progress\"'
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

    // $ANTLR start "Concurrency"
    public final void mConcurrency() throws RecognitionException {
        try {
            int _type = Concurrency;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGithubwfRootConcurrencyOneOf1Lexer.g:16:13: ( '\"concurrency\"' )
            // InternalGithubwfRootConcurrencyOneOf1Lexer.g:16:15: '\"concurrency\"'
            {
            match("\"concurrency\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Concurrency"

    // $ANTLR start "Group"
    public final void mGroup() throws RecognitionException {
        try {
            int _type = Group;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGithubwfRootConcurrencyOneOf1Lexer.g:18:7: ( '\"group\"' )
            // InternalGithubwfRootConcurrencyOneOf1Lexer.g:18:9: '\"group\"'
            {
            match("\"group\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Group"

    // $ANTLR start "False"
    public final void mFalse() throws RecognitionException {
        try {
            int _type = False;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGithubwfRootConcurrencyOneOf1Lexer.g:20:7: ( 'false' )
            // InternalGithubwfRootConcurrencyOneOf1Lexer.g:20:9: 'false'
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

    // $ANTLR start "Null"
    public final void mNull() throws RecognitionException {
        try {
            int _type = Null;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGithubwfRootConcurrencyOneOf1Lexer.g:22:6: ( 'null' )
            // InternalGithubwfRootConcurrencyOneOf1Lexer.g:22:8: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Null"

    // $ANTLR start "True"
    public final void mTrue() throws RecognitionException {
        try {
            int _type = True;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGithubwfRootConcurrencyOneOf1Lexer.g:24:6: ( 'true' )
            // InternalGithubwfRootConcurrencyOneOf1Lexer.g:24:8: 'true'
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

    // $ANTLR start "Comma"
    public final void mComma() throws RecognitionException {
        try {
            int _type = Comma;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGithubwfRootConcurrencyOneOf1Lexer.g:26:7: ( ',' )
            // InternalGithubwfRootConcurrencyOneOf1Lexer.g:26:9: ','
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

    // $ANTLR start "Colon"
    public final void mColon() throws RecognitionException {
        try {
            int _type = Colon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGithubwfRootConcurrencyOneOf1Lexer.g:28:7: ( ':' )
            // InternalGithubwfRootConcurrencyOneOf1Lexer.g:28:9: ':'
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

    // $ANTLR start "LeftSquareBracket"
    public final void mLeftSquareBracket() throws RecognitionException {
        try {
            int _type = LeftSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGithubwfRootConcurrencyOneOf1Lexer.g:30:19: ( '[' )
            // InternalGithubwfRootConcurrencyOneOf1Lexer.g:30:21: '['
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
            // InternalGithubwfRootConcurrencyOneOf1Lexer.g:32:20: ( ']' )
            // InternalGithubwfRootConcurrencyOneOf1Lexer.g:32:22: ']'
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

    // $ANTLR start "LeftCurlyBracket"
    public final void mLeftCurlyBracket() throws RecognitionException {
        try {
            int _type = LeftCurlyBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGithubwfRootConcurrencyOneOf1Lexer.g:34:18: ( '{' )
            // InternalGithubwfRootConcurrencyOneOf1Lexer.g:34:20: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftCurlyBracket"

    // $ANTLR start "RightCurlyBracket"
    public final void mRightCurlyBracket() throws RecognitionException {
        try {
            int _type = RightCurlyBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGithubwfRootConcurrencyOneOf1Lexer.g:36:19: ( '}' )
            // InternalGithubwfRootConcurrencyOneOf1Lexer.g:36:21: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightCurlyBracket"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            // InternalGithubwfRootConcurrencyOneOf1Lexer.g:38:19: ( ( '0' | '1' .. '9' ( '0' .. '9' )* ) )
            // InternalGithubwfRootConcurrencyOneOf1Lexer.g:38:21: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            {
            // InternalGithubwfRootConcurrencyOneOf1Lexer.g:38:21: ( '0' | '1' .. '9' ( '0' .. '9' )* )
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
                    // InternalGithubwfRootConcurrencyOneOf1Lexer.g:38:22: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // InternalGithubwfRootConcurrencyOneOf1Lexer.g:38:26: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
                    // InternalGithubwfRootConcurrencyOneOf1Lexer.g:38:35: ( '0' .. '9' )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalGithubwfRootConcurrencyOneOf1Lexer.g:38:36: '0' .. '9'
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
            // InternalGithubwfRootConcurrencyOneOf1Lexer.g:40:13: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalGithubwfRootConcurrencyOneOf1Lexer.g:40:15: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalGithubwfRootConcurrencyOneOf1Lexer.g:40:19: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
            	    // InternalGithubwfRootConcurrencyOneOf1Lexer.g:40:20: '\\\\' .
            	    {
            	    match('\\'); 
            	    matchAny(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalGithubwfRootConcurrencyOneOf1Lexer.g:40:27: ~ ( ( '\\\\' | '\"' ) )
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
            // InternalGithubwfRootConcurrencyOneOf1Lexer.g:42:12: ( ( '-' )? RULE_INT )
            // InternalGithubwfRootConcurrencyOneOf1Lexer.g:42:14: ( '-' )? RULE_INT
            {
            // InternalGithubwfRootConcurrencyOneOf1Lexer.g:42:14: ( '-' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='-') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalGithubwfRootConcurrencyOneOf1Lexer.g:42:14: '-'
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
            // InternalGithubwfRootConcurrencyOneOf1Lexer.g:44:15: ( ( '-' )? RULE_INT ( '.' ( RULE_INT )+ )? ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )? )
            // InternalGithubwfRootConcurrencyOneOf1Lexer.g:44:17: ( '-' )? RULE_INT ( '.' ( RULE_INT )+ )? ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )?
            {
            // InternalGithubwfRootConcurrencyOneOf1Lexer.g:44:17: ( '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='-') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalGithubwfRootConcurrencyOneOf1Lexer.g:44:17: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            mRULE_INT(); 
            // InternalGithubwfRootConcurrencyOneOf1Lexer.g:44:31: ( '.' ( RULE_INT )+ )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='.') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalGithubwfRootConcurrencyOneOf1Lexer.g:44:32: '.' ( RULE_INT )+
                    {
                    match('.'); 
                    // InternalGithubwfRootConcurrencyOneOf1Lexer.g:44:36: ( RULE_INT )+
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
                    	    // InternalGithubwfRootConcurrencyOneOf1Lexer.g:44:36: RULE_INT
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

            // InternalGithubwfRootConcurrencyOneOf1Lexer.g:44:48: ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='E'||LA9_0=='e') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalGithubwfRootConcurrencyOneOf1Lexer.g:44:49: ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalGithubwfRootConcurrencyOneOf1Lexer.g:44:59: ( '+' | '-' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='+'||LA8_0=='-') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalGithubwfRootConcurrencyOneOf1Lexer.g:
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
            // InternalGithubwfRootConcurrencyOneOf1Lexer.g:46:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalGithubwfRootConcurrencyOneOf1Lexer.g:46:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalGithubwfRootConcurrencyOneOf1Lexer.g:46:11: ( '^' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='^') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalGithubwfRootConcurrencyOneOf1Lexer.g:46:11: '^'
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

            // InternalGithubwfRootConcurrencyOneOf1Lexer.g:46:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')||(LA11_0>='A' && LA11_0<='Z')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='z')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGithubwfRootConcurrencyOneOf1Lexer.g:
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
            // InternalGithubwfRootConcurrencyOneOf1Lexer.g:48:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalGithubwfRootConcurrencyOneOf1Lexer.g:48:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalGithubwfRootConcurrencyOneOf1Lexer.g:48:24: ( options {greedy=false; } : . )*
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
            	    // InternalGithubwfRootConcurrencyOneOf1Lexer.g:48:52: .
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
            // InternalGithubwfRootConcurrencyOneOf1Lexer.g:50:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalGithubwfRootConcurrencyOneOf1Lexer.g:50:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalGithubwfRootConcurrencyOneOf1Lexer.g:50:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalGithubwfRootConcurrencyOneOf1Lexer.g:50:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalGithubwfRootConcurrencyOneOf1Lexer.g:50:40: ( ( '\\r' )? '\\n' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\n'||LA15_0=='\r') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalGithubwfRootConcurrencyOneOf1Lexer.g:50:41: ( '\\r' )? '\\n'
                    {
                    // InternalGithubwfRootConcurrencyOneOf1Lexer.g:50:41: ( '\\r' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='\r') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalGithubwfRootConcurrencyOneOf1Lexer.g:50:41: '\\r'
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
            // InternalGithubwfRootConcurrencyOneOf1Lexer.g:52:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalGithubwfRootConcurrencyOneOf1Lexer.g:52:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalGithubwfRootConcurrencyOneOf1Lexer.g:52:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // InternalGithubwfRootConcurrencyOneOf1Lexer.g:
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
            // InternalGithubwfRootConcurrencyOneOf1Lexer.g:54:16: ( . )
            // InternalGithubwfRootConcurrencyOneOf1Lexer.g:54:18: .
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
        // InternalGithubwfRootConcurrencyOneOf1Lexer.g:1:8: ( CancelInProgress | Concurrency | Group | False | Null | True | Comma | Colon | LeftSquareBracket | RightSquareBracket | LeftCurlyBracket | RightCurlyBracket | RULE_STRING | RULE_E_INT | RULE_E_DOUBLE | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt17=20;
        alt17 = dfa17.predict(input);
        switch (alt17) {
            case 1 :
                // InternalGithubwfRootConcurrencyOneOf1Lexer.g:1:10: CancelInProgress
                {
                mCancelInProgress(); 

                }
                break;
            case 2 :
                // InternalGithubwfRootConcurrencyOneOf1Lexer.g:1:27: Concurrency
                {
                mConcurrency(); 

                }
                break;
            case 3 :
                // InternalGithubwfRootConcurrencyOneOf1Lexer.g:1:39: Group
                {
                mGroup(); 

                }
                break;
            case 4 :
                // InternalGithubwfRootConcurrencyOneOf1Lexer.g:1:45: False
                {
                mFalse(); 

                }
                break;
            case 5 :
                // InternalGithubwfRootConcurrencyOneOf1Lexer.g:1:51: Null
                {
                mNull(); 

                }
                break;
            case 6 :
                // InternalGithubwfRootConcurrencyOneOf1Lexer.g:1:56: True
                {
                mTrue(); 

                }
                break;
            case 7 :
                // InternalGithubwfRootConcurrencyOneOf1Lexer.g:1:61: Comma
                {
                mComma(); 

                }
                break;
            case 8 :
                // InternalGithubwfRootConcurrencyOneOf1Lexer.g:1:67: Colon
                {
                mColon(); 

                }
                break;
            case 9 :
                // InternalGithubwfRootConcurrencyOneOf1Lexer.g:1:73: LeftSquareBracket
                {
                mLeftSquareBracket(); 

                }
                break;
            case 10 :
                // InternalGithubwfRootConcurrencyOneOf1Lexer.g:1:91: RightSquareBracket
                {
                mRightSquareBracket(); 

                }
                break;
            case 11 :
                // InternalGithubwfRootConcurrencyOneOf1Lexer.g:1:110: LeftCurlyBracket
                {
                mLeftCurlyBracket(); 

                }
                break;
            case 12 :
                // InternalGithubwfRootConcurrencyOneOf1Lexer.g:1:127: RightCurlyBracket
                {
                mRightCurlyBracket(); 

                }
                break;
            case 13 :
                // InternalGithubwfRootConcurrencyOneOf1Lexer.g:1:145: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 14 :
                // InternalGithubwfRootConcurrencyOneOf1Lexer.g:1:157: RULE_E_INT
                {
                mRULE_E_INT(); 

                }
                break;
            case 15 :
                // InternalGithubwfRootConcurrencyOneOf1Lexer.g:1:168: RULE_E_DOUBLE
                {
                mRULE_E_DOUBLE(); 

                }
                break;
            case 16 :
                // InternalGithubwfRootConcurrencyOneOf1Lexer.g:1:182: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 17 :
                // InternalGithubwfRootConcurrencyOneOf1Lexer.g:1:190: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 18 :
                // InternalGithubwfRootConcurrencyOneOf1Lexer.g:1:206: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 19 :
                // InternalGithubwfRootConcurrencyOneOf1Lexer.g:1:222: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 20 :
                // InternalGithubwfRootConcurrencyOneOf1Lexer.g:1:230: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA17_eotS =
        "\1\uffff\1\22\3\27\6\uffff\1\22\2\42\1\22\1\uffff\1\22\5\uffff\1\27\1\uffff\2\27\6\uffff\2\42\2\uffff\1\42\6\uffff\3\27\3\uffff\1\27\1\70\1\71\3\uffff\1\75\37\uffff";
    static final String DFA17_eofS =
        "\127\uffff";
    static final String DFA17_minS =
        "\2\0\1\141\1\165\1\162\6\uffff\1\60\2\56\1\101\1\uffff\1\52\2\uffff\2\0\1\uffff\1\154\1\uffff\1\154\1\165\6\uffff\2\56\2\uffff\1\56\3\uffff\3\0\1\163\1\154\1\145\3\0\1\145\2\60\3\0\1\60\2\uffff\3\0\1\uffff\2\0\1\uffff\2\0\1\uffff\11\0\1\uffff\1\0\1\uffff\5\0\2\uffff";
    static final String DFA17_maxS =
        "\2\uffff\1\141\1\165\1\162\6\uffff\1\71\2\145\1\172\1\uffff\1\57\2\uffff\2\uffff\1\uffff\1\154\1\uffff\1\154\1\165\6\uffff\2\145\2\uffff\1\145\3\uffff\3\uffff\1\163\1\154\1\145\3\uffff\1\145\2\172\3\uffff\1\172\2\uffff\3\uffff\1\uffff\2\uffff\1\uffff\2\uffff\1\uffff\11\uffff\1\uffff\1\uffff\1\uffff\5\uffff\2\uffff";
    static final String DFA17_acceptS =
        "\5\uffff\1\7\1\10\1\11\1\12\1\13\1\14\4\uffff\1\20\1\uffff\1\23\1\24\2\uffff\1\15\1\uffff\1\20\2\uffff\1\7\1\10\1\11\1\12\1\13\1\14\2\uffff\1\16\1\17\1\uffff\1\21\1\22\1\23\20\uffff\1\5\1\6\3\uffff\1\4\2\uffff\1\3\2\uffff\1\3\11\uffff\1\2\1\uffff\1\2\5\uffff\2\1";
    static final String DFA17_specialS =
        "\1\34\1\0\21\uffff\1\42\1\35\23\uffff\1\1\1\22\1\36\3\uffff\1\2\1\23\1\37\3\uffff\1\3\1\24\1\40\3\uffff\1\4\1\25\1\41\1\uffff\1\5\1\26\1\uffff\1\6\1\27\1\uffff\1\7\1\30\1\10\1\31\1\11\1\32\1\12\1\33\1\13\1\uffff\1\14\1\uffff\1\15\1\16\1\17\1\20\1\21\2\uffff}>";
    static final String[] DFA17_transitionS = {
            "\11\22\2\21\2\22\1\21\22\22\1\21\1\22\1\1\11\22\1\5\1\13\1\22\1\20\1\14\11\15\1\6\6\22\32\17\1\7\1\22\1\10\1\16\1\17\1\22\5\17\1\2\7\17\1\3\5\17\1\4\6\17\1\11\1\22\1\12\uff82\22",
            "\143\25\1\23\3\25\1\24\uff98\25",
            "\1\26",
            "\1\30",
            "\1\31",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\40\11\41",
            "\1\43\26\uffff\1\43\37\uffff\1\43",
            "\1\43\1\uffff\12\44\13\uffff\1\43\37\uffff\1\43",
            "\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\1\45\4\uffff\1\46",
            "",
            "",
            "\141\25\1\50\15\25\1\51\uff90\25",
            "\162\25\1\52\uff8d\25",
            "",
            "\1\53",
            "",
            "\1\54",
            "\1\55",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\43\26\uffff\1\43\37\uffff\1\43",
            "\1\43\1\uffff\12\44\13\uffff\1\43\37\uffff\1\43",
            "",
            "",
            "\1\43\1\uffff\12\44\13\uffff\1\43\37\uffff\1\43",
            "",
            "",
            "",
            "\156\25\1\56\uff91\25",
            "\156\25\1\57\uff91\25",
            "\157\25\1\60\uff90\25",
            "\1\61",
            "\1\62",
            "\1\63",
            "\143\25\1\64\uff9c\25",
            "\143\25\1\65\uff9c\25",
            "\165\25\1\66\uff8a\25",
            "\1\67",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\145\25\1\72\uff9a\25",
            "\165\25\1\73\uff8a\25",
            "\160\25\1\74\uff8f\25",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "",
            "\154\25\1\76\uff93\25",
            "\162\25\1\77\uff8d\25",
            "\42\25\1\100\uffdd\25",
            "",
            "\55\25\1\101\uffd2\25",
            "\162\25\1\102\uff8d\25",
            "",
            "\151\25\1\104\uff96\25",
            "\145\25\1\105\uff9a\25",
            "",
            "\156\25\1\106\uff91\25",
            "\156\25\1\107\uff91\25",
            "\55\25\1\110\uffd2\25",
            "\143\25\1\111\uff9c\25",
            "\160\25\1\112\uff8f\25",
            "\171\25\1\113\uff86\25",
            "\162\25\1\114\uff8d\25",
            "\42\25\1\115\uffdd\25",
            "\157\25\1\116\uff90\25",
            "",
            "\147\25\1\120\uff98\25",
            "",
            "\162\25\1\121\uff8d\25",
            "\145\25\1\122\uff9a\25",
            "\163\25\1\123\uff8c\25",
            "\163\25\1\124\uff8c\25",
            "\42\25\1\125\uffdd\25",
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
            return "1:1: Tokens : ( CancelInProgress | Concurrency | Group | False | Null | True | Comma | Colon | LeftSquareBracket | RightSquareBracket | LeftCurlyBracket | RightCurlyBracket | RULE_STRING | RULE_E_INT | RULE_E_DOUBLE | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_1 = input.LA(1);

                        s = -1;
                        if ( (LA17_1=='c') ) {s = 19;}

                        else if ( (LA17_1=='g') ) {s = 20;}

                        else if ( ((LA17_1>='\u0000' && LA17_1<='b')||(LA17_1>='d' && LA17_1<='f')||(LA17_1>='h' && LA17_1<='\uFFFF')) ) {s = 21;}

                        else s = 18;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_40 = input.LA(1);

                        s = -1;
                        if ( (LA17_40=='n') ) {s = 46;}

                        else if ( ((LA17_40>='\u0000' && LA17_40<='m')||(LA17_40>='o' && LA17_40<='\uFFFF')) ) {s = 21;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_46 = input.LA(1);

                        s = -1;
                        if ( (LA17_46=='c') ) {s = 52;}

                        else if ( ((LA17_46>='\u0000' && LA17_46<='b')||(LA17_46>='d' && LA17_46<='\uFFFF')) ) {s = 21;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA17_52 = input.LA(1);

                        s = -1;
                        if ( (LA17_52=='e') ) {s = 58;}

                        else if ( ((LA17_52>='\u0000' && LA17_52<='d')||(LA17_52>='f' && LA17_52<='\uFFFF')) ) {s = 21;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA17_58 = input.LA(1);

                        s = -1;
                        if ( (LA17_58=='l') ) {s = 62;}

                        else if ( ((LA17_58>='\u0000' && LA17_58<='k')||(LA17_58>='m' && LA17_58<='\uFFFF')) ) {s = 21;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA17_62 = input.LA(1);

                        s = -1;
                        if ( (LA17_62=='-') ) {s = 65;}

                        else if ( ((LA17_62>='\u0000' && LA17_62<=',')||(LA17_62>='.' && LA17_62<='\uFFFF')) ) {s = 21;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA17_65 = input.LA(1);

                        s = -1;
                        if ( (LA17_65=='i') ) {s = 68;}

                        else if ( ((LA17_65>='\u0000' && LA17_65<='h')||(LA17_65>='j' && LA17_65<='\uFFFF')) ) {s = 21;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA17_68 = input.LA(1);

                        s = -1;
                        if ( (LA17_68=='n') ) {s = 70;}

                        else if ( ((LA17_68>='\u0000' && LA17_68<='m')||(LA17_68>='o' && LA17_68<='\uFFFF')) ) {s = 21;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA17_70 = input.LA(1);

                        s = -1;
                        if ( (LA17_70=='-') ) {s = 72;}

                        else if ( ((LA17_70>='\u0000' && LA17_70<=',')||(LA17_70>='.' && LA17_70<='\uFFFF')) ) {s = 21;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA17_72 = input.LA(1);

                        s = -1;
                        if ( (LA17_72=='p') ) {s = 74;}

                        else if ( ((LA17_72>='\u0000' && LA17_72<='o')||(LA17_72>='q' && LA17_72<='\uFFFF')) ) {s = 21;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA17_74 = input.LA(1);

                        s = -1;
                        if ( (LA17_74=='r') ) {s = 76;}

                        else if ( ((LA17_74>='\u0000' && LA17_74<='q')||(LA17_74>='s' && LA17_74<='\uFFFF')) ) {s = 21;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA17_76 = input.LA(1);

                        s = -1;
                        if ( (LA17_76=='o') ) {s = 78;}

                        else if ( ((LA17_76>='\u0000' && LA17_76<='n')||(LA17_76>='p' && LA17_76<='\uFFFF')) ) {s = 21;}

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA17_78 = input.LA(1);

                        s = -1;
                        if ( (LA17_78=='g') ) {s = 80;}

                        else if ( ((LA17_78>='\u0000' && LA17_78<='f')||(LA17_78>='h' && LA17_78<='\uFFFF')) ) {s = 21;}

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA17_80 = input.LA(1);

                        s = -1;
                        if ( (LA17_80=='r') ) {s = 81;}

                        else if ( ((LA17_80>='\u0000' && LA17_80<='q')||(LA17_80>='s' && LA17_80<='\uFFFF')) ) {s = 21;}

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA17_81 = input.LA(1);

                        s = -1;
                        if ( (LA17_81=='e') ) {s = 82;}

                        else if ( ((LA17_81>='\u0000' && LA17_81<='d')||(LA17_81>='f' && LA17_81<='\uFFFF')) ) {s = 21;}

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA17_82 = input.LA(1);

                        s = -1;
                        if ( (LA17_82=='s') ) {s = 83;}

                        else if ( ((LA17_82>='\u0000' && LA17_82<='r')||(LA17_82>='t' && LA17_82<='\uFFFF')) ) {s = 21;}

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA17_83 = input.LA(1);

                        s = -1;
                        if ( (LA17_83=='s') ) {s = 84;}

                        else if ( ((LA17_83>='\u0000' && LA17_83<='r')||(LA17_83>='t' && LA17_83<='\uFFFF')) ) {s = 21;}

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA17_84 = input.LA(1);

                        s = -1;
                        if ( (LA17_84=='\"') ) {s = 85;}

                        else if ( ((LA17_84>='\u0000' && LA17_84<='!')||(LA17_84>='#' && LA17_84<='\uFFFF')) ) {s = 21;}

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA17_41 = input.LA(1);

                        s = -1;
                        if ( (LA17_41=='n') ) {s = 47;}

                        else if ( ((LA17_41>='\u0000' && LA17_41<='m')||(LA17_41>='o' && LA17_41<='\uFFFF')) ) {s = 21;}

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA17_47 = input.LA(1);

                        s = -1;
                        if ( (LA17_47=='c') ) {s = 53;}

                        else if ( ((LA17_47>='\u0000' && LA17_47<='b')||(LA17_47>='d' && LA17_47<='\uFFFF')) ) {s = 21;}

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA17_53 = input.LA(1);

                        s = -1;
                        if ( (LA17_53=='u') ) {s = 59;}

                        else if ( ((LA17_53>='\u0000' && LA17_53<='t')||(LA17_53>='v' && LA17_53<='\uFFFF')) ) {s = 21;}

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA17_59 = input.LA(1);

                        s = -1;
                        if ( (LA17_59=='r') ) {s = 63;}

                        else if ( ((LA17_59>='\u0000' && LA17_59<='q')||(LA17_59>='s' && LA17_59<='\uFFFF')) ) {s = 21;}

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA17_63 = input.LA(1);

                        s = -1;
                        if ( (LA17_63=='r') ) {s = 66;}

                        else if ( ((LA17_63>='\u0000' && LA17_63<='q')||(LA17_63>='s' && LA17_63<='\uFFFF')) ) {s = 21;}

                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA17_66 = input.LA(1);

                        s = -1;
                        if ( (LA17_66=='e') ) {s = 69;}

                        else if ( ((LA17_66>='\u0000' && LA17_66<='d')||(LA17_66>='f' && LA17_66<='\uFFFF')) ) {s = 21;}

                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA17_69 = input.LA(1);

                        s = -1;
                        if ( (LA17_69=='n') ) {s = 71;}

                        else if ( ((LA17_69>='\u0000' && LA17_69<='m')||(LA17_69>='o' && LA17_69<='\uFFFF')) ) {s = 21;}

                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA17_71 = input.LA(1);

                        s = -1;
                        if ( (LA17_71=='c') ) {s = 73;}

                        else if ( ((LA17_71>='\u0000' && LA17_71<='b')||(LA17_71>='d' && LA17_71<='\uFFFF')) ) {s = 21;}

                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA17_73 = input.LA(1);

                        s = -1;
                        if ( (LA17_73=='y') ) {s = 75;}

                        else if ( ((LA17_73>='\u0000' && LA17_73<='x')||(LA17_73>='z' && LA17_73<='\uFFFF')) ) {s = 21;}

                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA17_75 = input.LA(1);

                        s = -1;
                        if ( (LA17_75=='\"') ) {s = 77;}

                        else if ( ((LA17_75>='\u0000' && LA17_75<='!')||(LA17_75>='#' && LA17_75<='\uFFFF')) ) {s = 21;}

                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA17_0 = input.LA(1);

                        s = -1;
                        if ( (LA17_0=='\"') ) {s = 1;}

                        else if ( (LA17_0=='f') ) {s = 2;}

                        else if ( (LA17_0=='n') ) {s = 3;}

                        else if ( (LA17_0=='t') ) {s = 4;}

                        else if ( (LA17_0==',') ) {s = 5;}

                        else if ( (LA17_0==':') ) {s = 6;}

                        else if ( (LA17_0=='[') ) {s = 7;}

                        else if ( (LA17_0==']') ) {s = 8;}

                        else if ( (LA17_0=='{') ) {s = 9;}

                        else if ( (LA17_0=='}') ) {s = 10;}

                        else if ( (LA17_0=='-') ) {s = 11;}

                        else if ( (LA17_0=='0') ) {s = 12;}

                        else if ( ((LA17_0>='1' && LA17_0<='9')) ) {s = 13;}

                        else if ( (LA17_0=='^') ) {s = 14;}

                        else if ( ((LA17_0>='A' && LA17_0<='Z')||LA17_0=='_'||(LA17_0>='a' && LA17_0<='e')||(LA17_0>='g' && LA17_0<='m')||(LA17_0>='o' && LA17_0<='s')||(LA17_0>='u' && LA17_0<='z')) ) {s = 15;}

                        else if ( (LA17_0=='/') ) {s = 16;}

                        else if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {s = 17;}

                        else if ( ((LA17_0>='\u0000' && LA17_0<='\b')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\u001F')||LA17_0=='!'||(LA17_0>='#' && LA17_0<='+')||LA17_0=='.'||(LA17_0>=';' && LA17_0<='@')||LA17_0=='\\'||LA17_0=='`'||LA17_0=='|'||(LA17_0>='~' && LA17_0<='\uFFFF')) ) {s = 18;}

                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA17_20 = input.LA(1);

                        s = -1;
                        if ( (LA17_20=='r') ) {s = 42;}

                        else if ( ((LA17_20>='\u0000' && LA17_20<='q')||(LA17_20>='s' && LA17_20<='\uFFFF')) ) {s = 21;}

                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA17_42 = input.LA(1);

                        s = -1;
                        if ( (LA17_42=='o') ) {s = 48;}

                        else if ( ((LA17_42>='\u0000' && LA17_42<='n')||(LA17_42>='p' && LA17_42<='\uFFFF')) ) {s = 21;}

                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA17_48 = input.LA(1);

                        s = -1;
                        if ( (LA17_48=='u') ) {s = 54;}

                        else if ( ((LA17_48>='\u0000' && LA17_48<='t')||(LA17_48>='v' && LA17_48<='\uFFFF')) ) {s = 21;}

                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA17_54 = input.LA(1);

                        s = -1;
                        if ( (LA17_54=='p') ) {s = 60;}

                        else if ( ((LA17_54>='\u0000' && LA17_54<='o')||(LA17_54>='q' && LA17_54<='\uFFFF')) ) {s = 21;}

                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA17_60 = input.LA(1);

                        s = -1;
                        if ( (LA17_60=='\"') ) {s = 64;}

                        else if ( ((LA17_60>='\u0000' && LA17_60<='!')||(LA17_60>='#' && LA17_60<='\uFFFF')) ) {s = 21;}

                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA17_19 = input.LA(1);

                        s = -1;
                        if ( (LA17_19=='a') ) {s = 40;}

                        else if ( (LA17_19=='o') ) {s = 41;}

                        else if ( ((LA17_19>='\u0000' && LA17_19<='`')||(LA17_19>='b' && LA17_19<='n')||(LA17_19>='p' && LA17_19<='\uFFFF')) ) {s = 21;}

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