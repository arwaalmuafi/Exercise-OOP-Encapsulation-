public class Main {
    public static void main(String[] args) {
    Account bank1 =new Account();

    bank1.setName("arwa");
    bank1.setId("1132673416");
    bank1.setBalance(500);
        System.out.println(bank1.getName());
        System.out.println(bank1.getId());
        System.out.println(bank1.getBalance());

        System.out.println(bank1);
        bank1.credit(200);
        bank1.debit(100);

        System.out.println(bank1);
        System.out.println("---------------------------------------------------------");
        Account bank2 =new Account();

        bank2.setName("rose");
        bank2.setId("88729027");
        bank2.setBalance(500);
        System.out.println(bank2.getName());
        System.out.println(bank2.getId());
        System.out.println(bank2.getBalance());
        System.out.println(bank2);

        bank2.debit(200);
        bank2.credit(1000);

        System.out.println(bank2);

        System.out.println("---------------------------------------------------------");
        bank1.transferTo(bank2,200);
        System.out.println(bank1);
        System.out.println(bank2);




    }
}