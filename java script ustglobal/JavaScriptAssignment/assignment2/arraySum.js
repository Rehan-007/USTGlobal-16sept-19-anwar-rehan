// named function
function add()
{
    var arr=[10,20,30,40];
    var sum = 0, i;
    for (i = 0; i< arr.length ; i++ )
    {
        sum = sum + arr[i];
    }
    console.log('Sum of array element is ', sum)
}
add()
// expression function
var sum1 = function add()
{
    var arr=[10,20,30,40];
    var sum = 0, i;
    for (i = 0; i< arr.length ; i++ )
    {
        sum = sum + arr[i];
    }
    console.log('Sum of array element is ', sum)
}
sum1();
// self invoked
