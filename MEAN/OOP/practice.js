// const MyObjConstructor = function(name) {
//   const myPrivateVar = "Hello"; // just to show that it is hard to see this private var easily
//   this.name = name; // but you can see the name!
//   this.method = function() {
//     console.log( "I am a method");
//   };
// }
// const obj1 = new MyObjConstructor('object1');
// const obj2 = new MyObjConstructor('object2');
// console.log(obj1);


console.log("*********");


// class Dot {
//   constructor(x, y) {
//       this.x = x;
//       this.y = y;
//       console.log("You created a Dot!");
//   }
// }
// let dot1 = new Dot(10, 10);



console.log("*********");


// // Old ES5 way
// function Dot(x, y) {
//   this.x = x;
//   this.y = y;
// }
// Dot.prototype.showLocation = function() {
//   console.log("This Dot is at x " + this.x + " and y " + this.y);
// }
// const dot1 = new Dot(55, 20);
// dot1.showLocation();

// New ES6 way
class Dot {
  constructor(x, y) {
      this.x = x;
      this.y = y;
  }
  showLocation() {
      // ES6 String Interpolation!
      console.log(`This Dot is at x ${this.x} and y ${this.y}`);
  }
}

const dot2 = new Dot(5, 13);
dot2.showLocation();

