import java.util.Scanner;
public class LogicPyramid {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter height of pattern: ");
        int height = kb.nextInt();
        int size = 0,index = 1,count = 0;
        for(int i=1;i<=height;i++){
            size=size+i;
        }
        //calculate series
        int[] series = new int[size+1];
        int num = 6,temp = 0;
        for(int i=1;i<=size;i++){
             num += temp;
             temp = 22 + (i-1)*16;
             series[i]=num;
        }
        //done.
        //pattern start here.
        for(int i=1;i<=height;i++){
            for(int j = 1;j<=height-i;j++){
                System.out.print(" ");
            }
            //display zero
            for(int k=1;k<=i;k++){
                num = series[index];
                index++;
                count = 0;
                
                while(num>0){
                    num /=10;
                    count++;
                }
                for(int l=1;l<=5 - count ;l++){
                    System.out.print("0");
                }
                System.out.print(series[index-1]+" ");
            }
            System.out.println();
        }
    }
}
