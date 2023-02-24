package githubwf.githubwf.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGithubwfRootOnOneOf0Lexer extends Lexer {
    public static final int Null=6;
    public static final int True=7;
    public static final int RULE_STRING=15;
    public static final int False=4;
    public static final int RULE_SL_COMMENT=20;
    public static final int Comma=8;
    public static final int Colon=9;
    public static final int RightCurlyBracket=13;
    public static final int RULE_E_DOUBLE=17;
    public static final int EOF=-1;
    public static final int RightSquareBracket=11;
    public static final int RULE_ID=18;
    public static final int RULE_WS=21;
    public static final int LeftCurlyBracket=12;
    public static final int RULE_E_INT=16;
    public static final int RULE_ANY_OTHER=22;
    public static final int RULE_INT=14;
    public static final int RULE_ML_COMMENT=19;
    public static final int LeftSquareBracket=10;
    public static final int On=5;

    // delegates
    // delegators

    public InternalGithubwfRootOnOneOf0Lexer() {;} 
    public InternalGithubwfRootOnOneOf0Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalGithubwfRootOnOneOf0Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalGithubwfRootOnOneOf0Lexer.g"; }

    // $ANTLR start "False"
    public final void mFalse() throws RecognitionException {
        try {
            int _type = False;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGithubwfRootOnOneOf0Lexer.g:14:7: ( 'false' )
            // InternalGithubwfRootOnOneOf0Lexer.g:14:9: 'false'
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

    // $ANTLR start "On"
    public final void mOn() throws RecognitionException {
        try {
            int _type = On;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGithubwfRootOnOneOf0Lexer.g:16:4: ( '\"on\"' )
            // InternalGithubwfRootOnOneOf0Lexer.g:16:6: '\"on\"'
            {
            match("\"on\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "On"

    // $ANTLR start "Null"
    public final void mNull() throws RecognitionException {
        try {
            int _type = Null;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGithubwfRootOnOneOf0Lexer.g:18:6: ( 'null' )
            // InternalGithubwfRootOnOneOf0Lexer.g:18:8: 'null'
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
            // InternalGithubwfRootOnOneOf0Lexer.g:20:6: ( 'true' )
            // InternalGithubwfRootOnOneOf0Lexer.g:20:8: 'true'
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
            // InternalGithubwfRootOnOneOf0Lexer.g:22:7: ( ',' )
            // InternalGithubwfRootOnOneOf0Lexer.g:22:9: ','
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
            // InternalGithubwfRootOnOneOf0Lexer.g:24:7: ( ':' )
            // InternalGithubwfRootOnOneOf0Lexer.g:24:9: ':'
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
            // InternalGithubwfRootOnOneOf0Lexer.g:26:19: ( '[' )
            // InternalGithubwfRootOnOneOf0Lexer.g:26:21: '['
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
            // InternalGithubwfRootOnOneOf0Lexer.g:28:20: ( ']' )
            // InternalGithubwfRootOnOneOf0Lexer.g:28:22: ']'
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
            // InternalGithubwfRootOnOneOf0Lexer.g:30:18: ( '{' )
            // InternalGithubwfRootOnOneOf0Lexer.g:30:20: '{'
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
            // InternalGithubwfRootOnOneOf0Lexer.g:32:19: ( '}' )
            // InternalGithubwfRootOnOneOf0Lexer.g:32:21: '}'
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
            // InternalGithubwfRootOnOneOf0Lexer.g:34:19: ( ( '0' | '1' .. '9' ( '0' .. '9' )* ) )
            // InternalGithubwfRootOnOneOf0Lexer.g:34:21: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            {
            // InternalGithubwfRootOnOneOf0Lexer.g:34:21: ( '0' | '1' .. '9' ( '0' .. '9' )* )
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
                    // InternalGithubwfRootOnOneOf0Lexer.g:34:22: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // InternalGithubwfRootOnOneOf0Lexer.g:34:26: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
                    // InternalGithubwfRootOnOneOf0Lexer.g:34:35: ( '0' .. '9' )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalGithubwfRootOnOneOf0Lexer.g:34:36: '0' .. '9'
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
            // InternalGithubwfRootOnOneOf0Lexer.g:36:13: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalGithubwfRootOnOneOf0Lexer.g:36:15: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalGithubwfRootOnOneOf0Lexer.g:36:19: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
            	    // InternalGithubwfRootOnOneOf0Lexer.g:36:20: '\\\\' .
            	    {
            	    match('\\'); 
            	    matchAny(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalGithubwfRootOnOneOf0Lexer.g:36:27: ~ ( ( '\\\\' | '\"' ) )
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
            // InternalGithubwfRootOnOneOf0Lexer.g:38:12: ( ( '-' )? RULE_INT )
            // InternalGithubwfRootOnOneOf0Lexer.g:38:14: ( '-' )? RULE_INT
            {
            // InternalGithubwfRootOnOneOf0Lexer.g:38:14: ( '-' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='-') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalGithubwfRootOnOneOf0Lexer.g:38:14: '-'
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
            // InternalGithubwfRootOnOneOf0Lexer.g:40:15: ( ( '-' )? RULE_INT ( '.' ( RULE_INT )+ )? ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )? )
            // InternalGithubwfRootOnOneOf0Lexer.g:40:17: ( '-' )? RULE_INT ( '.' ( RULE_INT )+ )? ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )?
            {
            // InternalGithubwfRootOnOneOf0Lexer.g:40:17: ( '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='-') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalGithubwfRootOnOneOf0Lexer.g:40:17: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            mRULE_INT(); 
            // InternalGithubwfRootOnOneOf0Lexer.g:40:31: ( '.' ( RULE_INT )+ )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='.') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalGithubwfRootOnOneOf0Lexer.g:40:32: '.' ( RULE_INT )+
                    {
                    match('.'); 
                    // InternalGithubwfRootOnOneOf0Lexer.g:40:36: ( RULE_INT )+
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
                    	    // InternalGithubwfRootOnOneOf0Lexer.g:40:36: RULE_INT
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

            // InternalGithubwfRootOnOneOf0Lexer.g:40:48: ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='E'||LA9_0=='e') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalGithubwfRootOnOneOf0Lexer.g:40:49: ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalGithubwfRootOnOneOf0Lexer.g:40:59: ( '+' | '-' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='+'||LA8_0=='-') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalGithubwfRootOnOneOf0Lexer.g:
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
            // InternalGithubwfRootOnOneOf0Lexer.g:42:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalGithubwfRootOnOneOf0Lexer.g:42:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalGithubwfRootOnOneOf0Lexer.g:42:11: ( '^' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='^') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalGithubwfRootOnOneOf0Lexer.g:42:11: '^'
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

            // InternalGithubwfRootOnOneOf0Lexer.g:42:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')||(LA11_0>='A' && LA11_0<='Z')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='z')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGithubwfRootOnOneOf0Lexer.g:
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
            // InternalGithubwfRootOnOneOf0Lexer.g:44:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalGithubwfRootOnOneOf0Lexer.g:44:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalGithubwfRootOnOneOf0Lexer.g:44:24: ( options {greedy=false; } : . )*
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
            	    // InternalGithubwfRootOnOneOf0Lexer.g:44:52: .
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
            // InternalGithubwfRootOnOneOf0Lexer.g:46:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalGithubwfRootOnOneOf0Lexer.g:46:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalGithubwfRootOnOneOf0Lexer.g:46:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalGithubwfRootOnOneOf0Lexer.g:46:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalGithubwfRootOnOneOf0Lexer.g:46:40: ( ( '\\r' )? '\\n' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\n'||LA15_0=='\r') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalGithubwfRootOnOneOf0Lexer.g:46:41: ( '\\r' )? '\\n'
                    {
                    // InternalGithubwfRootOnOneOf0Lexer.g:46:41: ( '\\r' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='\r') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalGithubwfRootOnOneOf0Lexer.g:46:41: '\\r'
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
            // InternalGithubwfRootOnOneOf0Lexer.g:48:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalGithubwfRootOnOneOf0Lexer.g:48:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalGithubwfRootOnOneOf0Lexer.g:48:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // InternalGithubwfRootOnOneOf0Lexer.g:
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
            // InternalGithubwfRootOnOneOf0Lexer.g:50:16: ( . )
            // InternalGithubwfRootOnOneOf0Lexer.g:50:18: .
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
        // InternalGithubwfRootOnOneOf0Lexer.g:1:8: ( False | On | Null | True | Comma | Colon | LeftSquareBracket | RightSquareBracket | LeftCurlyBracket | RightCurlyBracket | RULE_STRING | RULE_E_INT | RULE_E_DOUBLE | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt17=18;
        alt17 = dfa17.predict(input);
        switch (alt17) {
            case 1 :
                // InternalGithubwfRootOnOneOf0Lexer.g:1:10: False
                {
                mFalse(); 

                }
                break;
            case 2 :
                // InternalGithubwfRootOnOneOf0Lexer.g:1:16: On
                {
                mOn(); 

                }
                break;
            case 3 :
                // InternalGithubwfRootOnOneOf0Lexer.g:1:19: Null
                {
                mNull(); 

                }
                break;
            case 4 :
                // InternalGithubwfRootOnOneOf0Lexer.g:1:24: True
                {
                mTrue(); 

                }
                break;
            case 5 :
                // InternalGithubwfRootOnOneOf0Lexer.g:1:29: Comma
                {
                mComma(); 

                }
                break;
            case 6 :
                // InternalGithubwfRootOnOneOf0Lexer.g:1:35: Colon
                {
                mColon(); 

                }
                break;
            case 7 :
                // InternalGithubwfRootOnOneOf0Lexer.g:1:41: LeftSquareBracket
                {
                mLeftSquareBracket(); 

                }
                break;
            case 8 :
                // InternalGithubwfRootOnOneOf0Lexer.g:1:59: RightSquareBracket
                {
                mRightSquareBracket(); 

                }
                break;
            case 9 :
                // InternalGithubwfRootOnOneOf0Lexer.g:1:78: LeftCurlyBracket
                {
                mLeftCurlyBracket(); 

                }
                break;
            case 10 :
                // InternalGithubwfRootOnOneOf0Lexer.g:1:95: RightCurlyBracket
                {
                mRightCurlyBracket(); 

                }
                break;
            case 11 :
                // InternalGithubwfRootOnOneOf0Lexer.g:1:113: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 12 :
                // InternalGithubwfRootOnOneOf0Lexer.g:1:125: RULE_E_INT
                {
                mRULE_E_INT(); 

                }
                break;
            case 13 :
                // InternalGithubwfRootOnOneOf0Lexer.g:1:136: RULE_E_DOUBLE
                {
                mRULE_E_DOUBLE(); 

                }
                break;
            case 14 :
                // InternalGithubwfRootOnOneOf0Lexer.g:1:150: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 15 :
                // InternalGithubwfRootOnOneOf0Lexer.g:1:158: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 16 :
                // InternalGithubwfRootOnOneOf0Lexer.g:1:174: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 17 :
                // InternalGithubwfRootOnOneOf0Lexer.g:1:190: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 18 :
                // InternalGithubwfRootOnOneOf0Lexer.g:1:198: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA17_eotS =
        "\1\uffff\1\24\1\22\2\24\6\uffff\1\22\2\41\1\22\1\uffff\1\22\2\uffff\1\24\3\uffff\2\24\6\uffff\2\41\2\uffff\1\41\3\uffff\1\24\1\uffff\3\24\1\uffff\1\61\1\62\1\63\4\uffff";
    static final String DFA17_eofS =
        "\64\uffff";
    static final String DFA17_minS =
        "\1\0\1\141\1\0\1\165\1\162\6\uffff\1\60\2\56\1\101\1\uffff\1\52\2\uffff\1\154\1\uffff\1\0\1\uffff\1\154\1\165\6\uffff\2\56\2\uffff\1\56\3\uffff\1\163\1\0\1\154\2\145\1\uffff\3\60\4\uffff";
    static final String DFA17_maxS =
        "\1\uffff\1\141\1\uffff\1\165\1\162\6\uffff\1\71\2\145\1\172\1\uffff\1\57\2\uffff\1\154\1\uffff\1\uffff\1\uffff\1\154\1\165\6\uffff\2\145\2\uffff\1\145\3\uffff\1\163\1\uffff\1\154\2\145\1\uffff\3\172\4\uffff";
    static final String DFA17_acceptS =
        "\5\uffff\1\5\1\6\1\7\1\10\1\11\1\12\4\uffff\1\16\1\uffff\1\21\1\22\1\uffff\1\16\1\uffff\1\13\2\uffff\1\5\1\6\1\7\1\10\1\11\1\12\2\uffff\1\14\1\15\1\uffff\1\17\1\20\1\21\5\uffff\1\2\3\uffff\1\2\1\3\1\4\1\1";
    static final String DFA17_specialS =
        "\1\0\1\uffff\1\1\22\uffff\1\2\22\uffff\1\3\13\uffff}>";
    static final String[] DFA17_transitionS = {
            "\11\22\2\21\2\22\1\21\22\22\1\21\1\22\1\2\11\22\1\5\1\13\1\22\1\20\1\14\11\15\1\6\6\22\32\17\1\7\1\22\1\10\1\16\1\17\1\22\5\17\1\1\7\17\1\3\5\17\1\4\6\17\1\11\1\22\1\12\uff82\22",
            "\1\23",
            "\157\26\1\25\uff90\26",
            "\1\27",
            "\1\30",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\37\11\40",
            "\1\42\26\uffff\1\42\37\uffff\1\42",
            "\1\42\1\uffff\12\43\13\uffff\1\42\37\uffff\1\42",
            "\32\24\4\uffff\1\24\1\uffff\32\24",
            "",
            "\1\44\4\uffff\1\45",
            "",
            "",
            "\1\47",
            "",
            "\156\26\1\50\uff91\26",
            "",
            "\1\51",
            "\1\52",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\42\26\uffff\1\42\37\uffff\1\42",
            "\1\42\1\uffff\12\43\13\uffff\1\42\37\uffff\1\42",
            "",
            "",
            "\1\42\1\uffff\12\43\13\uffff\1\42\37\uffff\1\42",
            "",
            "",
            "",
            "\1\53",
            "\42\26\1\54\uffdd\26",
            "\1\55",
            "\1\56",
            "\1\57",
            "",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
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
            return "1:1: Tokens : ( False | On | Null | True | Comma | Colon | LeftSquareBracket | RightSquareBracket | LeftCurlyBracket | RightCurlyBracket | RULE_STRING | RULE_E_INT | RULE_E_DOUBLE | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_0 = input.LA(1);

                        s = -1;
                        if ( (LA17_0=='f') ) {s = 1;}

                        else if ( (LA17_0=='\"') ) {s = 2;}

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
                    case 1 : 
                        int LA17_2 = input.LA(1);

                        s = -1;
                        if ( (LA17_2=='o') ) {s = 21;}

                        else if ( ((LA17_2>='\u0000' && LA17_2<='n')||(LA17_2>='p' && LA17_2<='\uFFFF')) ) {s = 22;}

                        else s = 18;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_21 = input.LA(1);

                        s = -1;
                        if ( (LA17_21=='n') ) {s = 40;}

                        else if ( ((LA17_21>='\u0000' && LA17_21<='m')||(LA17_21>='o' && LA17_21<='\uFFFF')) ) {s = 22;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA17_40 = input.LA(1);

                        s = -1;
                        if ( (LA17_40=='\"') ) {s = 44;}

                        else if ( ((LA17_40>='\u0000' && LA17_40<='!')||(LA17_40>='#' && LA17_40<='\uFFFF')) ) {s = 22;}

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