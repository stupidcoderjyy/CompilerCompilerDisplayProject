package compile;

import org.junit.jupiter.api.Test;
import stupidcoder.compile.syntax.LRGroupBuilder;
import stupidcoder.compile.syntax.SyntaxLoader;

public class TestBookExample {

    @Test
    public void test() {
        SyntaxLoader loader = new SyntaxLoader();
        loader.begin("S")
                .addNonTerminal("L")
                .addTerminal('=')
                .addNonTerminal("R")
                .finish();
        loader.begin("S")
                .addNonTerminal("R")
                .finish();
        loader.begin("L")
                .addTerminal('*')
                .addNonTerminal("R")
                .finish();
        loader.begin("L")
                .addTerminal("id", 128)
                .finish();
        loader.begin("R")
                .addNonTerminal("L")
                .finish();
        LRGroupBuilder.build(loader, DefaultDataInterface.ACCEPT);
    }
}
