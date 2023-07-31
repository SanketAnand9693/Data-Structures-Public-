package Recursion;

public class _24AllPathOF1DBoard {
    public static void printPath(int cur, int destination,String path){
        if(cur==destination){
            System.out.println(path);
            return;
        }
        if(cur>destination){
            return;
        }
        printPath(cur+1, destination,path+1 );
        printPath(cur+2, destination,path+2 );
        printPath(cur+3, destination,path+3 );
        printPath(cur+4, destination,path+4 );
        printPath(cur+5, destination,path+5 );
        printPath(cur+6, destination,path+6 );
    }
    public static void main(String[] args) {
        printPath(0, 6, "");
    }
}
