package Backtracking;
public class _29PrintPermutation{
    public static String swap(String str, int i, int j){
        char[] charArray=str.toCharArray();
        char temp=charArray[i];
        charArray[i]=charArray[j];
        charArray[j]=temp;
        return String.valueOf(charArray);
    }
    public static void printPermutation(String str1,int l,int r){
        if(l==r){
            System.out.println(str1);
        }
        for(int i=l;i<=r;i++){
            str1=swap(str1, l, i);
            printPermutation(str1, l+1, r);

            //Backtracking
            swap(str1, l, i);
        }

    }
    public static void main(String[] args) {
        String str1="ABCD";
        int n=str1.length()-1;
        printPermutation(str1, 0, n);
    }
}