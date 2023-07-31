package Stack;
import java.util.Stack;
public class _3Histogram{
    public static int histogram(int arr[]){
        int prev[]=new int[arr.length];
        int next[]=new int[arr.length];
        int width[]=new int[arr.length];
        int area[]=new int[arr.length];
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<arr.length;i++){
            //For prevSmallest
            for(int j=i;j<arr.length;j--){
                if(j<0){
                    prev[i]=-1;
                    break;
                }
                else if(arr[j]<arr[i]){
                    prev[i]=j;
                    break;
                }
            }
            //for nextSmallest
            for(int k=0;k<arr.length;k++){
            
                if(arr[k]<arr[i]){
                    next[i]=k;
                    break;
                    
                }
                else{
                    next[i]=arr[arr.length-1];
                }
            }
            
            //For width
            for(int j=0;j<arr.length;j++){
                width[i]=next[i]-(prev[i]-1); //This is the formula for calculating width
            }
            //For Area
            for(int l=0;l<arr.length;l++){
                area[i]=width[i]*arr[i];
            }
            //largest area(Using stack)
            
        }
        //This is for checking purpose
        // System.out.println("Area "+Arrays.toString(area));
        // System.out.println("Next "+Arrays.toString(next));
        // System.out.println("Prev "+ Arrays.toString(prev));
        // System.out.println("width "+ Arrays.toString(width));
        int max=0;
        for(int j=0;j<area.length;j++){
            if(max<area[j]){
                max=area[j];
                stack.push(max);
            }
            else{
                continue;
            }
        }
        return stack.peek();
        
    }
    public static void main(String[] args) {
        int a[]={4,2,1,5,6,3,2,4,2,0};
        
        int result=histogram(a);
        System.out.println(result);;

    }
}
