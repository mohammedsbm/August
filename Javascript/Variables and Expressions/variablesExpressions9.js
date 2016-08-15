//Variables and expressions - ex9 - Collect a number from the user and display on the webpage if the number entered is negative, less than 10 or greater than 10




var event1 = document.getElementById("button1");
event1.addEventListener('click', mySum, false);

function mySum()
{
    var userNumber1 = document.getElementById("number1").value;
    
    var greaterThan10 = "Number is Greater Than 10";
    
    var lessThan10 = "Number is less Than 10";
    
    var negativeNumber = "Number is negative";
    
    if(userNumber1 < 0)
        {
            document.getElementById("demo").innerHTML = negativeNumber;
        }
    
    else if(userNumber1 < 10)
        {
            document.getElementById("demo").innerHTML = lessThan10;
        }
    else if(userNumber1 > 10)
        {
            document.getElementById("demo").innerHTML = greaterThan10;
        }
    else
        document.getElementById("demo").innerHTML = "Your number is 10";
        
        
    
            
    
        
    
    
   
         //place user input inbetween div tags
}