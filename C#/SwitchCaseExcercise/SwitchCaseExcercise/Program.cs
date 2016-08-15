using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

//Several people are standing for the Presidency of the United States

//tell the user who is standing
//ask them who they think will win
//using a switch-case statement, make a comment about their choice

//Extension 1: match user input even if it isn't in the right case

//Extension 2: allow users to enter the first name, surname or full name of the candidate

namespace SwitchCaseExcercise
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Donald Trump, Hillary Clinton, Someone Else");
            Console.WriteLine("Who Do You Think Will Win?");
            string userInput = Console.ReadLine().ToLower();//get user input and recognise even if in lowercase

            switch(userInput) //loop through each case and match userinput and display results accordingly
            {
                case "donald":
                case "trump":
                case "donald trump":
                    Console.WriteLine("Old McDonald Had A Trump");
                    break;

                case "hillary":
                case "clinton":
                case "hillary clinton":
                    Console.WriteLine("Hillary Clinton");
                    break;

                case "someone":
                case "i dont know":
                case "someone else":
                    Console.WriteLine("Someone I dont know");
                    break;
            }


        }
    }
}
