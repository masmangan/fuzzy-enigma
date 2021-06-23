
public class MainApp
{
    public static void main(String[] args)
    {
        BankAccount c1;  //
        BankAccount c2; //
        
        c1 = new BankAccount("123456789-00");
        c2 = new BankAccount(1600.00, "123456789-00");
        
        System.out.println(c1.getBalance());
        System.out.println(c1.getBalance());
        
        // BankAccount[] cs;
        // cs = new BankAccount[] { 
            // new BankAccount("123456789-00"), 
            // new BankAccount("123456789-00") 
        // };
        
        // for (BankAccount x : cs) 
        // {
            // System.out.println(x.getBalance());
        // }        
    }
}
