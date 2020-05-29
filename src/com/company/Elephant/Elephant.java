package com.company.Elephant;

import java.util.ArrayList;
import java.util.Scanner;

public class Elephant {
    public static ArrayList<Object> elephantMove(Boolean b, Boolean c, int n, int t, char[][] array, Integer x3, Integer y3) {

        while (b) {
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
            Integer x4 = scanner3.nextInt();
            Scanner scanner4 = new Scanner(System.in);
            Integer y4 = scanner4.nextInt();
            for (int i = 0; i < array.length; i++) {
                if ((x4 == x3 + i) && (y4 == y3 + i) && (array[x4][y4] == '_') && (x4 != x3 && y4 != y3)) {
                    System.out.println("Слон занял пустую клетку");
                    array[x4][y4] = '♗';
                    array[x3][y3] = '_';
                    x3 = x4;
                    y3 = y4;
                    n++;
                    b = false;
                    break;
                } else if ((x4 == x3 + i) && (y4 == y3 + i) && (array[x4][y4] != '_') && (x4 != x3 && y4 != y3)) {
                    System.out.println("Слон бьет фигуру. Победа белых");
                    array[x4][y4] = '♗';
                    array[x3][y3] = '_';
                    n++;
                    b = false;
                    c = false;
                    break;
                } else if ((x4 == x3 - i) && (y4 == y3 - i) && (array[x4][y4] == '_') && (x4 != x3 && y4 != y3)) {
                    System.out.println("Слон занял пустую клетку");
                    array[x4][y4] = '♗';
                    array[x3][y3] = '_';
                    x3 = x4;
                    y3 = y4;
                    n++;
                    b = false;
                    break;
                } else if ((x4 == x3 - i) && (y4 == y3 - i) && (array[x4][y4] != '_') && (x4 != x3 && y4 != y3)) {
                    System.out.println("Слон бьет фигуру. Победа белых");
                    array[x4][y4] = '♗';
                    array[x3][y3] = '_';
                    n++;
                    b = false;
                    c = false;
                    break;
                } else if ((x4 == x3 - i) && (y4 == y3 + i) && (array[x4][y4] == '_') && (x4 != x3 && y4 != y3)) {
                    System.out.println("Слон занял пустую клетку");
                    array[x4][y4] = '♗';
                    array[x3][y3] = '_';
                    x3 = x4;
                    y3 = y4;
                    b = false;
                    n++;
                    break;
                } else if ((x4 == x3 - i) && (y4 == y3 + i) && (array[x4][y4] != '_') && (x4 != x3 && y4 != y3)) {
                    System.out.println("Слон бьет фигуру.Победа белых");
                    array[x4][y4] = '♗';
                    array[x3][y3] = '_';
                    n++;
                    b = false;
                    c = false;
                    break;
                } else if ((x4 == x3 + i) && (y4 == y3 - i) && (array[x4][y4] == '_') && (x4 != x3 && y4 != y3)) {
                    System.out.println("Слон занял пустую клетку");
                    array[x4][y4] = '♗';
                    array[x3][y3] = '_';
                    x3 = x4;
                    y3 = y4;
                    b = false;
                    n++;
                    break;
                } else if ((x4 == x3 + i) && (y4 == y3 - i) && (array[x4][y4] != '_') && (x4 != x3 && y4 != y3)) {
                    System.out.println("Слон бьет фигуру. Победа белых");
                    array[x4][y4] = '♗';
                    array[x3][y3] = '_';
                    b = false;
                    c = false;
                    n++;
                    break;
                }
                t++;
            }
        }
        ArrayList<Object> arrayList2 = new ArrayList<>();
        arrayList2.add(b);
        arrayList2.add(c);
        arrayList2.add(x3);
        arrayList2.add(y3);
        return arrayList2;
    }
}

