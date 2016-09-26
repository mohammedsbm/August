using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;



public partial class _Default : System.Web.UI.Page
{
    double nic2Percent = 0.02;
    double nic12Percent = 0.12;
    double basicTxRate = 0.2;
    double higherTxRate = 0.4;
    double addTxRate = 0.45;
    int personalAllowance = 11000;
    //int newPersonalAllowance;
    int niThreshold1 = 8060;
    int niThreshold2 = 43000;
    int grossIncome = 0;
    int taxableIncome = 0;
    int basicLimit = 43000;
    int addiLimit = 150000;
    double netIncome = 0;
    //int reduceBy = 0;
    double totalTax = 0;
    double tax40 = 0;
    double tax20 = 0;
    double tax45 = 0;
    double niTax = 0;

    private double reducedPa() //personal allowance for gross income between 100,000 and 122,000
    {
            int reduceBy = (grossIncome - 100000) / 2;
            int newPersonalAllowance = personalAllowance - reduceBy;
            taxableIncome = grossIncome - newPersonalAllowance;
            //personalAllowance = newPersonalAllowance;
            LblPersonalAllow.Text = newPersonalAllowance.ToString();
            tax40 = (taxableIncome - 32000) * higherTxRate;
            //totalTax = tax40 + 6400;
            LblTax40.Text = tax40.ToString();
        //LblTotalTax.Text = totalTax.ToString();

        if (newPersonalAllowance <= 0)
            {
                taxableIncome = grossIncome;
                tax40 = (taxableIncome - 32000) * higherTxRate;
                LblPersonalAllow.Text = 0.ToString();
        }
            return taxableIncome;        
    }

    private double taxAt45()
    {
        grossIncome = int.Parse(TxtIncomeInput.Text);
        if (grossIncome > addiLimit)
        {
            tax45 = (grossIncome - addiLimit) * addTxRate;
            return tax45;
        }
            
                return tax45;
    }

    private double taxAt40() //function to calculate tax at 40%
    {
        grossIncome = int.Parse(TxtIncomeInput.Text);
        if(grossIncome > addiLimit)
        {
            tax40 = 118000 * higherTxRate;
            LblPersonalAllow.Text = 0.ToString();
            return tax40;
        }

        else if (grossIncome > 100000)
        {
            reducedPa();
            return tax40;
        }
           
        //alert(taxableIncome);
        else if (grossIncome > 43000) //if taxable income is more than 32000 execute code else return 0.
        {
            taxableIncome = grossIncome - personalAllowance;
            tax40 = (grossIncome - basicLimit) * higherTxRate;

            return tax40;
        }
        else return tax40;
    }

    private double taxAt20() //function to calculate tax at 20%
    {
        grossIncome = int.Parse(TxtIncomeInput.Text);
        //reducedPa();
        //alert(personalAllow);
        if (grossIncome > basicLimit)  //40% tax payers
        {
            tax20 = 32000 * basicTxRate;
        }
        else if (grossIncome > personalAllowance)//20% tax payers
        {
            tax20 = (grossIncome - personalAllowance) * basicTxRate;
        }
        else
            tax20 = 0;

        return tax20;
    }

    private double niTax12()
    {
        grossIncome = int.Parse(TxtIncomeInput.Text);

        if (grossIncome > niThreshold2) //tax at 2%
        {
            double nic12 = (niThreshold2 - niThreshold1) * nic12Percent; //12%
            double nic2 = (grossIncome - niThreshold2) * nic2Percent; //2%
            niTax = nic12 + nic2;
        }
        else if (grossIncome > niThreshold1) //tax at 12%
        {
            niTax = (grossIncome - niThreshold1) * nic12Percent;
        }
        else if (grossIncome < niThreshold1)
        {
            niTax = 0; //no tax
        }

        return niTax;
    }

    //private void checkRadio()
    //{

    //}

    //private double getData(Label labeldata)
    //{
    //    if (!string.IsNullOrWhiteSpace(labeldata.Text))
    //    {

    //        return double.Parse(labeldata.Text);
    //    }
    //    else
    //    {
    //        return 0;
    //    }
    //}

    //private void DrawChart()
    //{
    //    string chartType = "'pie'";
    //    Type Income = GetType();
    //    //Type Expenses = GetType();

    //    totalTax = getData(LblTotalTax);
    //    netIncome = getData(LblNetIncome);

    //    //salary = getUserData(SalaryTextBox);
    //    //addIncome = getUserData(AdditionalIncomeTextBox);
    //    //mortgage = getUserData(MortgageTextBox);
    //    //electricty = getUserData(ElectricityTextBox);
    //    //gas = getUserData(GasTextBox);
    //    //tv = getUserData(TvTextBox);
    //    //phone = getUserData(PhoneTextBox);
    //    //internet = getUserData(InternetTextBox);
    //    //petrol = getUserData(PetrolTextBox);
    //    //insurance = getUserData(InsuranceTextBox);
    //    //otherExp = getUserData(OtherExpTextBox);

    //    //totalIncome = salary + addIncome;

    //    //utilities = electricty + gas;
    //    //tvandothers = tv + phone + internet;

    //    //totalExp = mortgage + utilities + tvandothers + petrol + insurance + otherExp;

    //    //total = totalIncome - totalExp;

    //    StringBuilder incomestring = new StringBuilder();
    //    incomestring.Append("drawIncome(" + chartType + "," + totalTax + "," + netIncome + "," + grossIncome + ");");

    //    //StringBuilder expensestring = new StringBuilder();
    //    //expensestring.Append("drawExp(" + chartType + "," + mortgage + "," + utilities + "," + tvandothers + "," + petrol + "," + insurance + "," + otherExp + "," + totalExp + ");");


    //    ClientScript.RegisterStartupScript(this.GetType(), "draw", incomestring.ToString(), true);

    //    //ClientScript.RegisterStartupScript(this.GetType(), "draw1", expensestring.ToString(), true);

    //    //ClientScript.RegisterStartupScript(this.GetType(), "draw", "drawChart('" + chartType + "','" + salary + "','" + addIncome + "','" + totalIncome + "');", true);

    //}

    private void calculateTax()
    {
       
        totalTax = taxAt20() + taxAt40() + taxAt45() + niTax12();
        netIncome = grossIncome - totalTax;

        LblPersonalAllow.Text = "£" + personalAllowance.ToString();
        LblTax45.Text = "£" + taxAt45().ToString();
        LblTax40.Text = "£" + taxAt40().ToString();
        LblTax20.Text = "£" + taxAt20().ToString();
        LblTotalTax.Text = "£" + totalTax.ToString();
        LblTaxNi.Text = "£" + niTax12().ToString();
        LblNetIncome.Text = "£" + netIncome.ToString();

    }

    protected void BtnCalculateTax_Click(object sender, EventArgs e)
    {
        calculateTax();

        //DrawChart();
    }
}