const hobbies = ['sleep','eat','cricket','coding','roaming'];
console.log(typeof hobbies);
console.log(Array.isArray(hobbies)); //returns boolean value
console.log(hobbies.includes('cricket')); //returns boolean value
console.log(hobbies.push('volley','badminton'));
console.log(hobbies);
console.log(hobbies.pop());
console.log('array after pop ooeration = ',hobbies);
console.log(hobbies.unshift('numismatics','sing')); // to add array element in 1st index
console.log(hobbies);
console.log(hobbies.shift());// to remove array elements from 1st index
console.log('array after shift operation ',hobbies);

const hobbies1 = ['sleeping','cricket','eating','coding','roaming'];
hobbies1.splice(1,2,'bird watching','PUBG');
console.log('after splice method ',hobbies1);
const afterSlice = hobbies1.slice(2,4);
console.log('array after slice operaion', hobbies1);
console.log('array after slice operaion', afterSlice);

console.log(hobbies1.indexOf('coding'));
afterJoin = hobbies1.join('_');
console.log('after join operation = ',hobbies1);
console.log('after join operation ', afterJoin);

console.log('===========================================');
// map method
const numbers = [100,200,300,400];
 const num1=numbers.map(function(val,index){
    val = val + 50
    return val;
})
console.log(num1);
// fat arrow function
const num2 = numbers.map(value => value+50)
console.log(num2);
// filter function
const num3 = numbers.filter(function(val){
    if( val>200)
    return true;
    else 
    return false;
})
console.log(num3);
// fat arrow function
const num4 = numbers.filter(val => val>200)
console.log(num4);
// assignment
