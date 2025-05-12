public class ThreadExampleAsg_20 extends Thread {
    public void run() {
        System.out.println("Thread ID: " + this.getId());
    }

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            ThreadExampleAsg_20 thread = new ThreadExampleAsg_20();
            thread.start();
        }
    }
}


