using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

//Ask the user 2 riddles and loop until they get the right answer or give up

//Use a while loop for the first riddle
//Use a do while loop for the second riddle

//Extension 1:  allow two or more versions of the answer for each riddle

//Extension 2: add several more riddles to the program and tell the user how many they got right at the end, allowing a maximum of 3 attempts per riddle

namespace AskARiddle
{
    class Program
    {
        static void Main(string[] args)
        {
            string riddle1 = "You will always find me in the past. I can be created in the present, But the future can never taint me. What am I?";
            string answer1 = "History";
            string riddle2 = "What belongs to you but others use it more than you do?";
            string answer2 = "Your Name";

            Console.WriteLine(riddle1);
            string userInput = Console.ReadLine();

            while (answer1 != userInput) //while user input is not equal to the answer then repeat riddle
            {
                Console.WriteLine(riddle1);
                userInput = Console.ReadLine();
            }
            if(answer1 == userInput) //when answer1 has been found display message and move onto second riddle
            {
                Console.WriteLine("That is Correct");

                do //while user input is not equal to answer2 keep repeating the question
                {
                    Console.WriteLine(riddle2);
                    userInput = Console.ReadLine();
                }
                while (answer2 != userInput);
                Console.WriteLine("Well Done That Is Correct!");
            }

        }
    }
}
