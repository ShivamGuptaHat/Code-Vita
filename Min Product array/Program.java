import java.util.StringTokenizer;
import java.util.Scanner;
class Program{
    public static void main(String[] args){
        int[] first = new int[100000]; int[] second = new int[10000];
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the size and modifier: ");
        String input = kb.nextLine();
        StringTokenizer tokens = new StringTokenizer(input , " ");
        int size = Integer.parseInt(tokens.nextToken());
        int modi = Integer.parseInt(tokens.nextToken());
        System.out.println("Enter the first array elements: ");
        input = kb.nextLine();
        tokens = new StringTokenizer(input , " ");
        int i = 0;
        while(tokens.hasMoreTokens() && i < size){
            first[i] = Integer.parseInt(tokens.nextToken());
            i++;
        }

        System.out.println("Enter the second array elements: ");
        input = kb.nextLine();
        tokens = new StringTokenizer(input , " ");
        i = 0;
        while(tokens.hasMoreTokens() && i < size ){
            second[i] = Integer.parseInt(tokens.nextToken());
            i++;
        }
        
        modi = 2*modi;
        System.out.println("modifier: "+modi);
        int res =0; 
        int temp1 = (first[0]+modi)*second[0];
        int temp2 = (first[0]-modi)*second[0];
        res = (temp1<temp2) ? temp1 : temp2;
        int index = 0;
        for(int m = 1;m<size;m++){
            temp1 = (first[m]+modi)*second[m];
            temp2 = (first[m]-modi)*second[m];
            if(temp1<temp2){
                if(temp1<res){
                    res = temp1;
                    index = m;
                }
                else if(temp1 == res){
                    if(first[m]*second[m]<first[index]*second[index]){
                     continue;   
                    }else{
                        res = temp1;
                        index = m;
                    }           
                }
            }
            else{
                if(temp2<res){
                    res = temp2;
                }
                else if(temp2 == res){
                    if(first[m]*second[m]<first[index]*second[index]){
                     continue;   
                    }else{
                        res = temp2;
                        index = m;
                    }           
                }
            }
        }
        System.out.println("after modification: "+res+" index: "+index);
        int min = 0;
        for(i=0;i<size;i++){
            if(i != index){
                min+=first[i]*second[i];
            }
            else if(i == index){
                min+=res; 
            }
        }

        System.out.println("result: "+min);
    }
}