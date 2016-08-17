using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

//Arrays exercise

//A user inputs 5 numbers and the program stores them in an array and finds the average

//Extension: create a 5 x 5 array, fill it with numbers, and sum each row and each column then calculate the overall total of the numbers in the array

namespace AverageNumber
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] userNumbers = new int[5];
            decimal average = 0;
            int total = 0;
            int inputNumbers = 0;

            Console.WriteLine("Type one number...");
            
            for(int i = 0; i < userNumbers.Length; i++) //loop through and store each user input into array
            {
                inputNumbers += userNumbers[i] = Convert.ToInt32(Console.ReadLine());

               if (i < 4)
                {
                    Console.WriteLine("Type Another Number..."); //keep requesting input as long as i is less than 4
                }
                
            }
            do //loop to perform calculations
            {
                total = userNumbers.Sum(); //get the values in the array and find the total
                average = (decimal)total / userNumbers.Length; //work out the average to a decimal
                Console.WriteLine("Total: "); 
                Console.WriteLine(total); //output total to screen
                Console.WriteLine("Average: ");
                Console.WriteLine(average); //output average to screen
            }
            while (inputNumbers == userNumbers.Length); //exit loop once input numbers are equal to the length of the array 
        }
    }
}
