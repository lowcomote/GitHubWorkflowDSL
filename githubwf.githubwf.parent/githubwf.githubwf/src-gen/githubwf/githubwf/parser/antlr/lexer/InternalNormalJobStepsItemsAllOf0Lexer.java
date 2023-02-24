package githubwf.githubwf.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalNormalJobStepsItemsAllOf0Lexer extends Lexer {
    public static final int Null=5;
    public static final int True=6;
    public static final int RULE_STRING=14;
    public static final int False=4;
    public static final int RULE_SL_COMMENT=19;
    public static final int Comma=7;
    public static final int Colon=8;
    public static final int RightCurlyBracket=12;
    public static final int RULE_E_DOUBLE=16;
    public static final int EOF=-1;
    public static final int RightSquareBracket=10;
    public static final int RULE_ID=17;
    public static final int RULE_WS=20;
    public static final int LeftCurlyBracket=11;
    public static final int RULE_E_INT=15;
    public static final int RULE_ANY_OTHER=21;
    public static final int RULE_INT=13;
    public static final int RULE_ML_COMMENT=18;
    public static final int LeftSquareBracket=9;

    // delegates
    // delegators

    public InternalNormalJobStepsItemsAllOf0Lexer() {;} 
    public InternalNormalJobStepsItemsAllOf0Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalNormalJobStepsItemsAllOf0Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalNormalJobStepsItemsAllOf0Lexer.g"; }

    // $ANTLR start "False"
    public final void mFalse() throws RecognitionException {
        try {
            int _type = False;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNormalJobStepsItemsAllOf0Lexer.g:14:7: ( 'false' )
            // InternalNormalJobStepsItemsAllOf0Lexer.g:14:9: 'false'
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
            // InternalNormalJobStepsItemsAllOf0Lexer.g:16:6: ( 'null' )
            // InternalNormalJobStepsItemsAllOf0Lexer.g:16:8: 'null'
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
            // InternalNormalJobStepsItemsAllOf0Lexer.g:18:6: ( 'true' )
            // InternalNormalJobStepsItemsAllOf0Lexer.g:18:8: 'true'
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
            // InternalNormalJobStepsItemsAllOf0Lexer.g:20:7: ( ',' )
            // InternalNormalJobStepsItemsAllOf0Lexer.g:20:9: ','
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
            // InternalNormalJobStepsItemsAllOf0Lexer.g:22:7: ( ':' )
            // InternalNormalJobStepsItemsAllOf0Lexer.g:22:9: ':'
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
            // InternalNormalJobStepsItemsAllOf0Lexer.g:24:19: ( '[' )
            // InternalNormalJobStepsItemsAllOf0Lexer.g:24:21: '['
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
            // InternalNormalJobStepsItemsAllOf0Lexer.g:26:20: ( ']' )
            // InternalNormalJobStepsItemsAllOf0Lexer.g:26:22: ']'
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
            // InternalNormalJobStepsItemsAllOf0Lexer.g:28:18: ( '{' )
            // InternalNormalJobStepsItemsAllOf0Lexer.g:28:20: '{'
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
            // InternalNormalJobStepsItemsAllOf0Lexer.g:30:19: ( '}' )
            // InternalNormalJobStepsItemsAllOf0Lexer.g:30:21: '}'
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
            // InternalNormalJobStepsItemsAllOf0Lexer.g:32:19: ( ( '0' | '1' .. '9' ( '0' .. '9' )* ) )
            // InternalNormalJobStepsItemsAllOf0Lexer.g:32:21: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            {
            // InternalNormalJobStepsItemsAllOf0Lexer.g:32:21: ( '0' | '1' .. '9' ( '0' .. '9' )* )
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
                    // InternalNormalJobStepsItemsAllOf0Lexer.g:32:22: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // InternalNormalJobStepsItemsAllOf0Lexer.g:32:26: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
                    // InternalNormalJobStepsItemsAllOf0Lexer.g:32:35: ( '0' .. '9' )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalNormalJobStepsItemsAllOf0Lexer.g:32:36: '0' .. '9'
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
            // InternalNormalJobStepsItemsAllOf0Lexer.g:34:13: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalNormalJobStepsItemsAllOf0Lexer.g:34:15: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalNormalJobStepsItemsAllOf0Lexer.g:34:19: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
            	    // InternalNormalJobStepsItemsAllOf0Lexer.g:34:20: '\\\\' .
            	    {
            	    match('\\'); 
            	    matchAny(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalNormalJobStepsItemsAllOf0Lexer.g:34:27: ~ ( ( '\\\\' | '\"' ) )
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
            // InternalNormalJobStepsItemsAllOf0Lexer.g:36:12: ( ( '-' )? RULE_INT )
            // InternalNormalJobStepsItemsAllOf0Lexer.g:36:14: ( '-' )? RULE_INT
            {
            // InternalNormalJobStepsItemsAllOf0Lexer.g:36:14: ( '-' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='-') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalNormalJobStepsItemsAllOf0Lexer.g:36:14: '-'
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
            // InternalNormalJobStepsItemsAllOf0Lexer.g:38:15: ( ( '-' )? RULE_INT ( '.' ( RULE_INT )+ )? ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )? )
            // InternalNormalJobStepsItemsAllOf0Lexer.g:38:17: ( '-' )? RULE_INT ( '.' ( RULE_INT )+ )? ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )?
            {
            // InternalNormalJobStepsItemsAllOf0Lexer.g:38:17: ( '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='-') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalNormalJobStepsItemsAllOf0Lexer.g:38:17: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            mRULE_INT(); 
            // InternalNormalJobStepsItemsAllOf0Lexer.g:38:31: ( '.' ( RULE_INT )+ )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='.') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalNormalJobStepsItemsAllOf0Lexer.g:38:32: '.' ( RULE_INT )+
                    {
                    match('.'); 
                    // InternalNormalJobStepsItemsAllOf0Lexer.g:38:36: ( RULE_INT )+
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
                    	    // InternalNormalJobStepsItemsAllOf0Lexer.g:38:36: RULE_INT
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

            // InternalNormalJobStepsItemsAllOf0Lexer.g:38:48: ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='E'||LA9_0=='e') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalNormalJobStepsItemsAllOf0Lexer.g:38:49: ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalNormalJobStepsItemsAllOf0Lexer.g:38:59: ( '+' | '-' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='+'||LA8_0=='-') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalNormalJobStepsItemsAllOf0Lexer.g:
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
            // InternalNormalJobStepsItemsAllOf0Lexer.g:40:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalNormalJobStepsItemsAllOf0Lexer.g:40:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalNormalJobStepsItemsAllOf0Lexer.g:40:11: ( '^' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='^') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalNormalJobStepsItemsAllOf0Lexer.g:40:11: '^'
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

            // InternalNormalJobStepsItemsAllOf0Lexer.g:40:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')||(LA11_0>='A' && LA11_0<='Z')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='z')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalNormalJobStepsItemsAllOf0Lexer.g:
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
            // InternalNormalJobStepsItemsAllOf0Lexer.g:42:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalNormalJobStepsItemsAllOf0Lexer.g:42:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalNormalJobStepsItemsAllOf0Lexer.g:42:24: ( options {greedy=false; } : . )*
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
            	    // InternalNormalJobStepsItemsAllOf0Lexer.g:42:52: .
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
            // InternalNormalJobStepsItemsAllOf0Lexer.g:44:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalNormalJobStepsItemsAllOf0Lexer.g:44:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalNormalJobStepsItemsAllOf0Lexer.g:44:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalNormalJobStepsItemsAllOf0Lexer.g:44:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalNormalJobStepsItemsAllOf0Lexer.g:44:40: ( ( '\\r' )? '\\n' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\n'||LA15_0=='\r') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalNormalJobStepsItemsAllOf0Lexer.g:44:41: ( '\\r' )? '\\n'
                    {
                    // InternalNormalJobStepsItemsAllOf0Lexer.g:44:41: ( '\\r' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='\r') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalNormalJobStepsItemsAllOf0Lexer.g:44:41: '\\r'
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
            // InternalNormalJobStepsItemsAllOf0Lexer.g:46:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalNormalJobStepsItemsAllOf0Lexer.g:46:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalNormalJobStepsItemsAllOf0Lexer.g:46:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // InternalNormalJobStepsItemsAllOf0Lexer.g:
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
            // InternalNormalJobStepsItemsAllOf0Lexer.g:48:16: ( . )
            // InternalNormalJobStepsItemsAllOf0Lexer.g:48:18: .
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
        // InternalNormalJobStepsItemsAllOf0Lexer.g:1:8: ( False | Null | True | Comma | Colon | LeftSquareBracket | RightSquareBracket | LeftCurlyBracket | RightCurlyBracket | RULE_STRING | RULE_E_INT | RULE_E_DOUBLE | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt17=17;
        alt17 = dfa17.predict(input);
        switch (alt17) {
            case 1 :
                // InternalNormalJobStepsItemsAllOf0Lexer.g:1:10: False
                {
                mFalse(); 

                }
                break;
            case 2 :
                // InternalNormalJobStepsItemsAllOf0Lexer.g:1:16: Null
                {
                mNull(); 

                }
                break;
            case 3 :
                // InternalNormalJobStepsItemsAllOf0Lexer.g:1:21: True
                {
                mTrue(); 

                }
                break;
            case 4 :
                // InternalNormalJobStepsItemsAllOf0Lexer.g:1:26: Comma
                {
                mComma(); 

                }
                break;
            case 5 :
                // InternalNormalJobStepsItemsAllOf0Lexer.g:1:32: Colon
                {
                mColon(); 

                }
                break;
            case 6 :
                // InternalNormalJobStepsItemsAllOf0Lexer.g:1:38: LeftSquareBracket
                {
                mLeftSquareBracket(); 

                }
                break;
            case 7 :
                // InternalNormalJobStepsItemsAllOf0Lexer.g:1:56: RightSquareBracket
                {
                mRightSquareBracket(); 

                }
                break;
            case 8 :
                // InternalNormalJobStepsItemsAllOf0Lexer.g:1:75: LeftCurlyBracket
                {
                mLeftCurlyBracket(); 

                }
                break;
            case 9 :
                // InternalNormalJobStepsItemsAllOf0Lexer.g:1:92: RightCurlyBracket
                {
                mRightCurlyBracket(); 

                }
                break;
            case 10 :
                // InternalNormalJobStepsItemsAllOf0Lexer.g:1:110: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 11 :
                // InternalNormalJobStepsItemsAllOf0Lexer.g:1:122: RULE_E_INT
                {
                mRULE_E_INT(); 

                }
                break;
            case 12 :
                // InternalNormalJobStepsItemsAllOf0Lexer.g:1:133: RULE_E_DOUBLE
                {
                mRULE_E_DOUBLE(); 

                }
                break;
            case 13 :
                // InternalNormalJobStepsItemsAllOf0Lexer.g:1:147: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 14 :
                // InternalNormalJobStepsItemsAllOf0Lexer.g:1:155: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 15 :
                // InternalNormalJobStepsItemsAllOf0Lexer.g:1:171: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 16 :
                // InternalNormalJobStepsItemsAllOf0Lexer.g:1:187: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 17 :
                // InternalNormalJobStepsItemsAllOf0Lexer.g:1:195: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA17_eotS =
        "\1\uffff\3\24\6\uffff\2\22\2\40\1\22\1\uffff\1\22\2\uffff\1\24\1\uffff\2\24\7\uffff\2\40\2\uffff\1\40\3\uffff\4\24\1\55\1\56\1\57\3\uffff";
    static final String DFA17_eofS =
        "\60\uffff";
    static final String DFA17_minS =
        "\1\0\1\141\1\165\1\162\6\uffff\1\0\1\60\2\56\1\101\1\uffff\1\52\2\uffff\1\154\1\uffff\1\154\1\165\7\uffff\2\56\2\uffff\1\56\3\uffff\1\163\1\154\2\145\3\60\3\uffff";
    static final String DFA17_maxS =
        "\1\uffff\1\141\1\165\1\162\6\uffff\1\uffff\1\71\2\145\1\172\1\uffff\1\57\2\uffff\1\154\1\uffff\1\154\1\165\7\uffff\2\145\2\uffff\1\145\3\uffff\1\163\1\154\2\145\3\172\3\uffff";
    static final String DFA17_acceptS =
        "\4\uffff\1\4\1\5\1\6\1\7\1\10\1\11\5\uffff\1\15\1\uffff\1\20\1\21\1\uffff\1\15\2\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\2\uffff\1\13\1\14\1\uffff\1\16\1\17\1\20\7\uffff\1\2\1\3\1\1";
    static final String DFA17_specialS =
        "\1\0\11\uffff\1\1\45\uffff}>";
    static final String[] DFA17_transitionS = {
            "\11\22\2\21\2\22\1\21\22\22\1\21\1\22\1\12\11\22\1\4\1\13\1\22\1\20\1\14\11\15\1\5\6\22\32\17\1\6\1\22\1\7\1\16\1\17\1\22\5\17\1\1\7\17\1\2\5\17\1\3\6\17\1\10\1\22\1\11\uff82\22",
            "\1\23",
            "\1\25",
            "\1\26",
            "",
            "",
            "",
            "",
            "",
            "",
            "\0\35",
            "\1\36\11\37",
            "\1\41\26\uffff\1\41\37\uffff\1\41",
            "\1\41\1\uffff\12\42\13\uffff\1\41\37\uffff\1\41",
            "\32\24\4\uffff\1\24\1\uffff\32\24",
            "",
            "\1\43\4\uffff\1\44",
            "",
            "",
            "\1\46",
            "",
            "\1\47",
            "\1\50",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\41\26\uffff\1\41\37\uffff\1\41",
            "\1\41\1\uffff\12\42\13\uffff\1\41\37\uffff\1\41",
            "",
            "",
            "\1\41\1\uffff\12\42\13\uffff\1\41\37\uffff\1\41",
            "",
            "",
            "",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
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
            return "1:1: Tokens : ( False | Null | True | Comma | Colon | LeftSquareBracket | RightSquareBracket | LeftCurlyBracket | RightCurlyBracket | RULE_STRING | RULE_E_INT | RULE_E_DOUBLE | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_0 = input.LA(1);

                        s = -1;
                        if ( (LA17_0=='f') ) {s = 1;}

                        else if ( (LA17_0=='n') ) {s = 2;}

                        else if ( (LA17_0=='t') ) {s = 3;}

                        else if ( (LA17_0==',') ) {s = 4;}

                        else if ( (LA17_0==':') ) {s = 5;}

                        else if ( (LA17_0=='[') ) {s = 6;}

                        else if ( (LA17_0==']') ) {s = 7;}

                        else if ( (LA17_0=='{') ) {s = 8;}

                        else if ( (LA17_0=='}') ) {s = 9;}

                        else if ( (LA17_0=='\"') ) {s = 10;}

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
                        int LA17_10 = input.LA(1);

                        s = -1;
                        if ( ((LA17_10>='\u0000' && LA17_10<='\uFFFF')) ) {s = 29;}

                        else s = 18;

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