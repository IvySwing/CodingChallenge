import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Main {
    private static DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) {
        Receipt myTax = new Receipt("book", 12.49, "music cd",
                14.99, "chocolate bar", .85,"no item", 0.00);
        Receipt myTax2 = new Receipt ("imported box of chocolates", 10.00, "imported bottle of perfume", 47.50,
                "no item", 0.00, "no item", 0.00);
        Receipt myTax3 = new Receipt ("imported bottle of perfume", 27.99, "bottle of perfume", 18.99,
                "packet of headache pills", 9.75, "box of imported chocolates", 11.25);

        System.out.println("Input 1");
        System.out.println("Item1: " + myTax.retailItem1 + "\n" + "Price: " + myTax.priceItem1);
        System.out.println("Item2: " + myTax.retailItem2 + "\n" + "Price: " + myTax.priceItem2);
        System.out.println("Item3: " + myTax.retailItem3 + "\n" + "Price: " + myTax.priceItem3);
        System.out.println("Item4: " + myTax.retailItem4 + "\n" + "Price: " + myTax.priceItem4 + "\n");

        System.out.println("Input 2");
        System.out.println("Item1: " + myTax2.retailItem1 + "\n" + "Price: " + myTax2.priceItem1);
        System.out.println("Item2: " + myTax2.retailItem2 + "\n" + "Price: " + myTax2.priceItem2);
        System.out.println("Item3: " + myTax2.retailItem3 + "\n" + "Price: " + myTax2.priceItem3);
        System.out.println("Item4: " + myTax2.retailItem4 + "\n" + "Price: " + myTax2.priceItem4 + "\n");

        System.out.println("Input 3");
        System.out.println("Item1: " + myTax3.retailItem1 + "\n" + "Price: " + myTax3.priceItem1);
        System.out.println("Item2: " + myTax3.retailItem2 + "\n" + "Price: " + myTax3.priceItem2);
        System.out.println("Item3: " + myTax3.retailItem3 + "\n" + "Price: " + myTax3.priceItem3);
        System.out.println("Item4: " + myTax3.retailItem4 + "\n" + "Price: " + myTax3.priceItem4 + "\n");

        System.out.println("Sales Tax 1");
        myTax.calculateTaxSales();
        System.out.println("Sales Tax 2");
        myTax2.calculateTaxSales();
        System.out.println("Sales Tax 3");
        myTax3.calculateTaxSales();

        myTax.calculateTaxImport();
        df.setRoundingMode(RoundingMode.UP);
        System.out.println("Import Tax 1");
        System.out.println("Item 1:" + df.format(myTax.newPriceItem1));
        System.out.println("Item 2:" + df.format(myTax.newPriceItem2));
        System.out.println("Item 3:" + df.format(myTax.newPriceItem3));
        System.out.println("Item 4:" + df.format(myTax.newPriceItem4) + "\n");

        myTax2.calculateTaxImport();
        df.setRoundingMode(RoundingMode.UP);
        System.out.println("Import Tax 2");
        System.out.println("Item 1:" + df.format(myTax2.newPriceItem1));
        System.out.println("Item 2:" + df.format(myTax2.newPriceItem2));
        System.out.println("Item 3:" + df.format(myTax2.newPriceItem3));
        System.out.println("Item 4:" + df.format(myTax2.newPriceItem4) + "\n");

        myTax3.calculateTaxImport();
        df.setRoundingMode(RoundingMode.UP);
        System.out.println("Import Tax 3");
        System.out.println("Item 1:" + df.format(myTax3.newPriceItem1));
        System.out.println("Item 2:" + df.format(myTax3.newPriceItem2));
        System.out.println("Item 3:" + df.format(myTax3.newPriceItem3));
        System.out.println("Item 4:" + df.format(myTax3.newPriceItem4) + "\n");

        double Sales = myTax.calculateSales();
        df.setRoundingMode(RoundingMode.UP);
        System.out.println("Total Sales Tax 1: " + df.format(Sales));
        double Sales2 = myTax2.calculateSales();
        df.setRoundingMode(RoundingMode.UP);
        System.out.println("Total Sales Tax 2: " + df.format(Sales2));
        double Sales3 = myTax3.calculateSales();
        df.setRoundingMode(RoundingMode.UP);
        System.out.println("Total Sales Tax 3: " + df.format(Sales3) + "\n");

        double Import = myTax.calculateImport();
        df.setRoundingMode(RoundingMode.UP);
        System.out.println("Total Import Tax 1: " + df.format(Import));
        double Import2 = myTax2.calculateImport();
        df.setRoundingMode(RoundingMode.UP);
        System.out.println("Total Import Tax 2: " + df.format(Import2));
        double Import3 = myTax3.calculateImport();
        df.setRoundingMode(RoundingMode.UP);
        System.out.println("Total Import Tax 3: " + df.format(Import3) + "\n");

        double Tax = myTax.calculateTaxTotal();
        df.setRoundingMode(RoundingMode.UP);
        System.out.println("Total Taxes Paid 1: " + df.format(Tax));
        double Tax2 = myTax2.calculateTaxTotal();
        df.setRoundingMode(RoundingMode.UP);
        System.out.println("Total Taxes Paid 2: " + df.format(Tax2));
        double Tax3 = myTax3.calculateTaxTotal();
        df.setRoundingMode(RoundingMode.UP);
        System.out.println("Total Taxes Paid 3: " + df.format(Tax3) + "\n");

        double Subtotal = myTax.calculateSubTotal();
        df.setRoundingMode(RoundingMode.UP);
        System.out.println("Subtotal 1 (without taxes): " + df.format(Subtotal));
        double Subtotal2 = myTax2.calculateSubTotal();
        df.setRoundingMode(RoundingMode.UP);
        System.out.println("Subtotal 2 (without taxes): " + df.format(Subtotal2));
        double Subtotal3 = myTax3.calculateSubTotal();
        df.setRoundingMode(RoundingMode.UP);
        System.out.println("Subtotal 3 (without taxes): " + df.format(Subtotal3) + "\n");

        double Price = myTax.calculatePriceTotal();
        df.setRoundingMode(RoundingMode.UP);
        System.out.println("Total Price 1: " + df.format(Price));
        double Price2 = myTax2.calculatePriceTotal();
        df.setRoundingMode(RoundingMode.UP);
        System.out.println("Total Price 2: " + df.format(Price2));
        double Price3 = myTax3.calculatePriceTotal();
        df.setRoundingMode(RoundingMode.UP);
        System.out.println("Total Price 3: " + df.format(Price3) + "\n");

        System.out.println("Output 1: ");
        myTax.newReceipt();
        System.out.println("Output 2: ");
        myTax2.newReceipt();
        System.out.println("Output 3: ");
        myTax3.newReceipt();

    }
}
