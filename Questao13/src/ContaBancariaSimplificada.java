public class ContaBancariaSimplificada {

    String nomeDoCorrentista;
    float saldo;
    boolean contaEhEspecial;

    void abreContaSimples(String nome) {
        nomeDoCorrentista = nome;
        saldo = 0.00f; //
        contaEhEspecial = false;
    }

    void deposita(float valor) {
        saldo = saldo + valor;
    }

    boolean retira(float valor) {
        if (!contaEhEspecial) {
            if (valor <= saldo) {
                saldo = saldo - valor;
                return true;
            } else {
                return false;
            }
        } else {
            saldo = saldo - valor;
            return true;
        }
    }

    void mostrarDados() {
        System.out.println("O nome do correntista é " + nomeDoCorrentista);
        System.out.println("O saldo é " + saldo);
        if (contaEhEspecial) {
            System.out.println("A conta é especial.");
        } else {
            System.out.println("A conta é comum.");
        }
    }

    boolean transfere(ContaBancariaSimplificada contaDestino, float valor) {
        if (this.retira(valor)) {
            contaDestino.deposita(valor);
            return true;
        }
        return false;
    }
}
