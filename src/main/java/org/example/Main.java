package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static int addNumbers(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int num1 = 1390;
        int num2 = 201;

        int sum = addNumbers(num1, num2);

        System.out.println("The sum is: " + sum);
    }
}