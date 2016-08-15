//Functions and Program Flow - ex2 - Create a function that accepts 3 variables being passed into it, adds them up and returns the sum.  Display the sum back to the DOM.

var event1 = document.getElementById("button1");
event1.addEventListener('click', myFunction, false);

function myFunction()
{
    var userInput1 = document.getElementById("input1").value
    var userInput2 = document.getElementById("input2").value
    var userInput3 = document.getElementById("input3").value
    
    var num1 = parseInt(userInput1); //convert string to int
    var num2 = parseInt(userInput2);
    var num3 = parseInt(userInput3);
    
    var Total = num1 + num2 + num3; // total int values
    
    document.getElementById("demo").innerHTML = Total;
        
}


