package tugas.week9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        OOODriver driver = new OOODriver();
        OScanner scanner = new OScanner();
        MedalRepository<CoreMedal> repo = new MedalRepository<>();
        Scanner input = new Scanner(System.in);

        // Inisialisasi Repository
        for (CoreMedal m : CoreMedal.values()) repo.add(m);

        System.out.println("=== Kougami Foundation: OOO Driver Simulator ===");

        while (true) {
            System.out.println("\nMenu: 1. Insert 2. Scan 3. Eject 4. Exit");
            System.out.print("Select: ");
            String choice = input.nextLine();

            if (choice.equals("1")) {
                System.out.println("Available Medals:");
                System.out.println("HEAD: TAKA, KUWAGATA, LION, SAI, SHACHI, PTERA, COBRA");
                System.out.println("ARMS: TORA, KAMAKIRI, GORILLA, UNAGI, KUJAKU, TRICERA, KAME");
                System.out.println("LEGS: BATTA, CHEETAH, ZOU, TAKO, CONDOR, TYRANNO, WANI");
                System.out.print("Enter Medal Name: ");
                try {
                    CoreMedal m = CoreMedal.valueOf(input.nextLine().toUpperCase());
                    driver.insertMedal(m);
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
            } else if (choice.equals("2")) {
                scanner.scan(driver);
            } else if (choice.equals("3")) {
                driver.ejectAll();
            } else if (choice.equals("4")) {
                break;
            }
        }
        input.close();
    }
}
