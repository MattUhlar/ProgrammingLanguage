grammar Clacious;

program : (stmt)+ | EOF;

stmt : PRINT expr SEMI_COLON     #printStmt
     | LET ID EQ expr SEMI_COLON #simpleAssign
     | expr SEMI_COLON           #exprStmt
     ;

expr : ID       #id
     | NUMBER   #number
     ;

PRINT : 'print';
LET : 'let';
ID : [a-zA-Z_]+;
EQ : '=';
NUMBER : [0-9]+;
SEMI_COLON : ';';
WS : [ \t\r\n]+ -> skip;

