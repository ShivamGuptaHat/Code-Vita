
public class Permutation {
    
    public static void main(String[] args){
        StringBuilder pattern =new StringBuilder("ABCD");
        displayPermutation(pattern,0,3);
        System.out.println("Total possible Permutation: "+permutationCounter);
    }
    
    static int permutationCounter = 0;
    public static void displayPermutation(StringBuilder pattern ,  int startIndex, int endIndex){
        if(startIndex == endIndex){
            System.out.println(pattern);
            permutationCounter++;
            return;
        }
        else{
            for(int i=startIndex;i<=endIndex;i++){
                swap(pattern,startIndex,i);
                displayPermutation(pattern,startIndex+1,endIndex);
                swap(pattern,startIndex,i); //back tracking
            }
        }
    }
    
    public static void swap(StringBuilder s,int sourceIndex,int targetIndex){
        char temp = s.charAt(sourceIndex);
        s.replace(sourceIndex, sourceIndex+1, String.valueOf(s.charAt(targetIndex)));
        s.replace(targetIndex, targetIndex+1,String.valueOf(temp));
    }
}
