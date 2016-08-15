//Variables and expressions - ex10 - Collect 2 numbers from the user and display on the webpage if one of them  or both of them are greater than 10


var event1 = document.getElementById("button1");
event1.addEventListener('click', mySum, false);

function mySum()
{
    var userNumber1 = document.getElementById("number1").value;
    
    var userNumber2 = document.getElementById("number2").value;
    
    var bothGreaterThan10 = "Both Numbers Are Greater Than 10";
    
    var oneGreaterThan10 = "One Number Is Greater Than 10";
    
    if(userNumber1 > 10 && userNumber2 > 10)
        {
            document.getElementById("demo").innerHTML = bothGreaterThan10;
        }
    else if(userNumber1 > 10 || userNumber2 > 10)
        {
            document.getElementById("demo").innerHTML = oneGreaterThan10;
        }
    
    else
        document.getElementById("demo").innerHTML = "None of your numbers are greater than 10";
        
        
    
            
    
        
    
    
   
         //place user input inbetween div tags
}