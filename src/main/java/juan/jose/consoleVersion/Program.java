package juan.jose.consoleVersion;

import java.util.Scanner;

public class Program {

    public int menu() {

        int selection;
        Scanner input = new Scanner(System.in);

        /***************************************************/

        System.out.println("Choose from these choices");
        System.out.println("-------------------------\n");
        System.out.println("1 - Type in a text");
        System.out.println("2 - Enter a directory path");
        System.out.println("3 - Quit");

        selection = input.nextInt();
        return selection;
    }



    public String getText() {
        Scanner input = new Scanner(System.in);
        return input.next();
    }

}
