
    class ThreadExample extends  Thread{
    private char c;

    public ThreadExample(char c) {
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

    class ThreadRunnable implements Runnable {
    private char c;
        public ThreadRunnable (char c) {
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
public class ConcorrenciaTeste01 {


    static void main(String[] args) {
//        ThreadExample t1 = new ThreadExample('A');
//        ThreadExample t2 = new ThreadExample('b');
//        ThreadExample t3 = new ThreadExample('c');
//        ThreadExample t4 = new ThreadExample('d');
        Thread t1 = new Thread(new ThreadRunnable('A'));
        Thread t2 = new Thread(new ThreadRunnable('B'));
        Thread t3 = new Thread(new ThreadRunnable('C'));
        Thread t4 = new Thread(new ThreadRunnable('D'));
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);

    }
}
