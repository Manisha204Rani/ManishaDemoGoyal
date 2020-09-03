import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Lab3 {
public static void main(String[] args) {
	Set<Integer> l1  = new TreeSet<>();
	l1.add(11);
	l1.add(300); // convert int to Integer -> Boxing 
	l1.add(3000);
	l1.add(33);
	l1.add(33);

	l1.add(111);
	System.out.println(l1);
	

	List<String> list = new ArrayList<>();
	list.add("AA");
	list.add("BB");
	list.add("CC");
	
	list.add("DD");
	list.add(2, "11111111111 ");
	
	list.remove(1);
	System.out.println(list);
	list.set(1,"22222222222");
	System.out.println(list);
}

}
