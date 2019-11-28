const person = {
    name : 'rehan',
    age : 22,
    color : 'black',
    address : {
        city : 'mirzapur',
        state : 'up',
        pincode : 591115
    },
    hobbies : ['coding', 'cricket','singing','bike riding']
}
console.log('original object', person);
let jsonObject = JSON.stringify(person);
console.log('JASON object = ',jsonObject);
let jsObject = JSON.parse(jsonObject);
console.log('JS object',jsObject);

localStorage.setItem('email','rehananwar.cruze@gmail.com');
const emailId = localStorage.getItem('email');
console.log('my email is',emailId);
localStorage.clear();

