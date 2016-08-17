using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

/****Car sales - classes, objects and properties exercise

You are writing an application for a car dealership.
Create a car class with some non-static fields and a static field to record the total number of cars in the program.
Instantiate 3 objects
Assign values to their properties
Increment the total number of cars each time you instantiate another car object
Display the values of the objects and the static field.****/

namespace CarSalesObjectOrientation
{
    class Car //create new car class inside namespace
    {
        public string make;
        public string model;
        public int price;
        public bool sold;

        public static int totalCars;
    }

    class Program
    {
        static void Main(string[] args)
        {
            Car myCar1 = new Car(); //create first new car object
            {
                myCar1.make = "BMW";
                myCar1.model = "330ci";
                myCar1.price = 25000;
                myCar1.sold = false;

                Car.totalCars++;
            }

            Car myCar2 = new Car(); //create second new car object
            {
                myCar2.make = "Mercedes";
                myCar2.model = "E350i";
                myCar2.price = 24500;
                myCar2.sold = false;

                Car.totalCars++;
            }

            Car myCar3 = new Car(); //create third new car object
            {
                myCar3.make = "Audi";
                myCar3.model = "A4";
                myCar3.price = 24000;
                myCar3.sold = false;

                Car.totalCars++;
            }

            //display total number of cars and list the values of each object properties
            Console.WriteLine("We Have The Following {0} Cars In The Garage:", Car.totalCars);
            Console.WriteLine("");
            Console.WriteLine("Make and Model: {0} {1}, Price: £{2:N0}, Sold: {3}", myCar1.make, myCar1.model, myCar1.price, myCar1.sold);
            Console.WriteLine("Make and Model: {0} {1}, Price: £{2:N0}, Sold: {3}", myCar2.make, myCar2.model, myCar2.price, myCar2.sold);
            Console.WriteLine("Make and Model: {0} {1}, Price: £{2:N0}, Sold: {3}", myCar3.make, myCar3.model, myCar3.price, myCar3.sold);


        }
    }
}
