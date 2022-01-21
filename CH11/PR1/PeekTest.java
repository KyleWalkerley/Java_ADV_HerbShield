package CH11.PR1;

import java.util.List;
import java.util.function.Consumer;

public class PeekTest {

    public static void main(String[] args) {

        List<SalesTXN> tList = SalesTXN.createTxnList();
        Consumer<SalesTXN> taxReport =
                t -> System.out.printf("Id: " + t.getTxnId()
                        + " Buyer: " + t.getBuyerName() +
                        " Txn amt: $%,9.2f ", t.getTransactionTotal());

        // Write report using peek
        System.out.println("=== Widget Pro Sales Tax in CA ===");
        tList.stream()
                .filter(t -> t.getState().equals(State.CA))
                .filter(t -> t.getProduct().equals("Widget Pro"))
                .peek(taxReport)
                .map(t -> t.getTransactionTotal() * TaxRate.byState(t.getState()))
                .forEach(amt -> System.out.printf("Txn tax: $%9.2f%n", amt));



    }
}
