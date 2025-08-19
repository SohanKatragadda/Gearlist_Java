public class GearItem {
    private String GearName;
    private int GearQuantity;
    private int Price;

    public GearItem(String GearName, int GearQuantity, int Price) {
        this.GearName = GearName;
        this.GearQuantity = GearQuantity;
        this.Price = Price;
        System.out.println(GearName + " entered Successfully");
    }

    public String getGearName() {
        return GearName;
    }
    public int getGearQuantity() {
        return GearQuantity;
    }
    public int getPrice() {
        return Price;
    }

    public int totalPrice() {
        return GearQuantity * Price;
    }

    @Override
    public String toString(){
        return ("Gear Name: " + GearName + " | Quantity:" + GearQuantity +
                " | Price:" + Price);
    }
}
