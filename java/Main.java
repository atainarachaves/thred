public class Main {

    // Primeira thread: imprime números de 1 a 10
    static class ContadorCrescente extends Thread {
        @Override
        public void run() {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Thread Crescente: " + i);
                try {
                    Thread.sleep(1000); // pausa de 1 segundo
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // Segunda thread: imprime números de 10 a 1
    static class ContadorDecrescente extends Thread {
        @Override
        public void run() {
            for (int i = 10; i >= 1; i--) {
                System.out.println("Thread Decrescente: " + i);
                try {
                    Thread.sleep(1000); // pausa de 1 segundo
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        // Criação das threads
        Thread t1 = new ContadorCrescente();
        Thread t2 = new ContadorDecrescente();

        // Início das execuções
        t1.start();
        t2.start();

        // Esperar as duas terminarem
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Execução das duas threads finalizada.");
    }
}
