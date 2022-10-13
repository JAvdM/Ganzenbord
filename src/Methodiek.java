import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Methodiek {

    private Speler speler1 = new Speler(/*"Rood"*/"", 1, 0, false, false);
    private Speler speler2 = new Speler(/*"Blauw*/"", 2, 0, false, false);
    private Speler speler3 = new Speler(/*"Groen*/"", 3, 0, false, false);
    private Speler speler4 = new Speler(/*"Geel*/"", 4, 0, false, false);
    private Speler speler5 = new Speler(/*"Zwart*/"", 5, 0, false, false);
    private Speler speler6 = new Speler(/*"Wit*/"", 6, 0, false, false);

    private ArrayList<Speler> spelers = new ArrayList(Arrays.asList(speler1, speler2, speler3, speler4, speler5, speler6));

    private Scanner scanner = new Scanner(System.in);

    public void groet() {
        System.out.println("**************");
        System.out.println("* GANZENBORD *");
        System.out.println("**************");
    }

    public int dobbelsteen() {
        int uitkomst = (int) (Math.random() * 6) + 1;
        return uitkomst;
    }

    public void spelerSelectie() {
        int spelerAantal = 6;
        int aantalMensen = 0;
        int aantalCPU = 0;

        do {
            System.out.println();
            System.out.println("Hoeveel menselijke spelers zijn er, en hoeveel CPU spelers?");
            System.out.println();
            System.out.println("Mensen:");

            do {
                try {
                    aantalMensen = Integer.parseInt(scanner.nextLine());
                } catch (Exception e) {
                    System.out.println("Geen getal tussen 1 en " + spelerAantal +  ". Probeer opnieuw.");
                }
            } while (aantalMensen > spelerAantal || aantalMensen < 0);

        } while (spelerAantal < 7 || spelerAantal > 0);
    }
}