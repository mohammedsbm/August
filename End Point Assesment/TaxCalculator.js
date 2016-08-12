/*End Point Assesment - Salary Tax Calculator - 1. Calculate tax due on a salary input on a webpage by the user, using the 2016-2017 tax allowances and rates as follows:

Personal allowance: £11,000

20% tax rate on next £32,000

40% tax rate on amounts above that

2. Test the application by inputting salaries of £11,000, £43,000 and £50,000 to ensure that the results are correct.  Work out in advance the results that you would expect.

 

3. Design and present the webpage nicely, with a neat and user-friendly layout and pleasant colours and fonts.

 

The purpose of the assessment is for us to be aware of your progress.  You will receive feedback, but no numerical mark.  The assessment is not timed, so you can spend as long as you want on it (though you will probably want to finish by lunchtime).  You can use books and the internet for help or ask me.  I will demonstrate the calculations if needed.  However, please don't help each other on this - we need to see the results of your independent work.

 

When we mark the assessment, we will be looking for:

 

Working code

Correct results

Meaningful variable names

Comments

User-friendly interface

Appealing interface

 

Additional challenges

 

Use the tax rules at: https://www.gov.uk/government/publications/tax-and-tax-credit-rates-and-thresholds-for-2016-17/tax-and-tax-credit-rates-and-thresholds-for-2016-17 for information for the following:

 

1. Apply the additional tax rate and adjustment to personal allowances for high salaries.

2. Deduct National Insurance Class 1 contributions.  See http://www.which.co.uk/money/tax/guides/national-insurance-explained/national-insurance-rates/ for information about how to calculate this.

3. Offer the option of deducting pension contributions at a percentage of salary entered by the user.

4. Offer the option of taking childcare vouchers (only apply the rules for people earning over £8,500). Details at: https://www.gov.uk/expenses-and-benefits-childcare/whats-exempt

5. Add a pie chart showing the proportion of gross salary represented by net income, tax at the various rates, NI, etc.  Chart.js is a graphs plug-in that is quite easy to use and has good documentation, but feel free to use any others that you like.
*/

var grossSalary = 0; //declare grossSalary as global variable and use and modify within functions
var personalAllow = 0; //declare personalAllow as global variable and use and modify within functions
var taxableIncome = 0; //declare taxableIncome as global variable and use and modify within functions

var event1 = document.getElementById("button1"); //create variable to store button1
event1.addEventListener('click', getInput, false); //link button1 to run getInput()

function getInput()
{
    var grossInput = document.getElementById("grossInput").value; //get user input from form
    //alert("gross input =" + grossInput);

    grossSalary = parseInt(grossInput); //convert user input into int
    //alert("gross sal =" + grossSalary);

    personalAllow = 11000; //initialise tax free allowance to 11000

    taxableIncome = grossSalary - personalAllow; //calculate taxable income
    
    showResults(); //call function showresults()
 
}

function taxAt40() //function to calculate tax at 40%
{
    //alert(taxableIncome);
    if(taxableIncome > 32000) //if taxable income is more than 32000 execute code else return 0.
        {
            var tax40 = (taxableIncome - 32000) * 0.4; 
            
            return tax40;
        }
        else return 0;
    
};

function taxAt20() //function to calculate tax at 20%
{
    //alert(personalAllow);
    if(taxableIncome > personalAllow) //if taxable income is more than personal allowance execute code else return 0.
       {
           var tax20 = 32000 * 0.2;
          
           return tax20;
       }
    else return 0;
    
       
};

function showResults() //function to display results onto the explorer window
{        
    var totalTaxPaid = taxAt20() + taxAt40(); //variable to store total tax paid
    
    var netSalary = grossSalary - totalTaxPaid; //variable to store net salary
    //alert(netSalary);
    
    document.getElementById("demo").innerHTML = "<span class='text-center'>" + grossSalary + "</span>";
    document.getElementById("demo2").innerHTML = "<span class='text-center'>" + personalAllow + "</span>";
    document.getElementById("demo3").innerHTML = "<span class='text-center'>" + taxAt20() + "</span>";
    document.getElementById("demo4").innerHTML = "<span class='text-center'>" + taxAt40() + "</span>";
    document.getElementById("demo5").innerHTML = "<span class='text-center'>" + netSalary + "</span>";
};



