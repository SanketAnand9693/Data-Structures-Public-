import java.util.Arrays;
public class _anagram {
    public static void main(String args[]){
        String str1="The classroom";
        String str2="School master";

        str1=str1.replace(" ", "");
        str2=str2.replace(" ","");

        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        char arr1[]=str1.toCharArray();
        char arr2[]=str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1, arr2)){
            System.out.println("It is an anagram");
        }
        else{
            System.out.println("It is not an anagram");
        }
        
    }
    
}
