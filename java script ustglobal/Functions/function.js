
(function(num1,num2)
{
    console.log('VAlue = ', num1*num2)
})(10,20)
function add(num1,num2)
{
    console.log('Sum ' ,num1+num2);
}
add(10,20);
function add(num1,num2,num3)
{
    console.log('Sum ' ,num1+num2+num3);
}
add(10,20,30)
var sub = function(n1,n2)
{
    var subValue = n1-n2;
    return subValue;
}
var value = sub(20,10)
console.log('subs ', value);
console.log('hello');

console.log("==================================================")

// fat arrow

console.log("==================================================")
var div = (num1,num2)=>{
    console.log('value= ' ,num1/num2)
}
div(10,5)
console.log("==================================================")
var div1 = num1 => {
    console.log('Value = ', num1);
}
div1(10)
console.log("==================================================")
var div2 = num2 => console.log(num2);
div2(20)

console.log("==================================================")
greeting('anwar')
function greeting(msg)
{
    console.log('Hello ',msg);
}
greet('dinga');
var greet = function(msg)
{
    console.log('hello', msg)
}
 greets('dingi');
 var greets = (msg) => {
     console.log('hi',msg);
 }