package com.company;
import java.util.Scanner;

public class desafio6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int X1,Y1,X2,Y2;

        while(true){

            X1 = sc.nextInt();

            Y1 = sc.nextInt();

            X2 = sc.nextInt();

            Y2 = sc.nextInt();



            if(X1 == 0 && Y1 == 0 && X2 == 0 && Y2 == 0) break; //condição de parada

            if (X1==X2 && Y1==Y2){

                System.out.println("0");

            }else if ((X1%2 == 0 && Y1%2 ==0) || (X1%2 != 0 && Y1%2 !=0)){

                if ((X2%2 == 0 && Y2%2 ==0) || (X2%2 != 0 && Y2%2 !=0)){

                    System.out.println("1");

                }else if (X2 == X1 || Y2 ==Y1){

                    System.out.println("1");

                }else System.out.println("2");

            }else if ((X1%2 == 0 && Y1%2 !=0) || (X1%2 != 0 && Y1%2 ==0)){

                if ((X2%2 == 0 && Y2%2 !=0) || (X2%2 != 0 && Y2%2 ==0)){

                    System.out.println("1");

                }else if (X2 == X1 || Y2 ==Y1){

                    System.out.println("1");

                }else System.out.println("2");

            }

        }

        sc.close();

    }

}
