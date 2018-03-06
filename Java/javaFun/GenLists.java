import java.util.ArrayList;

public class GenLists{
    ArrayList<Object> myList = new ArrayList<Object>();

    public static void getItem(){
        for(HashMap.Entry<Integer,String>tracks:myList.entrySet()){
            System.out.println("Track: "+tracks.getKey()+" : "+tracks.getValue());
        }
    }

    public static void main(String[] args){
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");
}