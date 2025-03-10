package PracticeQuestions;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNumber =0;
        int secondNumber =1;
        int n;
        StringBuilder fibonacciSeries =  new StringBuilder();
        System.out.print("Max Iterations: ");
        System.out.println("Printing first " + (n = sc.nextInt()) + " numbers of Fibonacci series");

        if (n <= 0){
            System.out.println("Please enter a positive integer.");
            return;
        }
        if (n >= 1) {
            fibonacciSeries.append(firstNumber);
        }
        if (n >= 2) {
            fibonacciSeries.append(", ").append(secondNumber);
        }
        for (int i = 3; i <= n; i++) {
            int nextNum = firstNumber + secondNumber;
            fibonacciSeries.append(", " ).append(nextNum);
            firstNumber =secondNumber;
            secondNumber = nextNum;
        }
        System.out.println("Fibonacci Series: " + fibonacciSeries);
    }
}