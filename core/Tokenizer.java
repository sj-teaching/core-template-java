package core;

import java.util.List;

public class Tokenizer {
    /**
     * List of tokens from the language.
     */
    private List<String> tokens;

    /**
     * The token stream to be generated.
     */
    private List<Token> tokenStream;

    /**
     * Index of the current token in the {@code tokenStream}.
     */
    private int currentIndex;

    // Note: Feel free to add any additional member variables you may need

    /**
     * Tokenizer constructor.
     */
    public Tokenizer() {
        // TODO implement the constructor
    }

    /**
     * Returns the current {@code Token} from the generated token stream.
     *
     * @return current {@code Token}.
     */
    public Token currentToken() {
        // TODO implement the method

        return null; // FIXME
    }

    /**
     * Advances to the next {@code Token} in the stream.
     */
    public void nextToken() {
        // TODO implement the method
    }

    /**
     * Reports whether there is another {@code Token} on the stream.
     */
    public boolean hasNext() {
        // TODO implement the method

        return false; // FIXME
    }

    /**
     * Removes all white spaces and generates the complete token-stream from the
     * given file.
     *
     * @param filePath Full or relative path of the input CORE program file.
     */
    public void tokenize(String filePath) {
        // TODO Declare the appropriate File handlers and open them.
        // TODO Make sure you handle any exceptions this may lead to.

        // TODO Implement the tokenizer per the algorithm given below

        // 1. Get a character from the input stream
        // 2. While it's a valid character (What does this mean?)
        // 2.1. Track the line numbers and ignore white-spaces
        // 2.2. If it's a lowercase, check if it results in a reserved word
        // 2.3. If it's uppercase, check if it's a valid ID
        // 2.4. If it's a digit, check if it's a valid NUMBER
        // 2.5. Otherwise, check if it's one of the valid special characters
        //       Note: be extra careful about tokens like '==' and '='.
        //             You should always extract a '==' first if it exists.
        // 3. Once the entire input stream is tokenized, add the special
        //    End-of-stream (33) token to the list of Tokens
    }

    // Note: Feel free to add any public/private method you may need.

    public static void main(String[] args) {
        if (args.length != 1) {
            String msg = "Invalid number of arguments\nUsage: java Tokenizer <core input file>\n";
            System.err.println(msg);
            System.exit(1);
        }

        Tokenizer t = new Tokenizer();
        t.tokenize(args[0]);
        while (t.hasNext()) {
            Token token = t.currentToken();
            System.out.println(token);
            t.nextToken();
        }
    }
}
