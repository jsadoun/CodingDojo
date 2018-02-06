// Basic 1: 
    var x = [];
    x.push('coding', 'dojo', 'rocks');
    x.pop();
    console.log(x);

console.log(); 

// Basic 2
    const y = [];
    y.push(88);
    console.log(y);

    console.log();

// Basic 3
    let z = [9,10,6,5,-1,20,13,2];
    for(let i = 0; i < z.length -1; i++){
        console.log(z[i]);
    }

    console.log();

// Basic 4
    let names = ['Kadie', 'Joe', 'Fritz', 'Pierre', 'Alphonso'];
    for(let i = 0; i < names.length; i++){
        console.log(names[i]);
    }

console.log()
    var namesoffive = [];
    for(let i = 0; i < names.length; i++){
        if(names[i].length == 5){
        console.log(names[i]);
    }
}

console.log()

// Basic 5
function yell(str){
    console.log(str.toUpperCase());
}
    yell("world");

