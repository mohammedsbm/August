using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WindowsFormsQuiz
{
    public partial class Form1 : Form
    {
        int timeLeft = 60; //initiate timer start value to 60
        bool q1Correct = false;
        bool q2Correct = false;
        bool q3Correct = false;

        public Form1()
        {
            InitializeComponent();

            //hide quiz
            pictureBox1.Visible = false;
            pictureBox2.Visible = false;
            pictureBox3.Visible = false;
            groupBox1.Visible = false;
            groupBox2.Visible = false;
            groupBox3.Visible = false;
            

        }

        private void radioButtonQ1A1_CheckedChanged(object sender, EventArgs e)
        {
            if (radioButtonQ1A1.Checked)
            {
                labelQ1Result.ForeColor = Color.Red;
                labelQ1Result.Text = "\u00fb"; //cross
                q1Correct = false;
            }
        }

        private void radioButton1Q1A2_CheckedChanged(object sender, EventArgs e)
        {
            if (radioButton1Q1A2.Checked)
            {
                labelQ1Result.ForeColor = Color.Red;
                labelQ1Result.Text = "\u00fb"; //cross
                q1Correct = false;
            }
        }

        private void radioButtonQ1A3_CheckedChanged(object sender, EventArgs e)
        {
            if (radioButtonQ1A3.Checked)
            {
                labelQ1Result.ForeColor = Color.Green;
                labelQ1Result.Text = "\u00fc"; //tick
                q1Correct = true;
            }
        }

        private void radioButtonQ2A1_CheckedChanged(object sender, EventArgs e)
        {
            if (radioButtonQ2A1.Checked)
            {
                labelQ2Result.ForeColor = Color.Red;
                labelQ2Result.Text = "\u00fb"; //cross
                q2Correct = false;
            }
        }

        private void radioButtonQ2A2_CheckedChanged(object sender, EventArgs e)
        {
            if (radioButtonQ2A2.Checked)
            {
                labelQ2Result.ForeColor = Color.Green;
                labelQ2Result.Text = "\u00fc"; //tick
                q2Correct = true;
            }
        }

        private void radioButtonQ2A3_CheckedChanged(object sender, EventArgs e)
        {
            if (radioButtonQ2A3.Checked)
            {
                labelQ2Result.ForeColor = Color.Red;
                labelQ2Result.Text = "\u00fb"; //cross
                q2Correct = false;
            }
        }

        private void timer1_Tick(object sender, EventArgs e)
        {
            if(q1Correct && q2Correct && q3Correct)
            {
                timer1.Stop();
                MessageBox.Show("You got everything right. Well Done!!", "Well Done");
            }
            else if(timeLeft > 0)
            {
                //update timer and display timeleft
                timeLeft--;
                labelTimerOutput.Text = timeLeft + " seconds";
            }
            else
            {
                //if the user runs out of time
                timer1.Stop();
                labelTimerOutput.Text = "Times Up!!";
                MessageBox.Show("You ran out of time", "Sorry");
            }
        }

        private void buttonStartTimer_Click(object sender, EventArgs e)
        {
            //start timer and disable timer button
            timer1.Start();
            buttonStartTimer.Enabled = false;

            //show quiz once timer begins
            pictureBox1.Visible = true;
            pictureBox2.Visible = true;
            pictureBox3.Visible = true;
            groupBox1.Visible = true;
            groupBox2.Visible = true;
            groupBox3.Visible = true;
        }

        private void radioButtonQ3A1_CheckedChanged(object sender, EventArgs e)
        {
            if (radioButtonQ3A1.Checked)
            {
                labelQ3Result.ForeColor = Color.Green;
                labelQ3Result.Text = "\u00fc"; //tick
                q3Correct = true;
            }
        }

        private void radioButtonQ3A2_CheckedChanged(object sender, EventArgs e)
        {
            if (radioButtonQ3A2.Checked)
            {
                labelQ3Result.ForeColor = Color.Red;
                labelQ3Result.Text = "\u00fb"; //tick
                q3Correct = false;
            }
        }

        private void radioButtonQ3A3_CheckedChanged(object sender, EventArgs e)
        {
            if (radioButtonQ3A3.Checked)
            {
                labelQ3Result.ForeColor = Color.Red;
                labelQ3Result.Text = "\u00fb"; //tick
                q3Correct = false;
            }
        }

        private void buttonClose_Click(object sender, EventArgs e)
        {
            this.Close(); //close window
        }
    }
}
