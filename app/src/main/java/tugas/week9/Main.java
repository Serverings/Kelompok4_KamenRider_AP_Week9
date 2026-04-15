package tugas.week9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        OOODriver driver = new OOODriver();
        Scanner input = new Scanner(System.in);

        System.out.println("=== Kougami Foundation: OOO Driver Simulator ===");

        while (true) {
            System.out.println("\nMenu: 1. Insert 2. Scan 3. Eject 4. Exit");
            System.out.print("Select: ");
            String choice = input.nextLine();

            if (choice.equals("1")) {
                // INSERT MEDAL
                System.out.println("\nAvailable Medals:");
                System.out.println("HEAD: TAKA, KUWAGATA, LION, SAI, SHACHI, PTERA, COBRA");
                System.out.println("ARMS: TORA, KAMAKIRI, GORILLA, UNAGI, KUJAKU, TRICERA, KAME");
                System.out.println("LEGS: BATTA, CHEETAH, ZOU, TAKO, CONDOR, TYRANNO, WANI");
                
                try {
                    System.out.print("Pilih Slot (1-3): ");
                    int slotIdx = Integer.parseInt(input.nextLine());
                    
                    System.out.print("Nama Medal: ");
                    CoreMedal m = CoreMedal.valueOf(input.nextLine().toUpperCase());
                    
                    driver.insertMedal(slotIdx, m);
                } catch (NumberFormatException e) {
                    System.out.println("Error: Slot harus berupa angka 1-3!");
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: Nama Medal tidak valid!");
                } catch (InvalidMedalException e) {
                    System.out.println("Error: " + e.getMessage());
                }
                
            } else if (choice.equals("2")) {
                // SCAN
                OScanner scanner = new OScanner();
                scanner.scan(driver);

            
            } else if (choice.equals("3")) {
                // EJECT MEDAL
                try {
                    System.out.print("Pilih Slot yang ingin di-eject (1-3): ");
                    int ejectIdx = Integer.parseInt(input.nextLine());
                    driver.ejectMedal(ejectIdx);
                } catch (NumberFormatException e) {
                    System.out.println("Error: Slot harus berupa angka 1-3!");
                } catch (InvalidMedalException e) {
                    System.out.println("Error: " + e.getMessage());
                }
                
            } else if (choice.equals("4")) {
                System.out.println("Terima kasih! Henshin!");
                break;
            } else {
                System.out.println("Pilihan tidak valid! Pilih 1-4.");
            }
        }
        input.close();
    }
}