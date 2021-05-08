import util.*;
import warrior.*;
import armour.*;
import weapon.*;
import java.util.Scanner;

import java.util.Random;

public class LOTRSIM {
    private static Scanner input = new Scanner(System.in);
    private static Scanner writer = new Scanner("savegame.txt");
    private static GameSave gameSaver;
    private static Random randNum = new Random();
    private static Printer printer = new Printer();
    private static Validator validator = new Validator();
    private static boolean gameOver = false;
    private static boolean playerTurn = true;
    private static int heavyAttackMod = 10;

    // player
    private static int pChoice;
    private static int pDamage;
    private static Warrior pWarrior;
    private static Armour pArmour;
    private static Weapon pWeapon;

    // computer
    private static int eChoice;
    private static int eDamage;
    private static Warrior eWarrior;
    private static Armour eArmour;
    private static Weapon eWeapon;

    private static int gameChoice;

    public static boolean exceptionChecker = true;
    public static boolean gameChecker = true;

    public static int numberOfTurns = 0;
    private static int continueGame;
    private static int criticalStrikeChance = 0;
    private static int playerDamage = 0;
    private static int computerDamage = 0;

    public static void main(String[] args) throws java.io.IOException {
        // first instantiate our game saver
        printer.WelcomeMessage();

        startGame();
    } // main

    public static void startGame() {
        do {
            try {
                printer.PrintGameTypeChoices();
                int gameChoice = input.nextInt();
                if (gameChoice > 0 && gameChoice < 3) {
                    exceptionChecker = false;
                }
            } catch (Exception e) {
                input.nextLine();
                exceptionChecker = true;
            }
        } while (exceptionChecker == true);

        if (gameChoice == 2) {
            try {
                gameSaver.RestoreGame();
            } catch (Exception e) {
                System.exit(1);
            }
        } else {
            ///////////////////////////////////////
            // Player Setup Section

            // warrior selection
            pChoice = validator.ValidateChoice("warrior");
            CreateWarrior(pChoice, playerTurn);

            // armour selection
            pChoice = validator.ValidateChoice("armour");
            CreateArmour(pChoice, playerTurn);

            // weapon selection
            pChoice = validator.ValidateChoice("weapon");
            CreateWeapon(pChoice, playerTurn);

            playerTurn = false;

            //////////////////////////////////////
            // Enemy Setup Section
            CreateWarrior(randNum.nextInt(4) + 1, playerTurn); // warrior
            CreateArmour(randNum.nextInt(3) + 1, playerTurn); // armour
            CreateWeapon(randNum.nextInt(3) + 1, playerTurn); // weapon

            playerTurn = true;
        }

        //////////////////////////////////////
        // Print initial warrior stats
        printer.PrintStartingStats(pWarrior, eWarrior);

        ////////////////////////
        // Main Game Loop!
        while (!gameOver) {
            // print stats for each turn
            if (playerTurn) // players turn
            {
                do {
                    try {
                        printer.PrintAttackTypes();
                        pChoice = input.nextInt();
                        if (pChoice > 0 && pChoice < 6) {
                            criticalStrikeChance = randNum.nextInt(10);
                            if (pChoice == 1) // basic attack
                            {
                                pDamage = pWeapon.Strike(pWarrior.GetDexterity(), pWarrior.GetStrength());
                                if (criticalStrikeChance > 5) {
                                    pDamage += pWarrior.GetCritcalStrike();
                                }
                            } else if (pChoice == 2) // heavy attack
                            {

                                if (criticalStrikeChance > 5) {
                                    pDamage += pWarrior.GetCritcalStrike();
                                }
                                pDamage = pWeapon.Strike(pWarrior.GetDexterity() - heavyAttackMod,
                                        pWarrior.GetStrength() + heavyAttackMod);
                            } else if (pChoice == 3) // Cast a spell
                            {

                                if (pWarrior.GetIntelligence() >= 50) {
                                    pDamage = pWarrior.GetIntelligence() / 3;
                                    System.out.println("You cast immolation!");

                                } else if (pWarrior.GetIntelligence() >= 30) {
                                    pDamage = pWarrior.GetIntelligence() / 2;
                                    System.out.println("You cast fireball");

                                } else {
                                    pDamage = 0;
                                    System.out.println(
                                            "You have never read a book and so, you have no knowledge of spellcasting.");
                                }

                            } else if (pChoice == 4) // save game
                            {
                                try {
                                    gameSaver.SaveGame(pWarrior, eWarrior, pWeapon.GetType(), eWeapon.GetType(),
                                            pArmour, eArmour);
                                    System.exit(0);
                                } catch (Exception e) {
                                    System.exit(1);
                                }
                            } else if (pChoice == 5) {
                                // do nothing
                                System.exit(0);
                            } else {

                            }

                            if (pDamage <= 0) // missed
                            {
                                printer.PrintMissMessage(playerTurn);
                                getComputersHealth();
                                getPlayerHealth();
                                System.out.println("-------------");
                                System.out.println("You have done " + playerDamage + " much damage.");
                                System.out.println("-------------");
                                battle();
                            } else // hit!
                            {
                                printer.PrintHitMessage(playerTurn, pDamage);
                                eWarrior.TakeDamage(pDamage);
                                getComputersHealth();
                                getPlayerHealth();
                                System.out.println("-------------");
                                playerDamage += pDamage;
                                System.out.println("You have done " + playerDamage + " much damage.");
                                System.out.println("-------------");
                                battle();

                            }
                        } // players turn ends here
                        else {

                        }

                    } catch (Exception e) {
                        input.nextLine();
                        exceptionChecker = true;
                    }
                } while (exceptionChecker == true);

            } // computer turn ends here
            playerTurn = !playerTurn; // flips the boolean
        } // while
    }

    public static void battle() {
        if (eWarrior.GetHealth() <= 0) {
            do {
                try {
                    printer.PrintPlayerWon();
                    continueGame = input.nextInt();
                    if (continueGame < 3 && continueGame > 0) {
                        gameChecker = false;
                    }

                } catch (Exception e) {
                    input.nextLine();
                    gameChecker = true;
                }
            } while (gameChecker == true);

            if (continueGame == 1) {
                gameOver = false;
                playerDamage = 0;
                computerDamage = 0;
                startGame();
            } else if (continueGame == 2) {

                gameOver = true;
                if (gameOver) {
                    System.exit(0);
                }
            } else {

            }

        } else {
            // do nothing enemy is still kickin.
        }

        if (pWarrior.GetHealth() <= 0) {
            do {
                try {
                    printer.PrintComputerWon();
                    continueGame = input.nextInt();
                    if (continueGame < 3 && continueGame > 0) {
                        gameChecker = false;
                    }

                } catch (Exception e) {
                    input.nextLine();
                    gameChecker = true;
                }
            } while (gameChecker == true);

            if (continueGame == 1) {
                gameOver = false;
                numberOfTurns = 0;
                startGame();
            } else if (continueGame == 2) {

                gameOver = true;
                if (gameOver) {
                    System.exit(0);
                }
            } else {

            }

        } else // enemys turn
        {

            criticalStrikeChance = randNum.nextInt(10);
            eChoice = randNum.nextInt(2) + 1;

            if (eChoice == 1) // basic attack
            {
                eDamage = eWeapon.Strike(eWarrior.GetDexterity(), eWarrior.GetStrength());
                if (criticalStrikeChance > 5) {
                    pDamage += pWarrior.GetCritcalStrike();
                }
            } else if (eChoice == 2) // heavy attack
            {
                eDamage = eWeapon.Strike(eWarrior.GetDexterity() - heavyAttackMod,
                        eWarrior.GetStrength() + heavyAttackMod);
            } else {
                // do nothing
            }

            if (eDamage <= 0) // missed
            {
                printer.PrintMissMessage(false);
                getComputersHealth();
                getPlayerHealth();
                System.out.println("-------------");
                numberOfTurns++;
                System.out.println("The enemy has done " + computerDamage + " damage.");
                System.out.println("-------------");
                if (numberOfTurns == 1) {

                    System.out.println("It has been " + numberOfTurns + " turn.");
                    System.out.println("-------------");
                } else {
                    System.out.println("It has been " + numberOfTurns + " turns.");
                    System.out.println("-------------");

                }
            } else // hit!
            {
                printer.PrintHitMessage(false, eDamage);
                pWarrior.TakeDamage(eDamage);
                getComputersHealth();
                getPlayerHealth();
                System.out.println("-------------");
                computerDamage += eDamage;
                System.out.println("The enemy has done " + computerDamage + " damage.");
                System.out.println("-------------");
                numberOfTurns++;
                if (numberOfTurns == 1) {

                    System.out.println("It has been " + numberOfTurns + " turn.");
                    System.out.println("-------------");
                } else {
                    System.out.println("It has been " + numberOfTurns + " turns.");
                    System.out.println("-------------");

                }
            }
        }
    }

    public static void getPlayerHealth() {
        printer.PrintPlayerHealth(pWarrior.GetHealth());

    }

    public static void getComputersHealth() {
        printer.PrintComputerHealth(eWarrior.GetHealth());

    }

    public static void CreateWarrior(int choice, boolean player) {
        switch (choice) {
            case 1: // Aragorn
            {
                if (player) {
                    pWarrior = new Aragorn();
                    printer.PrintMessageAragorn();
                } else {
                    eWarrior = new Aragorn();
                }
                break;
            }
            case 2: // Legolas
            {
                if (player) {
                    pWarrior = new Legolas();
                    printer.PrintMessageLegolas();
                } else {
                    eWarrior = new Legolas();
                }
                break;
            }
            case 3: // Shagrat
            {
                if (player) {
                    pWarrior = new Shagrat();
                    printer.PrintMessageShagrat();
                } else {
                    eWarrior = new Shagrat();
                }
                break;
            }
            case 4: // Fae
            {
                if (player) {
                    pWarrior = new Fai();
                    printer.PrintFai();
                } else {
                    eWarrior = new Fai();
                }
                break;
            }
        } // switch
    } // CreateWarrior

    public static void CreateArmour(int choice, boolean player) {
        switch (choice) {
            case 1: // leather
            {
                if (player) {
                    pArmour = new Leather();
                    printer.PrintLeather();
                } else {
                    eArmour = new Leather();
                }
                break;
            }
            case 2: // chainmail
            {
                if (player) {
                    pArmour = new Chainmail();
                    printer.PrintChainmail();
                } else {
                    eArmour = new Chainmail();
                }
                break;
            }
            case 3: // platemail
            {
                if (player) {
                    pArmour = new Platemail();
                    printer.PrintPlatemail();
                } else {
                    eArmour = new Platemail();
                }
                break;
            }
        } // switch
    } // CreateArmour

    public static void CreateWeapon(int choice, boolean player) {
        switch (choice) {
            case 1: // dagger
            {
                if (player) {
                    pWeapon = new MorgulKnife();
                    printer.PrintMessageMorgulKnife();
                } else {
                    eWeapon = new MorgulKnife();
                }
                break;
            }
            case 2: // sword
            {
                if (player) {
                    pWeapon = new Andúril();
                    printer.PrintMessageAndúril();
                } else {
                    eWeapon = new Andúril();
                }
                break;
            }
            case 3: // axe
            {
                if (player) {
                    pWeapon = new Dramborleg();
                    printer.PrintMessageDramborleg();
                } else {
                    eWeapon = new Dramborleg();
                }
                break;
            }
        } // switch
    } // CreateWeapon
} // class