//Functions and Program Flow - ex7 - Create a do while loop that displays the numbers from 1 to 10 onto the webpage

var event1 = document.getElementById("button1");
event1.addEventListener('click', myFunction, false);


function myFunction()
{
    var i = 1
    var num = ""; //place the value of i in the variable num.
    
    do
       {
           num += "<br/>" + i++;
       }
    while(i <= 10);
        //display numbers 1 to 10 on the screen
        document.getElementById("demo").innerHTML = num;
                      
}

