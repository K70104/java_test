package thread;

class MyThread2 extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("hello thread!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class demo2 {
    public static void main(String[] args) {
        Thread t = new MyThread2();
        t.start();

        while (true) {
            System.out.println("hello main");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // 运行打印：
        /*hello main
        hello thread!
        hello thread!
        hello main
        hello main
        hello thread!
        hello thread!
        hello main*/
    }
}
