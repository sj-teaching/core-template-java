package core;

public class Token {
    /**
     * Integer codes for the token types.
     */
    public static final int PROGRAM = 1, BEGIN = 2, END = 3, INT = 4, IF = 5,
        THEN = 6, ELSE = 7, WHILE = 8, LOOP = 9, READ = 10, WRITE = 11,
        AND = 12, OR = 13, SEMICOL = 14, COMMA = 15, ASSIGN = 16, NOT = 17,
        LBRACK = 18, RBRACK = 19, LPAREN = 20, RPAREN = 21, PLUS = 22,
        MINUS = 23, STAR = 24, NEQ = 25, EQ = 26, GEQ = 27, LEQ = 28, GT = 29,
        LT = 30, NUM = 31, ID = 32, EOF = 33;

    /**
     * String value of this token.
     */
    public final String name;
    /**
     * Integer code for this token.
     */
    public final int code;
    /**
     * Line number in the source code where this token appears.
     */
    public final int line;

    /**
     * Constructs a token object with the given information.
     *
     * @param name String value of the token, for example, "int", "X", "+", etc.
     * @param line Source line on which this token appears
     * @param code Integer code of this token
     */
    public Token(String name, int line, int code) {
        this.name = name;
        this.line = line;
        this.code = code;
    }

    @Override
    public String toString() {
        return "" + this.code;
    }

    // Note: Since none of the three fields should be changed once the token is
    // created, they are made `public final` and no getter methods are provided.
}
