import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner
        // Exibir as mensagens para o usuário
        // Obter pela classe scanner os valores digitados no terminal
        // Exibir a mensagem final
        
        Scanner terminal = new Scanner(System.in);
        System.out.println("Por favor, insira o número da conta: ");
        Integer nroConta = terminal.nextInt();
        terminal.nextLine();
        
        System.out.println("Por favor, insira o número da sua agência: ");
        String nroAgencia = terminal.nextLine();

        System.out.println("Por favor, insira o nome do titular da conta: ");
        String nomeCliente = terminal.nextLine();

        System.out.println("Por favor, insira o saldo inicial da conta: ");
        Double saldo = terminal.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + nroAgencia + ", conta " + nroConta + " e seu saldo " + saldo + " já está disponível para saque");

        terminal.close();
    }
}
