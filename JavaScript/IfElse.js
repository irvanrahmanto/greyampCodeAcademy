// let age = 6;
// const sal = 5000;

// if(age > 21){
//     console.log("I can Drive!");
// }else if(age> 25){
//     console.log("I can Drive with caution!");
// }else{
//     console.log("I can't drive!");
// }

// let canIDrive = (age>21 && age>85) ? "I can Drive" : age>85 ? "I can Drive with caution!" : "i can't drive!";
// console.log(canIDrive);

// Create a function that take two numbers and find the minimum  of it


function isMinimum(num1, num2){
    if(num1 > num2){
        console.log(`Num1 with value is ${num1}, is the greater than num2 with the value of ${num2}`);
    }else{
        console.log(`Num2 with value is ${num2}, is the greater than num1 with the value of ${num1}`)
    }
}

isMinimum(25,100);

// console.log();
// Number 2
// Write a function pow(x,n) that returns x in power n. Or, in other words, multiplies x by itself n times and returns the result.

function isPow(x,n){
    let result = 1;
	
	for(var i=1; i<=n; i++) {
		result = result * x;
	}
	return result;
}

console.log(isPow(5,2));
// isPow(2,3);




