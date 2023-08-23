package test;

import java.util.Scanner;
//febonacci series
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number up to which you want to generate the Fibonacci series: ");
        int n = scanner.nextInt();
        scanner.close();

        System.out.println("Fibonacci series up to " + n + ":");
        generateFibonacciSeries(n);
    }

    public static void generateFibonacciSeries(int n) {
        int firstTerm = 0;
        int secondTerm = 1;

        
        if (n >= 1) {
            System.out.print(firstTerm + " ");
        }
        if (n >= 2) {
            System.out.print(secondTerm + " ");
        }

       
        for (int i = 3; i <= n; i++) {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(nextTerm + " ");

            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
