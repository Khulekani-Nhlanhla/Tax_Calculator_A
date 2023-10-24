import java.math.BigDecimal;

public class TaxCalculator {
    public static void main(String[] args) {
//  This is the variables in double format.3
        double netProductValue = 9.99;
        double valueAddedTax = 0.23;
        double grossValue = netProductValue + 0.23;
        double itemsSold = 10_000;
        double salesValue = (itemsSold * grossValue);
        double salesValueWithoutVat = salesValue-0.23;

        System.out.println("The gross value of the product in double is equal to: "+ grossValue);
        System.out.println("The total amount of products sold in double is: "+salesValue);
        System.out.println("The value of the total sales excluding tax using double is: "+salesValueWithoutVat);

//  This is the calculations in Big Decimal Format
        BigDecimal bigDeciNetProductValue = new BigDecimal(netProductValue);
        BigDecimal bigDeciValueAddedTax = new BigDecimal(valueAddedTax);
        BigDecimal bigDeciGrossValue = bigDeciNetProductValue.add(bigDeciValueAddedTax);
        BigDecimal bigDeciItemsSold = new BigDecimal(itemsSold);
        BigDecimal bigDeciSalesValue = bigDeciGrossValue.multiply(bigDeciItemsSold);
        BigDecimal bigDeciSalesValueWithoutVat = bigDeciSalesValue.subtract(bigDeciValueAddedTax);

        System.out.println("\nThe big Decimal value of gross value is: "+bigDeciGrossValue);
        System.out.println("The value of the items sold in Big Decimal is: "+bigDeciSalesValue);
        System.out.println("The value of the items sold without Tax in Big Decimal is: "+bigDeciSalesValueWithoutVat);

        System.out.println("\nWhen you observe both outcomes using different datatypes you see that the double data type is not as accurate.\n"+
                "However the Big Decimal type is more accurate and therefore less prone to error in tasks that require precision.");


    }
}
