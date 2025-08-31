import java.util.Scanner;

public class Main {
    public static void processCommand(String command) {

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while(running) {
            System.out.println('>');
            String input = scanner.nextLine();

            //process the input
            processCommand(input);
        }

        scanner.close();
    }
}
