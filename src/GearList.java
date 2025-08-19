import java.util.ArrayList;

public class GearList {
    private ArrayList<GearItem> GearItems;

    public GearList() {
        GearItems = new ArrayList<>();
    }

    public void addGearItem(GearItem GearItem) {
        GearItems.add(GearItem);
    }

    public void displayGearItems(){
        for (GearItem GearItem : GearItems){
            System.out.println(GearItem.toString());
            //System.out.println("Gear Name: " + GearItem.getGearName() + " | Quantity:" + GearItem.getGearQuantity() +
            //        " | Price:" + GearItem.getPrice());
        }
    }

    public void totalGearPrice(){
        int TotalGearPrice = 0;
        for (GearItem GearItem : GearItems){
            TotalGearPrice += GearItem.totalPrice();
        }
        System.out.println("Total Price of Gear is: " + TotalGearPrice);
    }
}
