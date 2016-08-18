namespace WindowsFormsDemoTwoForms
{
    partial class Form2
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
            this.buttonPreviousForm = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // buttonPreviousForm
            // 
            this.buttonPreviousForm.Location = new System.Drawing.Point(38, 40);
            this.buttonPreviousForm.Name = "buttonPreviousForm";
            this.buttonPreviousForm.Size = new System.Drawing.Size(213, 169);
            this.buttonPreviousForm.TabIndex = 0;
            this.buttonPreviousForm.Text = "Return To Previous Form";
            this.buttonPreviousForm.UseVisualStyleBackColor = true;
            this.buttonPreviousForm.Click += new System.EventHandler(this.buttonPreviousForm_Click);
            // 
            // Form2
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(284, 261);
            this.Controls.Add(this.buttonPreviousForm);
            this.Name = "Form2";
            this.Text = "Form2";
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Button buttonPreviousForm;
    }
}