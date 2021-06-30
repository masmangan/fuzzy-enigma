
public class Savings extends BankAccount
{
    private int day;
    
    public Savings(String cpf)
    {
        super(0.0, cpf);
        day = 17;
    }
    
    public int getDay()
    {
        return day;
    }
}
