public class Main {

    public static void main(String[] args) throws InterruptedException {

        Contador contador = new Contador();

        Thread t1 = new Thread(new Processador(contador));
        Thread t2 = new Thread(new Processador(contador));
        Thread t3 = new Thread(new Processador(contador));

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("Valor final: " + contador.getQuantidade());
    }
}