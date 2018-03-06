
import java.util.HashMap;

public class Hashmatique{
    static HashMap<Integer,String> album = new HashMap<>();

    public static void getTracks(){
        for(HashMap.Entry<Integer,String>tracks:album.entrySet()){
            System.out.println("Track: "+tracks.getKey()+" : "+tracks.getValue());
        }
    }

    public static void main(String[] args){
        album.put(1,"First Track");
        album.put(2,"Second Track");
        album.put(3,"Third Track");
        album.put(4,"Fourth Track");

        System.out.println(album.get(1));

        getTracks();
    }
}