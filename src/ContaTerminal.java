import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        int numero;
        String agencia;
        String nomeCliente;
        Double saldo;

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência ! ex: xxx-xx");
        agencia = sc.next();

        System.out.println("Por favor, digite o número da Conta !");
        numero = sc.nextInt();

        // Consome a quebra de linha pendente após nextInt()
        sc.nextLine();

        System.out.println("Por favor, digite o seu Nome Completo !");
        nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o seu Saldo ! (Ex: 237.48)");
        saldo = sc.nextDouble();

        // Exibe a mensagem final usando concatenação de String
        String mensagem = String.format(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
                nomeCliente,
                agencia,
                numero,
                saldo
        );

        System.out.println(mensagem);

        sc.close();
    }
}