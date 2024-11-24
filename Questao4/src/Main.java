public class Main {
    public static void main(String[] args) {

        Lampada lampada = new Lampada();

        lampada.marca = "Philips";
        lampada.tipo = "LED";
        lampada.potencia = 9;
        lampada.voltagem = "Bivolt";
        lampada.corDaLuz = "Branca";
        lampada.preco = 29.90;
        lampada.estadoDaLampada = false;

        lampada.exibeDetalhes();

        lampada.mostraEstado();

        lampada.acende();
        lampada.mostraEstado();

        lampada.apaga();
        lampada.mostraEstado();
    }
}
