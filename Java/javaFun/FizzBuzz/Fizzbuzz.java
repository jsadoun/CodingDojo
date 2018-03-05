
public class Fizzbuzz{
    public String fizzBuzz(Integer num) {
        if( num%3 == 0){
            if( num%5 == 0){
                return "Fizzbuzz";
            } else {
                return "Fizz";
            }
        }; if (num%5 == 0){
            return "Buzz";
        } else { 
            return String.valueOf(num); 
        }
    }
}