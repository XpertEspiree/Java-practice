import java.util.Random;

public class RandomNumberDemo {
    public static void main(String[] args) {
        Random rand = new Random();

        // Random integer between 1 and 100
        int randomInt = rand.nextInt(100) + 1;
        System.out.println("Random Integer: " + randomInt);

        // Random double between 0.0 and 1.0
        double randomDouble = rand.nextDouble();
        System.out.println("Random Double: " + randomDouble);

        // Random boolean
        boolean randomBool = rand.nextBoolean();
        System.out.println("Random Boolean: " + randomBool);

        // Simulate a dice roll (1-6)
        int diceRoll = rand.nextInt(6) + 1;
        System.out.println("Dice Roll: " + diceRoll);
    }
}
