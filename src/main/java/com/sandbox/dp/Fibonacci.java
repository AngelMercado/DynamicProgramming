package com.sandbox.dp;


public class Fibonacci {

    static int global_count=0;

    final int MAX =100;
    long[] lookup = new long[MAX];
    static int global_dp_count=0;

    /**
     * Fibonacci implementation without any memorization
     * @param n
     * @return
     */
    public long fibonacci(int n){
        global_count++;
        if(n<=1){
            return 1;
        }else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    /**
     * Init look up array elements to 0
     */
    public void init_lookup(){
        for(int i =0 ; i< MAX ; i++){
            lookup[i] =0;
        }
    }

    /**
     * Fibonacci using Memorization
     * Top-down approach & store the previous completed values in a lookup
     * @param n
     * @return
     */
    public long fibonacci_with_dp(int n){
        global_dp_count++;
        if(lookup[n] ==0) {
            if (n <= 1) {
                lookup[n] = 1;
            } else {
                lookup[n] = fibonacci_with_dp(n - 1) + fibonacci_with_dp(n - 2);
            }
        }
        return lookup[n];
    }

    public static void main(String[] args){
        Fibonacci app = new Fibonacci();
        long start_time,end_time;
        System.out.println("Method: Fibonacci without dynamic programming");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        // Fibonacci without Dynamic programming
        start_time = System.nanoTime();
        System.out.println("Fibonacci of n[50]: "+ app.fibonacci(50));
        end_time = System.nanoTime();
        System.out.println("Recursive Function calls count: "+global_count );
        System.out.println("Time taken (in nanoseconds): "+ (end_time - start_time));

        System.out.println("");
        System.out.println("Method: Fibonacci using dynamic programming");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        //Fibonacci calculation using Dynamic programming - Memorization
        start_time = System.nanoTime();
        app.init_lookup();
        System.out.println("Fibonacci of n[50]: "+ app.fibonacci_with_dp(50));
        end_time = System.nanoTime();
        System.out.println("Recursive Function calls count: "+global_dp_count);
        System.out.println("Time taken (in nanoseconds): "+ (end_time - start_time));

    }
}
