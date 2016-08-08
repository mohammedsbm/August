//Variables and expressions - ex8 - collect 3 numbers from the user (a,b,c) and display on the webpage the difference between the values of the 2 calculations below: (a + b) * c  and (a + b + c)


var event1 = document.getElementById("button1");
event1.addEventListener('click', mySum, false);

function mySum()
{
    var userNumber1 = document.getElementById("number1").value;
    
    var userNumber2 = document.getElementById("number2").value;
    
    var userNumber3 = document.getElementById("number3").value;
    
    var newNumber = parseInt(userNumber1) + parseInt(userNumber2) //adds numbers a + b
    
    var answer1 = newNumber * parseInt(userNumber3); //multiplies answer by number c
    
    var answer2 = parseInt(userNumber1) + parseInt(userNumber2) + parseInt(userNumber3); //adds numbers a, b, and c
    
            document.getElementById("demo").innerHTML = answer1;
    
            document.getElementById("demo2").innerHTML = answer2;
    
        
    
    
   
         //place user input inbetween div tags
}