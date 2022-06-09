import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add(123);
		set.add(432);
		set.add(1234);
		set.add(423);
		set.add(432);
		set.add(111);
		//set.add("Abc"); // java.lang.ClassCastException
		//set.add(12.34);
		System.out.println(set);
	}

}
