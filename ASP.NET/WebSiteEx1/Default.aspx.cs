using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class _Default : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }

    protected void ButtonName_Click(object sender, EventArgs e)
    {
        LabelOutput.Text = "Hello " + TextBoxName.Text;
    }

    protected void ButtonCheckBox_Click(object sender, EventArgs e)
    {
        if(CheckBox1.Checked)
        {
            LabelCbOutput.Text = "The Box Is Checked";
        }
        else
        {
            LabelCbOutput.Text = "The Box Is Not Checked";
        }
    }

    protected void ButtonRadioButton_Click(object sender, EventArgs e)
    {
        if(RadioButton1.Checked)
        {
            LabelRbOutput.Text = "The Radio Button Is Checked";
        }
        else
        {
            LabelRbOutput.Text = "The Radio Button Is Not Checked";
        }
    }

    protected void ButtonRadioList_Click(object sender, EventArgs e)
    {
        if(RadioButtonList1.SelectedItem.Selected)
        {
            LabelRbListOutput.Text = "You Have Selected " + RadioButtonList1.SelectedItem.Value;
        }
        else
        {
            LabelRbListOutput.Text = "You Havent Selected Any Button";
        }
    }
}