/* Generated By:JJTree&JavaCC: Do not edit this line. PythonGrammar30Constants.java */
package org.python.pydev.parser.grammar30;

public interface PythonGrammar30Constants {

  int EOF = 0;
  int SPACE = 1;
  int CONTINUATION = 4;
  int NEWLINE1 = 5;
  int NEWLINE = 6;
  int NEWLINE2 = 7;
  int CRLF1 = 11;
  int DEDENT = 13;
  int INDENT = 14;
  int TRAILING_COMMENT = 15;
  int SINGLE_LINE_COMMENT = 16;
  int LPAREN = 17;
  int RPAREN = 18;
  int LBRACE = 19;
  int RBRACE = 20;
  int LBRACKET = 21;
  int RBRACKET = 22;
  int SEMICOLON = 23;
  int COMMA = 24;
  int DOT = 25;
  int COLON = 26;
  int PLUS = 27;
  int MINUS = 28;
  int MULTIPLY = 29;
  int DIVIDE = 30;
  int FLOORDIVIDE = 31;
  int POWER = 32;
  int LSHIFT = 33;
  int RSHIFT = 34;
  int MODULO = 35;
  int NOT = 36;
  int XOR = 37;
  int OR = 38;
  int AND = 39;
  int EQUAL = 40;
  int GREATER = 41;
  int LESS = 42;
  int EQEQUAL = 43;
  int EQLESS = 44;
  int EQGREATER = 45;
  int NOTEQUAL = 46;
  int PLUSEQ = 47;
  int MINUSEQ = 48;
  int MULTIPLYEQ = 49;
  int DIVIDEEQ = 50;
  int FLOORDIVIDEEQ = 51;
  int MODULOEQ = 52;
  int ANDEQ = 53;
  int OREQ = 54;
  int XOREQ = 55;
  int LSHIFTEQ = 56;
  int RSHIFTEQ = 57;
  int POWEREQ = 58;
  int OR_BOOL = 59;
  int AND_BOOL = 60;
  int NOT_BOOL = 61;
  int IS = 62;
  int IN = 63;
  int LAMBDA = 64;
  int IF = 65;
  int ELSE = 66;
  int ELIF = 67;
  int WHILE = 68;
  int FOR = 69;
  int TRY = 70;
  int EXCEPT = 71;
  int DEF = 72;
  int CLASS = 73;
  int FINALLY = 74;
  int PASS = 75;
  int BREAK = 76;
  int CONTINUE = 77;
  int RETURN = 78;
  int YIELD = 79;
  int IMPORT = 80;
  int FROM = 81;
  int DEL = 82;
  int RAISE = 83;
  int GLOBAL = 84;
  int NONLOCAL = 85;
  int ASSERT = 86;
  int AS = 87;
  int WITH = 88;
  int FALSE = 89;
  int TRUE = 90;
  int NONE = 91;
  int AT = 92;
  int NAME = 93;
  int LETTER = 94;
  int DECNUMBER = 95;
  int HEXNUMBER = 96;
  int OCTNUMBER = 97;
  int FLOAT = 98;
  int COMPLEX = 99;
  int EXPONENT = 100;
  int DIGIT = 101;
  int SINGLE_STRING = 110;
  int SINGLE_STRING2 = 111;
  int TRIPLE_STRING = 112;
  int TRIPLE_STRING2 = 113;
  int SINGLE_BSTRING = 114;
  int SINGLE_BSTRING2 = 115;
  int TRIPLE_BSTRING = 116;
  int TRIPLE_BSTRING2 = 117;

  int DEFAULT = 0;
  int FORCE_NEWLINE1 = 1;
  int FORCE_NEWLINE2 = 2;
  int INDENTING = 3;
  int INDENTATION_UNCHANGED = 4;
  int UNREACHABLE = 5;
  int IN_STRING11 = 6;
  int IN_STRING21 = 7;
  int IN_STRING13 = 8;
  int IN_STRING23 = 9;
  int IN_BSTRING11 = 10;
  int IN_BSTRING21 = 11;
  int IN_BSTRING13 = 12;
  int IN_BSTRING23 = 13;
  int IN_STRING1NLC = 14;
  int IN_STRING2NLC = 15;
  int IN_BSTRING1NLC = 16;
  int IN_BSTRING2NLC = 17;

  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\t\"",
    "\"\\f\"",
    "<CONTINUATION>",
    "<NEWLINE1>",
    "<NEWLINE>",
    "<NEWLINE2>",
    "\"\\t\"",
    "\" \"",
    "\"\\f\"",
    "<CRLF1>",
    "\"\"",
    "\"\"",
    "\"<INDENT>\"",
    "<TRAILING_COMMENT>",
    "<SINGLE_LINE_COMMENT>",
    "\"(\"",
    "\")\"",
    "\"{\"",
    "\"}\"",
    "\"[\"",
    "\"]\"",
    "\";\"",
    "\",\"",
    "\".\"",
    "\":\"",
    "\"+\"",
    "\"-\"",
    "\"*\"",
    "\"/\"",
    "\"//\"",
    "\"**\"",
    "\"<<\"",
    "\">>\"",
    "\"%\"",
    "\"~\"",
    "\"^\"",
    "\"|\"",
    "\"&\"",
    "\"=\"",
    "\">\"",
    "\"<\"",
    "\"==\"",
    "\"<=\"",
    "\">=\"",
    "\"!=\"",
    "\"+=\"",
    "\"-=\"",
    "\"*=\"",
    "\"/=\"",
    "\"//=\"",
    "\"%=\"",
    "\"&=\"",
    "\"|=\"",
    "\"^=\"",
    "\"<<=\"",
    "\">>=\"",
    "\"**=\"",
    "\"or\"",
    "\"and\"",
    "\"not\"",
    "\"is\"",
    "\"in\"",
    "\"lambda\"",
    "\"if\"",
    "\"else\"",
    "\"elif\"",
    "\"while\"",
    "\"for\"",
    "\"try\"",
    "\"except\"",
    "\"def\"",
    "\"class\"",
    "\"finally\"",
    "\"pass\"",
    "\"break\"",
    "\"continue\"",
    "\"return\"",
    "\"yield\"",
    "\"import\"",
    "\"from\"",
    "\"del\"",
    "\"raise\"",
    "\"global\"",
    "\"nonlocal\"",
    "\"assert\"",
    "\"as\"",
    "\"with\"",
    "\"False\"",
    "\"True\"",
    "\"None\"",
    "\"@\"",
    "<NAME>",
    "<LETTER>",
    "<DECNUMBER>",
    "<HEXNUMBER>",
    "<OCTNUMBER>",
    "<FLOAT>",
    "<COMPLEX>",
    "<EXPONENT>",
    "<DIGIT>",
    "<token of kind 102>",
    "<token of kind 103>",
    "<token of kind 104>",
    "<token of kind 105>",
    "<token of kind 106>",
    "<token of kind 107>",
    "<token of kind 108>",
    "<token of kind 109>",
    "\"\\\'\"",
    "\"\\\"\"",
    "\"\\\'\\\'\\\'\"",
    "\"\\\"\\\"\\\"\"",
    "\"\\\'\"",
    "\"\\\"\"",
    "\"\\\'\\\'\\\'\"",
    "\"\\\"\\\"\\\"\"",
    "\"\\\\\\r\\n\"",
    "<token of kind 119>",
    "\"\\\\\\r\\n\"",
    "<token of kind 121>",
    "\"\\\\\\r\\n\"",
    "<token of kind 123>",
    "\"\\\\\\r\\n\"",
    "<token of kind 125>",
    "\"\"",
    "\"\"",
    "\"\"",
    "\"\"",
    "<token of kind 130>",
    "<token of kind 131>",
    "\"\\r\\n\"",
    "\"\\n\"",
    "\"\\r\"",
    "<token of kind 135>",
    "<token of kind 136>",
  };

}