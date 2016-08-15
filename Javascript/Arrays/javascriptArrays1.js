//Javascript Arrays - ex1 - Collect 3 user inputs and allocate them to three members of a new array. Display the array on the webpage.

var event1 = document.getElementById("button1");
event1.addEventListener('click', myFunction, false);//link button1 to run myFunction()

function myFunction()
{    
    var input1 = document.getElementById("input1").value; //get user input from form
    var input2 = document.getElementById("input2").value; //get user input from form
    var input3 = document.getElementById("input3").value; //get user input from form

    var myArray = [input1, input2, input3]; //put user input into an array called myArray
    
    document.getElementById("demo").innerHTML = myArray; //display the array on the screen
    
}



