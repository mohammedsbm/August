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

    protected void ButtonChkBox_Click(object sender, EventArgs e)
    {
        if(CheckBox1.Checked)
        {
            LabelChkBoxOutput.Text = "ThankYou For Checking The Box";
        }
        else
        {
            LabelChkBoxOutput.Text = "You Have Not Checked The Checkbox";
        }
    }

    protected void ButtonRb_Click(object sender, EventArgs e)
    {
        if(RadioButton1.Checked)
        {
            LabelRbOutput.Text = "ThankYou For Checking The Radio Button";
        }
        else
        {
            LabelRbOutput.Text = "The Radio Button Has Not Been Checked";
        }
    }

    protected void ButtonTextBox_Click(object sender, EventArgs e)
    {
        int txtCount;

        txtCount = TextBoxMulti.Text.Length;

        LabelTbOutput.Text = "You Have Typed " + txtCount.ToString() + " Characters";
    }

    protected void ButtonEmail_Click(object sender, EventArgs e)
    {
        if(TextBoxEmail.Text.Contains("@"))
        {
            LabelEmailOutput.Text = "You have entered a valid email";
        }
        else
        {
            LabelEmailOutput.Text = "You have not entered a valid email";
        }
    }

    protected void Calendar1_SelectionChanged(object sender, EventArgs e)
    {
        LabelDate.Text = "The date you have chosen is: " + Calendar1.SelectedDate.ToShortDateString();
    }

    protected void ButtonDropDown_Click(object sender, EventArgs e)
    {
        if (DropDownList1.SelectedItem.Selected)
        {
            LabelDdOutput.Text = "Your favourite language is " + DropDownList1.SelectedValue;
        }
        else
        {
            LabelDdOutput.Text = "You didnt select a favourite language";
        }
    }

    protected void ButtonChkBoxList_Click(object sender, EventArgs e)
    {
        foreach(ListItem c in CheckBoxList1.Items)
        {
            if(c.Selected)
            {
                LabelChkBox1Output.Text += "Your favourite ice cream is: " + c + "<br />";
            }
        }
    }

    protected void ButtonRb1_Click(object sender, EventArgs e)
    {
        if(RadioButtonList1.SelectedItem.Selected)
        {
            LabelRbOutput1.Text = "You Prefer " + RadioButtonList1.SelectedValue + " over the other types of music";
        }
    }
}