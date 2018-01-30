/**
 * Created by Kuba on 06/03/2017.
 */

public class Search {

    public void sort(int tab[]){

        Save save = new Save();
        for (int i=0;i<tab.length-1;i++){
            if(tab[i]==1){
               save.S(1,i,"C:\\Users\\Kuba\\Desktop/zero.9gag");
            }
            else
                save.S(0,i,"C:\\Users\\Kuba\\Desktop/one.9gag");

        }
    }

}
