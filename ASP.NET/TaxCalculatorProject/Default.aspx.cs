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
    int basicLimit = 43000; 



protected void BtnCalculateTax_Click(object sender, EventArgs e)
    {
        
        if (taxableIncome > basicLimit)
        {
            grossIncome = int.Parse(TxtIncomeInput.Text);

            taxableIncome = grossIncome - personalAllowance;

            int taxAt40 = Convert.ToInt32((taxableIncome - basicLimit) * higherTxRate);
            int taxAt20 = Convert.ToInt32(personalAllowance * basicTxRate);

            LblTax20.Text = taxAt20.ToString();
            LblTax40.Text = taxAt40.ToString();
        }

    }
}