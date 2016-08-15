//Javascript Arrays - ex4 - Add to an array at a specific index point in the array

var myArray = [];//create a global array variable called myArray before event listener 

myArray[0] = "Oranges"; //add item to start of array list
myArray[1] = "Pears";
myArray[2] = "Apples";

document.getElementById("demo").innerHTML = myArray;

var event1 = document.getElementById("button1");
event1.addEventListener('click', addFirstItem, false); //link button to run specified function

function addFirstItem() //functions adds item to start of list and displays it on screen
{    
    var input1 = document.getElementById("input1").value; //get user input from form
    
    myArray.splice(1, 0, input1); //used to add/remove elements to/from a specific position in the array
       
    var arrayLength = myArray.length; //gets number of items in array
    
    document.getElementById("demo").innerHTML = myArray; //display the array on the screen
    document.getElementById("demo2").innerHTML = arrayLength; //display number of items in the array
    
}



