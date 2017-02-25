package main;

import range.Range;

import java.util.Scanner;

public class main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите начальную точку интервала: ");
        double from = scanner.nextDouble();

        System.out.print("Введите конечную точку интервала: ");
        double to = scanner.nextDouble();

        Range Range = new Range(from, to);
        System.out.printf("Длина интервала (%f;%f) = %f", from, to, Range.getLength(from, to));
        System.out.println();

        System.out.print("Введите вещественное число: ");
        System.out.println();
        double number = scanner.nextDouble();

        if (Range.isInside(number)){
            System.out.printf("Число %f лежит в интервале (%f;%f)",number,from, to);

        }else{
            System.out.printf("Число %f НЕ лежит в интервале (%f;%f)",number,from, to);
        }
    }
}
