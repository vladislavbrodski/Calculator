/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Калькулятор");
        System.out.println("Введите первое число - ");
        Scanner scanner  = new Scanner(System.in);
        double number1 = scanner.nextDouble();
        System.out.println("Введите второе число - ");
        double number2 = scanner.nextDouble();
        
        System.out.println("Выберите знак: +,-,*,/");
        scanner.nextLine();
        String znak = scanner.nextLine();
        double result = 0;
        if ("+".equals(znak)) {
            result = number1 + number2;
        }
        if ("/".equals(znak)) {
            result = number1 / number2;
        }
        if ("*".equals(znak)) {
            result = number1 * number2;
        }
        if ("-".equals(znak)) {
            result = number1 - number2;
        }
        
        System.out.println("Резултат - ");
        System.out.printf("%.3f%n%s%n%10.2f%n и %n%10.2f%n", result, "использовались числа:", number1, number2);
        System.out.println("Пока");
        
    }
                
               
    }
    