function Ninja(name) {
    var speed = 3;
    var strength = 3;

    this.name = name;
    this.health = 100;

    this.greet = function () {
        this.sayName();
        this.showStats();
    }
    this.sayName = function () {
        console.log("My name is, " + this.name + "!");
    }

    this.showStats = function () {
        console.log("My stats are: strength is " + strength + ", speed " + speed + ", and health is " + this.health + ".");
    }

    this.drinkSake = function () {
        console.log("I sip on Sake and gain 10 health!");
        this.health += 10;
        return this.health;
    }

    this.punch = function (Ninja) {
        console.log("i Punch!");
        Ninja.health -= 5;
        return Ninja.health;
    }

    this.kick = function (Ninja) {
        console.log("i kick you");
        Ninja.health -= (15*strength);
        return Ninja.health;
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
