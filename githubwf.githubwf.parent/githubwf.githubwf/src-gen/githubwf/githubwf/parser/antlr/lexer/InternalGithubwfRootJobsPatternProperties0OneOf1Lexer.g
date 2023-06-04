/*
 * generated by Xtext 2.29.0
 */
lexer grammar InternalGithubwfRootJobsPatternProperties0OneOf1Lexer;

@header {
package githubwf.githubwf.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

RepositoryProjects : '"repository-projects"';

SecurityEvents : '"security-events"';

PullRequests : '"pull-requests"';

MaxParallel : '"max-parallel"';

Concurrency : '"concurrency"';

Deployments : '"deployments"';

Discussions : '"discussions"';

Permissions : '"permissions"';

FailFast : '"fail-fast"';

Contents : '"contents"';

IdToken : '"id-token"';

Packages : '"packages"';

Statuses : '"statuses"';

Strategy : '"strategy"';

Actions : '"actions"';

Secrets : '"secrets"';

Checks : '"checks"';

Issues : '"issues"';

Matrix : '"matrix"';

Needs : '"needs"';

Pages : '"pages"';

Name : '"name"';

Uses : '"uses"';

With : '"with"';

False : 'false';

If : '"if"';

Null : 'null';

True : 'true';

Comma : ',';

Colon : ':';

LeftSquareBracket : '[';

RightSquareBracket : ']';

LeftCurlyBracket : '{';

RightCurlyBracket : '}';

fragment RULE_INT : ('0'|'1'..'9' ('0'..'9')*);

RULE_STRING : '"' ('\\' .|~(('\\'|'"')))* '"';

RULE_E_INT : '-'? RULE_INT;

RULE_E_DOUBLE : '-'? RULE_INT ('.' RULE_INT+)? (('E'|'e') ('+'|'-')? RULE_INT)?;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
