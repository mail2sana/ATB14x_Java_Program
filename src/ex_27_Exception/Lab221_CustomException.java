package ex_27_Exception;

import java.io.FileNotFoundException;

public class Lab221_CustomException  {
    static void main() throws Exception {
        Bank sbi=new Bank("INR", 100);
        Bank icici = new Bank("INR" , 200);
        Integer total_bal=sbi.add(icici);
        System.out.println(total_bal);

        Bank jp_chase = new Bank("USD", 100);
        Integer total_bal_all_countries= sbi.add(jp_chase);
        System.out.println(total_bal_all_countries);
    }
    }
class Bank{
    private String Currency;
    private Integer amount;
 //   constructor
    public Bank(String currency , Integer amount){
        this.Currency = currency;
        this.amount=amount;
    }
    public String getCurrency() {
        return Currency;
    }
    public void setCurrency(String currency) {
        Currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
    //constructor
    // Diff in throws -> handle the exception & throw -> throw the exception
    public Integer add(Bank bank)throws Exception, FileNotFoundException {
        if(!bank.Currency.equalsIgnoreCase("INR")) {
            return bank.amount + this.amount;
        }
        else {
            try{
                throw new CustomException("Currency mismatch can't proceed!");
            }
            catch (CustomException e){
                throw new RuntimeException(e);
            }

        }

    }
}
class CustomException extends Exception{
    CustomException(String msg){
        super(msg);
    }
}