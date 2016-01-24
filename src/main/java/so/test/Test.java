package so.test;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.NotNull;

public class Test {
    public static void main(String[] args) {
        String input = "[hello\\]world][hello[[world]";
        TestLexer lexer = new TestLexer(new ANTLRInputStream(input));
        TestParser parser = new TestParser(new CommonTokenStream(lexer));

        TestParser.RulContext rul = parser.rul();
        rul.accept(new TestParserBaseVisitor<Object>() {
            @Override
            public Object visitBlock(@NotNull TestParser.BlockContext ctx) {
                System.out.println(ctx.getText());
                return super.visitBlock(ctx);
            }
        });
    }
}
