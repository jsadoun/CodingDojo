// 1 -- checks array for negative #'s
function zero_negativity(arr){
    for(i = 0; i < arr.length; i++){
        if (arr[i] < 0){   //checks array for no negative #'s
            return true; 
        }
    } 
    return false; //checks array for negative #'s
}

// 2 -- checks array for odds/evens
function is_even(arr){
    for(i = 0; i < arr.length; i++){
        if (arr[i] % 2 == 0){   //checks if number is divisible by 2 (aka even)
            return true; 
        }
    }
    return false; //checks if number is not divisible by 2 (aka odd)
}

// 3 -- counts how many elements in array are even
function how_many_even(arr){
    count = 0;
    for(i = 0; i < arr.length; i++){
        if (arr[i] % 2 == 0){
            count ++;
        }
    }
    return count;
}

// 4 -- generate random number Array
function create_dummy_array(n){

}

// 5 -- returns a random element from the array based on its length
function random_choice(){
    
}


