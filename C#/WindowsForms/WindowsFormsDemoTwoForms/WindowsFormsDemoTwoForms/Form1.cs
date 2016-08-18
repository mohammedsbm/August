using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WindowsFormsDemoTwoForms
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void buttonOpenFile_Click(object sender, EventArgs e)
        {
            openFileDialog1.DefaultExt = "*.txt";
            openFileDialog1.Filter = "Text files (*.txt)| *.txt| All files (*.*)|*.*";

            if((openFileDialog1.ShowDialog() == DialogResult.OK) && 
                (openFileDialog1.FileName.Length > 0))
            {
                richTextBox1.LoadFile(openFileDialog1.FileName, RichTextBoxStreamType.PlainText);
            }
        }

        private void buttonChangeBgColour_Click(object sender, EventArgs e)
        {
            if(colorDialog1.ShowDialog() == DialogResult.OK)
            {
                BackColor = colorDialog1.Color;
            }
        }

        private void buttonNextForm_Click(object sender, EventArgs e)
        {
            //go to next form
            Form2 nextForm = new Form2(); //create new form object
            nextForm.Show(); //show new form
            this.Hide(); //hide current form

            FormState.previousPage = this; //previous page is the form hidden
        }

    }

    public static class FormState
    {
        public static Form previousPage;
    }
}
