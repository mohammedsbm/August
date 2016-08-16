using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;


/***Dictionary Excerise***/

/**Create a program that contains a dictionary of coding 
languages that you can look up by key or description, count the list or exit
Extension:  allow the user to add, edit or remove dictionary entries**/

namespace DictionarieExcercise
{
    class Program
    {
        static void Main(string[] args)
        {
            Dictionary<string, string> codingLanguages = new Dictionary<string, string>(); //declare a dictionary function

            codingLanguages.Add("C#", "C#");
            codingLanguages.Add("JS", "Javascript");
            codingLanguages.Add("ASP", "ASP.Net");
            codingLanguages.Add("C++", "C++");
            codingLanguages.Add("J", "Java");
            codingLanguages.Add("Py", "Python");

            //codingLanguages.ToList().ForEach(x => Console.WriteLine(x.Value));//output individual values in dictionary

            string userInput;
            string checkKey;

            do
            {
                userInput = Console.ReadLine();

                switch (userInput)
                {
                    case "K":
                        Console.WriteLine("please enter a key...");
                        checkKey = Console.ReadLine();
                        if(codingLanguages.ContainsKey(checkKey))
                        {
                            Console.WriteLine(checkKey + " is in the dictionary.");
                        }
                        else
                        {
                            Console.WriteLine(checkKey + " is not in the dictionary.");
                        }
                        break;

                    case "D":
                        Console.WriteLine("Please enter a description...");
                        checkKey = Console.ReadLine();
                        if(codingLanguages.ContainsValue(checkKey))
                        {
                            Console.WriteLine(checkKey + " is in the dictionary.");
                        }
                        else
                        {
                            Console.WriteLine(checkKey + " is not in the dictionary.");
                        }
                        break;

                    case "L":
                        Console.WriteLine("Please Enter Key To LookUp Description");
                        checkKey = Console.ReadLine();
                        if(codingLanguages.ContainsKey(checkKey))
                        {
                            Console.WriteLine(codingLanguages.ContainsValue(checkKey)); 
                        }
                        else
                        {
                            Console.WriteLine("NO");
                        }
                        break;



                }
            } while (userInput != "X");
        }
    }
}
