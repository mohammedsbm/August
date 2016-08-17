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

            //store items in dictionary
            codingLanguages.Add("C#", "C#");
            codingLanguages.Add("JS", "Javascript");
            codingLanguages.Add("ASP", "ASP.Net");
            codingLanguages.Add("C++", "C++");
            codingLanguages.Add("J", "Java");
            codingLanguages.Add("Py", "Python");

            //codingLanguages.ToList().ForEach(x => Console.WriteLine(x.Value));//output individual values in dictionary

            string userInput;
            string checkKey;
            string description;
            int dictionaryLength;
            string enterKey;
            string enterValue;

            Console.WriteLine("A = add entry, R = remove entry, K = check key, D = check description, ");
            Console.WriteLine("L = lookup description using key, C = count entries, X = Exit");
            Console.WriteLine("Please Choose An Option... ");

            do
            {
                userInput = Console.ReadLine();//request input from user

                switch (userInput)
                {
                    case "K": //if key is found in dictionary give msg saying found else not found
                        Console.WriteLine("Please enter a key...");
                        checkKey = Console.ReadLine();
                        if(codingLanguages.ContainsKey(checkKey))
                        {
                            Console.WriteLine(checkKey + " is in the dictionary.");
                        }
                        else
                        {
                            Console.WriteLine(checkKey + " is not in the dictionary.");
                        }
                        Console.WriteLine("Please Choose An Option... ");
                        break;

                    case "D": //if description is found in dictionary give msg saying found else not found
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
                        Console.WriteLine("Please Choose An Option... ");
                        break;

                    case "L": //if key is found in dictionary display key and description on screen
                        Console.WriteLine("Please Enter Key To LookUp Description");
                        checkKey = Console.ReadLine();
                        if(codingLanguages.TryGetValue(checkKey, out description))
                        {
                            Console.WriteLine("Key: " + checkKey);
                            Console.WriteLine("Description: " + description); 
                        }
                        else
                        {
                            Console.WriteLine("Sorry That Key Is Not In The Dictionary");
                        }
                        Console.WriteLine("Please Choose An Option... ");
                        break;

                    case "C": //count the items in the dictionary and list them
                        dictionaryLength = codingLanguages.Count;
                        Console.WriteLine("There are " + dictionaryLength + " items in the dictionary.");
                        codingLanguages.ToList().ForEach(x => Console.WriteLine(x.Value));//output individual values in dictionary
                        Console.WriteLine("Please Choose An Option... ");
                        break;

                    case "A": //enter a key and value to add item to dictionary
                        Console.WriteLine("Please Enter Key To Add: ");
                        enterKey = Console.ReadLine();
                        Console.WriteLine("Please Enter Description To Add: ");
                        enterValue = Console.ReadLine();
                        codingLanguages.Add(enterKey, enterValue);
                        Console.WriteLine("Please Choose An Option... ");
                        break;

                    case "R": //enter key to remove item from dictionary
                        Console.WriteLine("Please Enter Key To Remove: ");
                        enterKey = Console.ReadLine();
                        codingLanguages.Remove(enterKey);
                        Console.WriteLine("Please Choose An Option... ");
                        break;

                    case "X": //to exit console
                        Console.WriteLine("Thankyou For Using Me!");
                        break;

                    default: //default msg if no case has been chosen
                        Console.WriteLine("Please Choose An Option... ");
                        break;
                }
            } while (userInput != "X"); //exit loop when user input equals X
        }
    }
}
