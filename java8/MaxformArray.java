package impworks;







import java.util.Arrays;
import java.util.List;


public class MaxformArray { 
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(82,23,21,303,33,45,56);


        Integer max= numbers.stream().max((e1, e2) -> e1>e2 ? 1:-1 ).get();
        System.out.println ("maximum no in array is "+max);
    }
}

 
