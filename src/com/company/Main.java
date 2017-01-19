package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sk = new Scanner(System.in);
        System.out.println("Enter a number to check if it's a Fibonacci number");
        int fib = sk.nextInt();

        fibonacciNumbers fibo = new fibonacciNumbers();
        System.out.println(fibo.Fibonacci(fib));
        System.out.println(fibo.check(fib));


    }

}
