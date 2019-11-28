var brands = ['kingfisher','signature','royal stag','vat69'];
for(var element of brands){
    console.log('value= ',element); // for of loop
}

console.log('=======================================')

for(var index in brands)
{
    console.log('Brand', brands[index]); // for in loop
    break;
}

console.log('========================================')

var persons = {
    name : 'sunny leone',
    age : 33,
    color : 'white'
}
for(var key in persons){
     console.log('value = ', persons[key])
}
console.log('============================');
// for-Each method of array
var movies = ['sholay','titanic','hera pheri','sahoo']
movies.forEach(function(value,index){
console.log('Movies = ', value);
});
console.log('===================================');
//objects inside array 
var items=[{
    item : 'bangles',
    id : 1,
    price : 500
},
{
    item : 'bags',
    id : 2,
    price : 1000
},
{
    item : 'watches',
    id : 3,
    price : 5000
},
{
    item : 'bike',
    id : 4,
    price : 1000000
}]
items.forEach(function(value,index){
    console.log('Items = ',value);
    console.log('Index of item = ',index)
})

 var number = [10,20,,30,40,]
 for (var i= 0; i<number.length; i++)
 {
     console.log(number[i])
     number[2]=90;
 }
 console.log('============================')
 for(var i in number)
 {
     console.log(number[i])
 }
 for(var t of number)
 {
     console.log(number[i])
 }