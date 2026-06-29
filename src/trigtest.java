import java.util.Random;
import java.util.Scanner;

public class trigtest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[] statements = {
			"What is sin 0?",
			"What is sin 30?",
			"What is sin 60?",
			"What is cos 0?",
		};

		double[] answers = {
			0.0,
			0.5,
			Math.sqrt(3) / 2,
			1,
		};

		Random random = new Random();
		int randomIndex = random.nextInt(statements.length);
		String selectedStatement = statements[randomIndex];

		System.out.println(selectedStatement);
		double userAnswer = Integer.valueOf(scanner.nextInt());

		if (userAnswer == answers[randomIndex]) {
			System.out.println("correct");
		} else {
			System.out.println("incorrect. the answer is: " + answers[randomIndex]);
		}

		/* if (Math.abs(userAnswer - answers[randomIndex]) < 0.001) {
			System.out.println("correct");
		} else {
			System.out.println("incorrect. the answer is: " + answers[randomIndex]);
		} */

		scanner.close();
	}
}
