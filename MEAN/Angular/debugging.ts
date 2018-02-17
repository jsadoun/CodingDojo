//1. Setting Types
var myString: string;// I can assign myString like this:
myString = "Bee stinger";
myString = 9;// Why is there a problem with this? What can I do to fix this?

//Edited
var myString: string;
myString = "Bee stinger";
myString = String(9);

//Comments: setting the integer 9 as the value for 'myString' won't work because we previously stated that the variable was assigned to be a string (not an integer).

//~~~~~~~~~~~~

//2. Setting the types for function parameters
function sayHello(name: string){
    return `Hello, ${name}!`;
 }
 console.log(sayHello("Kermit")); // This is working great
 console.log(sayHello(9)); // Why isn't this working? I want it to return "Hello, 9!"
 
//Edited
function sayHello(name: string){
    return `Hello, ${name}!`;
 }
 console.log(sayHello("Kermit"));
 console.log(sayHello("9")); 

//Comments: if we wrap the number 9 in "" we get a legit string

//~~~~~~~~~~~~

//3. Optional parameters
function fullName(firstName: string, lastName: string, middleName: string){
    let fullName = `${firstName} ${middleName} ${lastName}`;
    return fullName;
 }
 console.log(fullName("Mary", "Moore", "Tyler"));  // This works
 console.log(fullName("Jimbo", "Jones")); // What do I do if someone doesn't have a middlename?

 //Edit 1
function fullName(firstName?: string, lastName?: string, middleName?: string){
    let fullName = `${firstName} ${middleName} ${lastName}`;
    return fullName;
 }
 console.log(fullName("Mary", "Moore", "Tyler"));
 console.log(fullName("Jimbo", "Jones"));
//  Comments: by adding ?'s to the end of each paramater, we are making that paramater optional, and the console.log will return 'undefined' for the missing input

//Edit 2
function fullName(firstName: string, lastName: string, middleName?: string){
    var fullName = ""
    if (middleName == undefined){
        fullName = `${firstName} ${lastName}`;
    }
    else{
        fullName = `${firstName} ${middleName} ${lastName}`;
    }
    return fullName;
}
console.log(fullName("Mary", "Moore", "Tyler"));
console.log(fullName("Jimbo", "Jones"));
//Comments: by adding ?'s to the end of the paramater, we are making the paramater optional. meaning -- instead of returning 'undefined', the console.log will simply ommit the paramaters missing input

//~~~~~~~~~~~~

//4. Interfaces and function parameters
interface Student {
    firstName: string;
    lastName: string;
    belts: number;
}
function graduate(ninja: Student){
    return `Congratulations, ${ninja.firstName} ${ninja.lastName}, you earned ${ninja.belts} belts!`;
}
const christine = {
    firstName: "Christine",
    lastName: "Yang",
    belts: 2
}
const jay = {
    firstName: "Jay",
    lastName: "Patel",
    belt: 4
}
console.log(graduate(christine)); // This seems to work fine:
console.log(graduate(jay)); // This one has problems:

//Edited
interface Student {
    firstName: string;
    lastName: string;
    belts: number;
}
function graduate(ninja: Student){
    return `Congratulations, ${ninja.firstName} ${ninja.lastName}, you earned ${ninja.belts} belts!`;
}
const christine = {
    firstName: "Christine",
    lastName: "Yang",
    belts: 2
}
const jay = {
    firstName: "Jay",
    lastName: "Patel",
    belts: 4
}
console.log(graduate(christine));
console.log(graduate(jay));

//Comments: dingus made a typo.. Correction: (Jay's) belt => belts

//~~~~~~~~~~~~

//5. Classes and function parameters
class Ninja {
    fullName: string;
    constructor(
       public firstName: string,
       public lastName: string){
          this.fullName = `${firstName} ${lastName}`;
       }
    debug(){
       console.log("Console.log() is my friend.")
    }
}
const shane = Ninja();// This is not making an instance of Ninja, for some reason:
const turing = { // Since I'm having trouble making an instance of Ninja, I decided to do this:
    fullName: "Alan Turing",
    firstName: "Alan",
    lastName: "Turing"
}
// Now I'll make a study function, which is a lot like our graduate function from above:
function study(programmer: Ninja){
    return `Ready to whiteboard an algorithm, ${programmer.fullName}?`
}
console.log(study(turing));// Now this has problems:

//Edit
class Ninja {
    fullName: string;
    constructor(
       public firstName: string,
       public lastName: string){
          this.fullName = `${firstName} ${lastName}`;
    }
}
const shane = Ninja
const turing = {
    fullName: "Alan Turing",
    firstName: "Alan",
    lastName: "Turing"
}
function study(programmer: Ninja){
    return `Ready to whiteboard an algorithm, ${programmer.fullName}?`
}
console.log(study(turing));

//Comments: 
//1st problem -- Ninja is a class, not a method.  You don't need to add paramaters to the Ninja class because its not a method, and already has atributes set.
//2nd problem -- the debug(console.log) in the Ninja class causes an issue with compiling (perhaps because we didnt import the debug method??)

//~~~~~~~~~~~~

//6. Arrow functions
var increment = x => x + 1;
console.log(increment(3)); // This works great

var square = x => {x * x};
console.log(square(4)); // This is not showing me what I want

var multiply = x,y => x * y; // This is not working

var math = (x, y) => let sum = x + y; // Nor is this working
   let product = x * y;
   let difference = Math.abs(x-y);
   return [sum, product, difference];

//Edited
var increment = x => x + 1;
console.log(increment(3));

var square = x => x * x;
console.log(square(4)); 

var multiply = (x, y) => x * y;
console.log(multiply(1, 2));

var math = (x, y) => {
    let sum = x + y;
    let product = x * y;
    let difference = Math.abs(x - y);
    return [sum, product, difference];
}
console.log(math(1, 2));

//Comments: 
//(increment) -- no issue.
//(square)    -- had to remove the brackets (its not an object)
//(multiply)  -- needed to add () to add the x,y paramaters & tested w console.log
//(math)      -- needed to add {} around the product/difference to make it function properly

//~~~~~~~~~~~~

//7. Arrow functions and 'this'
class Elephant { 
    constructor(public age: number){}
    birthday = function(){
       this.age++;
    }
 }
 const babar = new Elephant(8);
 setTimeout(babar.birthday, 1000)
 setTimeout(function(){
    console.log(`Babar's age is ${babar.age}.`)
    }, 2000)
 // Why didn't babar's age change? Fix this by using an arrow function in the Elephant class.

//Edited
class Elephant {
    constructor(public age: number){}
    birthday = (age)=>{
       this.age++;
    }
}
const babar = new Elephant(8);
setTimeout(babar.birthday, 1000)
setTimeout(function(){
    console.log(`Babar's age is ${babar.age}.`)
    }, 2000)

//Comments: needed to add "age" in the paramater for the function & remove the word function because we are adding the => version


 

 






 
