using System;

namespace MyApp
{
    class Program
    {
        static void Main(string[] args)
        {
            int input = int.Parse(Console.ReadLine());
            int factor = 1;

            for (int i = 1; i <= input; i++) {
                // Console.WriteLine(i);  // testing purposes
                factor *= i;
            }

            Console.WriteLine(factor);
            Console.ReadKey();
        }
    }
}
