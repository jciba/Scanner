import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * Created by Kuba on 12/01/2017.
 */

public class Try extends Thread{
    public  int start;
    String ip;
    String path;
    public static int[] tab = new int[65535];
    public void run() {

        int i;
        for (i=start;i<65535;i=i+40)
        {
            up(i);

        }

    }
    public void up( int port){
        Save save = new Save();
        try {
            Socket socket = new Socket();
            socket.connect(new InetSocketAddress(ip,port));
            socket.close();
            tab[port]=1;
            System.out.println(tab[port] + " "+port);
            save.S(tab[port],port,path);

        } catch (IOException e) {
            //e.printStackTrace();
            tab[port]=0;
            System.out.println(tab[port] +" "+port);
            save.S(tab[port],port,path);
        }

    }
    public static int[] getTab(){
        return tab;
    }
    public static void thread(String ip,String path){
        Try[] t = new Try[40];
        int i;
        for(i=0;i<40;i++) {
            t[i] = new Try();
            t[i].start=i;
            t[i].ip=ip;
            t[i].path=path;
            t[i].start();
        }


        for(i=0;i<40;i++){
            try {
                t[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static int search(int a){
        return tab[a];
    }




}
