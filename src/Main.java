import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GearList SohanGear = new GearList();

        Scanner scanner = new Scanner(System.in);
        String addGear = "y";

        while (addGear.equals("y")){
            System.out.println("What Type of Gear do you wish to add?\n" +
                    "C - Camera\n" +
                    "Ln - Lens\n" +
                    "O - Others");
            String gearType = scanner.nextLine();
            switch (gearType.toLowerCase()){
                case ("c"):
                    System.out.print("Enter Camera Name: ");
                    String cName = scanner.nextLine();

                    System.out.print("Enter Quantity: ");
                    int cQuantity = scanner.nextInt();

                    System.out.print("Enter Price: ");
                    int cPrice = scanner.nextInt();
                    scanner.nextLine(); // consume leftover newline

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
                    System.out.print("Enter Lens Name: ");
                    String lnName = scanner.nextLine();

                    System.out.print("Enter Quantity: ");
                    int lnQuantity = scanner.nextInt();

                    System.out.print("Enter Price: ");
                    int lnPrice = scanner.nextInt();
                    scanner.nextLine(); // consume leftover newline

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
                    System.out.print("Enter Gear Name: ");
                    String oName = scanner.nextLine();

                    System.out.print("Enter Quantity: ");
                    int oQuantity = scanner.nextInt();

                    System.out.print("Enter Price: ");
                    int oPrice = scanner.nextInt();
                    scanner.nextLine(); // consume leftover newline

                    GearItem gearItem = new GearItem(oName,oQuantity,oPrice);
                    SohanGear.addGearItem(gearItem);
                    break;

                default:
                    System.out.println("Oops! You seemed to have inputted something else");
            }
            System.out.print("Do you want add more Gear? (y/n) : ");
            addGear = scanner.nextLine();
        }


/*
        Camera mainCamera = new Camera("Canon R8", 1, 85000);
        Lens mainLens = new Lens("Canon 24-70 f/2.8", 1, 45000);
        Lens vintageLens = new Lens("Takumar 50mm f/1.4", 1, 5000, "23rd August 2024");

        SohanGear.addGearItem(mainCamera);
        SohanGear.addGearItem(mainLens);
        SohanGear.addGearItem(vintageLens);

        SohanGear.displayGearItems();
        SohanGear.totalGearPrice();
        System.out.println(mainCamera.getShutterCount());
 */
    }
}