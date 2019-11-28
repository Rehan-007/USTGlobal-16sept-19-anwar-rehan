// promise
 const message = new Promise(function(resolve,reject){
    if(20>10){
        resolve('success')
     }else{
          reject('try again');
     }
 })
 message.then(function(msg){
     console.log(msg);
 }).catch(function(error){
     console.log(error);
 });

 //
 const employee = new Promise(function(resolve,reject){
    if(20>10){
        resolve([
            {
                name : 'billgates',
                age : 90
            },{
                name : 'rehan',
                age : 40
            },{
                name : 'poreie',
                age : 69
            }
        ]);
     }else{
          reject('try again');
     }
 })
 employee.then(function(data){
     console.log(data);
 }).catch(function(error){
     console.log(error);
 });

 // closures

 function outerFunction(counter){
     function innerFunction(){
         let count;
         count = counter + 10;
         return count;
     }
     return innerFunction;
 }
 let innerFunc = outerFunction(10);
 let counter  = innerFunc();
 console.log('counter value = ',counter);