import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PlayToys run = new PlayToys();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nYou are in toy store lottery:");
            System.out.println("1 - Add new toy to the prize pool");
            System.out.println("2 - Change the probability of a toy");
            System.out.println("3 - Commit a lottery with saving the result");
            System.out.println("4 - Exit");
            System.out.print("Enter the number of action: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    run.addToy();
                    break;
                case 2:
                    run.setFrequency();
                    break;
                case 3:
                    run.playToys();
                    break;
                case 4:
                    System.out.println("Exit completed");
                    System.exit(4);   
                default: 
                    System.out.println("Incorrect entry, try again.");
            }
        }
    }
}