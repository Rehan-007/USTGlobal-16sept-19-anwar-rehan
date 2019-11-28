const laptop = ['asus','apple','hp','mac'];
console.log(Array.isArray(laptop));
console.log(laptop.includes('hp',1));
console.log(laptop.push('acer','sony'));
console.log(laptop.pop());
console.log(laptop.shift());
console.log(laptop.unshift('pro'));

laptop1 =  ['asus','apple','hp','mac','vaio'];
laptop1.splice(1,2,'acer','sony');
console.log(laptop1);
let afterSlice = laptop1.slice(1,2);
console.log(afterSlice);
console.log(laptop1.join('_'));
console.log(laptop1.indexOf('mac'));
// 2nd array
const mobile = ['mi','one plus','apple','honor'];
console.log(Array.isArray(mobile));
console.log(mobile.includes('nokia',1));
console.log(mobile.push('samsung','moto'));
console.log(mobile.pop());
console.log(mobile.shift());
console.log(mobile.unshift('rog'));

mobile1 = ['mi','one plus','apple','honor','nokia'];
mobile1.splice(1,2,'intex','sony');
console.log(mobile1);
let afteSlice = mobile1.slice(1,2);
console.log(afterSlice);
console.log(mobile1.join('_'));
console.log(mobile1.indexOf('nok'));
// 3rd array
const company = ['jack','levies','adidas','puma'];
console.log(Array.isArray(company));
console.log(company.includes('adidas',1));
console.log(company.push('nike','gap'));
console.log(company.pop());
console.log(company.shift());
console.log(company.unshift('gas'));

const company1 =  ['jack','levis','adidas','puma','gas'];
company1.splice(1,2,'gas','gap');
console.log(company1);
let aSlice = mobile1.slice(1,2);
console.log(aSlice);
console.log(mobile1.join('_'));
console.log(mobile1.indexOf('puma'));
 
// 4th array
const sub = ['html','css','js','bootstrap'];

console.log(Array.isArray(sub));
console.log(sub.includes('js',1));
console.log(sub.push('angular','sql'));
console.log(sub.pop());
console.log(sub.shift());
console.log(sub.unshift('sql'));

const sub1 = ['html','css','js','bootstrap','sql'];
sub1.splice(1,2,'java','j2ee');
console.log(sub1);
let bSlice = sub1.slice(1,2);
console.log(bSlice);
console.log(sub1.join('_'));
console.log(sub1.indexOf('java'));

// 5th array
const tv = ['mi','samsung','onida','lg'];
console.log(Array.isArray(tv));
console.log(tv.includes('mi',1));
console.log(tv.push('one plus','sql'));
console.log(tv.pop());
console.log(tv.shift());
console.log(tv.unshift('onida'));
 
const tv1 = ['mi','samsung','onida','lg','apple'];
tv1.splice(1,2,'philips','asus');
console.log(tv1);
let cSlice = tv1.slice(1,2);
console.log(cSlice);
console.log(tv1.join('_'));
console.log(tv1.indexOf('onida'));
  
//6th array
const cars = ['bmw','lambo','ferari','bently'];
console.log(Array.isArray(cars));
console.log(cars.includes('ferari',1));
console.log(cars.push('aston','galerado'));
console.log(cars.pop());
console.log(cars.shift());
console.log(cars.unshift('dc avanti'));

 const cars1 =  ['bmw','lambo','ferari','bently','jaguar'];
 cars1.splice(1,2,'aventador','tata');
console.log(cars1);
let dSlice = cars1.slice(1,2);
console.log(dSlice);
console.log(cars1.join('_'));
console.log(cars1.indexOf('bently'));
 
// 7th array
const bikes = ['hayabhusa','ninja','h2r','gixxer'];
console.log(Array.isArray(bikes));
console.log(bikes.includes('ducati',1));
console.log(bikes.push('aston','galerado'));
console.log(bikes.pop());
console.log(bikes.shift());
console.log(bikes.unshift('panigale'));
 
const bike1 = ['hayabhusa','ninja','h2r','gixxer','rtr'];
bike1.splice(1,2,'suzuki','triump');
console.log(bike1);
let eSlice = bike1.slice(1,2);
console.log(eSlice);
console.log(bike1.join('_'));
console.log(bike1.indexOf('triump'));