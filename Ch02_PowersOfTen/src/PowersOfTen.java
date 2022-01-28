import java.util.Random;

public class PowersOfTen {
    public static void main(String[] args) {
        int powerOfTen = 1;
        System.out.printf(">>>>%9d<<<<%n", powerOfTen);
        powerOfTen *= 10;
        System.out.printf(">>>>%9d<<<<%n", powerOfTen);
        powerOfTen *= 10;
        System.out.printf(">>>>%9d<<<<%n", powerOfTen);
        powerOfTen *= 10;
        System.out.printf(">>>>%9d<<<<%n", powerOfTen);
        powerOfTen *= 10;
        System.out.printf(">>>>%9d<<<<%n", powerOfTen);
        powerOfTen *= 10;
        System.out.printf(">>>>%9d<<<<%n", powerOfTen);
        powerOfTen *= 10;
        System.out.printf(">>>>%9d<<<<%n", powerOfTen);
        powerOfTen *= 10;
        System.out.printf(">>>>%9d<<<<%n", powerOfTen);
        powerOfTen *= 10;
        System.out.printf(">>>>%9d<<<<%n", powerOfTen);

        System.out.println("-----------------------------");
        System.out.println(Math.PI);
        System.out.printf("%10.2f%n", Math.PI);

        System.out.println("-----------------------------");
        Random rand = new Random();
        System.out.println(rand.nextInt(6));
    }
}
