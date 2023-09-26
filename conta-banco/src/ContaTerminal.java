import java.util.Scanner;

public class ContaTerminal {
    Integer numero;
    String agencia;
    String nomeCliente;
    Float saldo;

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo R$" + saldo + " já está disponível para saque.";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaTerminal conta = new ContaTerminal();

        System.out.print("Digite o número da agência: ");
        conta.setNumero(scanner.nextInt());

        System.out.print("Digite o nome da agência: ");
        conta.setAgencia(scanner.next());

        System.out.print("Digite o nome do cliente: ");
        conta.setNomeCliente(scanner.next());

        System.out.print("Digite o saldo da conta bancária: ");
        conta.setSaldo(scanner.nextFloat());

        System.out.println(conta);
    }
}