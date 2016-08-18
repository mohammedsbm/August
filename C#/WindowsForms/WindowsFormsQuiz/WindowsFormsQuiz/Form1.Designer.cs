namespace WindowsFormsQuiz
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
            this.components = new System.ComponentModel.Container();
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(Form1));
            this.tableLayoutPanel1 = new System.Windows.Forms.TableLayoutPanel();
            this.label1 = new System.Windows.Forms.Label();
            this.pictureBox1 = new System.Windows.Forms.PictureBox();
            this.groupBox1 = new System.Windows.Forms.GroupBox();
            this.labelQ1 = new System.Windows.Forms.Label();
            this.radioButtonQ1A1 = new System.Windows.Forms.RadioButton();
            this.radioButton1Q1A2 = new System.Windows.Forms.RadioButton();
            this.radioButtonQ1A3 = new System.Windows.Forms.RadioButton();
            this.labelQ1Result = new System.Windows.Forms.Label();
            this.pictureBox2 = new System.Windows.Forms.PictureBox();
            this.labelQ2 = new System.Windows.Forms.Label();
            this.groupBox2 = new System.Windows.Forms.GroupBox();
            this.labelQ2Result = new System.Windows.Forms.Label();
            this.radioButtonQ2A1 = new System.Windows.Forms.RadioButton();
            this.radioButtonQ2A2 = new System.Windows.Forms.RadioButton();
            this.radioButtonQ2A3 = new System.Windows.Forms.RadioButton();
            this.timer1 = new System.Windows.Forms.Timer(this.components);
            this.labelTimeLeft = new System.Windows.Forms.Label();
            this.labelTimerOutput = new System.Windows.Forms.Label();
            this.buttonStartTimer = new System.Windows.Forms.Button();
            this.pictureBox3 = new System.Windows.Forms.PictureBox();
            this.groupBox3 = new System.Windows.Forms.GroupBox();
            this.labelQ3 = new System.Windows.Forms.Label();
            this.radioButtonQ3A1 = new System.Windows.Forms.RadioButton();
            this.radioButtonQ3A2 = new System.Windows.Forms.RadioButton();
            this.radioButtonQ3A3 = new System.Windows.Forms.RadioButton();
            this.labelQ3Result = new System.Windows.Forms.Label();
            this.groupBox4 = new System.Windows.Forms.GroupBox();
            this.buttonClose = new System.Windows.Forms.Button();
            this.tableLayoutPanel1.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).BeginInit();
            this.groupBox1.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox2)).BeginInit();
            this.groupBox2.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox3)).BeginInit();
            this.groupBox3.SuspendLayout();
            this.groupBox4.SuspendLayout();
            this.SuspendLayout();
            // 
            // tableLayoutPanel1
            // 
            this.tableLayoutPanel1.ColumnCount = 3;
            this.tableLayoutPanel1.ColumnStyles.Add(new System.Windows.Forms.ColumnStyle(System.Windows.Forms.SizeType.Percent, 25F));
            this.tableLayoutPanel1.ColumnStyles.Add(new System.Windows.Forms.ColumnStyle(System.Windows.Forms.SizeType.Percent, 50F));
            this.tableLayoutPanel1.ColumnStyles.Add(new System.Windows.Forms.ColumnStyle(System.Windows.Forms.SizeType.Percent, 25F));
            this.tableLayoutPanel1.Controls.Add(this.label1, 0, 0);
            this.tableLayoutPanel1.Controls.Add(this.pictureBox1, 0, 1);
            this.tableLayoutPanel1.Controls.Add(this.groupBox1, 1, 1);
            this.tableLayoutPanel1.Controls.Add(this.labelQ1Result, 2, 1);
            this.tableLayoutPanel1.Controls.Add(this.pictureBox2, 0, 2);
            this.tableLayoutPanel1.Controls.Add(this.groupBox2, 1, 2);
            this.tableLayoutPanel1.Controls.Add(this.labelTimerOutput, 2, 0);
            this.tableLayoutPanel1.Controls.Add(this.labelQ2Result, 2, 2);
            this.tableLayoutPanel1.Controls.Add(this.labelTimeLeft, 1, 0);
            this.tableLayoutPanel1.Controls.Add(this.pictureBox3, 0, 3);
            this.tableLayoutPanel1.Controls.Add(this.groupBox3, 1, 3);
            this.tableLayoutPanel1.Controls.Add(this.labelQ3Result, 2, 3);
            this.tableLayoutPanel1.Controls.Add(this.groupBox4, 1, 4);
            this.tableLayoutPanel1.Location = new System.Drawing.Point(1, 2);
            this.tableLayoutPanel1.Name = "tableLayoutPanel1";
            this.tableLayoutPanel1.RowCount = 5;
            this.tableLayoutPanel1.RowStyles.Add(new System.Windows.Forms.RowStyle(System.Windows.Forms.SizeType.Percent, 10F));
            this.tableLayoutPanel1.RowStyles.Add(new System.Windows.Forms.RowStyle(System.Windows.Forms.SizeType.Percent, 25F));
            this.tableLayoutPanel1.RowStyles.Add(new System.Windows.Forms.RowStyle(System.Windows.Forms.SizeType.Percent, 25F));
            this.tableLayoutPanel1.RowStyles.Add(new System.Windows.Forms.RowStyle(System.Windows.Forms.SizeType.Percent, 25F));
            this.tableLayoutPanel1.RowStyles.Add(new System.Windows.Forms.RowStyle(System.Windows.Forms.SizeType.Percent, 15F));
            this.tableLayoutPanel1.Size = new System.Drawing.Size(560, 461);
            this.tableLayoutPanel1.TabIndex = 0;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Engravers MT", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(3, 0);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(125, 38);
            this.label1.TabIndex = 0;
            this.label1.Text = "Fast Car Quiz";
            // 
            // pictureBox1
            // 
            this.pictureBox1.Dock = System.Windows.Forms.DockStyle.Fill;
            this.pictureBox1.Image = ((System.Drawing.Image)(resources.GetObject("pictureBox1.Image")));
            this.pictureBox1.Location = new System.Drawing.Point(3, 49);
            this.pictureBox1.Name = "pictureBox1";
            this.pictureBox1.Size = new System.Drawing.Size(134, 109);
            this.pictureBox1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom;
            this.pictureBox1.TabIndex = 1;
            this.pictureBox1.TabStop = false;
            // 
            // groupBox1
            // 
            this.groupBox1.Controls.Add(this.radioButtonQ1A3);
            this.groupBox1.Controls.Add(this.radioButton1Q1A2);
            this.groupBox1.Controls.Add(this.radioButtonQ1A1);
            this.groupBox1.Controls.Add(this.labelQ1);
            this.groupBox1.Location = new System.Drawing.Point(143, 49);
            this.groupBox1.Name = "groupBox1";
            this.groupBox1.Size = new System.Drawing.Size(274, 109);
            this.groupBox1.TabIndex = 2;
            this.groupBox1.TabStop = false;
            // 
            // labelQ1
            // 
            this.labelQ1.AutoSize = true;
            this.labelQ1.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.labelQ1.Location = new System.Drawing.Point(-1, 10);
            this.labelQ1.Name = "labelQ1";
            this.labelQ1.Size = new System.Drawing.Size(115, 13);
            this.labelQ1.TabIndex = 0;
            this.labelQ1.Text = "Which Car Is This?";
            // 
            // radioButtonQ1A1
            // 
            this.radioButtonQ1A1.AutoSize = true;
            this.radioButtonQ1A1.Location = new System.Drawing.Point(16, 32);
            this.radioButtonQ1A1.Name = "radioButtonQ1A1";
            this.radioButtonQ1A1.Size = new System.Drawing.Size(81, 17);
            this.radioButtonQ1A1.TabIndex = 1;
            this.radioButtonQ1A1.TabStop = true;
            this.radioButtonQ1A1.Text = "Ferrari Enzo";
            this.radioButtonQ1A1.UseVisualStyleBackColor = true;
            this.radioButtonQ1A1.CheckedChanged += new System.EventHandler(this.radioButtonQ1A1_CheckedChanged);
            // 
            // radioButton1Q1A2
            // 
            this.radioButton1Q1A2.AutoSize = true;
            this.radioButton1Q1A2.Location = new System.Drawing.Point(16, 55);
            this.radioButton1Q1A2.Name = "radioButton1Q1A2";
            this.radioButton1Q1A2.Size = new System.Drawing.Size(75, 17);
            this.radioButton1Q1A2.TabIndex = 2;
            this.radioButton1Q1A2.TabStop = true;
            this.radioButton1Q1A2.Text = "Ferrari F40";
            this.radioButton1Q1A2.UseVisualStyleBackColor = true;
            this.radioButton1Q1A2.CheckedChanged += new System.EventHandler(this.radioButton1Q1A2_CheckedChanged);
            // 
            // radioButtonQ1A3
            // 
            this.radioButtonQ1A3.AutoSize = true;
            this.radioButtonQ1A3.Location = new System.Drawing.Point(16, 78);
            this.radioButtonQ1A3.Name = "radioButtonQ1A3";
            this.radioButtonQ1A3.Size = new System.Drawing.Size(81, 17);
            this.radioButtonQ1A3.TabIndex = 3;
            this.radioButtonQ1A3.TabStop = true;
            this.radioButtonQ1A3.Text = "Ferrari F430";
            this.radioButtonQ1A3.UseVisualStyleBackColor = true;
            this.radioButtonQ1A3.CheckedChanged += new System.EventHandler(this.radioButtonQ1A3_CheckedChanged);
            // 
            // labelQ1Result
            // 
            this.labelQ1Result.AutoSize = true;
            this.labelQ1Result.Font = new System.Drawing.Font("Wingdings", 72F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(2)));
            this.labelQ1Result.Location = new System.Drawing.Point(423, 46);
            this.labelQ1Result.Name = "labelQ1Result";
            this.labelQ1Result.Size = new System.Drawing.Size(0, 106);
            this.labelQ1Result.TabIndex = 3;
            // 
            // pictureBox2
            // 
            this.pictureBox2.Dock = System.Windows.Forms.DockStyle.Fill;
            this.pictureBox2.Image = ((System.Drawing.Image)(resources.GetObject("pictureBox2.Image")));
            this.pictureBox2.Location = new System.Drawing.Point(3, 164);
            this.pictureBox2.Name = "pictureBox2";
            this.pictureBox2.Size = new System.Drawing.Size(134, 109);
            this.pictureBox2.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom;
            this.pictureBox2.TabIndex = 4;
            this.pictureBox2.TabStop = false;
            // 
            // labelQ2
            // 
            this.labelQ2.AutoSize = true;
            this.labelQ2.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.labelQ2.Location = new System.Drawing.Point(-2, 8);
            this.labelQ2.Name = "labelQ2";
            this.labelQ2.Size = new System.Drawing.Size(275, 13);
            this.labelQ2.TabIndex = 0;
            this.labelQ2.Text = "Which Manufacturer Does This Car Belong To?";
            // 
            // groupBox2
            // 
            this.groupBox2.Controls.Add(this.radioButtonQ2A3);
            this.groupBox2.Controls.Add(this.radioButtonQ2A2);
            this.groupBox2.Controls.Add(this.radioButtonQ2A1);
            this.groupBox2.Controls.Add(this.labelQ2);
            this.groupBox2.Location = new System.Drawing.Point(143, 164);
            this.groupBox2.Name = "groupBox2";
            this.groupBox2.Size = new System.Drawing.Size(274, 109);
            this.groupBox2.TabIndex = 5;
            this.groupBox2.TabStop = false;
            // 
            // labelQ2Result
            // 
            this.labelQ2Result.AutoSize = true;
            this.labelQ2Result.Font = new System.Drawing.Font("Wingdings", 72F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(2)));
            this.labelQ2Result.Location = new System.Drawing.Point(423, 161);
            this.labelQ2Result.Name = "labelQ2Result";
            this.labelQ2Result.Size = new System.Drawing.Size(0, 106);
            this.labelQ2Result.TabIndex = 3;
            // 
            // radioButtonQ2A1
            // 
            this.radioButtonQ2A1.AutoSize = true;
            this.radioButtonQ2A1.Location = new System.Drawing.Point(16, 34);
            this.radioButtonQ2A1.Name = "radioButtonQ2A1";
            this.radioButtonQ2A1.Size = new System.Drawing.Size(63, 17);
            this.radioButtonQ2A1.TabIndex = 4;
            this.radioButtonQ2A1.TabStop = true;
            this.radioButtonQ2A1.Text = "Mclaren";
            this.radioButtonQ2A1.UseVisualStyleBackColor = true;
            this.radioButtonQ2A1.CheckedChanged += new System.EventHandler(this.radioButtonQ2A1_CheckedChanged);
            // 
            // radioButtonQ2A2
            // 
            this.radioButtonQ2A2.AutoSize = true;
            this.radioButtonQ2A2.Location = new System.Drawing.Point(16, 57);
            this.radioButtonQ2A2.Name = "radioButtonQ2A2";
            this.radioButtonQ2A2.Size = new System.Drawing.Size(58, 17);
            this.radioButtonQ2A2.TabIndex = 5;
            this.radioButtonQ2A2.TabStop = true;
            this.radioButtonQ2A2.Text = "Pagani";
            this.radioButtonQ2A2.UseVisualStyleBackColor = true;
            this.radioButtonQ2A2.CheckedChanged += new System.EventHandler(this.radioButtonQ2A2_CheckedChanged);
            // 
            // radioButtonQ2A3
            // 
            this.radioButtonQ2A3.AutoSize = true;
            this.radioButtonQ2A3.Location = new System.Drawing.Point(16, 80);
            this.radioButtonQ2A3.Name = "radioButtonQ2A3";
            this.radioButtonQ2A3.Size = new System.Drawing.Size(54, 17);
            this.radioButtonQ2A3.TabIndex = 6;
            this.radioButtonQ2A3.TabStop = true;
            this.radioButtonQ2A3.Text = "Ferrari";
            this.radioButtonQ2A3.UseVisualStyleBackColor = true;
            this.radioButtonQ2A3.CheckedChanged += new System.EventHandler(this.radioButtonQ2A3_CheckedChanged);
            // 
            // timer1
            // 
            this.timer1.Interval = 1000;
            this.timer1.Tick += new System.EventHandler(this.timer1_Tick);
            // 
            // labelTimeLeft
            // 
            this.labelTimeLeft.Anchor = System.Windows.Forms.AnchorStyles.Right;
            this.labelTimeLeft.AutoSize = true;
            this.labelTimeLeft.Location = new System.Drawing.Point(363, 16);
            this.labelTimeLeft.Name = "labelTimeLeft";
            this.labelTimeLeft.Size = new System.Drawing.Size(54, 13);
            this.labelTimeLeft.TabIndex = 6;
            this.labelTimeLeft.Text = "Time Left:";
            // 
            // labelTimerOutput
            // 
            this.labelTimerOutput.Anchor = System.Windows.Forms.AnchorStyles.None;
            this.labelTimerOutput.AutoSize = true;
            this.labelTimerOutput.Location = new System.Drawing.Point(472, 16);
            this.labelTimerOutput.Name = "labelTimerOutput";
            this.labelTimerOutput.Size = new System.Drawing.Size(35, 13);
            this.labelTimerOutput.TabIndex = 7;
            this.labelTimerOutput.Text = "label3";
            // 
            // buttonStartTimer
            // 
            this.buttonStartTimer.Anchor = ((System.Windows.Forms.AnchorStyles)((System.Windows.Forms.AnchorStyles.Bottom | System.Windows.Forms.AnchorStyles.Left)));
            this.buttonStartTimer.Location = new System.Drawing.Point(0, 25);
            this.buttonStartTimer.Name = "buttonStartTimer";
            this.buttonStartTimer.Size = new System.Drawing.Size(134, 39);
            this.buttonStartTimer.TabIndex = 8;
            this.buttonStartTimer.Text = "Start Timer";
            this.buttonStartTimer.UseVisualStyleBackColor = true;
            this.buttonStartTimer.Click += new System.EventHandler(this.buttonStartTimer_Click);
            // 
            // pictureBox3
            // 
            this.pictureBox3.Dock = System.Windows.Forms.DockStyle.Fill;
            this.pictureBox3.Image = ((System.Drawing.Image)(resources.GetObject("pictureBox3.Image")));
            this.pictureBox3.Location = new System.Drawing.Point(3, 279);
            this.pictureBox3.Name = "pictureBox3";
            this.pictureBox3.Size = new System.Drawing.Size(134, 109);
            this.pictureBox3.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom;
            this.pictureBox3.TabIndex = 9;
            this.pictureBox3.TabStop = false;
            // 
            // groupBox3
            // 
            this.groupBox3.Controls.Add(this.radioButtonQ3A3);
            this.groupBox3.Controls.Add(this.radioButtonQ3A2);
            this.groupBox3.Controls.Add(this.radioButtonQ3A1);
            this.groupBox3.Controls.Add(this.labelQ3);
            this.groupBox3.Location = new System.Drawing.Point(143, 279);
            this.groupBox3.Name = "groupBox3";
            this.groupBox3.Size = new System.Drawing.Size(273, 109);
            this.groupBox3.TabIndex = 10;
            this.groupBox3.TabStop = false;
            // 
            // labelQ3
            // 
            this.labelQ3.AutoSize = true;
            this.labelQ3.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.labelQ3.Location = new System.Drawing.Point(-2, 6);
            this.labelQ3.Name = "labelQ3";
            this.labelQ3.Size = new System.Drawing.Size(175, 13);
            this.labelQ3.TabIndex = 0;
            this.labelQ3.Text = "What Film Featured This Car?";
            // 
            // radioButtonQ3A1
            // 
            this.radioButtonQ3A1.AutoSize = true;
            this.radioButtonQ3A1.Location = new System.Drawing.Point(16, 40);
            this.radioButtonQ3A1.Name = "radioButtonQ3A1";
            this.radioButtonQ3A1.Size = new System.Drawing.Size(104, 17);
            this.radioButtonQ3A1.TabIndex = 1;
            this.radioButtonQ3A1.TabStop = true;
            this.radioButtonQ3A1.Text = "Fast And Furious";
            this.radioButtonQ3A1.UseVisualStyleBackColor = true;
            this.radioButtonQ3A1.CheckedChanged += new System.EventHandler(this.radioButtonQ3A1_CheckedChanged);
            // 
            // radioButtonQ3A2
            // 
            this.radioButtonQ3A2.AutoSize = true;
            this.radioButtonQ3A2.Location = new System.Drawing.Point(16, 63);
            this.radioButtonQ3A2.Name = "radioButtonQ3A2";
            this.radioButtonQ3A2.Size = new System.Drawing.Size(103, 17);
            this.radioButtonQ3A2.TabIndex = 2;
            this.radioButtonQ3A2.TabStop = true;
            this.radioButtonQ3A2.Text = "Need For Speed";
            this.radioButtonQ3A2.UseVisualStyleBackColor = true;
            this.radioButtonQ3A2.CheckedChanged += new System.EventHandler(this.radioButtonQ3A2_CheckedChanged);
            // 
            // radioButtonQ3A3
            // 
            this.radioButtonQ3A3.AutoSize = true;
            this.radioButtonQ3A3.Location = new System.Drawing.Point(16, 86);
            this.radioButtonQ3A3.Name = "radioButtonQ3A3";
            this.radioButtonQ3A3.Size = new System.Drawing.Size(123, 17);
            this.radioButtonQ3A3.TabIndex = 3;
            this.radioButtonQ3A3.TabStop = true;
            this.radioButtonQ3A3.Text = "Gone In 60 Seconds";
            this.radioButtonQ3A3.UseVisualStyleBackColor = true;
            this.radioButtonQ3A3.CheckedChanged += new System.EventHandler(this.radioButtonQ3A3_CheckedChanged);
            // 
            // labelQ3Result
            // 
            this.labelQ3Result.AutoSize = true;
            this.labelQ3Result.Font = new System.Drawing.Font("Wingdings", 72F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(2)));
            this.labelQ3Result.Location = new System.Drawing.Point(423, 276);
            this.labelQ3Result.Name = "labelQ3Result";
            this.labelQ3Result.Size = new System.Drawing.Size(0, 106);
            this.labelQ3Result.TabIndex = 11;
            // 
            // groupBox4
            // 
            this.groupBox4.Controls.Add(this.buttonClose);
            this.groupBox4.Controls.Add(this.buttonStartTimer);
            this.groupBox4.Location = new System.Drawing.Point(143, 394);
            this.groupBox4.Name = "groupBox4";
            this.groupBox4.Size = new System.Drawing.Size(273, 64);
            this.groupBox4.TabIndex = 12;
            this.groupBox4.TabStop = false;
            // 
            // buttonClose
            // 
            this.buttonClose.Location = new System.Drawing.Point(140, 25);
            this.buttonClose.Name = "buttonClose";
            this.buttonClose.Size = new System.Drawing.Size(133, 39);
            this.buttonClose.TabIndex = 9;
            this.buttonClose.Text = "Close";
            this.buttonClose.UseVisualStyleBackColor = true;
            this.buttonClose.Click += new System.EventHandler(this.buttonClose_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(561, 464);
            this.Controls.Add(this.tableLayoutPanel1);
            this.Name = "Form1";
            this.Text = "Fast Car Quiz";
            this.tableLayoutPanel1.ResumeLayout(false);
            this.tableLayoutPanel1.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).EndInit();
            this.groupBox1.ResumeLayout(false);
            this.groupBox1.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox2)).EndInit();
            this.groupBox2.ResumeLayout(false);
            this.groupBox2.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox3)).EndInit();
            this.groupBox3.ResumeLayout(false);
            this.groupBox3.PerformLayout();
            this.groupBox4.ResumeLayout(false);
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.TableLayoutPanel tableLayoutPanel1;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.PictureBox pictureBox1;
        private System.Windows.Forms.GroupBox groupBox1;
        private System.Windows.Forms.RadioButton radioButtonQ1A3;
        private System.Windows.Forms.RadioButton radioButton1Q1A2;
        private System.Windows.Forms.RadioButton radioButtonQ1A1;
        private System.Windows.Forms.Label labelQ1;
        private System.Windows.Forms.Label labelQ1Result;
        private System.Windows.Forms.PictureBox pictureBox2;
        private System.Windows.Forms.GroupBox groupBox2;
        private System.Windows.Forms.Label labelQ2;
        private System.Windows.Forms.Label labelQ2Result;
        private System.Windows.Forms.RadioButton radioButtonQ2A1;
        private System.Windows.Forms.RadioButton radioButtonQ2A2;
        private System.Windows.Forms.RadioButton radioButtonQ2A3;
        private System.Windows.Forms.Label labelTimeLeft;
        private System.Windows.Forms.Label labelTimerOutput;
        private System.Windows.Forms.Timer timer1;
        private System.Windows.Forms.Button buttonStartTimer;
        private System.Windows.Forms.PictureBox pictureBox3;
        private System.Windows.Forms.GroupBox groupBox3;
        private System.Windows.Forms.RadioButton radioButtonQ3A3;
        private System.Windows.Forms.RadioButton radioButtonQ3A2;
        private System.Windows.Forms.RadioButton radioButtonQ3A1;
        private System.Windows.Forms.Label labelQ3;
        private System.Windows.Forms.Label labelQ3Result;
        private System.Windows.Forms.GroupBox groupBox4;
        private System.Windows.Forms.Button buttonClose;
    }
}

