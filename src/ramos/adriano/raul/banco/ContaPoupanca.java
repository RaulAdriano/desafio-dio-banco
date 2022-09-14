package ramos.adriano.raul.banco;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void imprimirExtrato() {
        System.out.println("----------------Extrato ramos.adriano.raul.banco.Conta Poupanca -----------");
        imprimirInfosComuns();
    }
}
