package me;

public class RunModules {

    public static void main(String[] args) {
        //From the add Module
        Add a = new Add();
        System.out.println("Add 2 + 2 = " + a.add(2,2));

        //From the Subtract Module
        Subtract sub = new Subtract();
        System.out.println("Subtract 2 - 2 = " + sub.subtract(2,2));

        //From the Divide Module
        Divide div = new Divide();
        System.out.println("Divide 2 / 2 = " + div.divide(2,2));

        //From the multiply
        Multiply multi = new Multiply();
        System.out.println("Multiply 2 * 2 = " +multi.multiply(2,2));
    }
}
