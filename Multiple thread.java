public class Main extends Thread
{
String task;
Main(String task)
{
    this.task=task;
}
public void run()
{
    for(int i=1;i<5;i++)
    {
        System.out.println(task+" : " +i );
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException ie){
            System.out.println(ie.getMessage());
        }    
         
        }
    }
    public static void main(String[] args)
    {
        Main th1=new Main("cut the ticket");
        Main th2=new Main("show your seat number");
        Thread t1=new Thread(th1);
        Thread t2=new Thread(th2);
        t1.start();
        t2.start();
    }
}
