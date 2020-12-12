package ru.gorbunov.homeWork;

public class Main {

	public static void main(String[] args) {

		String[][] array = {{"1", "1", "1", "1"}, {"1", "1", "1", "1"}};
		String[][] invalidArraySize = {{"1", "1", "1", "1", "1"}, {"1", "1", "1", "1"}};
		String[][] invalidArrayData = {{"1", "1", "1", "a"}, {"1", "1", "1", "1"}};


		System.out.println("Пример для корректного массива:");
		System.out.println();
		checkArray(array);
		System.out.println("Пример для массива с некорректной длинной:");
		checkArray(invalidArraySize);
		System.out.println("Пример для массива с некорректными данными:");
		checkArray(invalidArrayData);
	}

	public static int checkArray(String[][] array) {
		int row = 0;
		int cell = 0;
		int summ = 0;
		int value = 0;

		if (array.length != 2 || array[0].length != 4 || array[1].length != 4) {
			System.out.println("Ошибка в размере массива.");
		}

		for (int i = 0; i < 2; i++) {
			row = i;
			for (int j = 0; j < 4; j++) {
				cell = j;
				try {
					Integer.parseInt(array[i][j]);
					summ += value;
				} catch (IllegalArgumentException e) {
					System.out.println("Употребление недопустимого аргумента в массиве.");
					System.out.println("В " + row + " ряду, " + cell + " ячейке");
				}
			}
		}
		return summ;
	}
}
