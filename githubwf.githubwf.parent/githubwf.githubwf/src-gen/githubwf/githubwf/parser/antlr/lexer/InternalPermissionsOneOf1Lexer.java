package githubwf.githubwf.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPermissionsOneOf1Lexer extends Lexer {
    public static final int Null=18;
    public static final int PullRequests=6;
    public static final int SecurityEvents=5;
    public static final int Discussions=8;
    public static final int Issues=15;
    public static final int Deployments=7;
    public static final int True=19;
    public static final int RULE_STRING=27;
    public static final int False=17;
    public static final int RULE_SL_COMMENT=32;
    public static final int Comma=20;
    public static final int Packages=11;
    public static final int Colon=21;
    public static final int RightCurlyBracket=25;
    public static final int RULE_E_DOUBLE=29;
    public static final int EOF=-1;
    public static final int RightSquareBracket=23;
    public static final int RepositoryProjects=4;
    public static final int IdToken=10;
    public static final int RULE_ID=30;
    public static final int Actions=13;
    public static final int RULE_WS=33;
    public static final int LeftCurlyBracket=24;
    public static final int RULE_E_INT=28;
    public static final int RULE_ANY_OTHER=34;
    public static final int Pages=16;
    public static final int Contents=9;
    public static final int Statuses=12;
    public static final int Checks=14;
    public static final int RULE_INT=26;
    public static final int RULE_ML_COMMENT=31;
    public static final int LeftSquareBracket=22;

    // delegates
    // delegators

    public InternalPermissionsOneOf1Lexer() {;} 
    public InternalPermissionsOneOf1Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalPermissionsOneOf1Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalPermissionsOneOf1Lexer.g"; }

    // $ANTLR start "RepositoryProjects"
    public final void mRepositoryProjects() throws RecognitionException {
        try {
            int _type = RepositoryProjects;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPermissionsOneOf1Lexer.g:14:20: ( '\"repository-projects\"' )
            // InternalPermissionsOneOf1Lexer.g:14:22: '\"repository-projects\"'
            {
            match("\"repository-projects\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RepositoryProjects"

    // $ANTLR start "SecurityEvents"
    public final void mSecurityEvents() throws RecognitionException {
        try {
            int _type = SecurityEvents;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPermissionsOneOf1Lexer.g:16:16: ( '\"security-events\"' )
            // InternalPermissionsOneOf1Lexer.g:16:18: '\"security-events\"'
            {
            match("\"security-events\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SecurityEvents"

    // $ANTLR start "PullRequests"
    public final void mPullRequests() throws RecognitionException {
        try {
            int _type = PullRequests;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPermissionsOneOf1Lexer.g:18:14: ( '\"pull-requests\"' )
            // InternalPermissionsOneOf1Lexer.g:18:16: '\"pull-requests\"'
            {
            match("\"pull-requests\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PullRequests"

    // $ANTLR start "Deployments"
    public final void mDeployments() throws RecognitionException {
        try {
            int _type = Deployments;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPermissionsOneOf1Lexer.g:20:13: ( '\"deployments\"' )
            // InternalPermissionsOneOf1Lexer.g:20:15: '\"deployments\"'
            {
            match("\"deployments\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Deployments"

    // $ANTLR start "Discussions"
    public final void mDiscussions() throws RecognitionException {
        try {
            int _type = Discussions;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPermissionsOneOf1Lexer.g:22:13: ( '\"discussions\"' )
            // InternalPermissionsOneOf1Lexer.g:22:15: '\"discussions\"'
            {
            match("\"discussions\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Discussions"

    // $ANTLR start "Contents"
    public final void mContents() throws RecognitionException {
        try {
            int _type = Contents;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPermissionsOneOf1Lexer.g:24:10: ( '\"contents\"' )
            // InternalPermissionsOneOf1Lexer.g:24:12: '\"contents\"'
            {
            match("\"contents\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Contents"

    // $ANTLR start "IdToken"
    public final void mIdToken() throws RecognitionException {
        try {
            int _type = IdToken;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPermissionsOneOf1Lexer.g:26:9: ( '\"id-token\"' )
            // InternalPermissionsOneOf1Lexer.g:26:11: '\"id-token\"'
            {
            match("\"id-token\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IdToken"

    // $ANTLR start "Packages"
    public final void mPackages() throws RecognitionException {
        try {
            int _type = Packages;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPermissionsOneOf1Lexer.g:28:10: ( '\"packages\"' )
            // InternalPermissionsOneOf1Lexer.g:28:12: '\"packages\"'
            {
            match("\"packages\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Packages"

    // $ANTLR start "Statuses"
    public final void mStatuses() throws RecognitionException {
        try {
            int _type = Statuses;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPermissionsOneOf1Lexer.g:30:10: ( '\"statuses\"' )
            // InternalPermissionsOneOf1Lexer.g:30:12: '\"statuses\"'
            {
            match("\"statuses\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Statuses"

    // $ANTLR start "Actions"
    public final void mActions() throws RecognitionException {
        try {
            int _type = Actions;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPermissionsOneOf1Lexer.g:32:9: ( '\"actions\"' )
            // InternalPermissionsOneOf1Lexer.g:32:11: '\"actions\"'
            {
            match("\"actions\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Actions"

    // $ANTLR start "Checks"
    public final void mChecks() throws RecognitionException {
        try {
            int _type = Checks;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPermissionsOneOf1Lexer.g:34:8: ( '\"checks\"' )
            // InternalPermissionsOneOf1Lexer.g:34:10: '\"checks\"'
            {
            match("\"checks\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Checks"

    // $ANTLR start "Issues"
    public final void mIssues() throws RecognitionException {
        try {
            int _type = Issues;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPermissionsOneOf1Lexer.g:36:8: ( '\"issues\"' )
            // InternalPermissionsOneOf1Lexer.g:36:10: '\"issues\"'
            {
            match("\"issues\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Issues"

    // $ANTLR start "Pages"
    public final void mPages() throws RecognitionException {
        try {
            int _type = Pages;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPermissionsOneOf1Lexer.g:38:7: ( '\"pages\"' )
            // InternalPermissionsOneOf1Lexer.g:38:9: '\"pages\"'
            {
            match("\"pages\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Pages"

    // $ANTLR start "False"
    public final void mFalse() throws RecognitionException {
        try {
            int _type = False;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPermissionsOneOf1Lexer.g:40:7: ( 'false' )
            // InternalPermissionsOneOf1Lexer.g:40:9: 'false'
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
            // InternalPermissionsOneOf1Lexer.g:42:6: ( 'null' )
            // InternalPermissionsOneOf1Lexer.g:42:8: 'null'
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
            // InternalPermissionsOneOf1Lexer.g:44:6: ( 'true' )
            // InternalPermissionsOneOf1Lexer.g:44:8: 'true'
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
            // InternalPermissionsOneOf1Lexer.g:46:7: ( ',' )
            // InternalPermissionsOneOf1Lexer.g:46:9: ','
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
            // InternalPermissionsOneOf1Lexer.g:48:7: ( ':' )
            // InternalPermissionsOneOf1Lexer.g:48:9: ':'
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
            // InternalPermissionsOneOf1Lexer.g:50:19: ( '[' )
            // InternalPermissionsOneOf1Lexer.g:50:21: '['
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
            // InternalPermissionsOneOf1Lexer.g:52:20: ( ']' )
            // InternalPermissionsOneOf1Lexer.g:52:22: ']'
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
            // InternalPermissionsOneOf1Lexer.g:54:18: ( '{' )
            // InternalPermissionsOneOf1Lexer.g:54:20: '{'
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
            // InternalPermissionsOneOf1Lexer.g:56:19: ( '}' )
            // InternalPermissionsOneOf1Lexer.g:56:21: '}'
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
            // InternalPermissionsOneOf1Lexer.g:58:19: ( ( '0' | '1' .. '9' ( '0' .. '9' )* ) )
            // InternalPermissionsOneOf1Lexer.g:58:21: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            {
            // InternalPermissionsOneOf1Lexer.g:58:21: ( '0' | '1' .. '9' ( '0' .. '9' )* )
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
                    // InternalPermissionsOneOf1Lexer.g:58:22: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // InternalPermissionsOneOf1Lexer.g:58:26: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
                    // InternalPermissionsOneOf1Lexer.g:58:35: ( '0' .. '9' )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalPermissionsOneOf1Lexer.g:58:36: '0' .. '9'
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
            // InternalPermissionsOneOf1Lexer.g:60:13: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalPermissionsOneOf1Lexer.g:60:15: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalPermissionsOneOf1Lexer.g:60:19: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
            	    // InternalPermissionsOneOf1Lexer.g:60:20: '\\\\' .
            	    {
            	    match('\\'); 
            	    matchAny(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalPermissionsOneOf1Lexer.g:60:27: ~ ( ( '\\\\' | '\"' ) )
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
            // InternalPermissionsOneOf1Lexer.g:62:12: ( ( '-' )? RULE_INT )
            // InternalPermissionsOneOf1Lexer.g:62:14: ( '-' )? RULE_INT
            {
            // InternalPermissionsOneOf1Lexer.g:62:14: ( '-' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='-') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalPermissionsOneOf1Lexer.g:62:14: '-'
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
            // InternalPermissionsOneOf1Lexer.g:64:15: ( ( '-' )? RULE_INT ( '.' ( RULE_INT )+ )? ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )? )
            // InternalPermissionsOneOf1Lexer.g:64:17: ( '-' )? RULE_INT ( '.' ( RULE_INT )+ )? ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )?
            {
            // InternalPermissionsOneOf1Lexer.g:64:17: ( '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='-') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalPermissionsOneOf1Lexer.g:64:17: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            mRULE_INT(); 
            // InternalPermissionsOneOf1Lexer.g:64:31: ( '.' ( RULE_INT )+ )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='.') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalPermissionsOneOf1Lexer.g:64:32: '.' ( RULE_INT )+
                    {
                    match('.'); 
                    // InternalPermissionsOneOf1Lexer.g:64:36: ( RULE_INT )+
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
                    	    // InternalPermissionsOneOf1Lexer.g:64:36: RULE_INT
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

            // InternalPermissionsOneOf1Lexer.g:64:48: ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='E'||LA9_0=='e') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalPermissionsOneOf1Lexer.g:64:49: ( 'E' | 'e' ) ( '+' | '-' )? RULE_INT
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalPermissionsOneOf1Lexer.g:64:59: ( '+' | '-' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='+'||LA8_0=='-') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalPermissionsOneOf1Lexer.g:
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
            // InternalPermissionsOneOf1Lexer.g:66:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalPermissionsOneOf1Lexer.g:66:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalPermissionsOneOf1Lexer.g:66:11: ( '^' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='^') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalPermissionsOneOf1Lexer.g:66:11: '^'
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

            // InternalPermissionsOneOf1Lexer.g:66:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')||(LA11_0>='A' && LA11_0<='Z')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='z')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalPermissionsOneOf1Lexer.g:
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
            // InternalPermissionsOneOf1Lexer.g:68:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalPermissionsOneOf1Lexer.g:68:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalPermissionsOneOf1Lexer.g:68:24: ( options {greedy=false; } : . )*
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
            	    // InternalPermissionsOneOf1Lexer.g:68:52: .
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
            // InternalPermissionsOneOf1Lexer.g:70:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalPermissionsOneOf1Lexer.g:70:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalPermissionsOneOf1Lexer.g:70:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalPermissionsOneOf1Lexer.g:70:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalPermissionsOneOf1Lexer.g:70:40: ( ( '\\r' )? '\\n' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\n'||LA15_0=='\r') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalPermissionsOneOf1Lexer.g:70:41: ( '\\r' )? '\\n'
                    {
                    // InternalPermissionsOneOf1Lexer.g:70:41: ( '\\r' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='\r') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalPermissionsOneOf1Lexer.g:70:41: '\\r'
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
            // InternalPermissionsOneOf1Lexer.g:72:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalPermissionsOneOf1Lexer.g:72:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalPermissionsOneOf1Lexer.g:72:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // InternalPermissionsOneOf1Lexer.g:
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
            // InternalPermissionsOneOf1Lexer.g:74:16: ( . )
            // InternalPermissionsOneOf1Lexer.g:74:18: .
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
        // InternalPermissionsOneOf1Lexer.g:1:8: ( RepositoryProjects | SecurityEvents | PullRequests | Deployments | Discussions | Contents | IdToken | Packages | Statuses | Actions | Checks | Issues | Pages | False | Null | True | Comma | Colon | LeftSquareBracket | RightSquareBracket | LeftCurlyBracket | RightCurlyBracket | RULE_STRING | RULE_E_INT | RULE_E_DOUBLE | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt17=30;
        alt17 = dfa17.predict(input);
        switch (alt17) {
            case 1 :
                // InternalPermissionsOneOf1Lexer.g:1:10: RepositoryProjects
                {
                mRepositoryProjects(); 

                }
                break;
            case 2 :
                // InternalPermissionsOneOf1Lexer.g:1:29: SecurityEvents
                {
                mSecurityEvents(); 

                }
                break;
            case 3 :
                // InternalPermissionsOneOf1Lexer.g:1:44: PullRequests
                {
                mPullRequests(); 

                }
                break;
            case 4 :
                // InternalPermissionsOneOf1Lexer.g:1:57: Deployments
                {
                mDeployments(); 

                }
                break;
            case 5 :
                // InternalPermissionsOneOf1Lexer.g:1:69: Discussions
                {
                mDiscussions(); 

                }
                break;
            case 6 :
                // InternalPermissionsOneOf1Lexer.g:1:81: Contents
                {
                mContents(); 

                }
                break;
            case 7 :
                // InternalPermissionsOneOf1Lexer.g:1:90: IdToken
                {
                mIdToken(); 

                }
                break;
            case 8 :
                // InternalPermissionsOneOf1Lexer.g:1:98: Packages
                {
                mPackages(); 

                }
                break;
            case 9 :
                // InternalPermissionsOneOf1Lexer.g:1:107: Statuses
                {
                mStatuses(); 

                }
                break;
            case 10 :
                // InternalPermissionsOneOf1Lexer.g:1:116: Actions
                {
                mActions(); 

                }
                break;
            case 11 :
                // InternalPermissionsOneOf1Lexer.g:1:124: Checks
                {
                mChecks(); 

                }
                break;
            case 12 :
                // InternalPermissionsOneOf1Lexer.g:1:131: Issues
                {
                mIssues(); 

                }
                break;
            case 13 :
                // InternalPermissionsOneOf1Lexer.g:1:138: Pages
                {
                mPages(); 

                }
                break;
            case 14 :
                // InternalPermissionsOneOf1Lexer.g:1:144: False
                {
                mFalse(); 

                }
                break;
            case 15 :
                // InternalPermissionsOneOf1Lexer.g:1:150: Null
                {
                mNull(); 

                }
                break;
            case 16 :
                // InternalPermissionsOneOf1Lexer.g:1:155: True
                {
                mTrue(); 

                }
                break;
            case 17 :
                // InternalPermissionsOneOf1Lexer.g:1:160: Comma
                {
                mComma(); 

                }
                break;
            case 18 :
                // InternalPermissionsOneOf1Lexer.g:1:166: Colon
                {
                mColon(); 

                }
                break;
            case 19 :
                // InternalPermissionsOneOf1Lexer.g:1:172: LeftSquareBracket
                {
                mLeftSquareBracket(); 

                }
                break;
            case 20 :
                // InternalPermissionsOneOf1Lexer.g:1:190: RightSquareBracket
                {
                mRightSquareBracket(); 

                }
                break;
            case 21 :
                // InternalPermissionsOneOf1Lexer.g:1:209: LeftCurlyBracket
                {
                mLeftCurlyBracket(); 

                }
                break;
            case 22 :
                // InternalPermissionsOneOf1Lexer.g:1:226: RightCurlyBracket
                {
                mRightCurlyBracket(); 

                }
                break;
            case 23 :
                // InternalPermissionsOneOf1Lexer.g:1:244: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 24 :
                // InternalPermissionsOneOf1Lexer.g:1:256: RULE_E_INT
                {
                mRULE_E_INT(); 

                }
                break;
            case 25 :
                // InternalPermissionsOneOf1Lexer.g:1:267: RULE_E_DOUBLE
                {
                mRULE_E_DOUBLE(); 

                }
                break;
            case 26 :
                // InternalPermissionsOneOf1Lexer.g:1:281: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 27 :
                // InternalPermissionsOneOf1Lexer.g:1:289: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 28 :
                // InternalPermissionsOneOf1Lexer.g:1:305: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 29 :
                // InternalPermissionsOneOf1Lexer.g:1:321: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 30 :
                // InternalPermissionsOneOf1Lexer.g:1:329: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA17_eotS =
        "\1\uffff\1\22\3\34\6\uffff\1\22\2\47\1\22\1\uffff\1\22\12\uffff\1\34\1\uffff\2\34\6\uffff\2\47\2\uffff\1\47\17\uffff\3\34\15\uffff\1\34\1\132\1\133\15\uffff\1\151\146\uffff";
    static final String DFA17_eofS =
        "\u00c0\uffff";
    static final String DFA17_minS =
        "\2\0\1\141\1\165\1\162\6\uffff\1\60\2\56\1\101\1\uffff\1\52\2\uffff\7\0\1\uffff\1\154\1\uffff\1\154\1\165\6\uffff\2\56\2\uffff\1\56\3\uffff\14\0\1\163\1\154\1\145\15\0\1\145\2\60\15\0\1\60\2\uffff\15\0\1\uffff\5\0\1\uffff\14\0\1\uffff\3\0\1\uffff\1\0\1\uffff\11\0\1\uffff\1\0\2\uffff\2\0\1\uffff\1\0\1\uffff\2\0\3\uffff\2\0\1\uffff\1\0\1\uffff\2\0\2\uffff\10\0\2\uffff\3\0\2\uffff\2\0\1\uffff\2\0\1\uffff\1\0\1\uffff\1\0\1\uffff\2\0\2\uffff";
    static final String DFA17_maxS =
        "\2\uffff\1\141\1\165\1\162\6\uffff\1\71\2\145\1\172\1\uffff\1\57\2\uffff\7\uffff\1\uffff\1\154\1\uffff\1\154\1\165\6\uffff\2\145\2\uffff\1\145\3\uffff\14\uffff\1\163\1\154\1\145\15\uffff\1\145\2\172\15\uffff\1\172\2\uffff\15\uffff\1\uffff\5\uffff\1\uffff\14\uffff\1\uffff\3\uffff\1\uffff\1\uffff\1\uffff\11\uffff\1\uffff\1\uffff\2\uffff\2\uffff\1\uffff\1\uffff\1\uffff\2\uffff\3\uffff\2\uffff\1\uffff\1\uffff\1\uffff\2\uffff\2\uffff\10\uffff\2\uffff\3\uffff\2\uffff\2\uffff\1\uffff\2\uffff\1\uffff\1\uffff\1\uffff\1\uffff\1\uffff\2\uffff\2\uffff";
    static final String DFA17_acceptS =
        "\5\uffff\1\21\1\22\1\23\1\24\1\25\1\26\4\uffff\1\32\1\uffff\1\35\1\36\7\uffff\1\27\1\uffff\1\32\2\uffff\1\21\1\22\1\23\1\24\1\25\1\26\2\uffff\1\30\1\31\1\uffff\1\33\1\34\1\35\55\uffff\1\17\1\20\15\uffff\1\16\5\uffff\1\15\14\uffff\1\15\3\uffff\1\13\1\uffff\1\14\11\uffff\1\13\1\uffff\1\14\1\12\2\uffff\1\11\1\uffff\1\10\2\uffff\1\6\1\7\1\12\2\uffff\1\11\1\uffff\1\10\2\uffff\1\6\1\7\10\uffff\1\4\1\5\3\uffff\1\4\1\5\2\uffff\1\3\2\uffff\1\3\1\uffff\1\2\1\uffff\1\2\2\uffff\2\1";
    static final String DFA17_specialS =
        "\1\125\1\0\21\uffff\1\3\1\2\1\1\1\167\1\60\1\103\1\143\23\uffff\1\4\1\26\1\134\1\44\1\122\1\61\1\73\1\106\1\152\1\115\1\157\1\144\3\uffff\1\5\1\27\1\135\1\45\1\126\1\164\1\62\1\74\1\107\1\153\1\116\1\160\1\145\3\uffff\1\6\1\30\1\136\1\46\1\127\1\165\1\63\1\75\1\110\1\154\1\117\1\161\1\146\3\uffff\1\7\1\31\1\137\1\47\1\130\1\166\1\64\1\76\1\111\1\155\1\120\1\162\1\147\1\uffff\1\10\1\32\1\140\1\50\1\131\1\uffff\1\65\1\77\1\112\1\156\1\121\1\163\1\150\1\11\1\33\1\141\1\51\1\132\1\uffff\1\66\1\100\1\113\1\uffff\1\123\1\uffff\1\151\1\12\1\34\1\142\1\52\1\133\1\67\1\101\1\114\1\uffff\1\124\2\uffff\1\13\1\35\1\uffff\1\53\1\uffff\1\70\1\102\3\uffff\1\14\1\36\1\uffff\1\54\1\uffff\1\71\1\104\2\uffff\1\15\1\37\1\55\1\72\1\105\1\16\1\40\1\56\2\uffff\1\17\1\41\1\57\2\uffff\1\20\1\42\1\uffff\1\21\1\43\1\uffff\1\22\1\uffff\1\23\1\uffff\1\24\1\25\2\uffff}>";
    static final String[] DFA17_transitionS = {
            "\11\22\2\21\2\22\1\21\22\22\1\21\1\22\1\1\11\22\1\5\1\13\1\22\1\20\1\14\11\15\1\6\6\22\32\17\1\7\1\22\1\10\1\16\1\17\1\22\5\17\1\2\7\17\1\3\5\17\1\4\6\17\1\11\1\22\1\12\uff82\22",
            "\141\32\1\31\1\32\1\27\1\26\4\32\1\30\6\32\1\25\1\32\1\23\1\24\uff8c\32",
            "\1\33",
            "\1\35",
            "\1\36",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\45\11\46",
            "\1\50\26\uffff\1\50\37\uffff\1\50",
            "\1\50\1\uffff\12\51\13\uffff\1\50\37\uffff\1\50",
            "\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\1\52\4\uffff\1\53",
            "",
            "",
            "\145\32\1\55\uff9a\32",
            "\145\32\1\56\16\32\1\57\uff8b\32",
            "\141\32\1\61\23\32\1\60\uff8a\32",
            "\145\32\1\62\3\32\1\63\uff96\32",
            "\150\32\1\65\6\32\1\64\uff90\32",
            "\144\32\1\66\16\32\1\67\uff8c\32",
            "\143\32\1\70\uff9c\32",
            "",
            "\1\71",
            "",
            "\1\72",
            "\1\73",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\50\26\uffff\1\50\37\uffff\1\50",
            "\1\50\1\uffff\12\51\13\uffff\1\50\37\uffff\1\50",
            "",
            "",
            "\1\50\1\uffff\12\51\13\uffff\1\50\37\uffff\1\50",
            "",
            "",
            "",
            "\160\32\1\74\uff8f\32",
            "\143\32\1\75\uff9c\32",
            "\141\32\1\76\uff9e\32",
            "\154\32\1\77\uff93\32",
            "\143\32\1\100\3\32\1\101\uff98\32",
            "\160\32\1\102\uff8f\32",
            "\163\32\1\103\uff8c\32",
            "\156\32\1\104\uff91\32",
            "\145\32\1\105\uff9a\32",
            "\55\32\1\106\uffd2\32",
            "\163\32\1\107\uff8c\32",
            "\164\32\1\110\uff8b\32",
            "\1\111",
            "\1\112",
            "\1\113",
            "\157\32\1\114\uff90\32",
            "\165\32\1\115\uff8a\32",
            "\164\32\1\116\uff8b\32",
            "\154\32\1\117\uff93\32",
            "\153\32\1\120\uff94\32",
            "\145\32\1\121\uff9a\32",
            "\154\32\1\122\uff93\32",
            "\143\32\1\123\uff9c\32",
            "\164\32\1\124\uff8b\32",
            "\143\32\1\125\uff9c\32",
            "\164\32\1\126\uff8b\32",
            "\165\32\1\127\uff8a\32",
            "\151\32\1\130\uff96\32",
            "\1\131",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\163\32\1\134\uff8c\32",
            "\162\32\1\135\uff8d\32",
            "\165\32\1\136\uff8a\32",
            "\55\32\1\137\uffd2\32",
            "\141\32\1\140\uff9e\32",
            "\163\32\1\141\uff8c\32",
            "\157\32\1\142\uff90\32",
            "\165\32\1\143\uff8a\32",
            "\145\32\1\144\uff9a\32",
            "\153\32\1\145\uff94\32",
            "\157\32\1\146\uff90\32",
            "\145\32\1\147\uff9a\32",
            "\157\32\1\150\uff90\32",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "",
            "\151\32\1\152\uff96\32",
            "\151\32\1\153\uff96\32",
            "\163\32\1\154\uff8c\32",
            "\162\32\1\155\uff8d\32",
            "\147\32\1\156\uff98\32",
            "\42\32\1\157\uffdd\32",
            "\171\32\1\160\uff86\32",
            "\163\32\1\161\uff8c\32",
            "\156\32\1\162\uff91\32",
            "\163\32\1\163\uff8c\32",
            "\153\32\1\164\uff94\32",
            "\163\32\1\165\uff8c\32",
            "\156\32\1\166\uff91\32",
            "",
            "\164\32\1\167\uff8b\32",
            "\164\32\1\170\uff8b\32",
            "\145\32\1\171\uff9a\32",
            "\145\32\1\172\uff9a\32",
            "\145\32\1\173\uff9a\32",
            "",
            "\155\32\1\175\uff92\32",
            "\163\32\1\176\uff8c\32",
            "\164\32\1\177\uff8b\32",
            "\42\32\1\u0080\uffdd\32",
            "\145\32\1\u0081\uff9a\32",
            "\42\32\1\u0082\uffdd\32",
            "\163\32\1\u0083\uff8c\32",
            "\157\32\1\u0084\uff90\32",
            "\171\32\1\u0085\uff86\32",
            "\163\32\1\u0086\uff8c\32",
            "\161\32\1\u0087\uff8e\32",
            "\163\32\1\u0088\uff8c\32",
            "",
            "\145\32\1\u0089\uff9a\32",
            "\151\32\1\u008a\uff96\32",
            "\163\32\1\u008b\uff8c\32",
            "",
            "\156\32\1\u008d\uff91\32",
            "",
            "\42\32\1\u008f\uffdd\32",
            "\162\32\1\u0090\uff8d\32",
            "\55\32\1\u0091\uffd2\32",
            "\42\32\1\u0092\uffdd\32",
            "\165\32\1\u0093\uff8a\32",
            "\42\32\1\u0094\uffdd\32",
            "\156\32\1\u0095\uff91\32",
            "\157\32\1\u0096\uff90\32",
            "\42\32\1\u0097\uffdd\32",
            "",
            "\42\32\1\u0098\uffdd\32",
            "",
            "",
            "\171\32\1\u009a\uff86\32",
            "\145\32\1\u009b\uff9a\32",
            "",
            "\145\32\1\u009d\uff9a\32",
            "",
            "\164\32\1\u009f\uff8b\32",
            "\156\32\1\u00a0\uff91\32",
            "",
            "",
            "",
            "\55\32\1\u00a3\uffd2\32",
            "\166\32\1\u00a4\uff89\32",
            "",
            "\163\32\1\u00a5\uff8c\32",
            "",
            "\163\32\1\u00a6\uff8c\32",
            "\163\32\1\u00a7\uff8c\32",
            "",
            "",
            "\160\32\1\u00a8\uff8f\32",
            "\145\32\1\u00a9\uff9a\32",
            "\164\32\1\u00aa\uff8b\32",
            "\42\32\1\u00ab\uffdd\32",
            "\42\32\1\u00ac\uffdd\32",
            "\162\32\1\u00ad\uff8d\32",
            "\156\32\1\u00ae\uff91\32",
            "\163\32\1\u00af\uff8c\32",
            "",
            "",
            "\157\32\1\u00b2\uff90\32",
            "\164\32\1\u00b3\uff8b\32",
            "\42\32\1\u00b4\uffdd\32",
            "",
            "",
            "\152\32\1\u00b5\uff95\32",
            "\163\32\1\u00b6\uff8c\32",
            "",
            "\145\32\1\u00b8\uff9a\32",
            "\42\32\1\u00b9\uffdd\32",
            "",
            "\143\32\1\u00ba\uff9c\32",
            "",
            "\164\32\1\u00bc\uff8b\32",
            "",
            "\163\32\1\u00bd\uff8c\32",
            "\42\32\1\u00be\uffdd\32",
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
            return "1:1: Tokens : ( RepositoryProjects | SecurityEvents | PullRequests | Deployments | Discussions | Contents | IdToken | Packages | Statuses | Actions | Checks | Issues | Pages | False | Null | True | Comma | Colon | LeftSquareBracket | RightSquareBracket | LeftCurlyBracket | RightCurlyBracket | RULE_STRING | RULE_E_INT | RULE_E_DOUBLE | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_1 = input.LA(1);

                        s = -1;
                        if ( (LA17_1=='r') ) {s = 19;}

                        else if ( (LA17_1=='s') ) {s = 20;}

                        else if ( (LA17_1=='p') ) {s = 21;}

                        else if ( (LA17_1=='d') ) {s = 22;}

                        else if ( (LA17_1=='c') ) {s = 23;}

                        else if ( (LA17_1=='i') ) {s = 24;}

                        else if ( (LA17_1=='a') ) {s = 25;}

                        else if ( ((LA17_1>='\u0000' && LA17_1<='`')||LA17_1=='b'||(LA17_1>='e' && LA17_1<='h')||(LA17_1>='j' && LA17_1<='o')||LA17_1=='q'||(LA17_1>='t' && LA17_1<='\uFFFF')) ) {s = 26;}

                        else s = 18;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_21 = input.LA(1);

                        s = -1;
                        if ( (LA17_21=='u') ) {s = 48;}

                        else if ( (LA17_21=='a') ) {s = 49;}

                        else if ( ((LA17_21>='\u0000' && LA17_21<='`')||(LA17_21>='b' && LA17_21<='t')||(LA17_21>='v' && LA17_21<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_20 = input.LA(1);

                        s = -1;
                        if ( (LA17_20=='e') ) {s = 46;}

                        else if ( (LA17_20=='t') ) {s = 47;}

                        else if ( ((LA17_20>='\u0000' && LA17_20<='d')||(LA17_20>='f' && LA17_20<='s')||(LA17_20>='u' && LA17_20<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA17_19 = input.LA(1);

                        s = -1;
                        if ( (LA17_19=='e') ) {s = 45;}

                        else if ( ((LA17_19>='\u0000' && LA17_19<='d')||(LA17_19>='f' && LA17_19<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA17_45 = input.LA(1);

                        s = -1;
                        if ( (LA17_45=='p') ) {s = 60;}

                        else if ( ((LA17_45>='\u0000' && LA17_45<='o')||(LA17_45>='q' && LA17_45<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA17_60 = input.LA(1);

                        s = -1;
                        if ( (LA17_60=='o') ) {s = 76;}

                        else if ( ((LA17_60>='\u0000' && LA17_60<='n')||(LA17_60>='p' && LA17_60<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA17_76 = input.LA(1);

                        s = -1;
                        if ( (LA17_76=='s') ) {s = 92;}

                        else if ( ((LA17_76>='\u0000' && LA17_76<='r')||(LA17_76>='t' && LA17_76<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA17_92 = input.LA(1);

                        s = -1;
                        if ( (LA17_92=='i') ) {s = 106;}

                        else if ( ((LA17_92>='\u0000' && LA17_92<='h')||(LA17_92>='j' && LA17_92<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA17_106 = input.LA(1);

                        s = -1;
                        if ( (LA17_106=='t') ) {s = 119;}

                        else if ( ((LA17_106>='\u0000' && LA17_106<='s')||(LA17_106>='u' && LA17_106<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA17_119 = input.LA(1);

                        s = -1;
                        if ( (LA17_119=='o') ) {s = 132;}

                        else if ( ((LA17_119>='\u0000' && LA17_119<='n')||(LA17_119>='p' && LA17_119<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA17_132 = input.LA(1);

                        s = -1;
                        if ( (LA17_132=='r') ) {s = 144;}

                        else if ( ((LA17_132>='\u0000' && LA17_132<='q')||(LA17_132>='s' && LA17_132<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA17_144 = input.LA(1);

                        s = -1;
                        if ( (LA17_144=='y') ) {s = 154;}

                        else if ( ((LA17_144>='\u0000' && LA17_144<='x')||(LA17_144>='z' && LA17_144<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA17_154 = input.LA(1);

                        s = -1;
                        if ( (LA17_154=='-') ) {s = 163;}

                        else if ( ((LA17_154>='\u0000' && LA17_154<=',')||(LA17_154>='.' && LA17_154<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA17_163 = input.LA(1);

                        s = -1;
                        if ( (LA17_163=='p') ) {s = 168;}

                        else if ( ((LA17_163>='\u0000' && LA17_163<='o')||(LA17_163>='q' && LA17_163<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA17_168 = input.LA(1);

                        s = -1;
                        if ( (LA17_168=='r') ) {s = 173;}

                        else if ( ((LA17_168>='\u0000' && LA17_168<='q')||(LA17_168>='s' && LA17_168<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA17_173 = input.LA(1);

                        s = -1;
                        if ( (LA17_173=='o') ) {s = 178;}

                        else if ( ((LA17_173>='\u0000' && LA17_173<='n')||(LA17_173>='p' && LA17_173<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA17_178 = input.LA(1);

                        s = -1;
                        if ( (LA17_178=='j') ) {s = 181;}

                        else if ( ((LA17_178>='\u0000' && LA17_178<='i')||(LA17_178>='k' && LA17_178<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA17_181 = input.LA(1);

                        s = -1;
                        if ( (LA17_181=='e') ) {s = 184;}

                        else if ( ((LA17_181>='\u0000' && LA17_181<='d')||(LA17_181>='f' && LA17_181<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA17_184 = input.LA(1);

                        s = -1;
                        if ( (LA17_184=='c') ) {s = 186;}

                        else if ( ((LA17_184>='\u0000' && LA17_184<='b')||(LA17_184>='d' && LA17_184<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA17_186 = input.LA(1);

                        s = -1;
                        if ( (LA17_186=='t') ) {s = 188;}

                        else if ( ((LA17_186>='\u0000' && LA17_186<='s')||(LA17_186>='u' && LA17_186<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA17_188 = input.LA(1);

                        s = -1;
                        if ( (LA17_188=='s') ) {s = 189;}

                        else if ( ((LA17_188>='\u0000' && LA17_188<='r')||(LA17_188>='t' && LA17_188<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA17_189 = input.LA(1);

                        s = -1;
                        if ( (LA17_189=='\"') ) {s = 190;}

                        else if ( ((LA17_189>='\u0000' && LA17_189<='!')||(LA17_189>='#' && LA17_189<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA17_46 = input.LA(1);

                        s = -1;
                        if ( (LA17_46=='c') ) {s = 61;}

                        else if ( ((LA17_46>='\u0000' && LA17_46<='b')||(LA17_46>='d' && LA17_46<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA17_61 = input.LA(1);

                        s = -1;
                        if ( (LA17_61=='u') ) {s = 77;}

                        else if ( ((LA17_61>='\u0000' && LA17_61<='t')||(LA17_61>='v' && LA17_61<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA17_77 = input.LA(1);

                        s = -1;
                        if ( (LA17_77=='r') ) {s = 93;}

                        else if ( ((LA17_77>='\u0000' && LA17_77<='q')||(LA17_77>='s' && LA17_77<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA17_93 = input.LA(1);

                        s = -1;
                        if ( (LA17_93=='i') ) {s = 107;}

                        else if ( ((LA17_93>='\u0000' && LA17_93<='h')||(LA17_93>='j' && LA17_93<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA17_107 = input.LA(1);

                        s = -1;
                        if ( (LA17_107=='t') ) {s = 120;}

                        else if ( ((LA17_107>='\u0000' && LA17_107<='s')||(LA17_107>='u' && LA17_107<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA17_120 = input.LA(1);

                        s = -1;
                        if ( (LA17_120=='y') ) {s = 133;}

                        else if ( ((LA17_120>='\u0000' && LA17_120<='x')||(LA17_120>='z' && LA17_120<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA17_133 = input.LA(1);

                        s = -1;
                        if ( (LA17_133=='-') ) {s = 145;}

                        else if ( ((LA17_133>='\u0000' && LA17_133<=',')||(LA17_133>='.' && LA17_133<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA17_145 = input.LA(1);

                        s = -1;
                        if ( (LA17_145=='e') ) {s = 155;}

                        else if ( ((LA17_145>='\u0000' && LA17_145<='d')||(LA17_145>='f' && LA17_145<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA17_155 = input.LA(1);

                        s = -1;
                        if ( (LA17_155=='v') ) {s = 164;}

                        else if ( ((LA17_155>='\u0000' && LA17_155<='u')||(LA17_155>='w' && LA17_155<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA17_164 = input.LA(1);

                        s = -1;
                        if ( (LA17_164=='e') ) {s = 169;}

                        else if ( ((LA17_164>='\u0000' && LA17_164<='d')||(LA17_164>='f' && LA17_164<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA17_169 = input.LA(1);

                        s = -1;
                        if ( (LA17_169=='n') ) {s = 174;}

                        else if ( ((LA17_169>='\u0000' && LA17_169<='m')||(LA17_169>='o' && LA17_169<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA17_174 = input.LA(1);

                        s = -1;
                        if ( (LA17_174=='t') ) {s = 179;}

                        else if ( ((LA17_174>='\u0000' && LA17_174<='s')||(LA17_174>='u' && LA17_174<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA17_179 = input.LA(1);

                        s = -1;
                        if ( (LA17_179=='s') ) {s = 182;}

                        else if ( ((LA17_179>='\u0000' && LA17_179<='r')||(LA17_179>='t' && LA17_179<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA17_182 = input.LA(1);

                        s = -1;
                        if ( (LA17_182=='\"') ) {s = 185;}

                        else if ( ((LA17_182>='\u0000' && LA17_182<='!')||(LA17_182>='#' && LA17_182<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA17_48 = input.LA(1);

                        s = -1;
                        if ( (LA17_48=='l') ) {s = 63;}

                        else if ( ((LA17_48>='\u0000' && LA17_48<='k')||(LA17_48>='m' && LA17_48<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA17_63 = input.LA(1);

                        s = -1;
                        if ( (LA17_63=='l') ) {s = 79;}

                        else if ( ((LA17_63>='\u0000' && LA17_63<='k')||(LA17_63>='m' && LA17_63<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA17_79 = input.LA(1);

                        s = -1;
                        if ( (LA17_79=='-') ) {s = 95;}

                        else if ( ((LA17_79>='\u0000' && LA17_79<=',')||(LA17_79>='.' && LA17_79<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA17_95 = input.LA(1);

                        s = -1;
                        if ( (LA17_95=='r') ) {s = 109;}

                        else if ( ((LA17_95>='\u0000' && LA17_95<='q')||(LA17_95>='s' && LA17_95<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA17_109 = input.LA(1);

                        s = -1;
                        if ( (LA17_109=='e') ) {s = 122;}

                        else if ( ((LA17_109>='\u0000' && LA17_109<='d')||(LA17_109>='f' && LA17_109<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA17_122 = input.LA(1);

                        s = -1;
                        if ( (LA17_122=='q') ) {s = 135;}

                        else if ( ((LA17_122>='\u0000' && LA17_122<='p')||(LA17_122>='r' && LA17_122<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA17_135 = input.LA(1);

                        s = -1;
                        if ( (LA17_135=='u') ) {s = 147;}

                        else if ( ((LA17_135>='\u0000' && LA17_135<='t')||(LA17_135>='v' && LA17_135<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA17_147 = input.LA(1);

                        s = -1;
                        if ( (LA17_147=='e') ) {s = 157;}

                        else if ( ((LA17_147>='\u0000' && LA17_147<='d')||(LA17_147>='f' && LA17_147<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA17_157 = input.LA(1);

                        s = -1;
                        if ( (LA17_157=='s') ) {s = 165;}

                        else if ( ((LA17_157>='\u0000' && LA17_157<='r')||(LA17_157>='t' && LA17_157<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA17_165 = input.LA(1);

                        s = -1;
                        if ( (LA17_165=='t') ) {s = 170;}

                        else if ( ((LA17_165>='\u0000' && LA17_165<='s')||(LA17_165>='u' && LA17_165<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA17_170 = input.LA(1);

                        s = -1;
                        if ( (LA17_170=='s') ) {s = 175;}

                        else if ( ((LA17_170>='\u0000' && LA17_170<='r')||(LA17_170>='t' && LA17_170<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA17_175 = input.LA(1);

                        s = -1;
                        if ( (LA17_175=='\"') ) {s = 180;}

                        else if ( ((LA17_175>='\u0000' && LA17_175<='!')||(LA17_175>='#' && LA17_175<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA17_23 = input.LA(1);

                        s = -1;
                        if ( (LA17_23=='o') ) {s = 52;}

                        else if ( (LA17_23=='h') ) {s = 53;}

                        else if ( ((LA17_23>='\u0000' && LA17_23<='g')||(LA17_23>='i' && LA17_23<='n')||(LA17_23>='p' && LA17_23<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA17_50 = input.LA(1);

                        s = -1;
                        if ( (LA17_50=='p') ) {s = 66;}

                        else if ( ((LA17_50>='\u0000' && LA17_50<='o')||(LA17_50>='q' && LA17_50<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA17_66 = input.LA(1);

                        s = -1;
                        if ( (LA17_66=='l') ) {s = 82;}

                        else if ( ((LA17_66>='\u0000' && LA17_66<='k')||(LA17_66>='m' && LA17_66<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA17_82 = input.LA(1);

                        s = -1;
                        if ( (LA17_82=='o') ) {s = 98;}

                        else if ( ((LA17_82>='\u0000' && LA17_82<='n')||(LA17_82>='p' && LA17_82<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA17_98 = input.LA(1);

                        s = -1;
                        if ( (LA17_98=='y') ) {s = 112;}

                        else if ( ((LA17_98>='\u0000' && LA17_98<='x')||(LA17_98>='z' && LA17_98<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA17_112 = input.LA(1);

                        s = -1;
                        if ( (LA17_112=='m') ) {s = 125;}

                        else if ( ((LA17_112>='\u0000' && LA17_112<='l')||(LA17_112>='n' && LA17_112<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA17_125 = input.LA(1);

                        s = -1;
                        if ( (LA17_125=='e') ) {s = 137;}

                        else if ( ((LA17_125>='\u0000' && LA17_125<='d')||(LA17_125>='f' && LA17_125<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA17_137 = input.LA(1);

                        s = -1;
                        if ( (LA17_137=='n') ) {s = 149;}

                        else if ( ((LA17_137>='\u0000' && LA17_137<='m')||(LA17_137>='o' && LA17_137<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA17_149 = input.LA(1);

                        s = -1;
                        if ( (LA17_149=='t') ) {s = 159;}

                        else if ( ((LA17_149>='\u0000' && LA17_149<='s')||(LA17_149>='u' && LA17_149<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 57 : 
                        int LA17_159 = input.LA(1);

                        s = -1;
                        if ( (LA17_159=='s') ) {s = 166;}

                        else if ( ((LA17_159>='\u0000' && LA17_159<='r')||(LA17_159>='t' && LA17_159<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 58 : 
                        int LA17_166 = input.LA(1);

                        s = -1;
                        if ( (LA17_166=='\"') ) {s = 171;}

                        else if ( ((LA17_166>='\u0000' && LA17_166<='!')||(LA17_166>='#' && LA17_166<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 59 : 
                        int LA17_51 = input.LA(1);

                        s = -1;
                        if ( (LA17_51=='s') ) {s = 67;}

                        else if ( ((LA17_51>='\u0000' && LA17_51<='r')||(LA17_51>='t' && LA17_51<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 60 : 
                        int LA17_67 = input.LA(1);

                        s = -1;
                        if ( (LA17_67=='c') ) {s = 83;}

                        else if ( ((LA17_67>='\u0000' && LA17_67<='b')||(LA17_67>='d' && LA17_67<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 61 : 
                        int LA17_83 = input.LA(1);

                        s = -1;
                        if ( (LA17_83=='u') ) {s = 99;}

                        else if ( ((LA17_83>='\u0000' && LA17_83<='t')||(LA17_83>='v' && LA17_83<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 62 : 
                        int LA17_99 = input.LA(1);

                        s = -1;
                        if ( (LA17_99=='s') ) {s = 113;}

                        else if ( ((LA17_99>='\u0000' && LA17_99<='r')||(LA17_99>='t' && LA17_99<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 63 : 
                        int LA17_113 = input.LA(1);

                        s = -1;
                        if ( (LA17_113=='s') ) {s = 126;}

                        else if ( ((LA17_113>='\u0000' && LA17_113<='r')||(LA17_113>='t' && LA17_113<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 64 : 
                        int LA17_126 = input.LA(1);

                        s = -1;
                        if ( (LA17_126=='i') ) {s = 138;}

                        else if ( ((LA17_126>='\u0000' && LA17_126<='h')||(LA17_126>='j' && LA17_126<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 65 : 
                        int LA17_138 = input.LA(1);

                        s = -1;
                        if ( (LA17_138=='o') ) {s = 150;}

                        else if ( ((LA17_138>='\u0000' && LA17_138<='n')||(LA17_138>='p' && LA17_138<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 66 : 
                        int LA17_150 = input.LA(1);

                        s = -1;
                        if ( (LA17_150=='n') ) {s = 160;}

                        else if ( ((LA17_150>='\u0000' && LA17_150<='m')||(LA17_150>='o' && LA17_150<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 67 : 
                        int LA17_24 = input.LA(1);

                        s = -1;
                        if ( (LA17_24=='d') ) {s = 54;}

                        else if ( (LA17_24=='s') ) {s = 55;}

                        else if ( ((LA17_24>='\u0000' && LA17_24<='c')||(LA17_24>='e' && LA17_24<='r')||(LA17_24>='t' && LA17_24<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 68 : 
                        int LA17_160 = input.LA(1);

                        s = -1;
                        if ( (LA17_160=='s') ) {s = 167;}

                        else if ( ((LA17_160>='\u0000' && LA17_160<='r')||(LA17_160>='t' && LA17_160<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 69 : 
                        int LA17_167 = input.LA(1);

                        s = -1;
                        if ( (LA17_167=='\"') ) {s = 172;}

                        else if ( ((LA17_167>='\u0000' && LA17_167<='!')||(LA17_167>='#' && LA17_167<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 70 : 
                        int LA17_52 = input.LA(1);

                        s = -1;
                        if ( (LA17_52=='n') ) {s = 68;}

                        else if ( ((LA17_52>='\u0000' && LA17_52<='m')||(LA17_52>='o' && LA17_52<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 71 : 
                        int LA17_68 = input.LA(1);

                        s = -1;
                        if ( (LA17_68=='t') ) {s = 84;}

                        else if ( ((LA17_68>='\u0000' && LA17_68<='s')||(LA17_68>='u' && LA17_68<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 72 : 
                        int LA17_84 = input.LA(1);

                        s = -1;
                        if ( (LA17_84=='e') ) {s = 100;}

                        else if ( ((LA17_84>='\u0000' && LA17_84<='d')||(LA17_84>='f' && LA17_84<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 73 : 
                        int LA17_100 = input.LA(1);

                        s = -1;
                        if ( (LA17_100=='n') ) {s = 114;}

                        else if ( ((LA17_100>='\u0000' && LA17_100<='m')||(LA17_100>='o' && LA17_100<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 74 : 
                        int LA17_114 = input.LA(1);

                        s = -1;
                        if ( (LA17_114=='t') ) {s = 127;}

                        else if ( ((LA17_114>='\u0000' && LA17_114<='s')||(LA17_114>='u' && LA17_114<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 75 : 
                        int LA17_127 = input.LA(1);

                        s = -1;
                        if ( (LA17_127=='s') ) {s = 139;}

                        else if ( ((LA17_127>='\u0000' && LA17_127<='r')||(LA17_127>='t' && LA17_127<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 76 : 
                        int LA17_139 = input.LA(1);

                        s = -1;
                        if ( (LA17_139=='\"') ) {s = 151;}

                        else if ( ((LA17_139>='\u0000' && LA17_139<='!')||(LA17_139>='#' && LA17_139<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 77 : 
                        int LA17_54 = input.LA(1);

                        s = -1;
                        if ( (LA17_54=='-') ) {s = 70;}

                        else if ( ((LA17_54>='\u0000' && LA17_54<=',')||(LA17_54>='.' && LA17_54<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 78 : 
                        int LA17_70 = input.LA(1);

                        s = -1;
                        if ( (LA17_70=='t') ) {s = 86;}

                        else if ( ((LA17_70>='\u0000' && LA17_70<='s')||(LA17_70>='u' && LA17_70<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 79 : 
                        int LA17_86 = input.LA(1);

                        s = -1;
                        if ( (LA17_86=='o') ) {s = 102;}

                        else if ( ((LA17_86>='\u0000' && LA17_86<='n')||(LA17_86>='p' && LA17_86<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 80 : 
                        int LA17_102 = input.LA(1);

                        s = -1;
                        if ( (LA17_102=='k') ) {s = 116;}

                        else if ( ((LA17_102>='\u0000' && LA17_102<='j')||(LA17_102>='l' && LA17_102<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 81 : 
                        int LA17_116 = input.LA(1);

                        s = -1;
                        if ( (LA17_116=='e') ) {s = 129;}

                        else if ( ((LA17_116>='\u0000' && LA17_116<='d')||(LA17_116>='f' && LA17_116<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 82 : 
                        int LA17_49 = input.LA(1);

                        s = -1;
                        if ( (LA17_49=='c') ) {s = 64;}

                        else if ( (LA17_49=='g') ) {s = 65;}

                        else if ( ((LA17_49>='\u0000' && LA17_49<='b')||(LA17_49>='d' && LA17_49<='f')||(LA17_49>='h' && LA17_49<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 83 : 
                        int LA17_129 = input.LA(1);

                        s = -1;
                        if ( (LA17_129=='n') ) {s = 141;}

                        else if ( ((LA17_129>='\u0000' && LA17_129<='m')||(LA17_129>='o' && LA17_129<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 84 : 
                        int LA17_141 = input.LA(1);

                        s = -1;
                        if ( (LA17_141=='\"') ) {s = 152;}

                        else if ( ((LA17_141>='\u0000' && LA17_141<='!')||(LA17_141>='#' && LA17_141<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 85 : 
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
                    case 86 : 
                        int LA17_64 = input.LA(1);

                        s = -1;
                        if ( (LA17_64=='k') ) {s = 80;}

                        else if ( ((LA17_64>='\u0000' && LA17_64<='j')||(LA17_64>='l' && LA17_64<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 87 : 
                        int LA17_80 = input.LA(1);

                        s = -1;
                        if ( (LA17_80=='a') ) {s = 96;}

                        else if ( ((LA17_80>='\u0000' && LA17_80<='`')||(LA17_80>='b' && LA17_80<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 88 : 
                        int LA17_96 = input.LA(1);

                        s = -1;
                        if ( (LA17_96=='g') ) {s = 110;}

                        else if ( ((LA17_96>='\u0000' && LA17_96<='f')||(LA17_96>='h' && LA17_96<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 89 : 
                        int LA17_110 = input.LA(1);

                        s = -1;
                        if ( (LA17_110=='e') ) {s = 123;}

                        else if ( ((LA17_110>='\u0000' && LA17_110<='d')||(LA17_110>='f' && LA17_110<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 90 : 
                        int LA17_123 = input.LA(1);

                        s = -1;
                        if ( (LA17_123=='s') ) {s = 136;}

                        else if ( ((LA17_123>='\u0000' && LA17_123<='r')||(LA17_123>='t' && LA17_123<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 91 : 
                        int LA17_136 = input.LA(1);

                        s = -1;
                        if ( (LA17_136=='\"') ) {s = 148;}

                        else if ( ((LA17_136>='\u0000' && LA17_136<='!')||(LA17_136>='#' && LA17_136<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 92 : 
                        int LA17_47 = input.LA(1);

                        s = -1;
                        if ( (LA17_47=='a') ) {s = 62;}

                        else if ( ((LA17_47>='\u0000' && LA17_47<='`')||(LA17_47>='b' && LA17_47<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 93 : 
                        int LA17_62 = input.LA(1);

                        s = -1;
                        if ( (LA17_62=='t') ) {s = 78;}

                        else if ( ((LA17_62>='\u0000' && LA17_62<='s')||(LA17_62>='u' && LA17_62<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 94 : 
                        int LA17_78 = input.LA(1);

                        s = -1;
                        if ( (LA17_78=='u') ) {s = 94;}

                        else if ( ((LA17_78>='\u0000' && LA17_78<='t')||(LA17_78>='v' && LA17_78<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 95 : 
                        int LA17_94 = input.LA(1);

                        s = -1;
                        if ( (LA17_94=='s') ) {s = 108;}

                        else if ( ((LA17_94>='\u0000' && LA17_94<='r')||(LA17_94>='t' && LA17_94<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 96 : 
                        int LA17_108 = input.LA(1);

                        s = -1;
                        if ( (LA17_108=='e') ) {s = 121;}

                        else if ( ((LA17_108>='\u0000' && LA17_108<='d')||(LA17_108>='f' && LA17_108<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 97 : 
                        int LA17_121 = input.LA(1);

                        s = -1;
                        if ( (LA17_121=='s') ) {s = 134;}

                        else if ( ((LA17_121>='\u0000' && LA17_121<='r')||(LA17_121>='t' && LA17_121<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 98 : 
                        int LA17_134 = input.LA(1);

                        s = -1;
                        if ( (LA17_134=='\"') ) {s = 146;}

                        else if ( ((LA17_134>='\u0000' && LA17_134<='!')||(LA17_134>='#' && LA17_134<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 99 : 
                        int LA17_25 = input.LA(1);

                        s = -1;
                        if ( (LA17_25=='c') ) {s = 56;}

                        else if ( ((LA17_25>='\u0000' && LA17_25<='b')||(LA17_25>='d' && LA17_25<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 100 : 
                        int LA17_56 = input.LA(1);

                        s = -1;
                        if ( (LA17_56=='t') ) {s = 72;}

                        else if ( ((LA17_56>='\u0000' && LA17_56<='s')||(LA17_56>='u' && LA17_56<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 101 : 
                        int LA17_72 = input.LA(1);

                        s = -1;
                        if ( (LA17_72=='i') ) {s = 88;}

                        else if ( ((LA17_72>='\u0000' && LA17_72<='h')||(LA17_72>='j' && LA17_72<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 102 : 
                        int LA17_88 = input.LA(1);

                        s = -1;
                        if ( (LA17_88=='o') ) {s = 104;}

                        else if ( ((LA17_88>='\u0000' && LA17_88<='n')||(LA17_88>='p' && LA17_88<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 103 : 
                        int LA17_104 = input.LA(1);

                        s = -1;
                        if ( (LA17_104=='n') ) {s = 118;}

                        else if ( ((LA17_104>='\u0000' && LA17_104<='m')||(LA17_104>='o' && LA17_104<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 104 : 
                        int LA17_118 = input.LA(1);

                        s = -1;
                        if ( (LA17_118=='s') ) {s = 131;}

                        else if ( ((LA17_118>='\u0000' && LA17_118<='r')||(LA17_118>='t' && LA17_118<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 105 : 
                        int LA17_131 = input.LA(1);

                        s = -1;
                        if ( (LA17_131=='\"') ) {s = 143;}

                        else if ( ((LA17_131>='\u0000' && LA17_131<='!')||(LA17_131>='#' && LA17_131<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 106 : 
                        int LA17_53 = input.LA(1);

                        s = -1;
                        if ( (LA17_53=='e') ) {s = 69;}

                        else if ( ((LA17_53>='\u0000' && LA17_53<='d')||(LA17_53>='f' && LA17_53<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 107 : 
                        int LA17_69 = input.LA(1);

                        s = -1;
                        if ( (LA17_69=='c') ) {s = 85;}

                        else if ( ((LA17_69>='\u0000' && LA17_69<='b')||(LA17_69>='d' && LA17_69<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 108 : 
                        int LA17_85 = input.LA(1);

                        s = -1;
                        if ( (LA17_85=='k') ) {s = 101;}

                        else if ( ((LA17_85>='\u0000' && LA17_85<='j')||(LA17_85>='l' && LA17_85<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 109 : 
                        int LA17_101 = input.LA(1);

                        s = -1;
                        if ( (LA17_101=='s') ) {s = 115;}

                        else if ( ((LA17_101>='\u0000' && LA17_101<='r')||(LA17_101>='t' && LA17_101<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 110 : 
                        int LA17_115 = input.LA(1);

                        s = -1;
                        if ( (LA17_115=='\"') ) {s = 128;}

                        else if ( ((LA17_115>='\u0000' && LA17_115<='!')||(LA17_115>='#' && LA17_115<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 111 : 
                        int LA17_55 = input.LA(1);

                        s = -1;
                        if ( (LA17_55=='s') ) {s = 71;}

                        else if ( ((LA17_55>='\u0000' && LA17_55<='r')||(LA17_55>='t' && LA17_55<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 112 : 
                        int LA17_71 = input.LA(1);

                        s = -1;
                        if ( (LA17_71=='u') ) {s = 87;}

                        else if ( ((LA17_71>='\u0000' && LA17_71<='t')||(LA17_71>='v' && LA17_71<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 113 : 
                        int LA17_87 = input.LA(1);

                        s = -1;
                        if ( (LA17_87=='e') ) {s = 103;}

                        else if ( ((LA17_87>='\u0000' && LA17_87<='d')||(LA17_87>='f' && LA17_87<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 114 : 
                        int LA17_103 = input.LA(1);

                        s = -1;
                        if ( (LA17_103=='s') ) {s = 117;}

                        else if ( ((LA17_103>='\u0000' && LA17_103<='r')||(LA17_103>='t' && LA17_103<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 115 : 
                        int LA17_117 = input.LA(1);

                        s = -1;
                        if ( (LA17_117=='\"') ) {s = 130;}

                        else if ( ((LA17_117>='\u0000' && LA17_117<='!')||(LA17_117>='#' && LA17_117<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 116 : 
                        int LA17_65 = input.LA(1);

                        s = -1;
                        if ( (LA17_65=='e') ) {s = 81;}

                        else if ( ((LA17_65>='\u0000' && LA17_65<='d')||(LA17_65>='f' && LA17_65<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 117 : 
                        int LA17_81 = input.LA(1);

                        s = -1;
                        if ( (LA17_81=='s') ) {s = 97;}

                        else if ( ((LA17_81>='\u0000' && LA17_81<='r')||(LA17_81>='t' && LA17_81<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 118 : 
                        int LA17_97 = input.LA(1);

                        s = -1;
                        if ( (LA17_97=='\"') ) {s = 111;}

                        else if ( ((LA17_97>='\u0000' && LA17_97<='!')||(LA17_97>='#' && LA17_97<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 119 : 
                        int LA17_22 = input.LA(1);

                        s = -1;
                        if ( (LA17_22=='e') ) {s = 50;}

                        else if ( (LA17_22=='i') ) {s = 51;}

                        else if ( ((LA17_22>='\u0000' && LA17_22<='d')||(LA17_22>='f' && LA17_22<='h')||(LA17_22>='j' && LA17_22<='\uFFFF')) ) {s = 26;}

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