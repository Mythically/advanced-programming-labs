import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {


        System.out.println("This is a luck-based game! You need to push past the monsters and reach the end /n The further you go, the higher the chance for you to die, reach the end to save your life.");
        Player player = new Player(50);
        Random random = new Random();
        List<Monster> monsters = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            monsters.add(new Monster("Monster" + i, random.nextInt(10) + 1));
        }
        System.out.println(monsters);
        System.out.println("Monsters generated, game is ready");
        System.out.println("Welcome player, you have two options: Y/N, Y makes you fight the monster, N means you're a wuss and you run away with your life, but you won't win.");
        System.out.println("Monsters alive: " + monsters.size());
        System.out.println("Would you like to try your luck?");
        Scanner scanner = new Scanner(System.in);
        int i = 10;
        // while player is still alive
        while (!monsters.isEmpty()) {
            i--;
                //check received answer
                if (scanner.hasNextLine()) {
                    if (scanner.nextLine().equalsIgnoreCase("y")) {
                        //select random monster
                        // reduce player's health by monster's strength
                        player.setHealth(player.getHealth() - monsters.get(i).getStrength());
                        // set monster's strength to 0, marking it as fought
                        //check if player is dead, offer restart
                        if (player.getHealth() <= 0) {
                            System.out.println("Slowly, Gently, This Is How A Life Is Taken...");
                            System.out.println("Try again another time, or try now? Y/N");
                            if (scanner.hasNextLine()) {
                                if (scanner.nextLine().equalsIgnoreCase("y")) {
                                    //reset stats and monsters list
                                    player.setHealth(50);
                                    monsters.clear();
                                    for (int j = 1; j <= 10; j++) {
                                        i = 10;
                                        monsters.add(new Monster("Monster" + j, random.nextInt(10) + 1));
                                    }
                                    continue;
                                } else {
                                    System.out.println("You wuss!");
                                    break;
                                }
                            }
                        }

                        //player damage notification
                        System.out.println(monsters.get(i).getName() + ", You took : " + monsters.get(i).getStrength() + " damage.");
                        //remove dead monster
                        monsters.remove(i);
                        System.out.println("Monsters alive: " + monsters.size());
                        //player's health status notification
                        if (player.getHealth() >= 33.5) {
                            System.out.println("You feel confident");
                        } else if (17 <= player.getHealth() && player.getHealth() <= 33.5) {
                            System.out.println("You wonder if you have the strength needed to survive all of this");
                        } else {
                            System.out.println("Be wary, for overconfidence is a slow and insidious killer. ");
                        }
                    } else if (scanner.nextLine().equalsIgnoreCase("n")) {
                        System.out.println("Scared little baby?");
                        break;
                    }
                }
            }
                if (player.getHealth() > 0) {
                    System.out.println("Congrats, you won, ya happy now?! Destroying monster families, YOU ARE HEARTLESS!");
                }
            }
        }




