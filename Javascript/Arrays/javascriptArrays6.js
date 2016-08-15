//Javascript Arrays - ex6 -   Create an array of Countries England, France, Italy, Mexico, Poland, Russia, China, Greece, Egypt, India. Create a  user text input field. User can enter a country. The array is searched and when a match is found the position in the array is displayed and the user is given a message to inform whether the country is present or not in the array.

var myArray = [];//create a global array variable called myArray before event listener 

myArray[0] = "England"; 
myArray[1] = "France";
myArray[2] = "Italy";
myArray[3] = "Mexico";
myArray[4] = "Poland"
myArray[5] = "Russia"; 
myArray[6] = "China";
myArray[7] = "Greece";
myArray[8] = "Egypt";
myArray[9] = "India";

var msg = "That country isnt in the array";

var msg1 = "the country is present at position: ";

var event1 = document.getElementById("button1");
event1.addEventListener('click', loopThroughArray, false); //link button to run specified function

function loopThroughArray() //functions loops through each element of array 
{    
    var input1 = document.getElementById("input1").value; //allows user to input data into the form
    
    var searchArray = myArray.indexOf(input1); //searches the index number of the users input against the array elements
    
    if(searchArray >= 0)//searches the position of the input value in the array and displays it to the user
        {
            
            document.getElementById("demo").innerHTML = msg1 + searchArray; //display msg for successful search
        }
    else
        
        document.getElementById("demo").innerHTML = msg; //display msg for unsuccessful search

}



