/* let element = document.getElementById('demo')
console.log(element);
console.log(element.textContent);
element.textContent = 'bye bye world';
console.log('==========================================');
let buttonElement = document.createElement('button');
buttonElement.textContent = 'lick me'
console.log('Element',buttonElement);

document.body.appendChild(buttonElement);
let ulElement = document.createElement('ul');
let li1Element = document.createElement('li');
let li2Element = document.createElement('li');
let li3Element = document.createElement('li');

li1Element.textContent = 'JAVA';
li2Element.textContent = 'SQL';
li3Element.textContent = ' javaScript';

ulElement.appendChild(li1Element);
ulElement.appendChild(li2Element);
ulElement.appendChild(li3Element);
document.body.appendChild(ulElement);

element.style.color = "red";
element.style.fontSize = '50px';

console.log('===============================');
function showMessage(){
    alert('hello welcome')
} */
function showMessage(){
    alert('hello world')
}
function changeColor(){
    let pElement = document.getElementById('mover');
    pElement.style.color = 'red';
}
function removeColor(){
    let a = document.getElementById('mover');
    a.style.color = 'black';
}
 function printHello(){
     console.log('hello');
    let userName = document.getElementById('username').value
    document.getElementById('Showusername').textContent = userName;
 }
 let name = 'anwar'
 let age = 22
 let phoneNo = 7681082301
 console.log('Name is'+name+'Age is'+age+ 'phone no is'+phoneNo);
 console.log(`Name is ${name} Age is ${age} phone no is ${phoneNo}`);
 console.log(`2 + 2 = ${2+2}`);
 document.getElementById('b1').disabled = false;