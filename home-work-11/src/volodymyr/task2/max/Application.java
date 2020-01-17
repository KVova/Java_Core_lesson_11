package volodymyr.task2.max;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Application {

	static void menu() {
		System.out.println();
		System.out.println("Input a, and see random array");
		System.out.println("Input b, and see identical element in array");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		HelmMaterial helmMaterial[] = HelmMaterial.values();

		while (true) {
			menu();

			switch (sc.nextLine()) {

			case "a": {

				Auto autoArray[][] = new Auto[getRandomValueFromRange(1, 3)][getRandomValueFromRange(1, 3)];

				for (int i = 0; i < autoArray.length; i++) {
					for (int j = 0; j < autoArray[i].length; j++) {
						autoArray[i][j] = new Auto(getRandomValueFromRange(150, 300),
								getRandomValueFromRange(1990, 2020),
								new Helm(getRandomValueFromRange(35, 50),
										helmMaterial[getRandomValueFromRange(0,helmMaterial.length - 1)].toString()),
								new Engine(getRandomValueFromRange(1, 3)));
					}
				}

				System.out.println(Arrays.deepToString(autoArray));

				break;
			}

			case "b": {

				Auto auto = new Auto(getRandomValueFromRange(150, 300), getRandomValueFromRange(1990, 2020),
						new Helm(getRandomValueFromRange(35, 50),
								helmMaterial[getRandomValueFromRange(0, helmMaterial.length - 1)].toString()),
						new Engine(getRandomValueFromRange(5, 20)));

				Auto autoArray[] = new Auto[getRandomValueFromRange(1, 3)];

				Arrays.fill(autoArray, auto);

				System.out.println(Arrays.deepToString(autoArray));

				break;
			}

			default: {
				System.out.println("Input date must be a or b");

				break;
			}

			}
		}
	}

	static int getRandomValueFromRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("Min value must be less than max value!");
		}

		Random randomValue = new Random();
		return randomValue.nextInt(max - min + 1) + min;
	}
}