// named function
function factorial(n)
{
   var  fact=1
   var i;
   for(i = 1 ; i<=n ; i++)
   {
       fact=fact*i;
       console.log('factorial of a number is ', fact)
   }
}
factorial(5);
// expression function
var fac  = function factorial(n)
{
    var fact=1;
    var i;
    for (i = 1 ; i<= n ;i ++)
    {
        fact=fact*i;
        console.log(fact);
    }
}
fac(5);
// self invoked
(function(n)
{
    var fact=1;
    var i;
    for (i = 1 ; i<= n ;i ++)
    {
        fact=fact*i;
        console.log(fact);
    }
})(5)
// fat arrow
var fac=(n) =>{
    var fact=1;
    var i;
    for (i = 1 ; i<= n ;i ++)
    {
        fact=fact*i;
        console.log(fact);
    }
}
fac(5)
