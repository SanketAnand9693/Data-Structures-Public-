public class _reversingString {
    public static void main(String args[]){
        //pwskill->llikswp
        /*
        String str1="pwskill";
        String str2="";
        for(int i=str1.length()-1;i>=0;i--){
            str2=str2+str1.charAt(i);
        }
        System.out.println(str1);
        System.out.println(str2);
        */
        //pwskill java->java pwskill
        /*
        String str1="pwskill java";
        String str2="";
        String sarr[]=str1.split(" ");
        for(int i=sarr.length-1;i>=0;i--){
            str2=str2+sarr[i]+" ";
        }
        System.out.println(str2);
        */
        //pwskill java->llikswp avaj
        /*
        String str1="pwskill java";
        String str2="";
        String arr[]=str1.split(" ");
        for(String elem:arr){
            for(int i=elem.length()-1;i>=0;i--)
            {
                str2=str2+elem.charAt(i);
            }
            str2=str2+" ";
        }
        System.out.println(str2);
        */

    }
    
}
