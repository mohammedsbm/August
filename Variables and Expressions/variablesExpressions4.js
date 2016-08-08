//Variables and expressions - ex3 - take user input and display it on the page

var event1 = document.getElementById("button1");
event1.addEventListener('click', mySum, false);

function mySum()
{
    var userNumber1 = document.getElementById("number1").value;
    var userNumber2 = document.getElementById("number2").value;
    var userSum = parseInt(userNumber1) + parseInt(userNumber2);
    
   
    
    document.getElementById("demo").innerHTML = userSum; //place user input inbetween div tags
}