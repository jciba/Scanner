/**
 * Created by Kuba on 06/02/2017.
 */
import  java.io.*;
public class Save implements Serializable
{
    public  static void saveToFile(int tab[],String path){
        try{
            File file = new File(path);
            PrintWriter out = new PrintWriter(file);
            int i;
            for(i=0;i<65535;i++){
                out.println(tab[i]);
            }

            out.close();


        }
        catch (Exception e){

        }

    }
    public static void serialize( Try ex,String path){

            try {
                FileOutputStream fileStream = new FileOutputStream(path);
                ObjectOutputStream os = new ObjectOutputStream(fileStream);
                os.writeObject(ex);
                os.close();
            }
            catch(Exception e){

        }

    }
    public static void S(int a, int b, String path){
        try{
            FileWriter file = new FileWriter(path,true);
            BufferedWriter out = new BufferedWriter(file);
            PrintWriter fw = new PrintWriter(out);
            fw.println("port " +b + ": "+a);
            out.close();

        }
        catch (Exception e ){

        }
    }
}
