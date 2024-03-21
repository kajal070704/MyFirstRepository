package JavaAdvanceStream;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.ArrayList;


public class Assignment2 {
	public static void main(String args[]) {
		List<String>name = Arrays.asList("Kajal","Sriya","Bhawana","Kaju");
		List result = name.stream().sorted().collect(Collectors.toList());
		name.forEach(x->System.out.println(x));
		
		
		Set<String>result2=name.stream().filter(s->s.contains("w")).collect(Collectors.toSet());
//		..forEach(z->System.out.println(z));
		System.out.println(result2);
		
//		List<String>nameList = new ArrayList<>(Arrays.asList(name));
		
	
	}

}
