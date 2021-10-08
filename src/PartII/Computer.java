package PartII;

//-----------------------------------------------------
//Assignment (1)
//© Zitao Wang & Jiaming Han
//Written by: (Zitao Wang 40171434) & (Jiaming Han 40185367)
//-----------------------------------------------------

public class Computer{

    private String brand;
    private String model;
    private long SN;
    private double price;

    private static int numOfCreatedObjects = 0;
    private static long serialNumCtr = 1000;

    public Computer() { //default constructor

        brand = "Nullbrand";
        model = "NullModel";
        SN = serialNumCtr + numOfCreatedObjects + 1;
        price = 0.0;

        numOfCreatedObjects++;
    }
    public Computer(String brand, String model, double price) {

        this.brand = brand;
        this.model = model;
        this.SN = serialNumCtr + numOfCreatedObjects + 1;
        this.price = price;

        numOfCreatedObjects++;
    }
    //mutators
    public String getBrand() {

        return brand;
    }
    public String getModel() {

        return model;
    }
    public long getSN() {

        return SN;
    }
    public double getPrice() {

        return price;
    }

    //accessors
    public void setBrand(String brand) {
        this.brand = brand;
        System.out.println("Brand is: " + this.brand);
    }
    public void setModel(String model) {
        this.model = model;
        System.out.println("Model is: " + this.model);
    }
    public void setSN(long SN) {
        this.SN = SN;
        System.out.println("SN is: " + this.SN);
    }
    public void setPrice(double price) {
        this.price = price;
        System.out.println("Price is: " + this.price);
    }

    //toString
    public String toString() {

        return "This computer has:" + "\n" +
                "Brand is: " + this.brand + "\n" +
                "Model is: " + this.model + "\n" +
                "SN is: " + this.SN + "\n" +
                "Price is: " + this.price;
    }

    //findNumberOfCreatedComputer
    public static void findNumberOfCreatedComputer()
    {
        System.out.println("The number of created Computer objects is " + numOfCreatedObjects + ".");
    }
    //equals
    public boolean equals(Object x)
    {
        if (x == null || this.getClass() != x.getClass())
            return false;
        else
        {
            // cast the passed object to an Computer object
            Computer e = (Computer)x;
            return (this.brand.equals(e.brand) &&
                    this.model.equals(e.model) &&
                    this.SN == e.SN &&
                    this.price == e.price);
        }
    }

    public static void main() {

    }

}

