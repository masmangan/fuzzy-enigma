// Direitos Autorais, 2021, Escola Politécnica, PUCRS
import java.util.Scanner;

/**
 * @author Marco Mangan (marco.mangan@pucrs.br)
 */
public class MainApp
{
    private MainApp()
    {
        
    }

    /**
     * 
     */
    public static void main(String[] args)
    {
        // BankAccount c1;  //
        // BankAccount c2; //
        // BankAccount s1;
        // Scanner teclado;
        
        // c1 = new BankAccount("123.456.789-00");
        // c2 = new BankAccount(1600.00, "123.456.789-00");
        // s1 = new Savings("123.456.789-00");
        
        // teclado = new Scanner(System.in);
        
        // System.out.println(c1.getBalance());
        // System.out.println(c2.getBalance());
        // Savings x = (Savings)s1;
        // int y = (int)3.14;
        // System.out.println(x.getDay());
        
        // c1.deposit(200.0);
        // c2.deposit(450.0);
        
        BankAccount[] cs;
        cs = new BankAccount[] { 
            new BankAccount("123.456.789-00"), 
            new BankAccount("123.456.789-00"),
            new Savings("123.456.789-00")            
        };
        
        for (BankAccount x : cs) 
        {
            System.out.println(x.getBalance());
            if (x instanceof Savings)
            {
                Savings y = (Savings)x;
                System.out.println(y.getDay());
            }
        }        
        
        // TODO: completar o programa para depositar 200 reais na primeira conta,
        // 450 na segunda conta e mostrar o saldo de cada conta.
    }
}
