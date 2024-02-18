package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Создаем объект Scanner для чтения ввода пользователя
        Scanner inputScanner = new Scanner(System.in);

        // Печатаем приглашение для ввода трех целых чисел
        System.out.println("Введите три целых числа: ");

        // Считываем введенные пользователем значения
        int sideA = inputScanner.nextInt();
        int sideB = inputScanner.nextInt();
        int sideC = inputScanner.nextInt();

        // Проверяем, являются ли введенные числа сторонами прямоугольного треугольника
        if (isRightTriangle(sideA, sideB, sideC)) {
            // Если да, выводим сообщение об этом
            System.out.println(sideA + ", " + sideB + " и " + sideC + " являются сторонами прямоугольного треугольника");
        } else if (isIsoscelesTriangle(sideA, sideB, sideC)) {
            // Если нет, проверяем, являются ли стороны равнобедренным треугольником
            System.out.println(sideA + ", " + sideB + " и " + sideC + " являются сторонами равнобедренного треугольника");
        } else if (sideA == sideB && sideB == sideC) {
            // Если нет, проверяем, являются ли стороны равносторонним треугольником
            System.out.println(sideA + ", " + sideB + " и " + sideC + " являются сторонами равностороннего треугольника");
        } else if (!isValidTriangle(sideA, sideB, sideC)) {
            // Если нет, проверяем, могут ли стороны образовать треугольник по неравенству треугольника
            System.out.println(sideA + ", " + sideB + " и " + sideC + " не являются сторонами треугольника");
        } else {
            // Если ни одно из вышеперечисленных условий не выполняется, выводим, что это обычный треугольник
            System.out.println(sideA + ", " + sideB + " и " + sideC + " являются сторонами обычного треугольника");
        }
    }

    // Проверка на прямоугольный треугольник
    private static boolean isRightTriangle(int a, int b, int c) {
        return a * a + b * b == c * c || b * b + c * c == a * a || c * c + a * a == b * b;
    }

    // Проверка на равнобедренный треугольник
    private static boolean isIsoscelesTriangle(int a, int b, int c) {
        return a == b || b == c || c == a;
    }

    // Проверка на существование треугольника по неравенству треугольника
    private static boolean isValidTriangle(int a, int b, int c) {
        return a + b > c && b + c > a && c + a > b;
    }
}