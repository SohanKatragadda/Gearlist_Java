public class Camera extends GearItem{
    private Integer shutterCount;

    public Camera(String GearName, int GearQuantity, int Price, Integer shutterCount ){
        super(GearName,GearQuantity,Price);
        this.shutterCount = shutterCount;
    }

    public Camera(String GearName, int GearQuantity, int Price){
        super(GearName,GearQuantity,Price);
    }

    public String getShutterCount() {
        if (shutterCount == null){
            return ("Shutter Count not given for " + getGearName());
        }
        else{
            return ("Shutter Count for "+getGearName()+" is " + shutterCount);
        }
    }

    @Override
    public String toString(){
        String s = ("Gear Name: " + getGearName() + " | Quantity:" + getGearQuantity() +
                " | Price:" + getPrice() +" | Shutter Count: " + getShutterCount());
        return s;
    }
}
