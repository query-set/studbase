using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace NWD
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            ulong m, n, diff;

            m = ulong.Parse(textBox1.Text);
            n = ulong.Parse(textBox2.Text);

            do
            {
                diff = m > n ? m - n : n - m;
                if (n > m)
                    n = diff;
                else
                    m = diff;
            }
            while (diff != 0);

            label3.Text = $"The NWD for these numbers is {n}";
        }
    }
}
