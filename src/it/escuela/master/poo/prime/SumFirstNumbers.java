package it.escuela.master.poo.prime;

public class SumFirstNumbers {


    public static void main(String[] args) {
        System.out.println("Starting Calculation:");
        PrimeNumberCalculator primeNumberCalculator = new PrimeNumberCalculator();
        long sum = 0;
        for (int i = 1; i <= 50; i++) {
            if (primeNumberCalculator.isPrime(i)) {
                System.out.println("\t-Prime Number:" + i);
                sum += i;
            }
        }

        System.out.println("Sum is: " + sum);
    }
}
