package juan.jose.consoleVersion;

import java.util.Scanner;

public class Application {

    public static void main(String[] arguments) {
        Program program = new Program();
        int selection = program.menu();

        if (selection == 1) {
            program.getText();
            System.out.println("Please type a text");
            String text = getText();
            text.toLowerCase();
        }
    }


    public static String getText() {
        Scanner input = new Scanner(System.in);
        return input.next();
    }
}
