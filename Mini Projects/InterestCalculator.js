//Mini Project - Interest only calculator - Create a small Javascript programme that enables users to calculate the interest they would pay on borrowing some money for a period of time at a fixed interest rate.There are 3 inputs, amount to borrow, interest rate, length of time of loan. Calculate and display the monthly interest payment on the loan and the total interest paid on the loan for the length of time of loan.

var event1 = document.getElementById("button1");
event1.addEventListener('click', myFunction, false);//link button one to run myFunction()

function myFunction()
{    
    var amountInput = document.getElementById("input1").value;
    var rateInput = document.getElementById("input2").value;
    var termInput = document.getElementById("input3").value;

    var borrowingAmount = parseInt(amountInput);
    var intresRate = parseInt(rateInput) / 100;
    var lengthOfLoan = parseInt(termInput);
       
    var annual = borrowingAmount * intresRate;
    var monthlyPaym = annual * lengthOfLoan / 12;
    //var totalIntPaym = "";
   
    document.getElementById("demo").innerHTML = "Total Interest Paid: " + annual;
    document.getElementById("demo2").innerHTML = "Monthly Payments Of: " + monthlyPaym;  
  
}



