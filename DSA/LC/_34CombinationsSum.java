package LC;

import java.util.*;
class _34CombinationsSum {
    public static void backtrack(List<List<Integer>> result, List<Integer> temp,int[] candidates,int target,int start){
            if(target<0){
                return;
            }    
            else if(target==0){
                    result.add(new ArrayList<>(temp));
            }
            for(int i=start;i<candidates.length;i++){
                temp.add(candidates[i]);
                backtrack(result, temp, candidates, target-candidates[i], i);
                temp.remove(temp.size()-1);
            }
        }
        public static List<List<Integer>> combinations(int [] candidates,int target){
            List<List<Integer>> result=new ArrayList<>();
            backtrack(result,new ArrayList<Integer>(),candidates, target, 0);
            return result;
        }

    public static void main(String[] args) {
        int target=7;
        int[]candidates={2,3,6,7};
        List<List<Integer>> Output=combinations(candidates,target);
        System.out.println(Output);
    }    
}
