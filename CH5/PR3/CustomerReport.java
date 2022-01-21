package CH5.PR3;

public class CustomerReport {

    private Bank bank;

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public void generateReport() {


        System.out.println("\t\t\tCUSTOMERS REPORT");
        System.out.println("\t\t\t================");


        for (int custIndex = 0; custIndex < bank.getNumOfCustomers(); custIndex++) {
            Customer customer = bank.getCustomer(custIndex);


            System.out.println();
            System.out.println("Customer: "
                    + customer.getLastName() + ", "
                    + customer.getFirstName());


            for (int acctIndex = 0; acctIndex< customer.getNumOfAccounts(); acctIndex++) {
                Account account = customer.getAccount(acctIndex);


                System.out.println("    " + account);
            }
        }
    }
}
