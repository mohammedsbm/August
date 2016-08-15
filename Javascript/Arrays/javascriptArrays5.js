//Javascript Arrays - ex5 - Create an array variable with 10 elements and using a for loop  display each element on the webpage

var myArray = [];//create a global array variable called myArray before event listener 

myArray[0] = "BMW"; //add item to start of array list
myArray[1] = "Audi";
myArray[2] = "Mercedes";
myArray[3] = "VW";
myArray[4] = "Porsche"
myArray[5] = "Ferrari"; //add item to start of array list
myArray[6] = "Lambourghini";
myArray[7] = "Aston Martin";
myArray[8] = "Jaguar";
myArray[9] = "Massarati";

var items = ""; //global variable for storing array elements

var arrayLength = myArray.length; //variable to retrieve how many items are in the array

var event1 = document.getElementById("button1");
event1.addEventListener('click', loopThroughArray, false); //link button to run specified function

function loopThroughArray() //functions loops through each element of array 
{    
    for(var i = 0; i < arrayLength; i++) //as long as the counter is less than the number of elements in the array the loop will continue
        
    items += myArray[i] + "<br/>"; //each element of the array is put into the variable items
    
    document.getElementById("demo").innerHTML = items; //displays each element of the array on the screen
}



