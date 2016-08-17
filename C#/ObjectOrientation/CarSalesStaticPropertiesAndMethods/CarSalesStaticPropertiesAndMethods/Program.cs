using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

/****Car sales - static methods

Building on the previous exercise:

Make sure that you have a static field in the car class that reflects a characteristic of the entire class
e.g. totalNumberOfCars
Add a static method to the car class
Hint: it may be useful to create a List of cars, so that you can iterate through them with a foreach loop in your static method
Possible static methods include: calculate value of sales, calculate value of stock (you will probably need a sold field in the car class for these)
Use the static method in the main program****/

namespace CarSalesStaticPropertiesAndMethods
{
    class Car //create new car class inside namespace
    {
        public string make;
        public string model;
        public int price;
        public bool sold;

        public static int totalCars;

        public void addCar(string make, string model, int price, bool isSold)//non static method for adding cars
        {
            this.make = make;
            this.model = model;
            this.price = price;
            this.sold = isSold;

            Car.totalCars++;
        }

        public void carSold(bool isSold) //non static method to record wether a car has been sold or not
        {
            this.sold = isSold;
        }

        public static void carList(List<Car>listOfCars) //static method to display list of cars
        {
            //list all cars and values using for each loop
            foreach (Car list in listOfCars)
            {
                Console.WriteLine("Make and Model: {0} {1}, Price: £{2:N0}, Sold: {3}", list.make, list.model, list.price, list.sold);
            }
        }

    }

    class Program
    {
        static void Main(string[] args)
        {
            List<Car> listOfCars = new List<Car>();

            Car myCar1 = new Car(); //create first new car object
            {
                myCar1.make = "BMW";
                myCar1.model = "330ci";
                myCar1.price = 25000;
                myCar1.sold = false;

                Car.totalCars++;
            }

            listOfCars.Add(myCar1);

            Car myCar2 = new Car(); //create second new car object
            {
                myCar2.make = "Mercedes";
                myCar2.model = "E350i";
                myCar2.price = 24500;
                myCar2.sold = false;

                Car.totalCars++;
            }

            listOfCars.Add(myCar2);

            Car myCar3 = new Car(); //create third new car object
            {
                myCar3.make = "Audi";
                myCar3.model = "A4";
                myCar3.price = 24000;
                myCar3.sold = false;

                Car.totalCars++;
            }

            listOfCars.Add(myCar3);

            //call the addCar method to add a new car
            var myCar4 = new Car(); //instance of class Car
            myCar4.addCar("Ferrari", "Enzo", 300000, false);
            listOfCars.Add(myCar4);

            //call method to record if a car has been sold
            myCar4.carSold(true);

            //display total number of cars and list the values of each object properties
            Console.WriteLine("We Have The Following {0} Cars In The Garage:", Car.totalCars);
            Console.WriteLine("");

            Car.carList(listOfCars); //call static method to list all cars
          

        }
    }
}
