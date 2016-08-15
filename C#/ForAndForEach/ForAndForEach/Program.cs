using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

//Dinners

//You are Snow White and you are serving the seven dwarves with their dinner and a nice warm drink

//Declare an array of strings for the dwarves’ names, e.g.
//string[] sevenDwarves = { "Happy", "Doc", "Sleepy", "Sneezy", "Dopey", "Bashful", "Grumpy" };
//Using a for loop, tell each dwarf by name that his dinner is ready
//Using a foreach loop, tell each dwarf by name that his drink is ready


//Extension: ask each dwarf what he wants for his dinner and drink, then tell each dwarf by name that his meal/drink is ready, naming his choice as well: e.g. "Doc, your roast beef is ready" or "Sleepy, your cocoa is ready".

namespace ForAndForEach
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] sevenDwarves = { "Happy", "Doc", "Sleepy", "Sneezy", "Dopey", "Bashful", "Grumpy" };
            int numOfDwarves = sevenDwarves.Length;//gets the number of items in the array
            string dinnerTime = "";//empty string to store elements

            for (int i = 0; i < numOfDwarves; i++)//loops through the array and stores each element into a variable as long as the count is below the length of the array
            {
                dinnerTime += sevenDwarves[i] + " " + "Your Dinner Is Ready";
            }
            Console.WriteLine(dinnerTime);

            foreach (string dwarves in sevenDwarves)//foreach loops through array and stores each string value in the variable dwarves
            {
                Console.WriteLine(dwarves + " " + "Your Drink Is Ready");//lists each string in the array sevenDwarves 
            }
        }
    }
}
