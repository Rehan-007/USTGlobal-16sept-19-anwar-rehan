function first(callFunc){
    setTimeout(function(){
    console.log('first function executed');// third excecution
    },0)
    console.log('Executed')// first execution
    callFunc();
}
function second()
{
    console.log('second function executed');// second execution
}
first(second)