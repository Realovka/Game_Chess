package com.company;

import com.company.Elephant.Elephant;
import com.company.Horse.Horse;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        char[][] array = new char[10][10];
        Boolean a = new Boolean(true);
        Boolean b = new Boolean(true);
        Boolean c = new Boolean(true);

        ArrayList<Object> arrayList1 = new ArrayList<>();
        ArrayList<Object> arrayList3 = new ArrayList<>();

        int n = 0;
        int t = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] = '_');
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("Введите координаты клетки, где стоит конь");
        Scanner scanner = new Scanner(System.in);
        Integer x1 = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        Integer y1 = scanner1.nextInt();
        array[x1][y1] = '♞';
        System.out.println("Введите координаты клетки, где стоит слон");
        Scanner scanner6 = new Scanner(System.in);
        int x3 = scanner6.nextInt();
        Scanner scanner5 = new Scanner(System.in);
        int y3 = scanner5.nextInt();
        array[x3][y3] = '♗';

        while (c) {
            while (a) {
                arrayList1 = Horse.horseMove(array, x1, y1, a, c);
                a = (Boolean) arrayList1.get(2);
                c = (Boolean) arrayList1.get(3);
                x1 = (Integer) arrayList1.get(0);
                y1 = (Integer) arrayList1.get(1);
                b=true;

            }
            while (b) {
                arrayList3 = Elephant.elephantMove(b, c, n, t, array, x3, y3);
                b = (Boolean) arrayList3.get(0);
                c = (Boolean) arrayList3.get(1);
                x3 = (Integer) arrayList3.get(2);
                y3 = (Integer) arrayList3.get(3);
                a=true;

            }

        }

    }

}





