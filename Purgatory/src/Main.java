import java.util.Scanner;
public class Main {
    static String prevEvents = "";
    static int hp = 5;
    static boolean trophy = false;
    public static void main(String[] args){
        intro();
            for (int i = 0; i < 11; i++) {
                if (hp >= 1) {
                    String prevEventsBefore = prevEvents;
                    chooseRandomEvent(11);
                    if (prevEvents.equals(prevEventsBefore)) {
                        i -= 1;
                    }
                }
                else {
                    System.out.println("You have failed to redeem yourself.");
                    System.out.println("You can always try again. You're here to improve after all.");
                    System.out.println("Remember that this is not a punishment, but a trial.");
                    return;
                }
            }
            if (hp >= 1) {
                System.out.println("You have proven your worthiness.");
                System.out.println("You can return to the trial at any time, for whatever reason.");
                if (trophy) {
                    System.out.println("The trophy you have retrieved is yours. You can keep it to remind you of your efforts.");
                }
                else{
                    System.out.println("There was also a trophy hidden within the trial path.");
                    System.out.println("You won't need it, but you can always return to try and find it as an additional challenge.");
                }
                System.out.println("Welcome to the afterlife.");
            }
            else{
                System.out.println("You have failed to redeem yourself.");
                System.out.println("You can always try again. You're here to improve after all.");
                System.out.println("Remember that this is not a punishment, but a trial.");
            }
    }
    public static int random(int min, int max){
        return (int)(Math.random() * (max-min + 1) + min);
    }
    public static void intro(){
        boolean start = false;
        System.out.println("Welcome to your Purgatory.");
        System.out.println("You have not reached the afterlife just yet, you must first redeem yourself for your past mistakes.");
        System.out.println("To do so, you will have to face a difficult trial.");
        System.out.println("You must reach the end of a path full of potential dangers.");
        System.out.println("Your survival depends on your intuition, so choose wisely.");
        System.out.println("At the start, you are given 5 HP, although there are ways to obtain more, so keep an eye out.");
        System.out.println("Any choice you make could reduce your HP.");
        System.out.println("You must reach the end of the path while keeping your HP above 0.");
        System.out.println("Keep in mind, death is not the end of the trial, as you can always restart.");
        System.out.println("Type in 'start' to begin the trial of redemption:");
        while (!start){
            Scanner one = new Scanner(System.in);
            String next = one.next();
            if (next.equalsIgnoreCase("start")){
                start = true;
            }
            else{
                System.out.println("Invalid answer.");
                System.out.println("Type 'start' to begin the trial:");
            }
        }
    }
    public static void tallGrass(){
        boolean repeat;
        do {
            repeat = false;
            System.out.println("While following a path, you spot some suspiciously tall grass nearby.");
            System.out.println("Do you check it? (Yes, No)");
            Scanner one = new Scanner(System.in);
            String next = one.next();
            if (next.equalsIgnoreCase("yes")) {
                System.out.println("You check the tall grass, and find nothing.");
            } else if (next.equalsIgnoreCase("no")) {
                System.out.println("You continue without checking the grass. Nothing happens.");
            } else {
                System.out.println("Invalid answer, repeating");
                System.out.println();
                repeat = true;
            }
        } while(repeat);
        System.out.println();
        System.out.println("You have " + hp + " HP.");
        System.out.println();
    }
    public static void strangeGuy(){
        boolean repeat;
        do {
            repeat = false;
            System.out.println("You spot a strange looking man standing next to a tree.");
            System.out.println("What will you do? (Ignore, Run, Talk, Attack)");
            Scanner one = new Scanner(System.in);
            String next = one.next();
            if (next.equalsIgnoreCase("Ignore")) {
                System.out.println("You mind your own business and keep walking. The strange man doesn't do anything.");
            } else if (next.equalsIgnoreCase("Run")) {
                System.out.println("You start running away. Then, you suddenly trip on a rock and fall on the ground. Turns out, the man wasn't even chasing you.");
                System.out.println("You lost 1 HP...");
                hp -= 1;
            } else if (next.equalsIgnoreCase("talk")) {
                System.out.println("You approach the man. Before you can say anything, he pulls out a healing potion. He gives you the potion, then suddenly disappears.");
                System.out.println("You gained 1 HP!");
                hp += 1;
            } else if (next.equalsIgnoreCase("attack")) {
                System.out.println("You attack the man, and quickly realise that he is more powerful than he looks. After taking several hits from the man, you finally knock him out.");
                System.out.println("You lost 3 HP...");
                hp -= 3;
            } else {
                System.out.println("Invalid answer, repeating");
                System.out.println();
                repeat = true;
            }
        } while(repeat);
        System.out.println();
        System.out.println("You have " + hp + " HP.");
        System.out.println();
    }
    public static void banditsNotReal(){
        boolean repeat;
        do {
            repeat = false;
            System.out.println("You see something that looks like a group of bandits further down the path, walking towards you.");
            System.out.println("What will you do? (Hide, Ignore)");
            Scanner one = new Scanner(System.in);
            String next = one.next();
            if (next.equalsIgnoreCase("Ignore")) {
                System.out.println("You mind your own business and keep walking. The closer you get, the more you realize that the bandits were nothing but an illusion.");
            } else if (next.equalsIgnoreCase("Hide")) {
                System.out.println("Without much hesitation, you dive into the nearest bush you find. You then feel the stings of several thorns that were hidden inside. At least you didn't get caught, right?");
                System.out.println("You lost 1 HP...");
                hp -= 1;
            } else {
                System.out.println("Invalid answer, repeating");
                System.out.println();
                repeat = true;
            }
        } while(repeat);
        System.out.println();
        System.out.println("You have " + hp + " HP.");
        System.out.println();
    }
    public static void healPotion(){
        boolean repeat;
        do {
            repeat = false;
            System.out.println("While walking, you spot a bottle on the ground. There seems to be some healing potion left inside of it.");
            System.out.println("Will you drink the potion? (yes, no)");
            Scanner one = new Scanner(System.in);
            String next = one.next();
            if (next.equalsIgnoreCase("yes")) {
                System.out.println("You drink the remaining liquid from the bottle and immediately feel slightly stronger than before.");
                System.out.println("You gained 1 HP!");
                hp += 1;
            } else if (next.equalsIgnoreCase("no")) {
                System.out.println("You have chosen not to drink the potion.");
                System.out.println("Guess what, nothing happens.");
            } else {
                System.out.println("Invalid answer, repeating");
                System.out.println();
                repeat = true;
            }
        } while(repeat);
        System.out.println();
        System.out.println("You have " + hp + " HP.");
        System.out.println();
    }
    public static void gamblePotion(){
        boolean repeat;
        do {
            repeat = false;
            System.out.println("You find a potion on the ground. You have absolutely no idea what it does, drinking it is a gamble...");
            System.out.println("Do you take the risk? (Yes, No)");
            Scanner one = new Scanner(System.in);
            String next = one.next();
            if (next.equalsIgnoreCase("yes")) {
                System.out.println("You drink the potion hoping for something good to happen.");
                int luck = random(1, 100);
                if (luck == 1) {
                    System.out.println("OH SHI-");
                    System.out.println("Due to the potion exploding, you lost 5 HP, congrats.");
                    hp -= 5;
                } else if (luck > 1 && luck < 50) {
                    System.out.println("The taste of the potion is unsatisfying. Also it appears to be mildly toxic.");
                    System.out.println("You lost 2 HP...");
                    hp -= 2;
                } else {
                    System.out.println("Seems like the potion was some sort of general-use medicine potion.");
                    System.out.println("You gained 1 HP!");
                    hp += 1;
                }
            } else if (next.equalsIgnoreCase("no")) {
                System.out.println("You got better things to do than gamble. Nothing happens.");
            } else {
                System.out.println("Invalid answer, repeating");
                repeat = true;
            }
        } while(repeat);
        System.out.println();
        System.out.println("You have " + hp + " HP");
        System.out.println();
    }
    public static void healPotionProbably(){
        boolean repeat;
        do {
            repeat = false;
            System.out.println("You find a potion on the ground. You aren't sure what it does, although it does look very similar to a healing potion.");
            System.out.println("Do you drink from the potion? (Yes, No)");
            Scanner one = new Scanner(System.in);
            String next = one.next();
            if (next.equalsIgnoreCase("yes")) {
                System.out.println("You drink the potion hoping for it to be a healing potion.");
                int luck = random(1, 100);
                if (luck <= 20) {
                    System.out.println("You realise you just fell for a poisonous healing potion decoy.");
                    System.out.println("You lost 1 HP...");
                    hp -= 1;
                } else if (luck <= 25) {
                    System.out.println("It tastes very strange. A bit like food coloring. That's because it's just colored water.");
                } else {
                    System.out.println("Looks like the potion was some sort of crude healing potion.");
                    System.out.println("You gained 1 HP!");
                    hp += 1;
                }
            } else if (next.equalsIgnoreCase("no")) {
                System.out.println("You don't trust the potion and decide to leave it. Nothing happens.");
            } else {
                System.out.println("Invalid answer, repeating");
                repeat = true;
            }
        } while(repeat);
        System.out.println();
        System.out.println("You have " + hp + " HP");
        System.out.println();
    }
    public static void cliff(){
        boolean repeat;
        do {
            repeat = false;
            System.out.println("The path suddenly stops at the end of a cliff. As you look down, you see that the path continues at the bottom of the cliff.");
            System.out.println("How will you get down? (Climb down, Jump down, Search for Ladder)");
            Scanner one = new Scanner(System.in);
            String next = one.nextLine();
            if (next.equalsIgnoreCase("climb down")) {
                System.out.println("You climb down the cliff, slipping multiple times on the way down. In the end, you make it with only a few scratches.");
                System.out.println("You lost 1 HP...");
                hp -= 1;
            } else if (next.equalsIgnoreCase("jump down")) {
                System.out.println("For some reason you thought it was a good idea to just jump down. You land not very safely on the ground with lethal injuries.");
                System.out.println("You lost 10 HP and died on the spot.");
                hp -= 10;
            } else if (next.equalsIgnoreCase("search for ladder")) {
                System.out.println("You are shocked to find out that there is no ladder.");
                System.out.println();
                repeat = true;
            } else {
                System.out.println("Invalid answer, repeating");
                System.out.println();
                repeat = true;
            }
        } while(repeat);
        System.out.println();
        System.out.println("You have " + hp + " HP.");
        System.out.println();
    }
    public static void lake(){
        boolean repeat;
        do {
            repeat = false;
            System.out.println("The path is suddenly blocked by a small, but deep lake. You will need to find a way across, but you quickly get distracted by something shiny at the bottom of the lake");
            System.out.println("What will you do? (Swim across, Swim down, Use raft)");
            Scanner one = new Scanner(System.in);
            String next = one.nextLine();
            if (next.equalsIgnoreCase("swim across")) {
                System.out.println("You swim through the lake, which is much colder than you expected. You make it to the other side, feeling a bit weakened from the cold water.");
                System.out.println("You lost 1 HP...");
                hp -= 1;
            } else if (next.equalsIgnoreCase("swim down")) {
                System.out.println("You decided to swim down and see what's at the bottom of the lake. The water is painfully cold, but you just keep going. At the bottom, you find a strange object and quickly take it with you. You reach the other side of the lake with hypothermia and a shiny object.");
                trophy = true;
                System.out.println("You lost 3 HP...");
                hp -= 3;
                if (hp>0) {
                    System.out.println("You found a trophy, which you decide to take with you.");
                }
            } else if (next.equalsIgnoreCase("use raft")) {
                System.out.println("As you are about to place the raft on the water, you remember that you don't actually have a raft.");
                System.out.println();
                repeat = true;
            } else {
                System.out.println("Invalid answer, repeating");
                System.out.println();
                repeat = true;
            }
        } while(repeat);
        System.out.println();
        System.out.println("You have " + hp + " HP.");
        System.out.println();
    }
    public static void cave(){
        boolean repeat;
        do {
            repeat = false;
            System.out.println("The path you were following leads into a cave. That cave has two directions to follow. You must decide.");
            System.out.println("Which direction will you go? (Left, Right)");
            Scanner one = new Scanner(System.in);
            String next = one.next();
            if (next.equalsIgnoreCase("left")) {
                System.out.println("You start walking down the left path. Not long after, a rock falls on your head.");
                System.out.println("You lost 1 HP...");
                hp -= 1;
            } else if (next.equalsIgnoreCase("right")) {
                System.out.println("You walk down the right pa-");
                System.out.println("Before you can even think through your choice, you fall down into a pit. You land at the bottom with several small injuries. Luckily, the pit wasn't that deep, and you easily climb back out.");
                System.out.println("You lost 2 HP...");
                hp -= 2;
            } else {
                System.out.println("Invalid answer, repeating");
                System.out.println();
                repeat = true;
            }
        } while(repeat);
        System.out.println();
        System.out.println("You have " + hp + " HP.");
        System.out.println();
    }
    public static void creature(){
        boolean repeat;
        do {
            repeat = false;
            System.out.println("You see a small, aggressive-looking creature on the ground in the middle of the path. It doesn't look intimidating, but still very aggressive.");
            System.out.println("What do you do? (Ignore, Attack)");
            Scanner one = new Scanner(System.in);
            String next = one.next();
            if (next.equalsIgnoreCase("attack")) {
                System.out.println("You attack the small creature, defeating it with easy. Honestly, you aren't sure if that was even necessary.");
            } else if (next.equalsIgnoreCase("ignore")) {
                System.out.println("You decide to just walk past the creature, but due to its aggressive nature, it attacks you on the spot. You fight it off after getting scratched and bitten multiple times");
                System.out.println("You lost 2 HP...");
                hp -= 2;
            } else {
                System.out.println("Invalid answer, repeating");
                System.out.println();
                repeat = true;
            }
        } while(repeat);
        System.out.println();
        System.out.println("You have " + hp + " HP.");
        System.out.println();
    }
    public static void quizTime(){
        boolean repeat;
        do {
            repeat = false;
            System.out.println("The path is blocked by a large stone gate. You hear a mysterious voice telling you a riddle. The door will open regardless of your answers, but wrong answers will result in punishment");
            System.out.println("What letter comes next: M T W T F S? (H, M, J, A, S, G)");
            Scanner one = new Scanner(System.in);
            String next = one.next();
            if (next.equalsIgnoreCase("S")) {
                System.out.println("The gate opens, and you pass through.");
            } else if (next.equalsIgnoreCase("H") || next.equalsIgnoreCase("M") || next.equalsIgnoreCase("J") || next.equalsIgnoreCase("A") || next.equalsIgnoreCase("G")) {
                System.out.println("You decide to just walk past the creature, but due to its aggressive nature, it attacks you on the spot. You fight it off after getting scratched and bitten multiple times");
                System.out.println("You lost 2 HP...");
                hp -= 2;
            } else {
                System.out.println("Invalid answer, repeating");
                System.out.println();
                repeat = true;
            }
        } while(repeat);
        System.out.println();
        System.out.println("You have " + hp + " HP.");
        System.out.println();
    }
    public static void chooseRandomEvent(int possibilities){
        int number = random(1, possibilities);
        if (number == 1 && !prevEvents.contains(String.valueOf(number))){
            tallGrass();
            prevEvents += number;
        }
        if (number == 2 && !prevEvents.contains(String.valueOf(number))){
            strangeGuy();
            prevEvents += number;
        }
        if (number == 3 && !prevEvents.contains(String.valueOf(number))){
            banditsNotReal();
            prevEvents += number;
        }
        if (number == 4 && !prevEvents.contains(String.valueOf(number))){
            healPotion();
            prevEvents += number;
        }
        if (number == 5 && !prevEvents.contains(String.valueOf(number))){
            gamblePotion();
            prevEvents += number;
        }
        if (number == 6 && !prevEvents.contains(String.valueOf(number))){
            healPotionProbably();
            prevEvents += number;
        }
        if (number == 7 && !prevEvents.contains(String.valueOf(number))){
            cliff();
            prevEvents += number;
        }
        if (number == 8 && !prevEvents.contains(String.valueOf(number))){
            lake();
            prevEvents += number;
        }
        if (number == 9 && !prevEvents.contains(String.valueOf(number))){
            cave();
            prevEvents += number;
        }
        if (number == 10 && !prevEvents.contains(String.valueOf(number))){
            creature();
            prevEvents += number;
        }
        if (number == 11 && !prevEvents.contains(String.valueOf(number))){
            quizTime();
            prevEvents += number;
        }
    }
}
