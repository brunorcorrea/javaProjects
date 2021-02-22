package com.company;

import java.util.Scanner;

public class ReadAges {

  public static void main(String[] args) {
    char cont = 'S';
    int times = 0, age = 0, averageAge = 0;
    Scanner read = new Scanner(System.in);
    while(cont == 'S'){
      times++;
      System.out.print("Insira a idade da criança " + times + ": ");
      age = read.nextInt();
      averageAge += age;
      System.out.println("Deseja inserir a idade de mais uma criança? (S para sim)");
      cont = read.next().charAt(0);
      cont = Character.toUpperCase(cont);
    }
    averageAge /= times;
    System.out.println("A média das idade é: " + averageAge + " anos.");
  }
}
