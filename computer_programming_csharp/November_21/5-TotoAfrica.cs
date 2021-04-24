using System;
using System.Linq;

namespace TotoAfrica
{
    class Program
    {
        static void Main(string[] args)
        {
            Random r = new Random();
            int[] africa = new int[6];
            
            for (int i = 0; i < africa.Length; i++)
            {
                int number = r.Next(1, 49);

                if (africa.Contains(number)) {
                    number = r.Next(1, 49);
                }

                africa[i] = number;
                Console.Write(africa[i] + " ");
            }

            Console.ReadKey();
        }
    }
}
