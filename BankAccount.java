// Direitos Autorais, 2021, Escola Politécnica, PUCRS

/**
 * A classe BankAccount...
 * 
 * @author Marco Mangan (marco.mangan@pucrs.br)
 * 
 * Por determinação de Legislação, é obrigatório
 * um CPF válido para cada conta de pessoa física.
 */
public class BankAccount
{
    private double balance; // saldo da conta
    private String cpf; // cpf do cliente
      
    /**
     * Confere o cpf indicado.
     * 
     * @param cpf o cpf a ser conferido.
     * 
     * @exception IllegalArgumentException
     */
    private static void checkCpf(String cpf)
    {
        if (cpf == null)
        {
            throw new IllegalArgumentException("O CPF não pode ser null!");
        }
        if (cpf.length() != 14)
        {
            throw new IllegalArgumentException("O CPF deve ser composto de 11 caracteres!");            
        }        
    }
    
    /**
     * Cadastra uma conta no cpf indicado, com um saldo de R$ 0,00.
     * 
     * @exception IllegalArgumentException
     */
    public BankAccount(double balance, String cpf) // construtor
    {
        checkCpf(cpf);
        
        this.balance = balance;
        this.cpf = cpf;
    }

    /**
     * Cadastra uma conta no cpf indicado, 
     * indicado com um saldo inicial de R$ 10.000,00.
     * @exception IllegalArgumentException
     */
    public BankAccount(String cpf) // construtor
    {
        checkCpf(cpf);
        
        this.balance = 10000.0;
        this.cpf = cpf;
    }    
    
    /**
     * Consulta o saldo da conta.
     * 
     * @return o valor do saldo da conta em reais.
     */
    public double getBalance()
    {
        return balance;
    }
    
    /**
     * Consulta o CPF do cliente desta conta.
     * 
     * @return o CPF do cliente
     */
    public String getCpf()
    {
        return cpf;
    }
    
    /**
     * Deposita um value ao saldo da conta.
     * 
     * @param value o valor a ser depositado, maior do que R$ 0,00
     * @exception IllegalArgumentException
     */
    public void deposit(double value)
    {
        if (value <= 0)
        {
            throw new IllegalArgumentException();            
        }
        balance = balance + value;
        // deposit() ver livro do Horstmann Capítulo 3   
    }
    
    /**
     * Retira um value do saldo da conta.
     * 
     * @param value o valor a ser depositado, maior do que R$ 0,00
     * @exception IllegalArgumentException
     */
    public void withdraw(double value)
    {
        if (value <= 0)
        {
            throw new IllegalArgumentException();            
        }
        balance = balance - value;
     // TODO: withdraw() ver livro do Horstmann Capítulo 3   
    }
}
