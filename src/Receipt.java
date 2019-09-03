import java.lang.String;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Receipt {
                private static DecimalFormat df = new DecimalFormat("0.00");

                String retailItem1;
                String retailItem2;
                String retailItem3;
                String retailItem4;

                double priceItem1;
                double priceItem2;
                double priceItem3;
                double priceItem4;

                double newPriceItem1;
                double newPriceItem2;
                double newPriceItem3;
                double newPriceItem4;

                double newSalesTaxPrice1;
                double newSalesTaxPrice2;
                double newSalesTaxPrice3;
                double newSalesTaxPrice4;

                double salesTaxRate = .10;
                double importTaxRate = .05;
                double salesTax;
                double importTax;

                double taxTotal;
                double subTotal;
                double total;

        public Receipt(String inputItem1, double inputPrice1,
                String inputItem2, double inputPrice2,
                String inputItem3, double inputPrice3,
                String inputItem4, double inputPrice4){

                        this.retailItem1 = inputItem1;
                        this.priceItem1 = inputPrice1;
                        this.retailItem2 = inputItem2;
                        this.priceItem2 = inputPrice2;
                        this.retailItem3 = inputItem3;
                        this.priceItem3 = inputPrice3;
                        this.retailItem4 = inputItem4;
                        this.priceItem4 = inputPrice4;
                }

                public void calculateTaxSales() {
                        if (retailItem1.contains("book")){
                            System.out.println("Item1: exempt from sales tax");
                        } else if (retailItem1.contains("chocolate")) {
                            System.out.println("Item1: exempt from sales tax");
                        } else if (retailItem1.contains("pills")) {
                            System.out.println("Item1: exempt from sales tax");
                        } else {newSalesTaxPrice1 = priceItem1*salesTaxRate;
                            df.setRoundingMode(RoundingMode.UP);
                            System.out.println("Item1: " + df.format(newSalesTaxPrice1));
                        }

                        if (retailItem2.contains("book")) {
                            System.out.println("Item2: exempt from sales tax");
                        } else if (retailItem2.contains("chocolate")) {
                            System.out.println("Item2: exempt from sales tax");
                        } else if (retailItem2.contains("pills")) {
                            System.out.println("Item2: exempt from sales tax");
                        } else {newSalesTaxPrice2 = priceItem2*salesTaxRate;
                            df.setRoundingMode(RoundingMode.UP);
                            System.out.println("Item2: " + df.format(newSalesTaxPrice2));
                        }

                        if (retailItem3.contains("book")) {
                            System.out.println("Item3: exempt from sales tax");
                        } else if (retailItem3.contains("chocolate")) {
                            System.out.println("Item3: exempt from sales tax");
                        } else if (retailItem3.contains("pills")) {
                            System.out.println("Item3: exempt from sales tax");
                        } else {newSalesTaxPrice3 = priceItem3*salesTaxRate;
                            df.setRoundingMode(RoundingMode.UP);
                            System.out.println("Item3: " + df.format(newSalesTaxPrice3));
                        }

                        if (retailItem4.contains("book")) {
                            System.out.println("Item4: exempt from sales tax");
                        } else if (retailItem4.contains("chocolate")) {
                            System.out.println("Item4: exempt from sales tax");
                        } else if (retailItem4.contains("pills")) {
                            System.out.println("Item4: exempt from sales tax");
                        } else {newSalesTaxPrice4 = priceItem4*salesTaxRate;
                            df.setRoundingMode(RoundingMode.UP);
                            System.out.println("Item4: " + df.format(newSalesTaxPrice4));
                        }   System.out.print("\n");
                    }

                public void calculateTaxImport() {
                        if (retailItem1.contains("import")) {
                                newPriceItem1 = priceItem1 * importTaxRate;
                        } if (retailItem2.contains("import")) {
                                newPriceItem2 = priceItem2 * importTaxRate;
                        } if (retailItem3.contains("import")) {
                                newPriceItem3 = priceItem3 * importTaxRate;
                        } if (retailItem4.contains("import")) {
                                newPriceItem4 = priceItem4 * importTaxRate;
                        }
                }

                public double calculateSales (){
                        salesTax = newSalesTaxPrice1+newSalesTaxPrice2+newSalesTaxPrice3+newSalesTaxPrice4;
                        return this.salesTax;
                }
                public double calculateImport (){
                        importTax = newPriceItem1+newPriceItem2+newPriceItem3+newPriceItem4;
                        return this.importTax;
                }

                public double calculateTaxTotal (){
                        taxTotal = salesTax+importTax;
                        return this.taxTotal;
                }

                public double calculateSubTotal (){
                        subTotal = priceItem1+priceItem2+priceItem3+priceItem4;
                        return this.subTotal;
                }

                public double calculatePriceTotal (){
                        total = taxTotal+subTotal;
                        return this.total;
                }
                public void newReceipt (){
                        df.setRoundingMode(RoundingMode.UP);
                        System.out.println("Item1: " + retailItem1 + "\n" + "Price: " + df.format(priceItem1+newSalesTaxPrice1+newPriceItem1));
                        System.out.println("Item2: " + retailItem2 + "\n" + "Price: " + df.format(priceItem2+newSalesTaxPrice2+newPriceItem2));
                        System.out.println("Item3: " + retailItem3 + "\n" + "Price: " + df.format(priceItem3+newSalesTaxPrice3+newPriceItem3));
                        System.out.println("Item4: " + retailItem4 + "\n" + "Price: " + df.format(priceItem4+newSalesTaxPrice4+newPriceItem4) + "\n");
                }
}