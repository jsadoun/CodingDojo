class Ninja {
    constructor(name) {
        this.speed = 3;
        this.strength = 3;
        this.name = name;
        this.health = 100;
    }
    greet() {
        this.sayName();
        this.showStats();
    }
    sayName() {
        console.log("My name is, " + this.name + "!");
    }

    showStats() {
        console.log("My stats are: strength of " + this.strength + ", speed is " + this.speed + ", and health is " + this.health + ".");
    }

    drinkSake() {
        console.log("I sip on Sake and gain 10 health!");
        this.health += 10;
        return this.health;
    }

    punch(Ninja) {
        console.log("i Punch!");
        Ninja.health -= 5;
        return Ninja.health;
    }

    kick(Ninja) {
        console.log("i kick you");
        Ninja.health -= (15 * this.strength);
        return Ninja.health;
    }
}

class Sensai extends Ninja {
    constructor(name) {
        super(name);
        this.speed = 10;
        this.strength = 10;
        this.health = 200;
        this.wisdom=10;
    }
    speakWisdom (){
        this.drinkSake();
        console.log("BUUUUUUUUTTTTTHOLIIIIOOO!!")
    }

}

const dude = new Ninja("Ed");
dude.greet();
dude.drinkSake();
dude.showStats();

console.log("******************")

const aakash = new Ninja("Sprinkles");
aakash.greet();
aakash.drinkSake();
aakash.showStats();

console.log("******FIGHT*******")

console.log(aakash.name + ":");
aakash.punch(dude);
aakash.punch(dude);
aakash.punch(dude);
console.log(dude.name + ": Ouch! My health is " + dude.health + "! :(")
dude.kick(aakash);
console.log(aakash.name + ": Ouch! My health is " + aakash.health + "! :(")

console.log("******************")
console.log("******************")

const super_dude = new Sensai("Yoda");
super_dude.greet();
super_dude.speakWisdom();
super_dude.showStats();
