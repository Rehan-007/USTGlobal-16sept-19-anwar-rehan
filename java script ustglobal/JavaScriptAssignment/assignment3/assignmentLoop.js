var cinemas = ['bollywood','tollywood','hollywood','ollywood']
for (var i = 0; i<cinemas.length; i++) // for loop
{
    console.log('Cinemas = ',cinemas[i]);
    break;
} 
// for in loop
console.log('==========================');
for (var index in cinemas)
{
    console.log('Cinemas = ', cinemas[index]);
    break;
}
console.log('======================================')
var beer = {
    name : 'bira',
    price : 130,
    nisha : 'light'
}
for( var index in beer){
    console.log('Beer = ', beer[index]);
}
// for off loop
console.log('=============================');
for( var ele of cinemas){
    console.log('Cine = ', ele);
}
// for-each method of array
console.log('==============================');
cinemas.forEach(function(val,index){
    console.log('CC = ', val);
})

// second array
var whiskey = ['royal stag','signature','vat69','barrel']
// for loop
for (var i=0; i<whiskey.length ; i++){
    console.log('Whiskey = ',whiskey[i]);
}
console.log('=================================');
// for in loop
for(var index in whiskey)
{
    console.log('value = ',whiskey[index]);
    break;
}
console.log('=================================');
// object
var wName = {
    name : 'signature',
    price : 890
}
for (var index in wName)
{
    console.log(wName[index]);
}
console.log('===================================');
// for of loop
for ( var element of whiskey)
{
    console.log(element);
}
// for each method
whiskey.forEach(function(value,index){
    console.log('Whiskey = ',value); 
    console.log('Index = ',index);
})
// third array
var phones = ['onePlus','apple','mi','honor']
// for loop
for(var j=0; j< phones.length;j++){
    console.log('Phones = ',phones[j]);
}
console.log('============================================')
// for in loop
for(var index in phones){
    console.log('pp = ',phones[index]);
    break;
}
var phone = {
    name : 'mi',
    price : 133005,
    color : 'silver'
}
for (var index in phone){
    console.log('Phone = ',phone[index]);
    break;
}
console.log('=========================================');
// for of loop
for( var element of phones){
    console.log('mobile = ',element);
    break;
}
// for-each method
console.log('==============================================');
phones.forEach(function(value,index){
    console.log('Mobile = ',value)
})
// fourth array
var cars = ['bmw','chiron','veron','ferari'];
// for loop
for( var i=0; i<cars.length; i++){
     console.log('Car = ', cars[i]);
}
// for in loop
console.log('==============================');
for ( var index in cars){
    console.log('Cars = ',cars[index]);
    break;
}
var carD = {
    name : 'duster',
    price : 1234567,
    color : 'black'
}
for (var index in carD){
    console.log('CAr = ', carD[index]);
}
console.log('=====================================');
// for of loop
for( var ele of cars){
    console.log('CARS = ',ele);
    break;
}
cars.forEach(function(val,index){
    console.log('CARS = ', val);
})

console.log('======================================');
// fifth array
var notes = ['js','html','css','bootstrap'];
for (var i = 0; i< notes.length ; i++){
    console.log('Notes = ', notes[i]);
}
// for in loop
for(var index in notes){
    console.log('Notes = ',notes[index]);
    break;
}
// for in loop
var prblm = {
    name : 'dipression',
    time : '13 years'
}
for(var index in prblm){
    console.log('Problem = ',prblm[index]);
}
// for of loop
for(var rle of notes){
      console.log('Notes = ',rle);
}
// for-each method
notes.forEach(function(val,index){
    console.log('Notes = ',val)
})