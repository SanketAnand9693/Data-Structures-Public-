public class _panagram {
    public static void main(String args[])
    {
        Boolean flag=false;
        String str="THE QUICK BROWN FOX JUMPS OVER LAZY DOG";
        str=str.replace(" ", "");
        char arr[]=str.toCharArray();

        int ar[]=new int[26];
        for(int i=0;i<arr.length;i++){
            ar[arr[i]-65]++;
        }
        for(int i=0;i<ar.length;i++){
            if(ar[i]==0){
                System.out.println("It is not panagram");
                flag=true;
            }
        
        }
        if(flag==false){
            System.out.println("It is a panagram");
        }
    }
    
    
    
}
