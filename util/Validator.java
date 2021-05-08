package util;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Validator {
    private Printer printer = new Printer();
    private static Scanner input = new Scanner(System.in);

    public Validator() {
    }

    public int ValidateChoice(String type) {
        int choice = 0;
        boolean valueBad = true;
        do {
            try {
                switch (type) {
                    case "warrior": {
                        printer.PrintWarriorChoices();
                        break;
                    }
                    case "armour": {
                        printer.PrintArmourChoices();
                        break;
                    }
                    case "weapon": {
                        printer.PrintWeaponChoices();
                        break;
                    }
                }
                choice = input.nextInt(); // assignment
                if (type == "warrior") {
                    valueBad = false;
                } else if (choice >= 1 && choice <= 3) {
                    valueBad = false; // allows us to exit the do...while
                }
            } catch (InputMismatchException e) {
                input.nextLine(); // discard the input
                valueBad = true;
            }
        } while (valueBad == true); // == equality check
        return choice;
    }
}
