using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

/****Car sales - inheritance

Our car dealer wants to add motorcycles to his car showroom

Add a vehicle base class to the previous code
Then add a motorcycle class 
Car and motorcycle should both inherit from Vehicle
Implement methods to Add and Sell and see how much code you can reuse via inheritance****/

namespace CarSalesInheritance
{
    class Vehicle //create new vehicle class inside namespace
    {
        public string make;
        public string model;
        public int price;
        public bool sold;

        public Vehicle(string make, string model, int price)//constructor for adding vehicles
        {
            this.make = make;
            this.model = model;
            this.price = price;
            this.sold = false;
        }

        public void vehicleSold(bool isSold) //non static method to record wether a car has been sold or not
        {
            this.sold = isSold;
        }

    }

    class Car : Vehicle //inherited class for cars
    {
        public string type;
        public static int totalNoOfCars;

        public Car(string make, string model, int price) : base (make, model, price) //inherited constructor for cars
        {
            this.type = "Car";
            totalNoOfCars++;
        }

        public static void carList(List<Car> listOfCars) //static method to display list of cars
        {
            //list all cars and values using for each loop
            foreach (Car list in listOfCars)
            {
                Console.WriteLine("Make and Model: {0} {1}, Price: £{2:N0}, Sold: {3}, Type: {4}", list.make, list.model, list.price, list.sold, list.type);
            }
        }
    }

    class Motorcycle : Vehicle //inherited class for motorcycles
    {
        public string type;
        public static int totalNoOfBikes;

        public Motorcycle(string make, string model, int price) : base(make, model, price) //inherited constructor for motorcycles
        {
            this.type = "Motorcycle";
            totalNoOfBikes++;
        }

        public static void bikeList(List<Motorcycle> listOfBikes) //static method to display list of bikes
        {
            //list all cars and values using for each loop
            foreach (Motorcycle list in listOfBikes)
            {
                Console.WriteLine("Make and Model: {0} {1}, Price: £{2:N0}, Sold: {3}, Type: {4}", list.make, list.model, list.price, list.sold, list.type);
            }
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            /****add cars to list of cars****/
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
            myCar4.vehicleSold(true);

            /****add bikes to list of bikes****/
            List<Motorcycle> listOfBikes = new List<Motorcycle>();

            Motorcycle myBike1 = new Motorcycle("Yamaha", "R1", 10000);
            listOfBikes.Add(myBike1);

            Motorcycle myBike2 = new Motorcycle("Kawasaki", "Ninja", 12000);
            listOfBikes.Add(myBike2);

            //display total number of cars and list the values of each object properties
            Console.WriteLine("We Have The Following {0} Cars In The Garage:", Car.totalNoOfCars);
            Console.WriteLine("");

            Car.carList(listOfCars); //call static method to list all cars

            //display total number of bikes and list the values of each object properties
            Console.WriteLine("");
            Console.WriteLine("We Have The Following {0} Bikes In The Garage:", Motorcycle.totalNoOfBikes);
            Console.WriteLine("");

            Motorcycle.bikeList(listOfBikes);
        }
    }
}
