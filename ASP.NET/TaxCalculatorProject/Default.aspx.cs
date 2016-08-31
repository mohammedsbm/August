using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;



public partial class _Default : System.Web.UI.Page
{
    double basicTxRate = 0.2;
    double higherTxRate = 0.4;
    double addTxRate = 0.45;
    int personalAllowance = 11000;
    int niThreshold = 8060;
    int grossIncome;
    int taxableIncome;
    int niTaxable;

    private double taxAt40()
    {
        grossIncome = Convert.ToInt32(TxtIncomeInput.Text);

        taxableIncome = grossIncome - personalAllowance;

        double tax40 = (taxableIncome - 43000) * higherTxRate;

        return tax40;
    }

    private double taxAt20()
    {
        grossIncome = Convert.ToInt32(TxtIncomeInput.Text);

        taxableIncome = grossIncome - personalAllowance;

        double Tax20 = taxableIncome * basicTxRate;

        return Tax20;
    }

    private double taxNi12(int grossIncome)
    {
        grossIncome = Convert.ToInt32(TxtIncomeInput.Text);

        niTaxable = 43000 - niThreshold;

        if (niTaxable > niThreshold)
        {
            var niTaxed = niTaxable * 0.12;

            return niTaxed;
        }
        else return 0;

    }

    private double taxNi2(int grossIncome)
    {
        grossIncome = Convert.ToInt32(TxtIncomeInput.Text);

        if (grossIncome > 43000)
        {
            var niTaxed = (grossIncome - 43000) * 0.02;

            return niTaxed;
        }
        else return 0;
    }
    
    private int calculateTax(int grossIncome)
    {
        if(grossIncome <= personalAllowance)
        {
            taxAt20();
        }
        else if(grossIncome >= 43000)
        {
            taxAt40();
        }
        else if(grossIncome > personalAllowance)
        {
            taxAt20();
        }
    }       

protected void BtnCalculateTax_Click(object sender, EventArgs e)
    {
        LblTax20.Text = Convert.ToDouble(taxAt20()).ToString();
    }
}