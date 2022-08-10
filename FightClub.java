import java.util.Arrays;
import java.util.Random;
import java.util.List;
import java.util.Collections;

public class FightClub {
    public static void main(String[] args) {

        int numObjects = 12; // number of npcs to build
        Random randomFighter = new Random();
        int fighter1 = randomFighter.nextInt(numObjects);
        int fighter2 = randomFighter.nextInt(numObjects);
        String winner = "";
        int winnerScore = 0;
        Fighters[] npcCollection = new Fighters[numObjects];

        while (fighter1 == fighter2) {
            fighter1 = randomFighter.nextInt(numObjects);
        }

        // builds the non player characters and puts them in an array
        while(numObjects > 0) {
            npcCollection[numObjects-1] = new Fighters();
            numObjects --;
        }

        List sortedList = Arrays.asList(npcCollection);
        Collections.shuffle(sortedList);
        sortedList.toArray(npcCollection);

        for (Fighters npc : npcCollection) {
            System.out.print("Name: " + npc.getName() + " , ");
            System.out.print("ID: " + npc.getId() + " , ");
            System.out.print("Age: " + npc.getAge() + " , ");
            System.out.print("Score: " + npc.getFightScore() + " , ");
            System.out.println("Turn: " + npc.takeTurn());
        }
        System.out.println();
        System.out.println();
        System.out.println("IT'S TIME TO FIGHT - BATTLE ROYALE!!!!!!");

        for (Fighters npc : npcCollection) {
            if (winnerScore == 0){
                System.out.println(npc.getName() + " Steps into the ring");
                winnerScore = npc.getFightScore();
                winner = npc.getName();
                continue;
            }
            if (winnerScore < npc.getFightScore()) {
                System.out.println(npc.getName() + " fights " + winner + " and WINS!");
                winnerScore = npc.getFightScore();
                winner = npc.getName();
            } else {
                System.out.println(npc.getName() + " fights " + winner + " and LOSSES!");
            }
        }
        System.out.println("----------------");
        System.out.println("The winner is " + winner + " with a score of " + winnerScore);
        System.out.println("----------------");

        System.out.println();
        System.out.println();
        System.out.println("IT'S TIME TO FIGHT - ONE ON ONE BATTLES!!!!!!");

        int npc0FightScore = npcCollection[fighter1].getFightScore();
        int npc1FightScore = npcCollection[fighter2].getFightScore();

        if (npc0FightScore > npc1FightScore) {
            System.out.println(npcCollection[fighter1].getName() + " wins the fight! With a score of: " +
                    npc0FightScore + " , age: " + npcCollection[fighter1].getAge());
            System.out.println(npcCollection[fighter2].getName() + " loses the fight! With a score of: " +
                    npc1FightScore + " , age: " + npcCollection[fighter2].getAge());
        } else {
            System.out.println(npcCollection[fighter2].getName() + " wins the fight! With a score of: " +
                    npc1FightScore + " , age: " + npcCollection[fighter2].getAge());
            System.out.println(npcCollection[fighter1].getName() + " loses the fight! With a score of: " +
                    npc0FightScore + " , age: " + npcCollection[fighter1].getAge());
        }
    }
}
