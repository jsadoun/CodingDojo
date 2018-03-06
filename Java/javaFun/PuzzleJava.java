import java.util.ArrayList;
import java.lang.Math;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;


public class PuzzleJava {
    public static void main(String[] args) {
        PuzzleJava.sumArr(new int[]{3,5,1,2,7,9,8,13,25,32});
        PuzzleJava.nameGame(new String[]{"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"});
        PuzzleJava.alphabet(new String[]{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"});
        PuzzleJava.randyNum();
        PuzzleJava.randyStr(new String[]{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"});
    }

    public static ArrayList<Integer> printArr(int[] arr){
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        for(int i=0; i<arr.length;i++){
            newArr.add(arr[i]);
        }
        Collections.sort(newArr);
        return newArr;
    }

    public static ArrayList<String> printArr(String[] arr){
        ArrayList<String> newArr = new ArrayList<String>();
        for(int i=0; i<arr.length;i++){
            newArr.add(arr[i]);
        }
        Collections.sort(newArr);
        return newArr;
    }


    public static void sumArr(int[] arr) {
        ArrayList<Integer> greaterThanTen = new ArrayList<Integer>();

        int sum = 0;
        for(int nums: arr){
            if(nums > 10){
            greaterThanTen.add(nums);
            }
            sum += nums;
        }
        System.out.println(sum);
        System.out.println(greaterThanTen);
        
    }

    public static void nameGame(String[] arr){

        Random rand = new Random();
        String temp = arr[0];
        for(int i = 0; i<arr.length;i++){
            int value = rand.nextInt(5);
            temp = arr[i];
            arr[i] = arr[value];
            arr[value] = temp;
        }
        ArrayList<String> longerThanFive = new ArrayList<String>();
        for(int j = 0; j<arr.length;j++){
            System.out.println(arr[j]);
            String word = arr[j];
            if (word.length() > 5){
                longerThanFive.add(word);
            }
        }
        System.out.println(longerThanFive);

    }

    public static void alphabet(String[] arr){
        Random rand = new Random();
        String temp = arr[0];
        for(int i = 0; i<arr.length;i++){
            int value = rand.nextInt(arr.length);
            temp = arr[i];
            arr[i] = arr[value];
            arr[value] = temp;
        }
        
        if(arr[0] == "a"||arr[0] == "e"||arr[0] == "i"||arr[0] == "o"||arr[0] == "u"){
            System.out.println("THERE IS A VOWEL");
        }
        if(arr[25] == "a"||arr[25] == "e"||arr[25] == "i"||arr[25] == "o"||arr[25] == "u"){
            System.out.println("THERE IS A VOWEL");
        }
        System.out.println(arr[0]);
        System.out.println(arr[25]);
    }

    public static void randyNum(){
        int[] myArry;
        myArry = new int[10];
        Random rand = new Random();

        for(int i = 0; i<10;i++){
            int randomNum = ThreadLocalRandom.current().nextInt(55, 101);
            myArry[i] = randomNum;
        }
        System.out.println(PuzzleJava.printArr(myArry));
        System.out.println(myArry[0]);
        System.out.println(myArry[9]);
    }

    public static void randyStr(String[] arr){
        ArrayList<String> fiveByTen = new ArrayList<String>();
        Random rand = new Random();
        String strOutput = "";
        int j=0;
        while(j < 10){
            for(int i = 0; i < 5;i++){
                int value = rand.nextInt(arr.length);
                strOutput += arr[value];
            }
            fiveByTen.add(strOutput);
            strOutput = "";
            j++;
        }
        System.out.println(fiveByTen);
    }

}