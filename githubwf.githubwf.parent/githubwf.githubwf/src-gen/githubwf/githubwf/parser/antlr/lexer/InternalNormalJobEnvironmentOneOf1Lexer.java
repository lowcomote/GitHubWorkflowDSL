package githubwf.githubwf.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalNormalJobEnvironmentOneOf1Lexer extends Lexer {
    public static final int RULE_STRING=12;
    public static final int Url=6;
    public static final int Name=5;
    public static final int RULE_SL_COMMENT=17;
    public static final int Comma=7;
    public static final int Colon=8;
    public static final int RightCurlyBracket=10;
    public static final int RULE_E_DOUBLE=14;
    public static final int EOF=-1;
    public static final int RULE_ID=15;
    public static final int RULE_WS=18;
    public static final int LeftCurlyBracket=9;
    public static final int RULE_E_INT=13;
    public static final int RULE_ANY_OTHER=19;
    public static final int RULE_INT=11;
    public static final int RULE_ML_COMMENT=16;
    public static final int Environment=4;

    // delegates
    // delegators

    public InternalNormalJobEnvironmentOneOf1Lexer() {;} 
    public InternalNormalJobEnvironmentOneOf1Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalNormalJobEnvironmentOneOf1Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalNormalJobEnvironmentOneOf1Lexer.g"; }

    // $ANTLR start "Environment"
    public final void mEnvironment() throws RecognitionException {
        try {
            int _type = Environment;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNormalJobEnvironmentOneOf1Lexer.g:14:13: ( '\"environment\"' )
            // InternalNormalJobEnvironmentOneOf1Lexer.g:14:15: '\"environment\"'
            {
            match("\"environment\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Environment"

    // $ANTLR start "Name"
    public final void mName() throws RecognitionException {
        try {
            int _type = Name;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNormalJobEnvironmentOneOf1Lexer.g:16:6: ( '\"name\"' )
            // InternalNormalJobEnvironmentOneOf1Lexer.g:16:8: '\"name\"'
            {
            match("\"name\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Name"

    // $ANTLR start "Url"
    public final void mUrl() throws RecognitionException {
        try {
            int _type = Url;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNormalJobEnvironmentOneOf1Lexer.g:18:5: ( '\"url\"' )
            // InternalNormalJobEnvironmentOneOf1Lexer.g:18:7: '\"url\"'
            {
            match("\"url\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Url"

    // $ANTLR start "Comma"
    public final void mComma() throws RecognitionException {
        try {
            int _type = Comma;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNormalJobEnvironmentOneOf1Lexer.g:20:7: ( ',' )
            // InternalNormalJobEnvironmentOneOf1Lexer.g:20:9: ','
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
            // InternalNormalJobEnvironmentOneOf1Lexer.g:22:7: ( ':' )
            // InternalNormalJobEnvironmentOneOf1Lexer.g:22:9: ':'
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

    // $ANTLR start "LeftCurlyBracket"
    public final void mLeftCurlyBracket() throws RecognitionException {
        try {
            int _type = LeftCurlyBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNormalJobEnvironmentOneOf1Lexer.g:24:18: ( '{' )
            // InternalNormalJobEnvironmentOneOf1Lexer.g:24:20: '{'
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
            // InternalNormalJobEnvironmentOneOf1Lexer.g:26:19: ( '}' )
            // InternalNormalJobEnvironmentOneOf1Lexer.g:26:21: '}'
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
            // InternalNormalJobEnvironmentOneOf1Lexer.g:28:19: ( ( '0' | '1' .. '9' ( '0' .. '9' )* ) )
            // InternalNormalJobEnvironmentOneOf1Lexer.g:28:21: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            {
            // InternalNormalJobEnvironmentOneOf1Lexer.g:28:21: ( '0' | '1' .. '9' ( '0' .. '9' )* )
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
                    // InternalNormalJobEnvironmentOneOf1Lexer.g:28:22: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // InternalNormalJobEnvironmentOneOf1Lexer.g:28:26: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
                    // InternalNormalJobEnvironmentOneOf1Lexer.g:28:35: ( '0' .. '9' )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalNormalJobEnvironmentOneOf1Lexer.g:28:36: '0' .. '9'
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
            // InternalNormalJobEnvironmentOneOf1Lexer.g:30:13: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalNormalJobEnvironmentOneOf1Lexer.g:30:15: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalNormalJobEnvironmentOneOf1Lexer.g:30:19: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
            	    // InternalNormalJobEnvironmentOneOf1Lexer.g:30:20: '\\\\' .
            	    {
            	    match('\\'); 
            	    matchAny(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalNormalJobEnvironmentOneOf1Lexer.g:30:27: ~ ( ( '\\\\' | '\"' ) )
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
            // InternalNormalJobEnvironmentOneOf1Lexer.g:32:12: ( ( '-' )? RULE_INT )
            // InternalNormalJobEnvironmentOneOf1Lexer.g:32:14: ( '-' )? RULE_INT
            {
            // InternalNormalJobEnvironmentOneOf1Lexer.g:32:14: ( '-' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='-') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalNormalJobEnvironmentOneOf1Lexer.g:32:14: '-'
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
            // InternalNormalJobEnvironmentOneOf1Lexer.g:34:15: ( ( '-' )? RULE_INT ( '.' ( RULE_INT )+ )? ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )? )
            // InternalNormalJobEnvironmentOneOf1Lexer.g:34:17: ( '-' )? RULE_INT ( '.' ( RULE_INT )+ )? ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )?
            {
            // InternalNormalJobEnvironmentOneOf1Lexer.g:34:17: ( '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='-') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalNormalJobEnvironmentOneOf1Lexer.g:34:17: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            mRULE_INT(); 
            // InternalNormalJobEnvironmentOneOf1Lexer.g:34:31: ( '.' ( RULE_INT )+ )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='.') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalNormalJobEnvironmentOneOf1Lexer.g:34:32: '.' ( RULE_INT )+
                    {
                    match('.'); 
                    // InternalNormalJobEnvironmentOneOf1Lexer.g:34:36: ( RULE_INT )+
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
                    	    // InternalNormalJobEnvironmentOneOf1Lexer.g:34:36: RULE_INT
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

            // InternalNormalJobEnvironmentOneOf1Lexer.g:34:48: ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='E'||LA9_0=='e') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalNormalJobEnvironmentOneOf1Lexer.g:34:49: ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalNormalJobEnvironmentOneOf1Lexer.g:34:59: ( '+' | '-' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='+'||LA8_0=='-') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalNormalJobEnvironmentOneOf1Lexer.g:
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
            // InternalNormalJobEnvironmentOneOf1Lexer.g:36:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalNormalJobEnvironmentOneOf1Lexer.g:36:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalNormalJobEnvironmentOneOf1Lexer.g:36:11: ( '^' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='^') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalNormalJobEnvironmentOneOf1Lexer.g:36:11: '^'
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

            // InternalNormalJobEnvironmentOneOf1Lexer.g:36:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')||(LA11_0>='A' && LA11_0<='Z')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='z')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalNormalJobEnvironmentOneOf1Lexer.g:
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
            // InternalNormalJobEnvironmentOneOf1Lexer.g:38:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalNormalJobEnvironmentOneOf1Lexer.g:38:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalNormalJobEnvironmentOneOf1Lexer.g:38:24: ( options {greedy=false; } : . )*
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
            	    // InternalNormalJobEnvironmentOneOf1Lexer.g:38:52: .
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
            // InternalNormalJobEnvironmentOneOf1Lexer.g:40:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalNormalJobEnvironmentOneOf1Lexer.g:40:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalNormalJobEnvironmentOneOf1Lexer.g:40:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalNormalJobEnvironmentOneOf1Lexer.g:40:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalNormalJobEnvironmentOneOf1Lexer.g:40:40: ( ( '\\r' )? '\\n' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\n'||LA15_0=='\r') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalNormalJobEnvironmentOneOf1Lexer.g:40:41: ( '\\r' )? '\\n'
                    {
                    // InternalNormalJobEnvironmentOneOf1Lexer.g:40:41: ( '\\r' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='\r') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalNormalJobEnvironmentOneOf1Lexer.g:40:41: '\\r'
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
            // InternalNormalJobEnvironmentOneOf1Lexer.g:42:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalNormalJobEnvironmentOneOf1Lexer.g:42:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalNormalJobEnvironmentOneOf1Lexer.g:42:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // InternalNormalJobEnvironmentOneOf1Lexer.g:
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
            // InternalNormalJobEnvironmentOneOf1Lexer.g:44:16: ( . )
            // InternalNormalJobEnvironmentOneOf1Lexer.g:44:18: .
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
        // InternalNormalJobEnvironmentOneOf1Lexer.g:1:8: ( Environment | Name | Url | Comma | Colon | LeftCurlyBracket | RightCurlyBracket | RULE_STRING | RULE_E_INT | RULE_E_DOUBLE | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt17=15;
        alt17 = dfa17.predict(input);
        switch (alt17) {
            case 1 :
                // InternalNormalJobEnvironmentOneOf1Lexer.g:1:10: Environment
                {
                mEnvironment(); 

                }
                break;
            case 2 :
                // InternalNormalJobEnvironmentOneOf1Lexer.g:1:22: Name
                {
                mName(); 

                }
                break;
            case 3 :
                // InternalNormalJobEnvironmentOneOf1Lexer.g:1:27: Url
                {
                mUrl(); 

                }
                break;
            case 4 :
                // InternalNormalJobEnvironmentOneOf1Lexer.g:1:31: Comma
                {
                mComma(); 

                }
                break;
            case 5 :
                // InternalNormalJobEnvironmentOneOf1Lexer.g:1:37: Colon
                {
                mColon(); 

                }
                break;
            case 6 :
                // InternalNormalJobEnvironmentOneOf1Lexer.g:1:43: LeftCurlyBracket
                {
                mLeftCurlyBracket(); 

                }
                break;
            case 7 :
                // InternalNormalJobEnvironmentOneOf1Lexer.g:1:60: RightCurlyBracket
                {
                mRightCurlyBracket(); 

                }
                break;
            case 8 :
                // InternalNormalJobEnvironmentOneOf1Lexer.g:1:78: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 9 :
                // InternalNormalJobEnvironmentOneOf1Lexer.g:1:90: RULE_E_INT
                {
                mRULE_E_INT(); 

                }
                break;
            case 10 :
                // InternalNormalJobEnvironmentOneOf1Lexer.g:1:101: RULE_E_DOUBLE
                {
                mRULE_E_DOUBLE(); 

                }
                break;
            case 11 :
                // InternalNormalJobEnvironmentOneOf1Lexer.g:1:115: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 12 :
                // InternalNormalJobEnvironmentOneOf1Lexer.g:1:123: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 13 :
                // InternalNormalJobEnvironmentOneOf1Lexer.g:1:139: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 14 :
                // InternalNormalJobEnvironmentOneOf1Lexer.g:1:155: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 15 :
                // InternalNormalJobEnvironmentOneOf1Lexer.g:1:163: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA17_eotS =
        "\1\uffff\1\15\4\uffff\1\15\2\30\1\15\1\uffff\1\15\12\uffff\2\30\2\uffff\1\30\31\uffff";
    static final String DFA17_eofS =
        "\64\uffff";
    static final String DFA17_minS =
        "\2\0\4\uffff\1\60\2\56\1\101\1\uffff\1\52\2\uffff\3\0\5\uffff\2\56\2\uffff\1\56\4\uffff\10\0\1\uffff\1\0\2\uffff\1\0\1\uffff\5\0\2\uffff";
    static final String DFA17_maxS =
        "\2\uffff\4\uffff\1\71\2\145\1\172\1\uffff\1\57\2\uffff\3\uffff\5\uffff\2\145\2\uffff\1\145\4\uffff\10\uffff\1\uffff\1\uffff\2\uffff\1\uffff\1\uffff\5\uffff\2\uffff";
    static final String DFA17_acceptS =
        "\2\uffff\1\4\1\5\1\6\1\7\4\uffff\1\13\1\uffff\1\16\1\17\3\uffff\1\10\1\4\1\5\1\6\1\7\2\uffff\1\11\1\12\1\uffff\1\13\1\14\1\15\1\16\10\uffff\1\3\1\uffff\1\2\1\3\1\uffff\1\2\5\uffff\2\1";
    static final String DFA17_specialS =
        "\1\0\1\16\14\uffff\1\1\1\14\1\21\16\uffff\1\2\1\15\1\22\1\3\1\17\1\23\1\4\1\20\1\uffff\1\5\2\uffff\1\6\1\uffff\1\7\1\10\1\11\1\12\1\13\2\uffff}>";
    static final String[] DFA17_transitionS = {
            "\11\15\2\14\2\15\1\14\22\15\1\14\1\15\1\1\11\15\1\2\1\6\1\15\1\13\1\7\11\10\1\3\6\15\32\12\3\15\1\11\1\12\1\15\32\12\1\4\1\15\1\5\uff82\15",
            "\145\21\1\16\10\21\1\17\6\21\1\20\uff8a\21",
            "",
            "",
            "",
            "",
            "\1\26\11\27",
            "\1\31\26\uffff\1\31\37\uffff\1\31",
            "\1\31\1\uffff\12\32\13\uffff\1\31\37\uffff\1\31",
            "\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\1\34\4\uffff\1\35",
            "",
            "",
            "\156\21\1\37\uff91\21",
            "\141\21\1\40\uff9e\21",
            "\162\21\1\41\uff8d\21",
            "",
            "",
            "",
            "",
            "",
            "\1\31\26\uffff\1\31\37\uffff\1\31",
            "\1\31\1\uffff\12\32\13\uffff\1\31\37\uffff\1\31",
            "",
            "",
            "\1\31\1\uffff\12\32\13\uffff\1\31\37\uffff\1\31",
            "",
            "",
            "",
            "",
            "\166\21\1\42\uff89\21",
            "\155\21\1\43\uff92\21",
            "\154\21\1\44\uff93\21",
            "\151\21\1\45\uff96\21",
            "\145\21\1\46\uff9a\21",
            "\42\21\1\47\uffdd\21",
            "\162\21\1\50\uff8d\21",
            "\42\21\1\51\uffdd\21",
            "",
            "\157\21\1\53\uff90\21",
            "",
            "",
            "\156\21\1\55\uff91\21",
            "",
            "\155\21\1\56\uff92\21",
            "\145\21\1\57\uff9a\21",
            "\156\21\1\60\uff91\21",
            "\164\21\1\61\uff8b\21",
            "\42\21\1\62\uffdd\21",
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
            return "1:1: Tokens : ( Environment | Name | Url | Comma | Colon | LeftCurlyBracket | RightCurlyBracket | RULE_STRING | RULE_E_INT | RULE_E_DOUBLE | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_0 = input.LA(1);

                        s = -1;
                        if ( (LA17_0=='\"') ) {s = 1;}

                        else if ( (LA17_0==',') ) {s = 2;}

                        else if ( (LA17_0==':') ) {s = 3;}

                        else if ( (LA17_0=='{') ) {s = 4;}

                        else if ( (LA17_0=='}') ) {s = 5;}

                        else if ( (LA17_0=='-') ) {s = 6;}

                        else if ( (LA17_0=='0') ) {s = 7;}

                        else if ( ((LA17_0>='1' && LA17_0<='9')) ) {s = 8;}

                        else if ( (LA17_0=='^') ) {s = 9;}

                        else if ( ((LA17_0>='A' && LA17_0<='Z')||LA17_0=='_'||(LA17_0>='a' && LA17_0<='z')) ) {s = 10;}

                        else if ( (LA17_0=='/') ) {s = 11;}

                        else if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {s = 12;}

                        else if ( ((LA17_0>='\u0000' && LA17_0<='\b')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\u001F')||LA17_0=='!'||(LA17_0>='#' && LA17_0<='+')||LA17_0=='.'||(LA17_0>=';' && LA17_0<='@')||(LA17_0>='[' && LA17_0<=']')||LA17_0=='`'||LA17_0=='|'||(LA17_0>='~' && LA17_0<='\uFFFF')) ) {s = 13;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_14 = input.LA(1);

                        s = -1;
                        if ( (LA17_14=='n') ) {s = 31;}

                        else if ( ((LA17_14>='\u0000' && LA17_14<='m')||(LA17_14>='o' && LA17_14<='\uFFFF')) ) {s = 17;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_31 = input.LA(1);

                        s = -1;
                        if ( (LA17_31=='v') ) {s = 34;}

                        else if ( ((LA17_31>='\u0000' && LA17_31<='u')||(LA17_31>='w' && LA17_31<='\uFFFF')) ) {s = 17;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA17_34 = input.LA(1);

                        s = -1;
                        if ( (LA17_34=='i') ) {s = 37;}

                        else if ( ((LA17_34>='\u0000' && LA17_34<='h')||(LA17_34>='j' && LA17_34<='\uFFFF')) ) {s = 17;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA17_37 = input.LA(1);

                        s = -1;
                        if ( (LA17_37=='r') ) {s = 40;}

                        else if ( ((LA17_37>='\u0000' && LA17_37<='q')||(LA17_37>='s' && LA17_37<='\uFFFF')) ) {s = 17;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA17_40 = input.LA(1);

                        s = -1;
                        if ( (LA17_40=='o') ) {s = 43;}

                        else if ( ((LA17_40>='\u0000' && LA17_40<='n')||(LA17_40>='p' && LA17_40<='\uFFFF')) ) {s = 17;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA17_43 = input.LA(1);

                        s = -1;
                        if ( (LA17_43=='n') ) {s = 45;}

                        else if ( ((LA17_43>='\u0000' && LA17_43<='m')||(LA17_43>='o' && LA17_43<='\uFFFF')) ) {s = 17;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA17_45 = input.LA(1);

                        s = -1;
                        if ( (LA17_45=='m') ) {s = 46;}

                        else if ( ((LA17_45>='\u0000' && LA17_45<='l')||(LA17_45>='n' && LA17_45<='\uFFFF')) ) {s = 17;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA17_46 = input.LA(1);

                        s = -1;
                        if ( (LA17_46=='e') ) {s = 47;}

                        else if ( ((LA17_46>='\u0000' && LA17_46<='d')||(LA17_46>='f' && LA17_46<='\uFFFF')) ) {s = 17;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA17_47 = input.LA(1);

                        s = -1;
                        if ( (LA17_47=='n') ) {s = 48;}

                        else if ( ((LA17_47>='\u0000' && LA17_47<='m')||(LA17_47>='o' && LA17_47<='\uFFFF')) ) {s = 17;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA17_48 = input.LA(1);

                        s = -1;
                        if ( (LA17_48=='t') ) {s = 49;}

                        else if ( ((LA17_48>='\u0000' && LA17_48<='s')||(LA17_48>='u' && LA17_48<='\uFFFF')) ) {s = 17;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA17_49 = input.LA(1);

                        s = -1;
                        if ( (LA17_49=='\"') ) {s = 50;}

                        else if ( ((LA17_49>='\u0000' && LA17_49<='!')||(LA17_49>='#' && LA17_49<='\uFFFF')) ) {s = 17;}

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA17_15 = input.LA(1);

                        s = -1;
                        if ( (LA17_15=='a') ) {s = 32;}

                        else if ( ((LA17_15>='\u0000' && LA17_15<='`')||(LA17_15>='b' && LA17_15<='\uFFFF')) ) {s = 17;}

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA17_32 = input.LA(1);

                        s = -1;
                        if ( (LA17_32=='m') ) {s = 35;}

                        else if ( ((LA17_32>='\u0000' && LA17_32<='l')||(LA17_32>='n' && LA17_32<='\uFFFF')) ) {s = 17;}

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA17_1 = input.LA(1);

                        s = -1;
                        if ( (LA17_1=='e') ) {s = 14;}

                        else if ( (LA17_1=='n') ) {s = 15;}

                        else if ( (LA17_1=='u') ) {s = 16;}

                        else if ( ((LA17_1>='\u0000' && LA17_1<='d')||(LA17_1>='f' && LA17_1<='m')||(LA17_1>='o' && LA17_1<='t')||(LA17_1>='v' && LA17_1<='\uFFFF')) ) {s = 17;}

                        else s = 13;

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA17_35 = input.LA(1);

                        s = -1;
                        if ( (LA17_35=='e') ) {s = 38;}

                        else if ( ((LA17_35>='\u0000' && LA17_35<='d')||(LA17_35>='f' && LA17_35<='\uFFFF')) ) {s = 17;}

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA17_38 = input.LA(1);

                        s = -1;
                        if ( (LA17_38=='\"') ) {s = 41;}

                        else if ( ((LA17_38>='\u0000' && LA17_38<='!')||(LA17_38>='#' && LA17_38<='\uFFFF')) ) {s = 17;}

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA17_16 = input.LA(1);

                        s = -1;
                        if ( (LA17_16=='r') ) {s = 33;}

                        else if ( ((LA17_16>='\u0000' && LA17_16<='q')||(LA17_16>='s' && LA17_16<='\uFFFF')) ) {s = 17;}

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA17_33 = input.LA(1);

                        s = -1;
                        if ( (LA17_33=='l') ) {s = 36;}

                        else if ( ((LA17_33>='\u0000' && LA17_33<='k')||(LA17_33>='m' && LA17_33<='\uFFFF')) ) {s = 17;}

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA17_36 = input.LA(1);

                        s = -1;
                        if ( (LA17_36=='\"') ) {s = 39;}

                        else if ( ((LA17_36>='\u0000' && LA17_36<='!')||(LA17_36>='#' && LA17_36<='\uFFFF')) ) {s = 17;}

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