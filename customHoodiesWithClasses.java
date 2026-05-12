import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        RegularSweatshirt[] regularSweatshirts = new RegularSweatshirt[20];
        CustomSweatshirt[] customSweatshirts = new CustomSweatshirt[20];
        Socks[] socks = new Socks[20];
        byte topMenuChoice = 0;
        do {
            System.out.println("Welcome to Custom Hoodies! If you would like to take any action involving regular hoodies type 1, if you would like to take any action involving custom hoodies type 2, if you would like to take any action involving socks type 3, if you would like to print out all of the data on any of the three type 4, and if you would like to quit without printing type 5.");
            topMenuChoice = input.nextByte();
            if (topMenuChoice == 1) {
                System.out.println("You are now in the regular hoodies section. If you would like to take an inventory action type 1, or if you would like to take a sale action type 2.");
                byte regHoodieChoice = input.nextByte();
                if (regHoodieChoice == 1) {
                    regularHoodiesInventoryAction();
                }
                else if (regHoodieChoice == 2) {
                    regularHoodiesSalesAction();
                } else {System.out.println("You have entered an incorrect input so you are being sent back to the top menu");}
            } else if (topMenuChoice == 2) {
                System.out.println("You are now in the custom hoodies section. If you would like to take an inventory action type 1, or if you would like to take a sale action type 2.");
                byte customHoodieChoice = input.nextByte();
                if (customHoodieChoice == 1) {
                    customHoodiesInventoryAction();
                } else if (customHoodieChoice == 2) {
                    customHoodiesSalesAction();
                } else {System.out.println("You have entered an incorrect input so you are being sent back to the top menu.");}
            } else if (topMenuChoice == 3) {
                System.out.println("You are now in the socks section. If you would like to take an inventory action type 1, or if you would like to take a sale action type 2.");
                byte socksChoice = input.nextByte();
                if (socksChoice == 1) {
                    socksInventoryAction();
                } else if (socksChoice == 2) {
                    socksSalesAction();
                } else {System.out.println("You have entered an incorrect input so you are being sent back to the top menu.");}
            } else if (topMenuChoice == 4) {
                System.out.println("If you would like to print out all of the information for the regular sweatshirts type 1, if you would like to print out all of the information for the custom sweatshirts type 2, if you would like to print out all the information for the socks type 3, and if you would like to print out all of the information for all of the articles of clothing type 4.");
                byte printChoice = input.nextByte();
                if (printChoice == 1 || printChoice == 4) {
                    //put code to print out regular sweatshirt information here
                } else if (printChoice == 2 || printChoice == 4) {
                    //put code to print out custom sweatshirt information here
                } else if (printChoice == 3 || printChoice == 4) {
                    //put code to print out socks information here
                } else {
                    System.out.println("You have entered an incorrect input, you are being sent back to the main menu.");
                }
            }
        } while (topMenuChoice != 5);


    }


    public static void regularHoodiesInventoryAction(){}
    public static void regularHoodiesSalesAction(){}
    public static void customHoodiesInventoryAction(){}
    public static void customHoodiesSalesAction(){}
    public static void socksInventoryAction(){}
    public static void socksSalesAction(){}
}
class RegularSweatshirt {
    private int skuNumber;
    private String productName;
    private String productDescription;
    private double price;
    private double saleModifier;
    private char size;
    private String color;


    public RegularSweatshirt() {
        this.productName = "Regular Sweatshirt";
        this.productDescription = "Just a regular, un-customizable sweatshirt, and because it isn't customizable, it's cheaper!";
        this.price = 9.99;
        this.size = 'M';
        this.color = "gray";
        this.skuNumber = 7249;
        this.saleModifier = 1;
    }
/*
    public RegularSweatshirt(int skuNumber, String productName, String productDescription, double price, double saleModifier, char size, String color) {
        this.skuNumber = skuNumber;
        this.productName = productName;
        this.productDescription = productDescription;
        this.price = price;
        this.saleModifier = saleModifier;
        this.size = size;
        this.color = color;
    }
*/

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSaleModifier() {
        return saleModifier;
    }

    public void setSaleModifier(double saleModifier) {
        this.saleModifier = saleModifier;
    }

    public int getSkuNumber() {
        return skuNumber;
    }

    public void setSkuNumber(int skuNumber) {
        this.skuNumber = skuNumber;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "RegularSweatshirt{" +
                "skuNumber=" + skuNumber +
                ", productName='" + productName + '\'' +
                ", productDescription='" + productDescription + '\'' +
                ", price=" + price +
                ", saleModifier=" + saleModifier +
                ", size=" + size +
                ", color='" + color + '\'' +
                '}';
    }
}
class CustomSweatshirt {
    private int skuNumber;
    private String productName;
    private String productDescription;
    private double price;
    private double saleModifier;
    private char size;
    private String color;

    public CustomSweatshirt() {
        this.productName = "Custom Sweatshirt";
        this.productDescription = "You can customize the color of this sweatshirt";
        this.price = 19.99;
        this.size = 'M';
        this.color = "gray";
        this.skuNumber = 8329;
        this.saleModifier = 1;
    }

    /*
        public CustomSweatshirt(int skuNumber, String productName, String productDescription, double price, double saleModifier, char size, String color) {
            this.skuNumber = skuNumber;
            this.productName = productName;
            this.productDescription = productDescription;
            this.price = price;
            this.saleModifier = saleModifier;
            this.size = size;
            this.color = color;
        }
    */
    public int getSkuNumber() {
        return skuNumber;
    }

    public void setSkuNumber(int skuNumber) {
        this.skuNumber = skuNumber;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSaleModifier() {
        return saleModifier;
    }

    public void setSaleModifier(double saleModifier) {
        this.saleModifier = saleModifier;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "CustomSweatshirt{" +
                "skuNumber=" + skuNumber +
                ", productName='" + productName + '\'' +
                ", productDescription='" + productDescription + '\'' +
                ", price=" + price +
                ", saleModifier=" + saleModifier +
                ", size=" + size +
                ", color='" + color + '\'' +
                '}';
    }
}
class Socks {
    private int skuNumber;
    private String productName;
    private String productDescription;
    private double price;
    private double saleModifier;
    private char size;
    private String color;

    public Socks() {
        this.productName = "Socks";
        this.productDescription = "Just regular socks!";
        this.price = 19.99;
        this.size = 'M';
        this.color = "gray";
        this.skuNumber = 8329;
        this.saleModifier = 1;
    }
    /*
    public Socks(int skuNumber, String productName, String productDescription, double price, double saleModifier, char size, String color) {
        this.skuNumber = skuNumber;
        this.productName = productName;
        this.productDescription = productDescription;
        this.price = price;
        this.saleModifier = saleModifier;
        this.size = size;
        this.color = color;
    }

     */

    public int getSkuNumber() {
        return skuNumber;
    }

    public void setSkuNumber(int skuNumber) {
        this.skuNumber = skuNumber;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSaleModifier() {
        return saleModifier;
    }

    public void setSaleModifier(double saleModifier) {
        this.saleModifier = saleModifier;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Socks{" +
                "skuNumber=" + skuNumber +
                ", productName='" + productName + '\'' +
                ", productDescription='" + productDescription + '\'' +
                ", price=" + price +
                ", saleModifier=" + saleModifier +
                ", size=" + size +
                ", color='" + color + '\'' +
                '}';
    }
}
