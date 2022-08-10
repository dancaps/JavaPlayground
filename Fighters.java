import java.util.Random;

public class Fighters {
    private String name;
    private int age;
    private static int counter = 0;
    private int id;
    private int score;
    String[] names = {"Danny", "Lisa", "Ryan", "Jacob", "Katie", "Cat", "Greta", "Grandpa", "Grandma",
                      "Trump", "Sarah", "Joe"};

    public Fighters() {
        Random randomAge = new Random();
        this.name = this.names[counter];
        this.id = counter;
        this.age = randomAge.nextInt(90) + 10;
        this.score = fight();
        counter++;
    }

    private int fight() {
        Random randomFight = new Random();
        return randomFight.nextInt( 1000);
    }

    public int getFightScore() {
        return this.score;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public String takeTurn() {
        Random random = new Random();
        int randomNum = random.nextInt(3) + 1;

        switch (randomNum) {
            case 1: // This is rock
                return "rock";
            case 2: // This is paper
                return "paper";
            case 3: // This is scissors
                return "scissors";
            default:
                return "Invalid Choice";
        }
    }
}
