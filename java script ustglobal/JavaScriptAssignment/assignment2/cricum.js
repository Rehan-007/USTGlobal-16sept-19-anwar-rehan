// named function
function circum( radius )
{
  var c = 2 * (Math.PI) * radius;
  console.log('circumfrance of circle is', c); 
}
circum(3)
// epression function
var cir = function circum(radius)
{
    var c = 2 * (Math.PI) * radius;
    console.log('circumfrance of circle is', c); 
}
cir(4);
// self invoked
(function(radius)
{
    var c = 2 * (Math.PI) * radius;
    console.log('circumfrance of circle is', c); 
}) (4);
// fat arrow
var cir = (radius)=>
{
    var c = 2 * (Math.PI) * radius;
    console.log('circumfrance of circle is', c); 
}
cir(4)
