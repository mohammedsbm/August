using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

//Using if-else statements

//You are thinking of a particular number
//Write a simple program that prompts a user to enter numbers to help them guess which number you are thinking of
//Use one or more if-else statements to check whether the number they entered is greater or less than the number you are thinking of

//Extension 1: use a do-while loop to allow the user to make many guesses
//Extension 2: use a random number generator to select the number to guess
//Extension 3: rewrite the code as a 'Guess the Data Type' game, making sure that it accepts decimals.

namespace guessTheNumber
{
    class Program
    {
        static void Main(string[] args)
        {
            Random rand = new Random();
            int randNum = rand.Next(0, 10);
            int userInput;

            do
                {
                    Console.WriteLine("Im Thinking Of A Number Between 1 and 10, What Is It...?");

                    userInput = Convert.ToInt32(Console.ReadLine()); //get user input

                    if (userInput == randNum)
                        {
                            Console.WriteLine("Well done you guessed my number");
                        }
                    else if(userInput < randNum)
                        {
                            Console.WriteLine("That Number Is Too Small!");
                        }
                    else
                    Console.WriteLine("That Number is Too Big!");

                }
                while (userInput != randNum); //loop condition, loop will continue as long as this condition is true
        }
    }
}
