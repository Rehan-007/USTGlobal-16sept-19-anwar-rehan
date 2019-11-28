console.log('Window object', window);
console.log('This keword',this);
console.log(this === window);



/* confirm('are you above 18');
let confirmDelete = confirm('are you homosexual?');
console.log('Confirm delete',confirmDelete); */

const person = { 
    firstName : 'alia',
    age : 33,
    lastName : 'kapoor',
    getName : function(){
        return this.firstName + ' ' + this.lastName
    }
}
let fullName = person.getName()
console.log('Full Name = ', fullName);  