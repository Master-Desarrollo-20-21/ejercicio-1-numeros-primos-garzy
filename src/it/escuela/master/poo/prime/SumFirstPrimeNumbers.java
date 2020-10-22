package it.escuela.master.poo.prime;

public class SumFirstPrimeNumbers {


    public static void main(String[] args) {
        System.out.println("Starting Calculation:");
        PrimeNumberCalculator primeNumberCalculator = new PrimeNumberCalculator();
        long sum = 0;
        int primeNumbersCounter = 0;
        int i = 1;
        do {
            if(primeNumberCalculator.isPrime(i)) {
                System.out.println("\t-Prime Number:" + i);
                sum += i;
                primeNumbersCounter++;
            }
            i++;
        } while (primeNumbersCounter < 50);
        System.out.println("Sum is: " + sum);
    }
}
