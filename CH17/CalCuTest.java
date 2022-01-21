package CH17;

import java.util.List;

public class CalCuTest {

    public static void main(String[] args) {

        List<SalesTX> tList = SalesTX.createTxnList();

        System.out.println("=== Transactions Totals ===");
        double t2 = tList.stream()
                .filter(t -> t.getBuyerName().equals("PriceCo"))
                .mapToDouble( t -> t.getTransactionTotal())
                .parallel()
                .reduce(0, (sum, e) -> sum + e);

        System.out.printf("%nPriceCo Total: $%,9.2f%n", t2);

        int c2 = tList.stream()
                .filter(t -> t.getBuyerName().equals("PriceCo"))
                .mapToInt(t -> 1)
                .parallel()
                .reduce(0, (sum, e) -> sum + e);

        System.out.printf("PriceCo Transactions: %,6d%n", c2);

    }
}
