public class Main {
    public static void main(String[] args) {

        ContaBancariaSimplificada conta1 = new ContaBancariaSimplificada();
        ContaBancariaSimplificada conta2 = new ContaBancariaSimplificada();

        conta1.abreContaSimples("João Silva");
        conta2.abreContaSimples("Maria Oliveira");

        System.out.println("Dados iniciais das contas:");
        conta1.mostrarDados();
        conta2.mostrarDados();

        conta1.deposita(500);
        conta2.deposita(300);

        System.out.println("\nApós os depósitos:");
        conta1.mostrarDados();
        conta2.mostrarDados();

        System.out.println("\nTransferindo R$200 da conta de João para Maria...");
        boolean transferencia = conta1.transfere(conta2, 200);

        if (transferencia) {
            System.out.println("Transferência realizada com sucesso!");
        } else {
            System.out.println("Transferência não realizada. Saldo insuficiente!");
        }

        System.out.println("\nApós a transferência:");
        conta1.mostrarDados();
        conta2.mostrarDados();
    }
}
