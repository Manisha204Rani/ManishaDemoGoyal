import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lab2 {
public static void main(String[] args) {
	List<Integer> l1  = new ArrayList<Integer>();
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
