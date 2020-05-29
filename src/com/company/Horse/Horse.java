package com.company.Horse;

import java.util.ArrayList;
import java.util.Scanner;

public class Horse {

    public static ArrayList<Object> horseMove(char[][] array, Integer x1, Integer y1, Boolean a, Boolean c) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Введите координаты клетки, куда хотите поставить фигуру коня");
        Scanner scanner3 = new Scanner(System.in);
        Integer x2 = scanner3.nextInt();
        Scanner scanner4 = new Scanner(System.in);
        Integer y2 = scanner4.nextInt();
        if ((x2 == x1 - 2) && (y2 == y1 + 1) && (array[x1 - 2][y1 + 1] == '_')) {
            System.out.println("Конь занял пустую клетку");
            a = false;
            array[x1 - 2][y1 + 1] = '♞';
            array[x1][y1] = '_';
            x1 = x2;
            y1 = y2;
        } else if ((x2 == x1 - 2) && (y2 == y1 + 1) && (array[x1 - 2][y1 + 1] != '_')) {
            System.out.println("Конь бьет фигуру в клетке. Победа черных ");
            a = false;
            c = false;
            array[x1 - 2][y1 + 1] = '♞';
            array[x1][y1] = '_';
        } else if ((x2 == x1 - 1) && (y2 == y1 + 2) && (array[x1 - 1][y1 + 2] == '_')) {
            System.out.println("Конь занял пустую клетку");
            a = false;
            array[x1 - 1][y1 + 2] = '♞';
            array[x1][y1] = '_';
            x1 = x2;
            y1 = y2;
        } else if ((x2 == x1 - 1) && (y2 == y1 + 2) && (array[x1 - 1][y1 + 2] != '_')) {
            System.out.println("Конь бьет фигуру в клетке. Победа черных ");
            a = false;
            c = false;
            array[x1 - 1][y1 + 2] = '♞';
            array[x1][y1] = '_';
        } else if ((x2 == x1 + 1) && (y2 == y1 + 2) && (array[x1 + 1][y1 + 2] == '_')) {
            System.out.println("Конь занял пустую клетку");
            a = false;
            array[x1 + 1][y1 + 2] = '♞';
            array[x1][y1] = '_';
            x1 = x2;
            y1 = y2;
        } else if ((x2 == x1 + 1) && (y2 == y1 + 2) && (array[x1 + 1][y1 + 2] != '_')) {
            System.out.println("Конь бьет фигуру в клетке. Победа черных");
            a = false;
            c = false;
            array[x1 + 1][y1 + 2] = '♞';
            array[x1][y1] = '_';
        } else if ((x2 == x1 + 2) && (y2 == y1 + 1) && (array[x1 + 2][y1 + 1] == '_')) {
            System.out.println("Конь занял пустую клетку");
            a = false;
            array[x1 + 2][y1 + 1] = '♞';
            array[x1][y1] = '_';
            x1 = x2;
            y1 = y2;
        } else if ((x2 == x1 + 2) && (y2 == y1 + 1) && (array[x1 + 2][y1 + 1] != '_')) {
            System.out.println("Конь бьет фигуру в клетке. Победа черных ");
            a = false;
            c = false;
            array[x1 + 2][y1 + 1] = '♞';
            array[x1][y1] = '_';
        } else if ((x2 == x1 + 2) && (y2 == y1 - 1) && (array[x1 + 2][y1 - 1] == '_')) {
            System.out.println("Конь занял пустую клетку");
            a = false;
            array[x1 + 2][y1 - 1] = '♞';
            array[x1][y1] = '_';
            x1 = x2;
            y1 = y2;
        } else if ((x2 == x1 + 2) && (y2 == y1 - 1) && (array[x1 + 2][y1 - 1] != '_')) {
            System.out.println("Конь бьет фигуру в клетке. Победа черных ");
            a = false;
            c = false;
            array[x1 + 2][y1 - 1] = '♞';
            array[x1][y1] = '_';
        } else if ((x2 == x1 + 1) && (y2 == y1 - 2) && (array[x1 + 1][y1 - 2] == '_')) {
            System.out.println("Конь занял пустую клетку");
            a = false;
            array[x1 + 1][y1 - 2] = '♞';
            array[x1][y1] = '_';
            x1 = x2;
            y1 = y2;
        } else if ((x2 == x1 + 1) && (y2 == y1 - 2) && (array[x1 + 1][y1 - 2] != '_')) {
            System.out.println("Конь бьет фигуру в клетке. Победа черных ");
            a = false;
            c = false;
            array[x1 + 1][y1 - 2] = '♞';
            array[x1][y1] = '_';
        } else if ((x2 == x1 - 1) && (y2 == y1 - 2) && (array[x1 - 1][y1 - 2] == '_')) {
            System.out.println("Конь занял пустую клетку");
            a = false;
            array[x1 - 1][y1 - 2] = '♞';
            array[x1][y1] = '_';
            x1 = x2;
            y1 = y2;
        } else if ((x2 == x1 - 1) && (y2 == y1 - 2) && (array[x1 - 1][y1 - 2] != '_')) {
            System.out.println("Конь бьет фигуру в клетке. Победа черных ");
            a = false;
            c = false;
            array[x1 - 1][y1 - 2] = '♞';
            array[x1][y1] = '_';
        } else if ((x2 == x1 - 2) && (y2 == y1 - 1) && (array[x1 - 2][y1 - 1] == '_')) {
            System.out.println("Конь занял пустую клетку");
            a = false;
            array[x1 - 2][y1 - 1] = '♞';
            array[x1][y1] = '_';
            x1 = x2;
            y1 = y2;
        } else if ((x2 == x1 - 2) && (y2 == y1 - 1) && (array[x1 - 2][y1 - 1] != '_')) {
            System.out.println("Конь бьет фигуру в клетке. Победа черных ");
            a = false;
            c = false;
            array[x1 - 2][y1 - 1] = '♞';
            array[x1][y1] = '_';
        } else {
            System.out.println("Так конь не ходит");

        }
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add(x1);
        arrayList.add(y1);
        arrayList.add(a);
        arrayList.add(c);
        return arrayList;
    }
}

