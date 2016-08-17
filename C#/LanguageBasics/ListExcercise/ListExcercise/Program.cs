using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

/********List exercise********/

/*Create a program that contains a list of book titles and allows you to add a book, delete a book, list the books and sort the books

Extension: add a search function*/

namespace ListExcercise
{
    class Program
    {
        static void Main(string[] args)
        {
            List<string> listOfBooks = new List<string>(new string[] {"Harry Potter", "BFG", "Biff and Chip"}); //create a list to store books

            string userInput; //declare empty string variable for userinput

            Console.WriteLine("A = Add, R = Remove, L = List The Books, S = Sort The Books");
            Console.WriteLine("Please Choose An Option:");

            //for (int i = 0; i < listOfBooks.Count; i++) //loop through list as long as i is less than the length of the list
            //{
                //Console.WriteLine($"{i} = {listOfBooks[i]}");
                //Console.WriteLine("Please Choose An Option:");


                do //keep requesting user input until the loop has recieved an argument of X.
                {
                    userInput = Console.ReadLine();//request input from user

                    switch (userInput)
                    {
                        case "A":
                            Console.WriteLine("What Book Would You Like To Add?");//add an element to the array
                            string addBook = Console.ReadLine();
                            listOfBooks.Add(addBook);
                            Console.WriteLine("Please Choose An Option:");
                            break;

                        case "R":
                            Console.WriteLine("What Book Would You Like To Remove?");//remove an element from the array
                            string removeBook = Console.ReadLine();
                            listOfBooks.Remove(removeBook);
                            Console.WriteLine("Please Choose An Option:");
                            break;

                        case "S":
                            listOfBooks.Sort();
                            Console.WriteLine("The Books Have Been Sorted In Alphabetic Order");//sort the array in alphabetical order
                            Console.WriteLine("Please Choose An Option:");
                            break;

                        case "L":
                            for (int j = 0; j < listOfBooks.Count; j++)
                            {
                                Console.WriteLine($"{j} = {listOfBooks[j]}");//display all elements of the array in a list
                            }
                            Console.WriteLine("Please Choose An Option:");
                            break;

                        case "X":
                            Console.WriteLine("Thank You for using me");//display message on the screen
                            break;

                        default:
                            Console.WriteLine("Please Choose An Option:");//default msg if no option has been chosen
                            break;
                    }

                } while (userInput != "X");
 
        }
    }
}
