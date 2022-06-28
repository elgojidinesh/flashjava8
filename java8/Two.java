package impworks;

public class Two implements Runnable
{
    public void run()
    {
        new One().run();
        new Thread(new One(),"one").run();
        new Thread(new One(),"two").start();
    }
}


