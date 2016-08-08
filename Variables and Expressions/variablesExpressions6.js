//Variables and expressions - ex6 - take 2 user inputs as numbers and display in text wether they are the same or different

var event1 = document.getElementById("button1");
event1.addEventListener('click', mySum, false);

function mySum()
{
    var userNumber1 = document.getElementById("number1").value;
    var userNumber2 = document.getElementById("number2").value;
    
    if (parseInt(userNumber1) === parseInt(userNumber2)) //convert string to int and display wether the numbers are the same or different in text
        {
          document.getElementById("demo").innerHTML = "The numbers are the same";  
        }
    else
        document.getElementById("demo").innerHTML = "The numbers are different"; //place user input inbetween div tags
}