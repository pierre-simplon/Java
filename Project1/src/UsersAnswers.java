import java.util.InputMismatchException;
import java.util.Scanner;

public class UsersAnswers {

    // Will return either the correct integer of a menu either -1 in case of error
    public static int ReturnedInteger(String question, int numberOfQuestions) throws InputMismatchException {
        System.out.println(question);
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextInt()) {
            int answer = scan.nextInt();
            if ((answer >= 1) && (answer <= numberOfQuestions)) return answer;
            else return -1;
        }
        else return -1;
    }

    public static String ReturnedString (String question) throws InputMismatchException {
        System.out.println(question);
        Scanner scan = new Scanner(System.in);
        String answer = scan.nextLine();
        return answer;
    }
}
