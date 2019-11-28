// named function
function prime(n)
{
    var count = 1, i = 1;
   while(i<=n/2)
    {
        if(n%i === 0)
        count++;
        if(count > 2)
        break;
        i++
    }
    if(count === 2)
    console.log(n,'number is prime number');
    else
    console.log(n,'number is not prime number');
} 
prime(7)
// expression function
var prim = function prime(n)
{
    var count = 1, i = 1;
    while(i<=n/2)
     {
         if(n%i === 0)
         count++;
         if(count > 2)
         break;
         i++
     }
     if(count === 2)
     console.log(n,'number is prime number');
     else
     console.log(n,'number is not prime number');
} 
prim(6);
// self invoked
(function(n)
{
    var count = 1, i = 1;
    while(i<=n/2)
     {
         if(n%i === 0)
         count++;
         if(count > 2)
         break;
         i++
     }
     if(count === 2)
     console.log(n,'number is prime number');
     else
     console.log(n,'number is not prime number');
})(7)
// fat arrow
var pri=(n)=>{
    var count = 1, i = 1;
    while(i<=n/2)
     {
         if(n%i === 0)
         count++;
         if(count > 2)
         break;
         i++
     }
     if(count === 2)
     console.log(n,'number is prime number');
     else
     console.log(n,'number is not prime number');
}
pri(3)
console.log(Math.random(1)*100);