import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int score = 0;
            for (int i = 0; i < Test.questions.length; i++) {
                System.out.println(Test.questions[i]);
                for (int j = 0; j < Test.options[i].length; j++) {
                    System.out.print(Test.options[i][j]);
                }
                System.out.println("\nChoose one variant a , b , c ");
                    char answer = scanner.nextLine().charAt(0);
                    if (answer != 'a' && answer != 'b' && answer != 'c') {
                        throw new InputMismatchException("Choose correctly");
                    }
                    if (answer == Test.answers[i]) {
                        score += 20;
                    }
                }
                System.out.println("your point is :" + score+" of 100");
            }catch (InputMismatchException e){
            System.out.println("Choose one variant  a , b , c");
        }
    }
}