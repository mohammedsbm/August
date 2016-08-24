using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

/****C# assessment 1

Write a program, either in Windows Forms or using the console, that you can use to create and manage a collection of books.

Each book should have the attributes of title, author, ISBN and price. (Hint, you will probably create an object for book, and then add it to a list.)

The user should be able to add, view and delete books.

You should plan your program in advance.

You should also be able to explain what you did to test it.

Feel free to add extra features, such as sorting and searching.

We are looking for:

How well the code works

Use of objects, classes and methods

Use of appropriate data structures

Logical code that is easy to read

Meaningful variable names

Comments

Clear and easy-to-use user interface

Neat and attractive presentation****/

namespace ConsoleApplicationEndPointAssesment
{
    public class Books
    {
        public string title;
        public string author;
        public string isbn;
        public double price;

        public Books(string title, string author, string isbn, double price)
        {
            this.title = title;
            this.author = author;
            this.isbn = isbn;
            this.price = price;
        }

        public static void bookList(List<Books> listOfBooks) //static method to display list of cars
        {
            //list all books and values using for each loop
            foreach (Books list in listOfBooks)
            {
                Console.WriteLine("Title: {0}, Author: {1}, ISBN: £{2:N0}, Price: £{3}", list.title, list.author, list.isbn, list.price);
            }
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            List<Books> listOfBooks = new List<Books>();

            Books book1 = new Books("Harry Potter", "JK Rowling", "9780439064873", 24.99);
            listOfBooks.Add(book1);

            Books book2 = new Books("Harry Potter", "JK Rowling", "9780439064873", 24.99);
            listOfBooks.Add(book2);

            string userInput; //declare empty string variable for userinput
            string title;
            string author;
            string isbn;
            double price;

            Console.WriteLine("A = Add, R = Remove, L = List The Books, S = Sort The Books");
            Console.WriteLine("Please Choose An Option:");

            do //keep requesting user input until the loop has recieved an argument of X.
            {
                userInput = Console.ReadLine();//request input from user

                switch (userInput)
                {
                    case "A":
                        Console.WriteLine("Please enter a title:");
                        title = Console.ReadLine();
                        Console.WriteLine("Please enter an author:");
                        author = Console.ReadLine();
                        Console.WriteLine("Please enter an Isbn:");
                        isbn = Console.ReadLine();
                        Console.WriteLine("Please enter a price:");
                        price = Convert.ToDouble(Console.ReadLine());

                        Books myBook = new Books(title, author, isbn, price);
                        listOfBooks.Add(myBook);//add an element to the array
                        
                        Console.WriteLine("Please Choose An Option:");
                        break;

                    case "R":
                        Console.WriteLine("Please enter a title:");
                        string removeBook = Console.ReadLine();
                        
                        //listOfBooks.Remove(removeBook);//add an element to the array
                        Console.WriteLine("Please Choose An Option:");
                        break;

                    case "S":
                        listOfBooks.Sort();
                        Console.WriteLine("The Books Have Been Sorted In Alphabetic Order");//sort the array in alphabetical order
                        Console.WriteLine("Please Choose An Option:");
                        break;

                    case "L":
                        Books.bookList(listOfBooks);
                        Console.WriteLine("Please Choose An Option:");
                        break;

                    case "X":
                        Console.WriteLine("Thank You for using me");//display message on the screen
                        break;

                    default:
                        Console.WriteLine("Please Choose An Option:");//default msg if no option has been chosen
                        break;
                }

            } while (userInput != "X") ;
        }
    }
}
