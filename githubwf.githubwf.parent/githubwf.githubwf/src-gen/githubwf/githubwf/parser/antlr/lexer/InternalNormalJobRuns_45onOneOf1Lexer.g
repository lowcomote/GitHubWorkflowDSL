/*
 * generated by Xtext 2.29.0
 */
lexer grammar InternalNormalJobRuns_45onOneOf1Lexer;

@header {
package githubwf.githubwf.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

RunsOn : '"runs-on"';

False : 'false';

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
