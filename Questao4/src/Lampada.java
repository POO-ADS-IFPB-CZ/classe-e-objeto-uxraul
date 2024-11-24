public class Lampada {
    String marca;
    String tipo;
    int potencia;
    String voltagem;
    String corDaLuz;
    double preco;
    boolean estadoDaLampada; // true = ligada, false = desligada

    void acende() {
        estadoDaLampada = true;
        System.out.println("A lâmpada está acesa.");
    }

    void apaga() {
        estadoDaLampada = false;
        System.out.println("A lâmpada está apagada.");
    }

    void mostraEstado() {
        if (estadoDaLampada) {
            System.out.println("A lâmpada está ligada.");
        } else {
            System.out.println("A lâmpada está desligada.");
        }
    }

    void exibeDetalhes() {
        System.out.println("Detalhes da Lâmpada:");
        System.out.println("Marca: " + marca);
        System.out.println("Tipo: " + tipo);
        System.out.println("Potência: " + potencia + "W");
        System.out.println("Voltagem: " + voltagem);
        System.out.println("Cor da Luz: " + corDaLuz);
        System.out.println("Preço: R$ " + preco);
    }
}
