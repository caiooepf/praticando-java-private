
    class ThreadExample2 extends  Thread{
    private char c;

    public ThreadExample2(char c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 100 ; i++) {
            System.out.print(c);
            if (i % 100 == 0){
                System.out.println();
            }
        }
    }
}

    class ThreadRunnable2 implements Runnable {
    private char c;
        public ThreadRunnable2 (char c) {
            this.c = c;
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
            for (int i = 0; i < 100 ; i++) {
                System.out.print(c);
                if (i % 100 == 0){
                    System.out.println();
                }
            }
        }
    }
public class ConcorrenciaTeste02 {


    static void main(String[] args) throws InterruptedException {
    Thread t1 = new Thread(new ThreadExample2('K'));
    Thread t2 = new Thread(new ThreadExample2('A'));
    t1.start();
    t1.join();
    t2.start();
    }
}
