using System;

namespace MyApp
{
    class Program
    {
        static void Main(string[] args)
        {
            double x, y, z, v;
            Console.Write("Gimme first real number: ");
            x = Convert.ToDouble(Console.ReadLine());
            Console.Write("Gimme second real number: ");
            y = Convert.ToDouble(Console.ReadLine());

            if (x < 0 || y < 0)
            {
                z = x * y;
                // Console.WriteLine("yo is too low");
            }
            else if (x == 0 || y == 0)
            {
                z = 10;
            }
            else
            {
                z = x + y;
            }

            Console.WriteLine(
                "The 'z' variable is equal to {0}",
                z
                );

            Console.ReadKey(); // wait for user
        }
    }
}
