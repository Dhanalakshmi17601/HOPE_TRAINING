
class SampleThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread running using Thread class");
    }

}

class SampleThread2 implements Runnable {
    @Override
    public void run() { // 3. RUNNING state
        try {
            System.out.println("Thread running using Runnable");
            Thread.sleep(4000); // 4. BLOCKED / WAITED state
            System.out.println("After 4 seconds");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        SampleThread t = new SampleThread();
        t.start();
        SampleThread2 t1= new SampleThread2();
        Thread t2 = new Thread(new SampleThread());// 1.new thread
        t2.start();// 2.RUNNABLE state
    }
}