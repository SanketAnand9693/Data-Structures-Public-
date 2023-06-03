import java.util.Arrays;
import java.util.stream.*;
import java.util.*;
public class _introStreamApi {
    public static void main(String[] args) {
        List<Integer> list1=Arrays.asList(2,3,4,5,6,7);
        Stream<Integer> streamData=list1.stream();
        streamData.forEach(n->System.out.println(n));
    }
}
