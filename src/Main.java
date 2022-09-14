import ramos.adriano.raul.banco.Cliente;
import ramos.adriano.raul.banco.Conta;
import ramos.adriano.raul.banco.ContaCorrente;
import ramos.adriano.raul.banco.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Raul");

        Conta cc = new ContaCorrente(cliente1);
        Conta poupanca = new ContaPoupanca(cliente1);

        cc.depositar(200);
        cc.transferir(poupanca, 100);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
