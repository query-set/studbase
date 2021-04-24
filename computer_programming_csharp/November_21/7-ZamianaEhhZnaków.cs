using System;

namespace ZamianaEhhZnakow
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Gimme a word to tweak!");
            string words = Console.ReadLine();
            char[] word = words.Split(' ')[0].ToCharArray();

            char last = word[word.Length - 1];
            Array.Copy(word, 0, word, word.Length - 1, 1);
            word[0] = last;

            Console.Write($"The result is ");
            Console.WriteLine(word);
            Console.ReadKey();
        }
    }
}
