package videogame.main;
import java.util.Scanner;
public class GameLogic {
    static Scanner scanner = new Scanner(System.in);
    public static int readInt(String prompt, int userChoices) {
        int input;
        do {
            System.out.println(prompt);
            try {
                input = Integer.parseInt(scanner.next());
            } catch (Exception e) {
                input = -1;
                System.out.println("Please enter an integer!");
            }
        } while (input < 1 || input > userChoices);
        return input;
    }

    //to clear console
    public static void clearConsole(){
        for(int i=0;i<100;i++)
            System.out.println();
    }

    public static void characterInfo(){
        clearConsole();
        printHeading("CHARACTER INFO");
        System.out.println("player.name +"\tHP"+player.hp+"/"+player.maxHp);
                printSeperator(20);
        System.out.println("Experience: "+player.xp);
        printSeperator(20);

        System.out.println("Number of Potions"+ player.pots);
        printSeperator(20);


        //Printing chosen traits
        if(player.numAtkUpgrades > 0){
            System.out.println("Offensive trait: "+player.atkUpgrades[player.numAtkUpgrades-1]);
            printSeperator(20);
        }
        if(player.numDefUpgrades > 0){
            System.out.println("Defensive trait: "+player.defUpgrade[player.numDefUpgrades - 1]);
        }
        anythingToContinue();
    }

    public static void printMenu(){
        clearConsole();
        printHeading(places[place]);
        System.out.println("Choose an action:");
        printSeperator(20);
        System.out.println("(1) Continue on your Journey ");
        System.out.println("(2) Character Information");
        System.out.println("(3) Exit Game");
    }

    public static void startGame(){
        boolean nameSet=false;
        String name;
        //print title screen
        clearConsole();
        printSeperator(40);
        printSeperator(30;
        System.out.println(" AGE OF EVIL EMPEROR ");
        printSeperator(30);
        printSeperator(40);
        anythingToContinue();

        do{
            clearConsole();
            printHeading("Whats's your name ?");
            name=scanner.next();
            clearConsole();
            printHeading("Your name is "+name"./Is that correct?");
            System.out.println("(1) Yes!");
            System.out.println("(2) No,I want to change my name.");
            int input=readInt("->",2);
            if(input==1)
                nameSet=true;
        }while(!nameSet);
        //creating player object with name
        player=new Player(name);

        //print first story intro
        Story.printFirstActIntro();

        //set Running to true for game loop to continue
        isRunnining = true;

        //start main game loop
        gameLoop();
    }

public static void randomBattle(){
    clearConsole();
    printHeading("You encountered an evil minded creature. You'll have to fight it!");
    anythingToContine();
    battle(new Enemy(enemies[(int)(Math.random()*enemies.length)],player.xp));
}


}
