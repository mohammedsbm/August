//Functions and Program Flow - ex6 - Create a while loop that displays the numbers 1 to 10 onto the webpage

var event1 = document.getElementById("button1");
event1.addEventListener('click', myFunction, false);


function myFunction()
{
    var i = 1
    var num = "";
    
    while(i <= 10)
       {
           num += "<br/>" + i++;
       }
        //display numbers 1 to 10 on the screen
        document.getElementById("demo").innerHTML = num;
                      
}

