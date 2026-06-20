import java.util.Random;
import java.util.Scanner;

public class trigtest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[] statements = {
			"What is sin 0?",
			"What is sin 30?",
			"What is sin 60?",
		};

		Random random = new Random();
		int randomIndex = random.nextInt(statements.length);
		String selectedStatement = statements[randomIndex];

		System.out.println(selectedStatement);
	}
}