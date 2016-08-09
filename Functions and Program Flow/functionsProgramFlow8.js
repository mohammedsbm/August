//Functions and Program Flow - ex8 - Create a nested loop that displays two sequences of numbers from 1-10, with one sequence nested inside the other

var event1 = document.getElementById("button1");
event1.addEventListener('click', myFunction, false);


function myFunction()
{
    var i = 1;
    var num = ""; //place the value of i in the variable num.
    
    //loop through numbers 1 to 10 and display on screen
    for(i = 0; i < 10; i++)
        {
            num += "<br/> outer loop equals: " + (i + 1);
            
            document.getElementById("demo").innerHTML = num;
            
            //loop through numbers 1 to 10 and display on the screen below the first loop
            for(var j = 0; j < 10; j++)
                {
                    num += "<br/>" + (j + 1);
                    
                    document.getElementById("demo").innerHTML = num;
                                        
                }
            
        }
    
}

