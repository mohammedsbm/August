using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DataStorage
{
    class Program
    {
        static void Main(string[] args)
        {
            double num = 2; //this one runs
            string ohSnap = "%$^&$ "; //this one runs
            int num2 = 10.9; //wrong data type and cannot be converted from double to int (not a whole number)
            byte smallNum = -42; //wrong data type, constant value '-42' cant be converted to a 'byte' (bytes cant be negative)
            char word = 'word'; //will not compile, too many characters in character literal (char is a single character)
            long bigNum = 12345678.9; //wrong data type, cannot convert 'double' to 'long' (cannot store decimal values, long is for whole numbers only)
            float x = 3.5F; //this one runs
            decimal deciNum = 4.2m; //this one runs, (the 'm' tells c# the value is a decimal not a double or float)
            Console.WriteLine(deciNum);
        }
    }
}
