package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Введите для проверки число А: ");
        int A= in.nextInt();
        System.out.print("Введите для проверки число В: ");
        int B= in.nextInt();
        if(A==0){
            System.out.print("Число отрицательное! Введите для проверки число А: ");
            A= in.nextInt();
        }
        if(B==0){
            System.out.print("Число отрицательное! Введите для проверки число В: ");
            B= in.nextInt();
        }
        int sumA=0;
        for(int i=1;i<A;i++) {
           if(A%i==0) {
               sumA+=i;
           }
        }
        int sumB=0;
        for(int i=1;i<B;i++) {
            if(B%i==0) {
                sumB+=i;
            }
        }
        if(A==sumB && B==sumA) {
            System.out.print("Данные числа А и В являются дружественными!");
        }
        else {
            System.out.print("Данные числа А и В не являются дружественными!");
        }
    }
}
