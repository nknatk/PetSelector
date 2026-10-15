import java.util.*;
public class Main {
    public static void main(String[] args) {
       
Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your favorite color (Either red, blue, or green): ");
        String color = scanner.nextLine().toLowerCase();
        if (!color.equals("red") && !color.equals("blue") && !color.equals("green")) {
            System.out.println("not a color run again");
            return; 
        }
        System.out.println("Enter your favorite season (winter, spring, summer, fall): ");
        String season = scanner.nextLine().toLowerCase();
        if (!season.equals("winter") && !season.equals("spring") && !season.equals("summer") && 
        !season.equals("fall")) {
            System.out.println("not a season run again");
            return;
        }
        System.out.println("Your favorite season is: " + season);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine().toLowerCase();
         if ("abcdefghijklmnopqrstuvwxyz".indexOf(name.substring(0, 1).toLowerCase()) >= 0) {
            System.out.println("");
            
        }
         else {
                System.out.println("Invalid name, run again");
                return;
            }
            
        String first = name.substring(0, 1).toLowerCase();
        String pet = "";
        if (color.equals("blue") && season.equals("fall")) {
        pet = "alligator "; 
        }
        else if (color.equals("blue") && season.equals("spring")) {
            pet = "ostrich";
        }
        else if (color.equals("green") && season.equals("winter") && !(first.equals("a") || 
        first.equals("e") || 
        first.equals("i") || first.equals("o") || first.equals("u"))) {
            pet = "giraffe";
        }

        else if (color.equals("green") && !season.equals("fall")) {
            pet = "dog";
        }

               else if (color.equals("red") ) {
                if (first.equals("a") || first.equals("e") || 
        first.equals("i") || first.equals("o") || first.equals("u"))  
        pet = "porcupine";
        else {
            pet = "panda";
        }
            
        }
        
        else if (season.equals("summer") ) {

            pet = "ponies";
        }
        else if (color.equals("blue") && !(first.equals("a") || 
        first.equals("e") || 
        first.equals("i") || first.equals("o") || first.equals("u")) && !(season.equals("summer")
    || season.equals("fall"))) {
        pet = "axolotl";
        }
        else {
            pet = "pet rock";
        }
        

        
        System.out.println("your pet is: " + pet);
    }       





}