using System;

namespace MnozenieEhhMacierzy
{
    class Program
    {
        public struct Matrix
        {
            public uint rows;
            public uint cols;
            public int[,] values;
            public string name;

            void DisplayMatrix()
            {
                Console.WriteLine($"\nMatrix '{name}' is being printed:");

                for (int i = 0; i < this.cols; i++)
                {
                    for (int j = 0; j < this.rows; j++)
                    {
                        Console.Write(" " + values[j, i] + " ");
                    }
                    Console.WriteLine();
                }
            }

            public Matrix(uint r, uint c, string mname)
            {
                // Matrix properties
                this.name = mname;
                this.rows = r;
                this.cols = c;
                this.values = new int[rows, cols];

                Console.WriteLine($"Matrix {name}:");

                // Formatting purposes
                int actual_line_length;

                // Looping through matrix
                for (int i = 0; i < cols; i++)
                {
                    for (int j = 0; j < rows; j++)
                    {
                        Console.Write($" [{i + 1}, {j + 1}] = ");
                        actual_line_length = Console.CursorLeft + 4;
                        this.values[j, i] = int.Parse(Console.ReadLine());
                        Console.SetCursorPosition(actual_line_length, Console.CursorTop - 1);
                    }
                    Console.WriteLine();
                }
            }

            public Matrix(Matrix A, Matrix B)
            {
                // Matrix properties
                this.name = "C";
                this.rows = A.rows;
                this.cols = B.cols;
                this.values = new int[this.rows, this.cols];

                uint m = A.cols;

                int sum = 0;
                for (int i = 0; i < this.rows; i++)
                {
                    for (int j = 0; j < this.cols; j++)
                    {
                        sum = 0;
                        for (int k = 0; k < m; k++)
                        {
                            sum += A.values[i, k] * B.values[k, j];
                        }
                        this.values[i, j] = sum;
                    }
                }
            }

            static void Main(string[] args)
            {
                const int N = 3, M = 4, K = 4;

                Console.WriteLine("Hint: to populate the matrix values, split the values by <space>, split rows by <enter>");

                Matrix A = new Matrix(N, K, "A");
                Matrix B = new Matrix(K, M, "B");
                Matrix C = new Matrix(A, B);

                C.DisplayMatrix();

                Console.ReadKey();
            }
        }
    }
}
