package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        char[][] array = new char[10][10];
        boolean a = true;
        boolean b = true;
        boolean c = true;
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
        int x1 = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        int y1 = scanner1.nextInt();
        array[x1][y1] = '♞';
        System.out.println("Введите координаты клетки, где стоит слон");
        Scanner scanner6 = new Scanner(System.in);
        int x3 = scanner6.nextInt();
        Scanner scanner5 = new Scanner(System.in);
        int y3 = scanner5.nextInt();
        array[x3][y3] = '♗';

        while (c) {

            while (a) {
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array.length; j++) {
                        System.out.print(array[i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println("Введите координаты клетки, куда хотите поставить фигуру коня");
                Scanner scanner3 = new Scanner(System.in);
                int x2 = scanner3.nextInt();
                Scanner scanner4 = new Scanner(System.in);
                int y2 = scanner4.nextInt();
                if ((x2 == x1 - 2) && (y2 == y1 + 1) && (array[x1 - 2][y1 + 1] == '_')) {
                    System.out.println("Конь занял пустую клетку");
                    a = false;
                    b = true;
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
                    b = true;
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
                    b = true;
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
                    b = true;
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
                    b = true;
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
                    b = true;
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
                    b = true;
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
                    b = true;
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
            }


            while (b && c) {
                if (n != t) {
                    System.out.println("Так слон не ходит.");
                    n = t;
                }
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array.length; j++) {
                        System.out.print(array[i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println("Введите координаты клетки, куда хотите поставить фигуру слона");
                Scanner scanner3 = new Scanner(System.in);
                int x4 = scanner3.nextInt();
                Scanner scanner4 = new Scanner(System.in);
                int y4 = scanner4.nextInt();
                for (int i = 0; i < array.length; i++) {
                    if ((x4 == x3 + i) && (y4 == y3 + i) && (array[x4][y4] == '_') && (x4!=y3 && y4!=y3)) {
                        System.out.println("Слон занял пустую клетку");
                        array[x4][y4] = '♗';
                        array[x3][y3] = '_';
                        x3 = x4;
                        y3 = y4;
                        n++;
                        b = false;
                        a = true;
                        break;
                    } else if ((x4 == x3 + i) && (y4 == y3 + i) && (array[x4][y4] != '_') && (x4!=y3 && y4!=y3)) {
                        System.out.println("Слон бьет фигуру. Победа белых");
                        array[x4][y4] = '♗';
                        array[x3][y3] = '_';
                        n++;
                        b = false;
                        c = false;
                        break;
                    } else if ((x4 == x3 - i) && (y4 == y3 - i) && (array[x4][y4] == '_') && (x4!=y3 && y4!=y3)) {
                        System.out.println("Слон занял пустую клетку");
                        array[x4][y4] = '♗';
                        array[x3][y3] = '_';
                        x3 = x4;
                        y3 = y4;
                        n++;
                        b = false;
                        a = true;
                        break;
                    } else if ((x4 == x3 - i) && (y4 == y3 - i) && (array[x4][y4] != '_') && (x4!=y3 && y4!=y3)) {
                        System.out.println("Слон бьет фигуру. Победа белых");
                        array[x4][y4] = '♗';
                        array[x3][y3] = '_';
                        n++;
                        b = false;
                        c = false;
                        break;
                    } else if ((x4 == x3 - i) && (y4 == y3 + i) && (array[x4][y4] == '_') && (x4!=y3 && y4!=y3)) {
                        System.out.println("Слон занял пустую клетку");
                        array[x4][y4] = '♗';
                        array[x3][y3] = '_';
                        x3 = x4;
                        y3 = y4;
                        b = false;
                        a = true;
                        n++;
                        break;
                    } else if ((x4 == x3 - i) && (y4 == y3 + i) && (array[x4][y4] != '_') && (x4!=y3 && y4!=y3)) {
                        System.out.println("Слон бьет фигуру.Победа белых");
                        array[x4][y4] = '♗';
                        array[x3][y3] = '_';
                        n++;
                        b = false;
                        c = false;
                        break;
                    } else if ((x4 == x3 + i) && (y4 == y3 - i) && (array[x4][y4] == '_') && (x4!=y3 && y4!=y3)) {
                        System.out.println("Слон занял пустую клетку");
                        array[x4][y4] = '♗';
                        array[x3][y3] = '_';
                        x3 = x4;
                        y3 = y4;
                        b = false;
                        a = true;
                        n++;
                        break;
                    } else if ((x4 == x3 + i) && (y4 == y3 - i) && (array[x4][y4] != '_') && (x4!=y3 && y4!=y3)) {
                        System.out.println("Слон бьет фигуру. Победа белых");
                        array[x4][y4] = '♗';
                        array[x3][y3] = '_';
                        b = false;
                        a = true;
                        c = false;
                        n++;
                        break;
                    }
                    t++;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }


    }
}



