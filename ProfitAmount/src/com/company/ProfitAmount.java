package com.company;

import java.util.Scanner;

public class ProfitAmount {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        float profit = 0.0f;
        for(int times = 0; times < 20; times++){
            System.out.print("Insira o preço de custo do produto " + (times+1) + ": ");
            profit = read.nextFloat();
            if(profit < 100) profit += 20;
            else profit += 50;
            System.out.printf("O preço de venda do produto " + (times+1) + " é: %.2f \n",profit);
        }
    }
}
