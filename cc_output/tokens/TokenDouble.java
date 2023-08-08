package com.stupidcoder.generated.tokens;

public class TokenDouble implements IToken {
    private double value;

    @Override
    public int type() {
        return 0;
    }

    @Override
    public IToken fromLexeme(String lexeme) {
        value = Double.parseDouble(lexeme);
        return this;
    }

    public double getValue() {
        return value;
    }
}