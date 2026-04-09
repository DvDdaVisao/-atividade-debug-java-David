package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("------====[ C A L C U L A D O R A]====------\n\n");

        double total;

        System.out.println("Digite um número:");
        double num1 = ler.nextDouble();

        System.out.println("Digite outro número:");
        double num2 = ler.nextDouble();

        System.out.println("Digite a operação:\n(+, -, /, x)");
        String opera = ler.next();

        switch (opera) {
            case "+":
                total=num1+num2;
                System.out.println("Resultado = "+total);
                break;
            case "-":
                total=num1-num2;
                System.out.println("Resultado = "+total);
            case "/":
                total=num1/num2;
                System.out.println("Resultado = "+total);
                break;
            case "x":
                total=num1*num2;
                System.out.println("Resultado = "+total);
                break;
        }
        }
    }
