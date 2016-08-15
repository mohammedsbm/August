//Mini Project - Random winner generator - http://lite-support.co.uk/dev/published/randomwinnergenerator/rwg.html Users can input elements into an array and then select a random winner from that array and display it on the screen.

var myArray = [];//create a global array variable called myArray before event listener

var list = "";

var event1 = document.getElementById("button1");
event1.addEventListener('click', userInput, false); //link button to run specified function

function userInput() //allow user to add items to array 
{    
    var input1 = document.getElementById("input1").value; //allows user to input data into the form
    
    var userInput = myArray.push(input1); //add elements to array
    
    var lengthOfArray = myArray.length;
    
    //document.getElementById("demo").innerHTML = myArray;
    
    for(var i = 0; i < lengthOfArray; i++)
        {
            list += myArray[i] + "<br/>";
                        
            document.getElementById("demo").innerHTML = list;
        }
 
}

var event2 = document.getElementById("button2");
event2.addEventListener('click', generateWinner, false); //link button to run specified function

function generateWinner()
{
    var lengthOfArray = myArray.length;
    
    var randomNumber = myArray[Math.floor(Math.random() * lengthOfArray)];
    //var numberIndex = myArray.indexOf(input1);
    
    document.getElementById("demo2").innerHTML = "the winner is " + randomNumber;
}




