//Javascript Arrays - ex3 - Add and Remove first and last elements  on and off an array using shift, unshift, push and pop methods

var myArray = [];//create a global array variable called myArray before event listener 

var event1 = document.getElementById("button1");
event1.addEventListener('click', addFirstItem, false); //link button to run specified function

function addFirstItem() //functions adds item to start of list and displays it on screen
{    
    var input1 = document.getElementById("input1").value; //get user input from form
    
    myArray.unshift(input1); //add item to start of array list
    
    var arrayLength = myArray.length; //gets number of items in array
    
    document.getElementById("demo").innerHTML = myArray; //display the array on the screen
    document.getElementById("demo2").innerHTML = arrayLength; //display number of items in the array
    
}

var event2 = document.getElementById("button2");
event2.addEventListener('click', removeFirstItem, false); //link button to run specified function

function removeFirstItem() //functions removes item from start of list and displays it on screen
{        
    myArray.shift(); //remove item from start of array list
    
    var arrayLength = myArray.length; //gets the number of items in the array
    
    document.getElementById("demo").innerHTML = myArray; //display the array on the screen
    document.getElementById("demo2").innerHTML = arrayLength; //display number of items in the array
    
}

var event3 = document.getElementById("button3");
event3.addEventListener('click', addLastItem, false); //link button to run specified function

function addLastItem() //functions adds item to end of list and displays it on screen
{
    var input1 = document.getElementById("input1").value; //get user input from form
    
    myArray.push(input1); //adds an item to the end of an array
    
    var arrayLength = myArray.length; //gets the number of items in array
    
    document.getElementById("demo").innerHTML = myArray; //display the array on the screen
    document.getElementById("demo2").innerHTML = arrayLength; //display number of items in the array
}

var event4 = document.getElementById("button4");
event4.addEventListener('click', removeLastItem, false); //link button to run specified function

function removeLastItem() //functions removes item from end of list and displays it on screen
{
    myArray.pop(); //removes last item from array
    
    var arrayLength = myArray.length; //gets the number of items in array
    
    document.getElementById("demo").innerHTML = myArray; //display the array on the screen
    document.getElementById("demo2").innerHTML = arrayLength; //display number of items in the array
}


