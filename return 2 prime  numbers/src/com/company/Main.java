package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter a even number:");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        for(int i=2;i<input;i++){
            if(checkIfPrime(i)){
                if(checkIfPrime(input-i)){
                    System.out.println("The primes are:"+i+"and"+(input-i));
                    break;
                }
            }
        }
    }
    private static boolean checkIfPrime(int n){
        for(int i=2;i<n;i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
