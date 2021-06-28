// Direitos Autorais, 2021, Escola Politécnica, PUCRS

/**
 * @author Marco Mangan (marco.mangan@pucrs.br)
 */
public class MainApp
{
    /**
     * 
     */
    public static void main(String[] args)
    {
        BankAccount c1;  //
        BankAccount c2; //
        
        c1 = new BankAccount("123.456.789-00");
        c2 = new BankAccount(1600.00, "123.456.789-00");
        
        System.out.println(c1.getBalance());
        System.out.println(c2.getBalance());
        
        // BankAccount[] cs;
        // cs = new BankAccount[] { 
            // new BankAccount("123456789-00"), 
            // new BankAccount("123456789-00") 
        // };
        
        // for (BankAccount x : cs) 
        // {
            // System.out.println(x.getBalance());
        // }        
        
        // TODO: completar o programa para depositar 200 reais na primeira conta,
        // 450 na segunda conta e mostrar o saldo de cada conta.
    }
}
