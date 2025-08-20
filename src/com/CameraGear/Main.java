package com.CameraGear;

import org.jetbrains.annotations.NotNull;
import java.util.Scanner;

public class Main {

    public static Object[] inputBasicGearInfo(@NotNull Scanner scanner){
        System.out.print("Enter Gear Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Quantity: ");
        int quantity = scanner.nextInt();

        System.out.print("Enter Price: ");
        int price = scanner.nextInt();
        scanner.nextLine(); // consume leftover newline

        return new Object[]{name,quantity,price};
    }

    public static void inputDisplayGear(GearList gearList, @org.jetbrains.annotations.NotNull Scanner scanner){
        System.out.print("Would you like to check your entries? (y/n) ");
        String displayCheck = scanner.nextLine();
        if (displayCheck.equalsIgnoreCase("y")){
            gearList.displayGearItems();
        }
    }

    public static void inputDisplayPrice(GearList gearList, @NotNull Scanner scanner){
        System.out.print("Would you like to check Total Price of Gear? (y/n): ");
        String displayPrice = scanner.nextLine();
        if (displayPrice.equalsIgnoreCase("y")){
            gearList.totalGearPrice();
        }
    }

    public static void main(String[] args) {
        GearList SohanGear = new GearList();

        Scanner scanner = new Scanner(System.in);
        String addGear = "y";

        while (addGear.equals("y")){
            System.out.println("""
                    What Type of Gear do you wish to add?
                    C - Camera
                    Ln - Lens
                    O - Others""");
            String gearType = scanner.nextLine();
            switch (gearType.toLowerCase()){
                case ("c"):
                    Object[] cInputs = inputBasicGearInfo(scanner);
                    String cName = (String) cInputs[0];
                    int cQuantity = (int) cInputs[1];
                    int cPrice = (int) cInputs[2];

                    System.out.print("Enter Shutter Count (leave blank and hit enter if NA) : ");
                    Integer shutterCount = null;
                    String shutterInput = scanner.nextLine();
                    if (!shutterInput.isEmpty()){
                        shutterCount = Integer.valueOf(shutterInput);
                    }

                    Camera camera = new Camera(cName,cQuantity,cPrice,shutterCount);
                    SohanGear.addGearItem(camera);
                    break;

                case ("ln"):
                    Object[] lnInputs = inputBasicGearInfo(scanner);
                    String lnName = (String) lnInputs[0];
                    int lnQuantity = (int) lnInputs[1];
                    int lnPrice = (int) lnInputs[2];

                    System.out.print("Enter Service Date (leave blank and hit enter if NA) : ");
                    String serviceDate = null;
                    String serviceInput = scanner.nextLine();
                    if (!serviceInput.isEmpty()){
                        serviceDate = serviceInput;
                    }


                    Lens lens = new Lens(lnName,lnQuantity,lnPrice,serviceDate);
                    SohanGear.addGearItem(lens);
                    break;

                case ("o"):
                    Object[] oInputs = inputBasicGearInfo(scanner);
                    String oName = (String) oInputs[0];
                    int oQuantity = (int) oInputs[1];
                    int oPrice = (int) oInputs[2];

                    GearItem gearItem = new GearItem(oName,oQuantity,oPrice);
                    SohanGear.addGearItem(gearItem);
                    break;

                default:
                    System.out.println("Oops! You seemed to have inputted something else");
            }
            System.out.print("Do you want add more Gear? (y/n) : ");
            addGear = scanner.nextLine();
        }

        inputDisplayGear(SohanGear, scanner);
        inputDisplayPrice(SohanGear,scanner);

        scanner.close();

    }
}