var na = '武野純大';
console.log(na);

var firstName = 'Atsuhiro';
var lastName = 'Takeno';
console.log(firstName+" "+lastName);

let syo1 = 200*3;
let syo2 = 250*4;
let num1 = syo1 + syo2;
let num2 = num1 * 0.1;
let num3 = num1 + num2;
var en = '円';
console.log('小計');
console.log(num1+en);
console.log('消費税');
console.log(num2+en);
console.log('合計金額');
console.log(num3+en);

let testScore = -1;
if(testScore >= 0 && testScore < 80){
    console.log('追試です');
}else if(testScore >= 80 && testScore < 101){
    console.log('合格です');
}else{
    console.log('存在しない点数です');
}

let taso = 0;
for(let i = 1; i <=100; i++){
    taso += i;
}
console.log(taso);

let add = function(x,y){
    return x+y
}
console.log('5 + 3 = '+add(5,3));
let sub = function(x,y){
    return x-y
}
console.log('5 - 3 = '+sub(5,3));

let multi = function(x,y){
    return x*y
}
console.log('5 * 3 = '+multi(5,3));

let div = function(x,y){
    return x/y
}
console.log('5 / 3 = '+div(5,3));
