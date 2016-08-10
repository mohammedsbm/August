//Mini Project - Interest only calculator - Create a small Javascript programme that enables users to calculate the interest they would pay on borrowing some money for a period of time at a fixed interest rate.There are 3 inputs, amount to borrow, interest rate, length of time of loan. Calculate and display the monthly interest payment on the loan and the total interest paid on the loan for the length of time of loan.

var event1 = document.getElementById("button1");
event1.addEventListener('click', myFunction, false);//link button one to run myFunction()

function myFunction()
{    
    var amountInput = document.getElementById("input1").value; //get user input from form
    var rateInput = document.getElementById("input2").value; //get user input from form
    var termInput = document.getElementById("input3").value; //get user input from form

    var intresRate = parseInt(rateInput) / 100; //convert user input into int and / by 12
    var borrowingAmount = parseInt(amountInput); //convert user input into int
    var lengthOfLoan = parseInt(termInput); //convert user input into int
    
    
    var numberOfMonths = lengthOfLoan * 12; //declare how many months in the year nd * by length of the loan
    var annual = borrowingAmount * intresRate; //calculate total annual repayment for 1 year
    var monthlyPaym = annual * lengthOfLoan / 12; //calculate total monthly payment for 1 year
    var totalIntPaym = annual * lengthOfLoan; //calculate total interest paid on the loan
    var totalMonthlyPaym = totalIntPaym / numberOfMonths; //calculate total monthly interest payments on the loan
   
    document.getElementById("demo").innerHTML = "Total Interest Paid: £" + totalIntPaym; //display total interest paid
    
    document.getElementById("demo2").innerHTML = "Monthly Interest Payments Of: £" + totalMonthlyPaym;  //display monthly interest payments
  
}



