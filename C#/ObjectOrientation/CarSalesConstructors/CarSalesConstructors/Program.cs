using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

/**
In the previous example, replace the Add method with a constructor

•   Extension: create at least two different constructors for the 
    same object (you may need to add some extra attributes to the Car class)**/

namespace CarSalesConstructors
{
    class Car //create new car class inside namespace
    {
        public string make;
        public string model;
        public int price;
        public bool sold;
        public int noOfDoors;

        public static int totalCars;

        public Car(string make, string model, int price)//constructor for adding cars
        {
            this.make = make;
            this.model = model;
            this.price = price;
            this.sold = false;

            Car.totalCars++;
        }

        public Car(string make, string model, int price, int noOfDoors)
        {
            this.make = make;
            this.model = model;
            this.price = price;
            this.sold = false;
            this.noOfDoors = noOfDoors;
        }

        public void carSold(bool isSold) //non static method to record wether a car has been sold or not
        {
            this.sold = isSold;
        }

        public static void carList(List<Car> listOfCars) //static method to display list of cars
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

            Car myCar1 = new Car("BMW", "330ci", 25000); //create first new car object
            
            listOfCars.Add(myCar1);

            Car myCar2 = new Car("Mercedes", "E350i", 24500); //create second new car object

            listOfCars.Add(myCar2);

            Car myCar3 = new Car("Audi", "A4", 24000); //create third new car object

            listOfCars.Add(myCar3);

            Car myCar4 = new Car("Ferrari", "Enzo", 300000); //create fourth new car object
            listOfCars.Add(myCar4);

            //call method to change sold value
            myCar4.carSold(true);

            //display total number of cars and list the values of each object properties
            Console.WriteLine("We Have The Following {0} Cars In The Garage:", Car.totalCars);
            Console.WriteLine("");

            Car.carList(listOfCars); //call static method to list all cars
        }
    }
}
