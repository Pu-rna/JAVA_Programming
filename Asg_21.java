class MyRunnable implements Runnable 
{
    private Thread t;
    private String threadName;

    MyRunnable(String name) 
    {
        this.threadName = name;
        System.out.println("Creating" + threadName);
    }

    public void run() 
    {
        System.out.println("Running" + threadName);
        try {
            System.out.println("Thread Name: " + threadName+" sleeping for 1 second.");
            Thread.sleep(60);
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.println("Thread " + threadName + " exiting.");
    }
    public void start() 
    {
        System.out.println("Starting " + threadName);
        if (t == null) {
          t = new Thread(this, threadName);
          t.start();
        }
      }
}

 class Test_Thread 
 {
    public static void main(String[] args) 
    {
        for (int i = 1; i <= 10; i++) 
        {
            Thread thread = new Thread(new MyRunnable("Thread-" + i));
            thread.start();
        }
    }
}
