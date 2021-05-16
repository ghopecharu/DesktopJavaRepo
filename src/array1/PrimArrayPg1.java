package array1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimArrayPg1 {

	public static void main(String[] args) {
	int [] number= {1,2,3,4,5,6,7,8,9,10};
	List<Integer> list = IntStream.of(number).boxed().collect(Collectors.toList());
	List<Integer> list1 = Arrays.stream(number).boxed().collect(Collectors.toList());
	System.out.println("List:" +list);	
	System.out.println("List:" +list1);
		
		
	}

}
