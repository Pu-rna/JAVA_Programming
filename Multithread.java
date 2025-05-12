//20
class MultithreadingEg extends Thread { 
    public void run() 
    { 
        try {   
    // Displaying the thread that is running 
            System.out.println( "NewThread " + Thread.currentThread().getId() +  
            " is running"); 
        } 
        catch (Exception e) { 
            System.out.println("Exception is caught…..");
        } 
    } 
}

public class Multithread { 
    public static void main(String[] args) 
    { 
        int n = 10;   
        for (int i = 0; i < n; i++) { 
            MultithreadingEg object= new MultithreadingEg();
            object.start(); 
        } 
    } 
} 
  