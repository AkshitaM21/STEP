import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter your full name (first and last): ");
        String fullName = scanner.nextLine();

        
        System.out.print("Enter your favorite programming language: ");
        String language = scanner.nextLine();

        
        System.out.print("Write a sentence about your programming experience: ");
        String experience = scanner.nextLine();

        
        String[] nameParts = fullName.split(" ");
        String firstName = nameParts[0];
        String lastName = (nameParts.length > 1) ? nameParts[1] : "";

        
        String noSpaces = experience.replaceAll(" ", "");
        int charCount = noSpaces.length();

        
        String langUpper = language.toUpperCase();

        
        System.out.println("\n----- SUMMARY -----");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Favorite Language: " + langUpper);
        System.out.println("Characters in Experience Sentence (excluding spaces): " + charCount);
        System.out.println("Your Experience: " + experience);

        scanner.close();
    }
}
