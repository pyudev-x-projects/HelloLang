import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    
    
    public static void main(String[] args) throws Exception {
        ArrayList<String> tokens = new ArrayList<String>();

        tokens.add("say");
        tokens.add("greet");
        tokens.add("count");
        tokens.add("del");

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the filename (Full path): ");
        String filename = keyboard.nextLine();

        try {
            File file = new File(filename);
            Scanner inputFile = new Scanner(file);

            while (inputFile.hasNext()) {
            
                String stringName = inputFile.nextLine();

                if (stringName.equals("say")) {
                    System.out.print("Enter: ");

                    String s = keyboard.nextLine();

                    System.out.println(s);
                } 
                
                else if (stringName.equals("greet")) {
                    System.out.print("Enter: ");
                    
                    String s = keyboard.nextLine();

                    System.out.println("Hello, " + s + "!");
                } 
                
                else if (stringName.equals("count")) {
                    System.out.print("Enter: ");
                    
                    int m = keyboard.nextInt();
                    
                    for (int i = 0; i < m; i++) {
                        System.out.println((i+1));
                    }
                } 
                
                else if (stringName.equals("9+10=21")) {
                    System.out.println("Sorry that is incorrect.");
                }

                else if (stringName.equals("tokens")) {
                    for (String token : tokens) {
                        System.out.println(token);
                    }
                }
                
                else if (stringName.equals("del")) {
                    System.out.println(file.getName() + " deleted");
                    file.delete();
                }

                else {
                    System.out.println("Syntax error only avaliable tokens are: " + tokens);
                    System.out.println("You entered: " + stringName);
                }
            }

            
            inputFile.close();
        } catch (FileNotFoundException n) {
            System.out.println("Error file does not exist: " + filename);
        }
        

        
        keyboard.close();
    }
}
