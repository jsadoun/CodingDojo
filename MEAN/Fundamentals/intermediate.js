// part 1
function starString(num) {
    let star = "";
    for (i = 0; i < num; i++) {
        star += "*";
    }
    return star
}

console.log(starString(8));



// part 2
let x = [4, 6, 1, 3, 5, 7, 25]

function drawStars(arr) {
    for (let i = 0; i < arr.length; i++) {
        let star = "";
        for (let j = 0; j < arr[i]; j++) {
            star += "*";
        }
        console.log(star);
    }
}
drawStars(x);



// part 3
let x = [4, "Tom", 1, "Michael", 5, 7, "Jimmy Smith"]

function drawStars(arr) {
    for (let i = 0; i < arr.length; i++) {
        let star = "";
        for (let j = 0; j < arr[i]; j++) {
            star += "*";
        }
        console.log(star);
    }
}
drawStars(x);