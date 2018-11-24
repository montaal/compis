grammar Datalog;

prog: datalogProgram+;

datalogProgram:
	'Table:' query	#querydec
;

query: ID LEFT_PARENTHESIS predParam RIGHT_PARENTHESIS QUESTION_MARK;
table: 	ID LEFT_PARENTHESIS tableParam RIGHT_PARENTHESIS;
idList:	COMMA ID idList
	|
;

headPredicate:	ID LEFT_PARENTHESIS headParam RIGHT_PARENTHESIS;

predicate:	ID LEFT_PARENTHESIS predParam RIGHT_PARENTHESIS;

predicateList:	COMMA predicate predicateList
	|
;

parameter:	STRING | ID | VAR | expression;

parameterList: 	COMMA parameter parameterList
	|
;
stringIdList: COMMA (ID|STRING) stringIdList
	|
;
varList: COMMA VAR
	|
;
predParam: parameter parameterList;
tableParam: ID idList;
factParam: (STRING|ID) stringIdList;
headParam: VAR varList;
expression: 	LEFT_PARENTHESIS parameter operator parameter RIGHT_PARENTHESIS;

operator:	ADD
	| MULTIPLICATION
	| DIVISION
	| MINUS
	| GREATER_THAN
	| GREATER_THAN_OR_EQUAL
	| LESSER_THAN
	| LESSER_THAN_OR_EQUAL
	| EQUAL
	| NOT_EQUAL
;


MULTIPLICATION : '*' ;
DIVISION   : '/' ;
ADD  : '+' ;
MINUS : '-' ;

GREATER_THAN : '>' ;
GREATER_THAN_OR_EQUAL : '>=' ;
LESSER_THAN : '<' ;
LESSER_THAN_OR_EQUAL : '<=' ;
EQUAL : '=' ;
NOT_EQUAL : '!=';



LEFT_PARENTHESIS : '(' ;
RIGHT_PARENTHESIS : ')' ;

COMMA : ',' ;
DOT : '.';
TILDE : '~';
QUESTION_MARK : '?';
COLON_DASH : ':-';
DOUBLE_QUOTE : '"';

ID:	[_a-z0-9][a-zA-Z_0-9]*;
VAR : [A-Z][a-zA-Z0-9]*;

STRING:
  '"'	 ( ESC_SEQ | ~('\\'|'"'|'\n') )* '"'
;

LINE_COMMENT:
  '#' ~[\r\n]* '\r'? '\n' -> channel(HIDDEN)
;
COMMMENT :
  '#|' .*? '|#' ->channel(HIDDEN)
;

WS:
	[ \t\r\n]+ -> channel(HIDDEN)
;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')
    ;
