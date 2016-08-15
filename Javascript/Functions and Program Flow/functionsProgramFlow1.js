//Functions and Program Flow - ex1 - Accept user input from the webpage and display it in an alert message using a function


var event1 = document.getElementById("button1");
event1.addEventListener('click', myAlert, false);

function myAlert()
{
    var userInput1 = document.getElementById("input1").value;
    
    window.alert(userInput1);
    
}