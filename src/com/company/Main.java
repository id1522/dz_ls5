package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
        int[][][] array = new int[3][2][5];
        int b;
        int c;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 5; k++) {

                    b=((int)(Math.random()*40));
                    array[i][j][k] = b;
                    System.out.println("\nЧисло массива : "+b+"\n");
                    System.out.println("введите число чтобы добавить к числу из массива :\n");
                    int a = scan.nextInt();
                    c = a + b;
                    System.out.print("  "+array[i][j][k] + " + "+a+" =  "+c+"\n");
                }
            }
        }
    }
}