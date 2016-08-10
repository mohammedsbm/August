//Javascript Arrays - ex2 - Collect a user input and allocate it to a new array using the push method. Display the array and the length of the array (number of elements) using array.length on the webpage

var myArray = []; //create a global array variable before event listener called myArray

var event1 = document.getElementById("button1");
event1.addEventListener('click', myFunction, false);//link button1 to run myFunction()

function myFunction()
{    
    var input1 = document.getElementById("input1").value; //get user input from form
    
    myArray.push(input1); //push new user input into array
    
    var arrayLength = myArray.length; //display the number of items in array
    
    document.getElementById("demo").innerHTML = myArray; //display the array on the screen
    document.getElementById("demo2").innerHTML = arrayLength; //display number of items in the array
    
}



