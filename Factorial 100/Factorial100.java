import java.util.Scanner;
public class Factorial100 {
    public static void main(String[] args){
        
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=kb.nextInt();
        
        long startTime = System.currentTimeMillis();
        int[] collector = calculateFactorial(num);
        
            for(int counter=j;counter>=0;counter--){
             System.out.print(collector[counter]);
            }

        long stopTime = System.currentTimeMillis();
        System.out.println("\n\nTotal Time taken: "+(stopTime-startTime)+"milli-sec.");
      
    }
    
    static int temp=0,j=0;
    public static int[] calculateFactorial(int num)
    {
        int[] collector = new int[20000000];
        for(int i=0;i<collector.length;i++)
        {
            collector[i]=1;
        }
        //factorial snippet
        for( ;num>=2;num--)
        {
            temp=0;
            for(int i=0;i<=j;i++)
            {
                temp = num*collector[i]+temp;
                collector[i]=temp%10;
                temp=temp/10;
            }
            
            while(temp > 0)
            {
             collector[++j]=temp%10;
             temp = temp / 10;
            }
        }
        return collector;
    }
}
