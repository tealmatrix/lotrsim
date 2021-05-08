package util;
import java.io.File;
import java.util.Scanner;
import warrior.*;
import armour.*;

public class GameSave 
{
    private static File file = new java.io.File("savegame.txt");
    private static Scanner reader;

    public GameSave() throws Exception
    {
        reader = new Scanner(file);

        // read the file
        while(reader.hasNext())
        {
            // todo
        }

        // close the file
        reader.close();
    }

    /*  game save format!
        h, d, s, race, weapon type, aType, armour points, dex cost => for the player
        h, d, s, race, weapon type, aType, armour points, dex cost => for the enemy
        
    */
    public void SaveGame(Warrior player, Warrior enemy, String pwType, String ewType, Armour pArmour, Armour eArmour) 
        throws java.io.IOException
    {
        // create the scanner for file writing
        java.io.PrintWriter output = new java.io.PrintWriter(file);

        // write to the new file
        output.println(player.GetHealth() + " " + player.GetDexterity() + " " + player.GetStrength() + " " + player.GetType() +
           " " + pwType + " " + pArmour.GetType() + " " + pArmour.GetArmourPoints() + " " + pArmour.GetDexCost());
        output.print(enemy.GetHealth() + " " + enemy.GetDexterity() + " " + enemy.GetStrength() + " " + enemy.GetType() +
        " " + ewType + " " + eArmour.GetType() + " " + eArmour.GetArmourPoints() + " " + eArmour.GetDexCost());

        // close the file
        output.close();
    }

    public void RestoreGame() 
    {

    }
}
