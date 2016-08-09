//Mini Project - Guess A Number - Build a small game where the user has to guess a secret number which is generated automatically in Javascript. After each guess the webpage displays to the user whether their guess is too large or too small. When the user guesses the secret number correctly - three pieces of information are displayed on the webpage: (1) the correct number  (2)the number of guesses (3)the message “Well done – correct guess!”

var event1 = document.getElementById("button1");
event1.addEventListener('click', myFunction, false);//link button one to run myFunction()

var numberOfGuesses = 0;//number of guesses made by the player initialised to 0.
var secretNumber = Math.floor((Math.random() * 10) + 1); //generate a random number
var tooLarge = "Number Too Large, Guess Again!";
var tooSmall = "Number Too Small, Guess Again!";
var correctGuess = "Well Done! Correct Guess!"

function myFunction()
{
    
    var guess = document.getElementById("input1").value;
    var playerGuess = parseInt(guess);//get players guess using input form
    
    numberOfGuesses++;//counts the number of times the button is being clicked and the player is guessing.
    
    if (playerGuess === secretNumber)
        {
            document.getElementById("demo").innerHTML = correctGuess + "<br/>The secret number was " + secretNumber + "<br/>You had " + numberOfGuesses + " guesses";//display message if the guess is correct
            
        }
    else if(playerGuess < secretNumber)
        {
            document.getElementById("demo").innerHTML = tooSmall;//display message if the guess is too small.
            
        }
    else if(playerGuess > secretNumber)
        {
            document.getElementById("demo").innerHTML = tooLarge;//display message if the guess is too big.
        }
      
    
}



