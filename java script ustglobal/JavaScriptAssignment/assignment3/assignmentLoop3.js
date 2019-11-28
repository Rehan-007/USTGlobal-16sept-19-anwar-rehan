// 6 loop
var months = ['jan','feb','march','april','may'];
// for loop
for(var i=0; i<months.length;i++){
    console.log('Months = ',months[i]);
}
// for in loop
for( var index in months){
    console.log('Months = ',months[index]);
    break;
}
var birthMonth = {
    name : 'Rehan',
    birthMonth : '28/11'
}
for(var index in birthMonth){
    console.log('Birth = ',birthMonth[index]);
}
// for of loop
for(var rle of months){
    console.log('Months = ',rle);
    break;
}
// for-each method
months.forEach(function(val,index){
    console.log('Months = ',val);
})

console.log('========================================');
// 7th array
var dj = ['marshmello','alen walker','martin garix','david guetta'];
// for loop
for(var i=0 ;i< dj.length;i++){
    console.log('DJS = ',dj[i]);
    break;
}
// for in loop
for(var index in dj){
    console.log('DJS = ',dj[index]);
    break;
}
var items = {
    name : 'mia kalifa',
    age : 69,
    color : 'white'
}
for(var index in items){
    console.log('Items = ',items[index]);
}
//  for of loop
for(var rle of dj){
    console.log('DJS = ',rle);
    break;
}
// for-each loop
dj.forEach(function(val,index){
    console.log('DJS = ',val);
})