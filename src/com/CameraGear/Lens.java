package com.CameraGear;

public class Lens extends GearItem{
    private String serviceDate;

    public Lens(String GearName, int GearQuantity, int Price,String serviceDate){
        super(GearName,GearQuantity,Price);
        this.serviceDate = serviceDate;
    }
    public Lens(String GearName, int GearQuantity, int Price){
        super(GearName,GearQuantity,Price);
    }

    public String getServiceDate(){
        if (serviceDate == null){
            return "No Service Records";
        }
        else{
            return "Last Service Date was on " + serviceDate;
        }
    }
    @Override
    public String toString(){
        String s = ("Gear Name: " + getGearName() + " | Quantity:" + getGearQuantity() +
                " | Price:" + getPrice() +" | Last Service: " + getServiceDate());
        return s;
    }
}
