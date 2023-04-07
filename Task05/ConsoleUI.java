package task055;

import java.util.Scanner;

public class ConsoleUI {
    private Scanner scanner;
    
    public ConsoleUI() {
        scanner = new Scanner(System.in);
    }
    
    public void start() {
        System.out.println("Welcome to the program!");
        
        while (true) {
            System.out.print("> ");
            String command = scanner.nextLine();
            // parse command and execute appropriate method
        }
    }
    
    // other methods for printing messages and receiving user input
}
