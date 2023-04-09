package oop.add_tasks.task4;

public class Matrix {
    private int[][] arr;
    private int rows;
    private int columns;

    public Matrix(int rows, int columns) {
        this.arr = new int[columns][rows];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) ((Math.random() * 10) + 1);
            }
        }
    }

    public static void main(String[] args) {
        Matrix arr1 = new Matrix(2, 2);
        System.out.println("Исходный массив:");
        for (int i = 0; i < arr1.arr.length; i++) {
            for (int j = 0; j < arr1.arr[i].length; j++) {
                System.out.print(arr1.arr[i][j] + " ");
            }
            System.out.println();
        }
        int k = 2;
        System.out.println("Результат умножения на число:");
        for (int i = 0; i < arr1.arr.length; i++) {
            for (int j = 0; j < arr1.arr[i].length; j++) {
                System.out.print(arr1.arr[i][j] * k + " ");
            }
            System.out.println();
        }
        int[][] arr2 = {{2,1},{4,2}};
        System.out.println("Второй массив:");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Результат сложения массивов:");
        for (int i = 0; i < arr1.arr.length; i++) {
            for (int j = 0; j < arr1.arr[i].length; j++) {
                System.out.print((arr1.arr[i][j] + arr2[i][j]) + " ");
            }
            System.out.println();
        }
    }

}
