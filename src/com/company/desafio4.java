package com.company;
import java.util.Scanner;

public class desafio4 {
    public class Main {

        public void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int horasaida = sc.nextInt();
            int tempoviagem = sc.nextInt();
            int fuso = sc.nextInt();

            if (horasaida == 0) {
                horasaida = 24;
            }
            int ajuste = horasaida + tempoviagem + fuso;
            if (ajuste >= 24) {
                ajuste -= 24;
            }

            System.out.println(ajuste);
            sc.close();
        }
    }
}
