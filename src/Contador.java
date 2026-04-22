public class Contador {
    private int quantidade = 0;

    public synchronized void incrementar() {
        int atual = this.quantidade;

        try {
            Thread.sleep(2);
        } catch (Exception e) {}

        this.quantidade = atual + 1;
    }

    public int getQuantidade() {
        return quantidade;
    }
}