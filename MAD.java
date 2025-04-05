import java.util.Scanner;

class MAD {
    public static void main(String[] args){
        Scanner MAD = new Scanner(System.in);

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.print("Enter an adjective (descrpiiton): ");
        adjective1 = MAD.nextLine();
        System.out.print("Enter a noun (animal or person):");
        noun1 = MAD.nextLine();
        System.out.print("Enter an adjective (descripition):");
        adjective2 = MAD.nextLine();
        System.out.print("Enter a verb end with -ing(action):");
        verb1 = MAD.nextLine();
        System.out.print("Enter an adjective (description): ");
        adjective3 = MAD.nextLine();

        System.out.println("\nToday I went to a " + adjective1 + "Zoo");
        System.out.println("In an exhaibit, I saw a " + noun1 + " Zoo.");
        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
        System.out.println("I was " + adjective3 + "!");

        MAD.close();


    }
}