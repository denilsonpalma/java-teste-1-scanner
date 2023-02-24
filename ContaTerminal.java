
import java.util.Locale;
import java.util.Scanner;

/**
 * Conta Banco - Java - Basico
 * trilha de teste e pratica em Java. 
 * Utilizacao de Scanner pra leitura de dados.
 * @author denilsonpalma
 */
public class ContaTerminal {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in).useLocale(Locale.US);
        
        int numeroConta = 0;
        String agencia, nomeCliente;
        double saldo = 0.0;
        
        System.out.println("Conta Bancaria\nInforme os dados por favor\nNumero da conta: ");
        numeroConta = leia.nextInt();
        
        System.out.println("Numero da agencia: ");
        agencia = leia.next();
        
        System.out.println("Nome do Cliente:");
        nomeCliente = leia.next();
        
        System.out.println("Saldo atual: ");
        saldo = leia.nextDouble();
        
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque!");
        
    }
    
}
