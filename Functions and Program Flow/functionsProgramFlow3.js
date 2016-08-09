//Functions and Program Flow - ex3 - Declare the same variable inside a function (local) and outside (global), giving it different values.  Display the two values.

var event1 = document.getElementById("button1");
event1.addEventListener('click', myFunction, false);

var myVar = document.getElementById("input1").value;


function myFunction()
{
    var newNum = parseInt("myVar") * 2;
    document.getElementById("demo2").innerHTML = newNum;
             
}

document.getElementById("demo").innerHTML = myVar;
