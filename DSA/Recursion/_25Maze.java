package Recursion;
//Printing all possible path for current to destination
public class _25Maze{
    public static void findPath(int size,int row,int col,int destination,int current,String path){
        int mazeSize=size;
        if(current==destination){
            System.out.println(path);
            return;
        }    
        if(col>mazeSize-1){
            return;
        }
        if(row>mazeSize-1){
            return;
        }
        findPath(size,row, col+1, destination, current+col, path+"H");
        findPath(size,row+1, col, destination, current+row, path+"V");
        }
    public static void main(String[] args) {
        findPath(3,0, 0, 2, 0, "");
    }
}