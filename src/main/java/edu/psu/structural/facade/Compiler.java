package edu.psu.structural.facade;

import edu.psu.structural.facade.actions.Generator;
import edu.psu.structural.facade.actions.Node;
import edu.psu.structural.facade.actions.Parser;
import edu.psu.structural.facade.actions.Tokenizer;

import java.util.List;

public class Compiler {
    public static int compile(String statement) throws Exception {
        Parser parser = new Parser();
        List<String> tokens = Tokenizer.tokenize(statement);
        Node expression = parser.parse(tokens);
        return Generator.generate(expression);
    }
}
