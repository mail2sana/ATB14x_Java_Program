package ex_21_OOPS_Encapsulation;

public class Lab190_Real_Bank {
    public static void main(String[] args) {
        HdfcBank amit = new HdfcBank("amit" , 1000);
        long bal = amit.getBal();
      //  System.out.println(amit.bal); can amit see balance directly no -> why its private
        System.out.println(bal);

        // cashier
        HdfcBank cashier = new HdfcBank("amit" , 1000);
        cashier.setBal(2000, true);
        System.out.println(cashier.getBal());
    }
}

class HdfcBank{
    private String name;
    private long bal;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal, boolean isCahier) {
        if (isCahier) {
            this.bal = bal;
        } else {
            System.out.println("Not allowed");
        }
    }
    public HdfcBank(String name, long bal){
        this.name = name;
        this.bal = bal;
    }

}
