package lt.lhu.unit11.main;

public class Task14 {

	public static void main(String[] args) {
		int[][] mas = new int[5][5];

		init2d(mas);
		printMas(mas);

	}

	public static void init2d(int[][] mas) {

		for (int i = 1; i <= mas.length; i++) {
			for (int j = 0; j < mas[0].length; j++) {
				if (j == mas.length - i) {
					mas[i - 1][j] = i;
				}
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
}