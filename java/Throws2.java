class DeadlockSample extends Thread {
    static Thread mainThread;
    public void run()
    {
        System.out.println("Thread2 waiting for" +
                          " Thread1 completion");
        try {
            mainThread.join();
        }
        catch (InterruptedException e) {
            System.out.println("Thread2 execution" +
                                           " completes");
        }
    }
    public static void main(String[] args)
                   throws InterruptedException
    {
        DeadlockSample.mainThread = Thread.currentThread();
        DeadlockSample thread = new DeadlockSample();

        thread.start();
        System.out.println("Thread1 waiting for " +
                            "Thread2 completion");
        thread.join();

        System.out.println("Thread1execution" +
                                      " completes");
    }
}