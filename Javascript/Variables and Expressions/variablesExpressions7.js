//Variables and expressions - ex7 - take a single number value and display the number one less and the number one more

var event1 = document.getElementById("button1");
event1.addEventListener('click', mySum, false);

function mySum()
{
    var userNumber1 = document.getElementById("number1").value;
    
    var greaterNumber = parseInt(userNumber1)+1;
    var lesserNumber = parseInt(userNumber1)-1;
    
            document.getElementById("demo").innerHTML = greaterNumber;
     
            document.getElementById("demo2").innerHTML = lesserNumber;
    
        
    
    
   
         //place user input inbetween div tags
}