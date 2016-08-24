using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WindowsFormsExcercise
{
    public partial class Form1 : Form
    {
        //int celcius = 0;
        int farenheight = 0;

        public Form1()
        {
            InitializeComponent();
        }

        private void buttonConvert_Click(object sender, EventArgs e)
        {
            double userInput = double.Parse(textBoxCelcius.Text);
            double celcius = (userInput * 5.0/9.0) + 32;

            if (radioButtonCelcius.Checked)
            {
                textBoxFarenheight.Text = celcius.ToString();
            }
        }
    }
}
