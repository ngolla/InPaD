package edu.psu.structural.facade;

public class Demo {
    public static void main(String[] args) {
        try {
            System.out.println(Compiler.compile("1 + 2"));
        } catch (Exception e) {
            System.out.println("Cannot compile statement");
        }
    }
}
