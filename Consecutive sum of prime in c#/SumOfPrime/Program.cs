using System;

namespace SumOfPrime
{
    class Program
    {
        static void Main(string[] args)
        {
            int primeList=-1;
            int size, flag = 0;
            int[] arr =new int[100000];
            Console.WriteLine("Enter the element count/Last element: ");
            size = Convert.ToInt32(Console.ReadLine());
            //Finding prime number's
            for(int i=2;i<=size;i++)
            {
                flag = 0;
                for(int j=2;j<i;j++)
                {
                    if(i % j==0)
                    {
                        flag = 1;
                        break;
                    }
                }
                if(flag==0)
                {
                    arr[++primeList] = i;
                }
            }

            int[] newArr = new int[100000];
            int sum = arr[0];
            int newList = -1;
            for (int i = 1; i <= primeList; i++)
            {
                flag = 0;
                sum += arr[i];
                if(sum>size)
                {
                    break;
                }
                for (int j = 2; j < sum; j++)
                {
                    if (sum % j == 0)
                    {
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0)
                {
                    newArr[++newList] = sum;
                }
            }
            //Consecutive prime sum..
            Console.WriteLine("\n\n\n");
            Console.WriteLine("output:  "+(newList+1));
            for (int i = 0; i <= newList; i++)
            {
                Console.WriteLine(newArr[i]);
            }
            Console.ReadLine();

        }

    }
}
