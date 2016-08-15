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

            Console.WriteLine("Type one number..");
            
            for(int i = 0; i < userNumbers.Length; i++)
            {
                userNumbers[i] = Convert.ToInt32(Console.ReadLine());

                do
                {
                    int total = userNumbers.Sum(); //get the total of the values in the array
                    Console.WriteLine(total);
                }
                while (userNumbers.Length < 4);
            }
           
        }
    }
}
