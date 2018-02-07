function Ninja(name) {
    var speed = 3;
    var strength = 3;

    this.name = name;
    var health = 100;

    this.greet = function () {
        this.sayName();
        this.showStats();
    }
    this.sayName = function () {
        console.log("My name is, " + this.name + "!");
    }

    this.showStats = function () {
        console.log("My stats are: strength is " + strength + ", speed " + speed + ", and health is " + health + ".");
    }

    this.drinkSake = function () {
        console.log("I sip on Sake and gain 10 health!");
        health += 10;
        return health;
    }
}

const dude = new Ninja("Ed");
dude.greet();
dude.drinkSake();
dude.showStats();