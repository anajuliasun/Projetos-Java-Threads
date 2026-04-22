public class Processador implements Runnable {

    private Contador contador;

    public Processador(Contador contador) {
        this.contador = contador;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            contador.incrementar();
        }
    }
}