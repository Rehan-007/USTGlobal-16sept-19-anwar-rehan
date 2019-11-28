const item = [{
    name : 'ear ring',
    id : 1,
    price: 5000
},{
    name : 'kajal',
    id : 2,
    price : 1000
},{
    name : 'trimmer',
    id : 3,
    price : 3000
},{
    name : 'beardo',
    id: 4,
    price : 170
},{
    name : 'phone',
    id : 5,
    price : 100000
},{
    name : 'snickers',
    id : 6,
    price : 4000
},{
    name : 't-shirts',
    id : 7,
    price : 1000
},{
    name : 'bags',
    id : 8,
    price : 3000
}]
const items = item.map(function(item,index){
 item.price = item.price + 300;
 return item;
})
console.log('Items  =  ',items);

// fat arrow
const ite = item.map(value => value.price+300);
console.log(ite);
// after updating
for (let i of item){
    console.log(i.name);
    console.log(i.id);
    console.log(i.price);
}

// filter method
/* const it = item.filter(function(val){
    if(val.price > 1000)
    return true;
    else 
    return false;
}) */
const it = item.filter((val)=>val.price>1000)
console.log(it);

// fat arrow
