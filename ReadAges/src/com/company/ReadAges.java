package com.company;

import java.util.Scanner;

public class ReadAges {

  public static void main(String[] args) {
    int times = 1, age, averageAge = 0;
    Scanner read = new Scanner(System.in);
    System.out.print("Insira a idade da criança " + times + ": ");
    age = read.nextInt();
    while(age >= 0){
      times++;
      System.out.print("Insira a idade da criança " + times + ": ");
      age = read.nextInt();
      averageAge += age;
    }
    averageAge /= times;
    System.out.println("A média das idade é: " + averageAge + " anos.");
  }
}
