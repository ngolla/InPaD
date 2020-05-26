package edu.psu.structural.facade.actions;

import java.util.Arrays;
import java.util.List;

public class Tokenizer {
    public static List<String> tokenize(String source){
        return Arrays.asList(source.split("\\s"));
    }
}
