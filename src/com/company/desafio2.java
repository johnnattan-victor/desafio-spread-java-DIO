package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class desafio2 {

    public class Main {



        public void main(String[] args) {



            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();



            for (int i = 0; i < n; i++) {

                int x = sc.nextInt();

                BigInteger num = new BigInteger("1");

                BigInteger b = new BigInteger("2");

                int z = 12, y = 1000;



                for (int p = 0; p < x; p++) {

                    num = num.multiply(b);

                }



                num = (num.divide(BigInteger.valueOf(z))).divide(BigInteger.valueOf(y));



                System.out.printf("%d kg\n", num ); //Complete o código aqui.

            }

            sc.close();



        }

    }
}
