package praktikum4;

import java.util.ArrayList;

public class arraylist {
	public static void main(String[] args) {
		ArrayList<Integer>age= new ArrayList<Integer>();
		age.add(10);
		age.add(12);
		age.add(16);
		age.add(28);
		age.add(19);
		
		System.out.println(age);
		
		age.set(1, 100);
		System.out.println(age);
		
		age.remove(3);
		System.out.println(age);
		age.clear();
	}
}
