using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace LiczbaPierwsza
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Button_Click(object sender, EventArgs e)
        {
            int x = int.Parse(textBox1.Text);
            if (x == 2)
                label1.Text = x + " is a primary number";
            else if (x % 2 == 0)
                label1.Text = x + " is not a primary number";
            else
            {
                bool primary = true;
                for (int i = 3; i < Math.Sqrt(x) + 1; i += 2)
                {
                    if (x % i == 0)
                    {
                        primary = false;
                        label1.Text = x + " is not a primary number";
                        break;
                    }
                }
                if (primary)
                    label1.Text = x + " is a primary number";
            }
        }

        private void TextBox_TextChanged(object sender, EventArgs e)
        {

        }
    }
}
