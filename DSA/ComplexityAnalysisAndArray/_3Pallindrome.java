package ComplexityAnalysisAndArray;
//Time Complexity-O(n)
//Space Complexity-(1)
public class _3Pallindrome {
    public static void main(String[] args) {
        int []a={1,2,4,2,1};
        int flag=0;
        int n=a.length;
        for(int i=0;i<n/2;i++){
            if(a[i]==a[n-i-1]){
                flag=1;
            }
            else{
                flag=0;
            }
        }
        if(flag==1){
            System.out.println("Pallindrome");
        }
    }
}
