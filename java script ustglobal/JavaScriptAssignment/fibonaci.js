// named function
function fibo(num)
{
    var a = 0;
    var b = 1;
    var c;
    var i;
    for (i = 2 ; i<= num ; i++)
    {
        c = a + b;
        a = b;
        b = c;
        console.log('Fibonaci series =' , c);
    }
}
fibo(10)
// expression function
var fib = function fibo(num)
{
    var a = 0;
    var b = 1;
    var c;
    var i;
    for (i = 2 ; i<= num ; i++)
    {
        c = a + b;
        a = b;
        b = c;
        console.log('Fibonaci series =' , c);
    }
}
fib(10);
// self invoked
( function(num){
    var a = 0;
    var b = 1;
    var c;
    var i;
    for (i = 2 ; i<= num ; i++)
    {
        c = a + b;
        a = b;
        b = c;
        console.log('Fibonaci series =' , c)
    }
}) (10)
//fat arrow
var fib = (num) =>{
    var a = 0;
    var b = 1;
    var c;
    var i;
    for (i = 2 ; i<= num ; i++)
    {
        c = a + b;
        a = b;
        b = c;
        console.log('Fibonaci series =' , c)
    }
}
 fib(10)