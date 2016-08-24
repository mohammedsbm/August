namespace WindowsFormsExcercise
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
            this.textBoxCelcius = new System.Windows.Forms.TextBox();
            this.textBoxFarenheight = new System.Windows.Forms.TextBox();
            this.buttonConvert = new System.Windows.Forms.Button();
            this.radioButtonCelcius = new System.Windows.Forms.RadioButton();
            this.radioButtonFarenheight = new System.Windows.Forms.RadioButton();
            this.SuspendLayout();
            // 
            // textBoxCelcius
            // 
            this.textBoxCelcius.Location = new System.Drawing.Point(106, 150);
            this.textBoxCelcius.Name = "textBoxCelcius";
            this.textBoxCelcius.Size = new System.Drawing.Size(109, 20);
            this.textBoxCelcius.TabIndex = 0;
            // 
            // textBoxFarenheight
            // 
            this.textBoxFarenheight.Location = new System.Drawing.Point(108, 110);
            this.textBoxFarenheight.Name = "textBoxFarenheight";
            this.textBoxFarenheight.Size = new System.Drawing.Size(107, 20);
            this.textBoxFarenheight.TabIndex = 1;
            // 
            // buttonConvert
            // 
            this.buttonConvert.Location = new System.Drawing.Point(118, 207);
            this.buttonConvert.Name = "buttonConvert";
            this.buttonConvert.Size = new System.Drawing.Size(75, 23);
            this.buttonConvert.TabIndex = 6;
            this.buttonConvert.Text = "Convert";
            this.buttonConvert.UseVisualStyleBackColor = true;
            this.buttonConvert.Click += new System.EventHandler(this.buttonConvert_Click);
            // 
            // radioButtonCelcius
            // 
            this.radioButtonCelcius.AutoSize = true;
            this.radioButtonCelcius.Location = new System.Drawing.Point(118, 31);
            this.radioButtonCelcius.Name = "radioButtonCelcius";
            this.radioButtonCelcius.Size = new System.Drawing.Size(59, 17);
            this.radioButtonCelcius.TabIndex = 7;
            this.radioButtonCelcius.TabStop = true;
            this.radioButtonCelcius.Text = "Celcius";
            this.radioButtonCelcius.UseVisualStyleBackColor = true;
            // 
            // radioButtonFarenheight
            // 
            this.radioButtonFarenheight.AutoSize = true;
            this.radioButtonFarenheight.Location = new System.Drawing.Point(118, 66);
            this.radioButtonFarenheight.Name = "radioButtonFarenheight";
            this.radioButtonFarenheight.Size = new System.Drawing.Size(81, 17);
            this.radioButtonFarenheight.TabIndex = 8;
            this.radioButtonFarenheight.TabStop = true;
            this.radioButtonFarenheight.Text = "Farenheight";
            this.radioButtonFarenheight.UseVisualStyleBackColor = true;
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(311, 264);
            this.Controls.Add(this.radioButtonFarenheight);
            this.Controls.Add(this.radioButtonCelcius);
            this.Controls.Add(this.buttonConvert);
            this.Controls.Add(this.textBoxFarenheight);
            this.Controls.Add(this.textBoxCelcius);
            this.Name = "Form1";
            this.Text = "Form1";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.TextBox textBoxCelcius;
        private System.Windows.Forms.TextBox textBoxFarenheight;
        private System.Windows.Forms.Button buttonConvert;
        private System.Windows.Forms.RadioButton radioButtonCelcius;
        private System.Windows.Forms.RadioButton radioButtonFarenheight;
    }
}

