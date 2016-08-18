namespace WindowsFormsDemoTwoForms
{
    partial class Form1
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.openFileDialog1 = new System.Windows.Forms.OpenFileDialog();
            this.colorDialog1 = new System.Windows.Forms.ColorDialog();
            this.buttonOpenFile = new System.Windows.Forms.Button();
            this.buttonChangeBgColour = new System.Windows.Forms.Button();
            this.buttonNextForm = new System.Windows.Forms.Button();
            this.richTextBox1 = new System.Windows.Forms.RichTextBox();
            this.SuspendLayout();
            // 
            // openFileDialog1
            // 
            this.openFileDialog1.FileName = "openFileDialog1";
            // 
            // buttonOpenFile
            // 
            this.buttonOpenFile.Location = new System.Drawing.Point(27, 33);
            this.buttonOpenFile.Name = "buttonOpenFile";
            this.buttonOpenFile.Size = new System.Drawing.Size(126, 43);
            this.buttonOpenFile.TabIndex = 0;
            this.buttonOpenFile.Text = "Open A Text File";
            this.buttonOpenFile.UseVisualStyleBackColor = true;
            this.buttonOpenFile.Click += new System.EventHandler(this.buttonOpenFile_Click);
            // 
            // buttonChangeBgColour
            // 
            this.buttonChangeBgColour.Location = new System.Drawing.Point(27, 115);
            this.buttonChangeBgColour.Name = "buttonChangeBgColour";
            this.buttonChangeBgColour.Size = new System.Drawing.Size(126, 49);
            this.buttonChangeBgColour.TabIndex = 1;
            this.buttonChangeBgColour.Text = "Change Background Colour";
            this.buttonChangeBgColour.UseVisualStyleBackColor = true;
            this.buttonChangeBgColour.Click += new System.EventHandler(this.buttonChangeBgColour_Click);
            // 
            // buttonNextForm
            // 
            this.buttonNextForm.Location = new System.Drawing.Point(27, 199);
            this.buttonNextForm.Name = "buttonNextForm";
            this.buttonNextForm.Size = new System.Drawing.Size(126, 46);
            this.buttonNextForm.TabIndex = 2;
            this.buttonNextForm.Text = "Go To Next Window";
            this.buttonNextForm.UseVisualStyleBackColor = true;
            this.buttonNextForm.Click += new System.EventHandler(this.buttonNextForm_Click);
            // 
            // richTextBox1
            // 
            this.richTextBox1.Location = new System.Drawing.Point(184, 33);
            this.richTextBox1.Name = "richTextBox1";
            this.richTextBox1.Size = new System.Drawing.Size(302, 212);
            this.richTextBox1.TabIndex = 3;
            this.richTextBox1.Text = "";
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(514, 288);
            this.Controls.Add(this.richTextBox1);
            this.Controls.Add(this.buttonNextForm);
            this.Controls.Add(this.buttonChangeBgColour);
            this.Controls.Add(this.buttonOpenFile);
            this.Name = "Form1";
            this.Text = "Two Forms";
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.OpenFileDialog openFileDialog1;
        private System.Windows.Forms.ColorDialog colorDialog1;
        private System.Windows.Forms.Button buttonOpenFile;
        private System.Windows.Forms.Button buttonChangeBgColour;
        private System.Windows.Forms.Button buttonNextForm;
        private System.Windows.Forms.RichTextBox richTextBox1;
    }
}

