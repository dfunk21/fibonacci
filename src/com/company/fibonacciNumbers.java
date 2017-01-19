package com.company;

/**
 * Created by df377 on 1/19/17.
 */
public class fibonacciNumbers {

    public int list;

    public int Fibonacci(int s) {
        if(s == 0)
        {
            return 0;
        }
        else if (s == 1) {
           return 1;
        }
        else {
           return Fibonacci(s - 1) + Fibonacci(s - 2);
        }

    }

    public String check(int t) {
        if (t == list)
        {
            return list + " is a Fibonacci number!";
        }
        else {
            return list + " is not a Fibonacci number, sorry!";
        }
    }



}
