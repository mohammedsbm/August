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
            this.labelCelcius = new System.Windows.Forms.Label();
            this.labelFarenheight = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.buttonConvert = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // textBoxCelcius
            // 
            this.textBoxCelcius.Location = new System.Drawing.Point(162, 42);
            this.textBoxCelcius.Name = "textBoxCelcius";
            this.textBoxCelcius.Size = new System.Drawing.Size(109, 20);
            this.textBoxCelcius.TabIndex = 0;
            // 
            // textBoxFarenheight
            // 
            this.textBoxFarenheight.Location = new System.Drawing.Point(163, 91);
            this.textBoxFarenheight.Name = "textBoxFarenheight";
            this.textBoxFarenheight.Size = new System.Drawing.Size(107, 20);
            this.textBoxFarenheight.TabIndex = 1;
            // 
            // labelCelcius
            // 
            this.labelCelcius.AutoSize = true;
            this.labelCelcius.Location = new System.Drawing.Point(47, 49);
            this.labelCelcius.Name = "labelCelcius";
            this.labelCelcius.Size = new System.Drawing.Size(41, 13);
            this.labelCelcius.TabIndex = 2;
            this.labelCelcius.Text = "Celcius";
            // 
            // labelFarenheight
            // 
            this.labelFarenheight.AutoSize = true;
            this.labelFarenheight.Location = new System.Drawing.Point(47, 98);
            this.labelFarenheight.Name = "labelFarenheight";
            this.labelFarenheight.Size = new System.Drawing.Size(63, 13);
            this.labelFarenheight.TabIndex = 3;
            this.labelFarenheight.Text = "Farenheight";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(47, 165);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(35, 13);
            this.label2.TabIndex = 4;
            this.label2.Text = "label2";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(235, 165);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(35, 13);
            this.label3.TabIndex = 5;
            this.label3.Text = "label3";
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
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(311, 264);
            this.Controls.Add(this.buttonConvert);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.labelFarenheight);
            this.Controls.Add(this.labelCelcius);
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
        private System.Windows.Forms.Label labelCelcius;
        private System.Windows.Forms.Label labelFarenheight;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Button buttonConvert;
    }
}

