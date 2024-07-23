import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        String agencia = "";
        int conta = 0;
        String nome = "";
        double saldo = 0.0;

        System.out.println("Por favor, digite o número da Agência !");
        agencia = scanner.nextLine();
        System.out.println("Por favor, digite o número da Conta !");
        conta = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Por favor, digite o seu nome!");
        nome = scanner.nextLine();
        System.out.println("Por favor, deposite um valor!");
        saldo = scanner.nextDouble();




        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.%n",
                nome, agencia, conta, saldo);


    }
}
