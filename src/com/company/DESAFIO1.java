package com.company;

import java.util.Scanner;

public class DESAFIO1 {

    public class Main {
        public void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            // essas são as variáveis
            int L = sc.nextInt();
            int C = sc.nextInt();
            if ((L + C) % 2==0)
                System.out.println("1\n"); //esse é par
            else                                               //complete o código nos espaços em branco
                System.out.println("0\n"); // esse é impar
            sc.close();
        }
    }
}
