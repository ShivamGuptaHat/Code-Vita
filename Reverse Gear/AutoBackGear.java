import java.util.StringTokenizer;
import java.util.Scanner;
class AutoBackGear{
    public static void main(String[] args) throws Exception{
        int forward=0,backward=0,init=0,time=0;
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the:  Forward distance --  Backward distance -- Time -- Initial distance");
        String input = kb.nextLine();
        StringTokenizer tokens = new StringTokenizer(input," ");
        try{
            forward = Integer.valueOf(tokens.nextToken());            
            backward = Integer.valueOf(tokens.nextToken());            
            time = Integer.valueOf(tokens.nextToken());
            init = Integer.valueOf(tokens.nextToken());
        }catch(Exception e){
                System.out.println("Exception!!");
        }
        int temp = 0,result = 0;
        for(int i = 1 ; ; i++){
            temp = 0;
            if(init != 0){
                if(i%2!=0){
                    //Backward 
                    temp = init;
                    if(temp <= backward){
                        result += temp;
                        break;
                    }
                    else{
                            temp = temp - backward;
                            init = temp;
                            result += backward;
                            continue;
                    }
                }
                else{
                    //Forward
                    init += forward;
                    result += forward;
                }
            }
            else{
                break;
            }
        }
        //Total Time require
        System.out.println("Total distance covered by car: "+result);
        System.out.println("Total time before car collide : "+time*result);
    }
}