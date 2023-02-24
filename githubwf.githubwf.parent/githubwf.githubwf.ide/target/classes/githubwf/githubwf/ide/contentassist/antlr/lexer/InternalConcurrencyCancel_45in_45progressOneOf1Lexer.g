/*
 * generated by Xtext 2.23.0
 */
lexer grammar InternalConcurrencyCancel_45in_45progressOneOf1Lexer;

@header {
package githubwf.githubwf.ide.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

CancelInProgress : '"cancel-in-progress"';

Colon : ':';

fragment RULE_INT : ('0'|'1'..'9' ('0'..'9')*);

RULE_STRING : '"' ('\\' .|~(('\\'|'"')))* '"';

RULE_E_INT : '-'? RULE_INT;

RULE_E_DOUBLE : '-'? RULE_INT ('.' RULE_INT+)? (('E'|'e') ('+'|'-')? RULE_INT)?;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
