using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

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

namespace WindowsFormsEndPointAssesment
{

    public partial class Form1 : Form
    {
        List<Books> listOfBooks = new List<Books>();

        public Form1()
        {
            InitializeComponent();

            Books book1 = new Books("Harry Potter", "JK Rowling", "9780439064873", 24.99);
            listOfBooks.Add(book1);

            Books book2 = new Books("Harry Potter", "JK Rowling", "9780439064873", 24.99);
            listOfBooks.Add(book2);
        }

        private void buttonViewBooks_Click(object sender, EventArgs e)
        {
            foreach (Books list in listOfBooks)
            {
                textBox1.Text = list.title;
            }
        }

        private void button1_Click(object sender, EventArgs e)
        {

        }
    }

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
            //list all cars and values using for each loop
            foreach (Books list in listOfBooks)
            {
                Console.WriteLine("Title: {0}, Author: {1}, ISBN: £{2:N0}, Price: £{3}", list.title, list.author, list.isbn, list.price);
            }
        }
    }

}
