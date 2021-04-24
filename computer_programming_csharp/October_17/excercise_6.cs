using System;
using System.Linq;

namespace Maksimum
{
    class Program
    {
        static void Main(string[] args)
        {
            int a, b, c, d;

            Console.Write("Podaj pierwszą wartość: ");
            a = Convert.ToInt32(Console.ReadLine());
            Console.Write("Podaj drugą wartość: ");
            b = Convert.ToInt32(Console.ReadLine());
            Console.Write("Podaj drugą wartość: ");
            c = Convert.ToInt32(Console.ReadLine());
            Console.Write("Podaj drugą wartość: ");
            d = Convert.ToInt32(Console.ReadLine());

            int[] numbers = new int[]{a, b, c, d};
            int max = numbers.Max();

            Console.WriteLine("Wartość maksymalna wynosi {0}.", max);
            Console.ReadKey();
        }
    }
}
