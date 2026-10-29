import java.util.ArrayList;
import java.util.Scanner;



public class Jujutsu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you want to know Sitti’s favorite Jujutsu Kaisen characters?");
        String choice = scanner.nextLine();

        while (choice.equalsIgnoreCase("yes")) {

            ArrayList<String> JujutsuCharacters = new ArrayList<>();

            JujutsuCharacters.add("Satoru");
            JujutsuCharacters.add("Megumi");
            JujutsuCharacters.add("Yuki");
            JujutsuCharacters.add("Tsumiki");
            JujutsuCharacters.add("Mai");

            System.out.println(JujutsuCharacters);

            System.out.print("Do you want to know Sitti’s favorite Jujutsu Kaisen characters again?");
            choice = scanner.nextLine();

        }


    }

}


