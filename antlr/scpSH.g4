grammar scpSH;

program :statements                             #prst
        ;

statements : statement                          #stm
           | statements statement               #stms
	   ;

statement :identifier '=' expr ';'                            #defID
          |'while' expr 'do' statement                        #while
	  |'print' identifier ';'                             #print
	  |'if' expr 'then' statement 'else' statement        #ifelse
	  |'if' expr 'then' statement                         #if
	  |'begin' statements 'end'                           #begend
	  ;


expr :expr op=('*'|'/') expr                                  #MULDIV
     |expr op=('-'|'+') expr                                  #ADDSUB
     |expr op=('<'|'>'|'<='|'>='|'=='|'!=') expr              #GGEQLLEQ
     |identifier                                              #idn
     |'(' expr ')'                                            #parex
     |number                                                  #num
     |'!' expr                                                #not
     ;


MUL:    '*';
DIV:    '/';
ADD:    '+';
SUB:    '-';
GRE:    '>';
GREQ:   '>=';
LE:     '<';
LEQ:    '<=';
EQ:     '==';
NEQ:    '!=';
	 


identifier : ST ;
number : INT ;
ST :[a-zA-Z] [A-Za-z0-9_]* ;
INT :[0-9]+ ('.' [0-9]+)? | [0-9] ;





WS: [ \r\n\t] -> skip;