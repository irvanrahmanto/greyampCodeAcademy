// Number 1
function isLoop(n){
    for(let i=1; i<n; i++){
        if((i%3==0) && (i%5==0)){
            console.log("FizzBuzz");
        }else if(i % 3 ==0){
            console.log("Fizz");
        }else if(i%5==0){
            console.log("Buzz")
        }
        console.log(i);
    }
}

isLoop(20);

// let isLoop = (n) => {
//     for(let i=1; i<n; i++){
//         if((i%3==0) && (i%5==0)){
//             console.log("FizzBuzz");
//         }else if(i % 3 ==0){
//             console.log("Fizz");
//         }else if(i%5==0){
//             console.log("Buzz")
//         }
//         console.log(i);
//     }
// }
// isLoop(20);
