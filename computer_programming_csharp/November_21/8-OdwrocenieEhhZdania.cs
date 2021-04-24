using System;

namespace OdwrocenieEhhZdania
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Input a sentence to reverse.");

            string[] zdanie = Console.ReadLine().Split(' ');
            for (int i = zdanie.Length - 1; i >= 0; i--)
            {
                Console.Write(zdanie[i] + " ");
            }

            Console.ReadKey();
        }
    }
}
