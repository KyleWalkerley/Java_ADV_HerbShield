package CH11.PR5;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class SortTest {

    public static void main(String[] args) {

        List<SalesTX> tList = SalesTX.createTxnList();
        Consumer<SalesTX> transReport
                = t -> System.out.printf("Id: " + t.getTxnId()
                + " Seller: " + t.getSalesPerson() + " Buyer: "
                + t.getBuyerName() + " Amt: $%,9.2f%n", t.getTransactionTotal());

        // Print out PriceCo Transactions
        System.out.println("=== PriceCo Transactions ===");
        tList.stream()
                .filter(t -> t.getBuyerName().equals("PriceCo"))
                .sorted(Comparator.comparing(SalesTX::getTransactionTotal))
                .forEach(transReport);

        System.out.println("\n=== PriceCo Transactions Reversed ===");
        tList.stream()
                .filter(t -> t.getBuyerName().equals("PriceCo"))
                .sorted(Comparator.comparing(SalesTX::getTransactionTotal).reversed())
                .forEach(transReport);

        // Sort by Buyer, SalesPerson, Transaction Total
        System.out.println("\n=== Triple Sort Transactions ===");
        tList.stream()
                .sorted(Comparator
                        .comparing(SalesTX::getBuyerName)
                        .thenComparing(SalesTX::getSalesPerson)
                        .thenComparing(SalesTX::getTransactionTotal)
                )
                .forEach(transReport);
    }
}
