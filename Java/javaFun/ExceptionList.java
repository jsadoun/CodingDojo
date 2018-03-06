import java.util.ArrayList;
import java.lang.RuntimeException;

public class ExceptionList{
    // 1st portion:
    // static ArrayList<Object> myList = new ArrayList<>();

    // 2nd portion:
    // Only allow strings to be added to list.
    static ArrayList<String> myList = new ArrayList<>();

    public static void main(String[] args){
        myList.add("13");
        myList.add("Hello World");
        myList.add(48);
        myList.add("Goodbye World");

        // 1st Portion:
        //for(int i=0;i<myList.size();i++){
            // try{
            //     int castVar = (Integer) myList.get(i);
            // }catch(RuntimeException e){
            //     System.out.println("ERROR ON INDEX: "+myList.get(i));
            // }
        //}
    }
}