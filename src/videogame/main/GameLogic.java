package videogame.main;

public class GameLogic {

public static void randomBattle(){
    clearConsole();
    printHeading("You encountered an evil minded creature. You'll have to fight it!");
    anythingToContine();
    battle(new Enemy(enemies[(int)(Math.random()*enemies.length)],player.xp));
}


}
