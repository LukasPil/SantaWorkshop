package lukas.visma;

import javax.xml.crypto.Data;
import java.lang.reflect.Array;
import java.net.SocketOption;
import java.net.SocketTimeoutException;
import java.sql.SQLOutput;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Registro info spauskite{1}");
        System.out.println("Prideti vaika arba dovana spauskite {2}");
        System.out.println("Suskisrstyti vaikus ir dovanas automatiskai spauskite {Coming soon...}");
        System.out.println("Suskirstyti dovanas vaikams rankiniu budu spauskite [Coming soon...]");


        int pasirinkimas = scanner.nextInt();
        String[] vaikai = {"Dianne Ameter", "Bodrum Salvador", "Hilary Ouse", "Indigo Violet", "Hans Down", "Shequondolisa Bivouac", "Ingredia Nutrisha", "Fig Nelson", "Benjamin Evalent", "Gustav Purpleson", "Elon Gated", "Gootsy Porkins", "Cornbread Stevens", "Slaps Guster"};
        String[] dovanos = {"Compass", "Banana", "Joystick", "Tamagotchi", "Drone", "Basketball ball", "Pear Watch", "Glasses", "Scooter", "Digimon", "Lego kit", "Visma internship", "Football ball", "Karaoke set"};
        String[] poros = {};


        switch (pasirinkimas) {
            case 1:
                System.out.println("Vaiku ir dovanu skaicius {1}");
                System.out.println("Vaiku vardai ir dovanu pavadinimai {2}");
                System.out.println("Vaikai, kuriems nepriskirtos dovanos {Coming soon...}");
                System.out.println("Nepriskirtos dovanos [Coming soon...]");
                int opcija = scanner.nextInt();
                if (opcija == 1) {
                    System.out.println("Vaiku skaicius: " + vaikai.length + " " + "Dovanu skaicius: " + dovanos.length);
                } else if (opcija == 2) {

                    System.out.println("Vaikai:");
                    System.out.println(" ");
                    for (String str : vaikai) {
                        System.out.println(str);
                    }
                    System.out.println(" ");
                    System.out.println("Dovanos:");
                    System.out.println(" ");
                    for (String str2 : dovanos) {
                        System.out.println(str2);
                    }
//

                } else if (opcija == 3) {
                    System.out.println("");
                } else if (opcija == 4) {
                    System.out.println("");
                } else {
                    System.out.println("Tokio pasirinkimo nera");
                }

                break;

            case 2:
                System.out.println("Prideti vaika {1}");
                System.out.println("Prideti dovana{2}");
                int prideti = scanner.nextInt();

                if (prideti == 1) {
                    System.out.println("Iveskite vaiko varda");

                    String vardas = scanner.next();
                    vaikai[vaikai.length - 1] = vardas;

                    String pridetasVaikas = vaikai[vaikai.length - 1];
                    System.out.println("Pridetas vaikas: " + pridetasVaikas);

                } else if (prideti == 2) {
                    System.out.println("Iveskite dovanos pavadinima");

                    String dovanosPavadinimas = scanner.next();
                    dovanos[dovanos.length - 1] = dovanosPavadinimas;

                    String pridetaDovana = dovanos[dovanos.length - 1];
                    System.out.println("Prideta dovana: " + pridetaDovana);
                } else {
                    System.out.println("Tokio pasirinkimo nera");
                }
                break;
            case 3:
                System.out.println("");
                break;
            case 4:
                System.out.println("");
                break;
            default:
                System.out.println("Tokio veiksmo nezinau");
        }
        ;
    }
}

