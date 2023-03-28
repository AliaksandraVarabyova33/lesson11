package lt.lhu.unit11.main;

import java.util.Random;

//Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

public class Task09 {

	public static void main(String[] args) {
		int[][] mas = new int[5][5];

		init2d(mas);
		printMas(mas);
		System.out.println();
		printMasDiagonals(mas);
	}

	public static void init2d(int[][] mas) {
		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(1000);
			}
		}
	}

	public static void printMas(int[][] mas) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%4d]", mas[i][j]);
			}
			System.out.println();
		}
	}

	public static void printMasDiagonals(int[][] mas) {
		for (int i = 0, n = mas.length - 1; i < mas.length; i++, n--) {
			for (int j = 0; j < mas[0].length; j++) {
				{
					if (i == j || n == j) {
						System.out.printf("[%4d]", mas[i][j]);
					} else {
						System.out.print("[   ]");
					}
				}
			}
			System.out.println();
		}
	}
}
