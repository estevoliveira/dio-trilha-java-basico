import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        startTerminalCadastro();
    }

    public static void startTerminalCadastro(){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("""
            \nOlá, Bem-vindo ao sistema de criacao de conta 
            Por favor insira os seguintes dados\n
            """);

        System.out.println("Digite o numero da sua agencia:");
        String agencia = scanner.next();

        System.out.println("Digite o numero da sua conta:");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite seu nome completo:");
        String nomeCliente = scanner.nextLine().toUpperCase(Locale.ROOT);

        System.out.println("Confirme o saldo da sua conta:");
        double saldo = scanner.nextDouble();

        //scanner.close();
        imprimirContaBancaria(agencia,numero,nomeCliente,saldo);
    };

    public static void imprimirContaBancaria (String agencia, int numeroConta,String nomeCliente, double saldo){

        System.out.printf("""
                Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s,
                conta %d e seu saldo %.2f já está disponível para saque
                """,nomeCliente,agencia,numeroConta,saldo);

    }
}