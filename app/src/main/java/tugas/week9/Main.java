package tugas.week9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        OOODriver driver = new OOODriver();
        Scanner input = new Scanner(System.in);
        OScanner scanner = new OScanner(); 

        System.out.println("=== Kougami Foundation: OOO Driver Simulator ===");

        while (true) {
            System.out.println("\nMenu: 1. Insert 2. Scan 3. Eject 4. Exit");
            System.out.print("Select: ");
            String choice = input.nextLine();

            if (choice.equals("1")) {
                System.out.println("\n--- Available Medals ---");
                
                System.out.print("HEAD: ");
                for (CoreMedal m : CoreMedal.values()) {
                    if (m.getEligibleSlot() == MedalSlot.HEAD) System.out.print(m + " ");
                }
                
                System.out.print("\nARMS: ");
                for (CoreMedal m : CoreMedal.values()) {
                    if (m.getEligibleSlot() == MedalSlot.ARMS) System.out.print(m + " ");
                }

                System.out.print("\nLEGS: ");
                for (CoreMedal m : CoreMedal.values()) {
                    if (m.getEligibleSlot() == MedalSlot.LEGS) System.out.print(m + " ");
                }
                System.out.println("\n------------------------");
                
                try {
                    System.out.print("Pilih Slot (1-3): ");
                    int slotIdx = Integer.parseInt(input.nextLine());
                    
                    System.out.print("Nama Medal: ");
                    CoreMedal m = CoreMedal.valueOf(input.nextLine().toUpperCase());
                    
                    driver.insertMedal(slotIdx, m);
                } catch (NumberFormatException e) {
                    System.out.println("Error: Slot harus berupa angka 1-3!");
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: Nama Medal tidak terdaftar!");
                } catch (InvalidMedalException e) {
                    System.out.println("Error: " + e.getMessage());
                }
                
            } else if (choice.equals("2")) {
                scanner.scan(driver);
            
            } else if (choice.equals("3")) {
                try {
                    System.out.print("Pilih Slot yang ingin di-eject (1-3): ");
                    int ejectIdx = Integer.parseInt(input.nextLine());
                    driver.ejectMedal(ejectIdx);
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
                
            } else if (choice.equals("4")) {
                System.out.println("Terima kasih! Happy Henshin!");
                break;
            } else {
                System.out.println("Pilihan tidak valid!");
            }
        }
        input.close();
    }
}