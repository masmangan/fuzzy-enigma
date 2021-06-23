
public class BankAccount
{
    public double balance; // saldo da conta
    public String cpf;
    
    public BankAccount(double initialBalance, String novoCpf) // construtor
    {
        balance = initialBalance;
        cpf = novoCpf;
    }

    public BankAccount(String novoCpf) // construtor
    {
        balance = 10000.0;
        cpf = novoCpf;
    }    
    
    public double getBalance()
    {
        return balance;
    }
}
