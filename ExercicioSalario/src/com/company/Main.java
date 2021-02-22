package com.company;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    String name;
    float salary, sales, totalSalary;
    System.out.print("Insira o nome do vendedor: ");
    name = read.next();
    System.out.print("Insira o salário fixo: ");
    salary = read.nextFloat();
    System.out.print("Insira o total de vendas efetuadas no mês (em dinheiro): ");
    sales = read.nextInt();
    totalSalary = (float) (salary + (sales*0.15));
    System.out.printf("O valor que " + name + " irá receber no final do mês será: R$%.2f", totalSalary);
  }
}