//Functions and Program Flow - ex4 - Create a function that contains a for loop that loops through from 1 to 50 and displays the numbers on the webpage

var event1 = document.getElementById("button1");
event1.addEventListener('click', myFunction, false);


function myFunction()
{
    
    var myString = "";
    
   for(var i = 1; i <= 50; i++)
    {
        myString += i + "<br/>";
        
         document.getElementById("demo").innerHTML = myString;
    }
    
       
    
             
}

