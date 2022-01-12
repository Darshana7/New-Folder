package te.com.collections;

import java.util.Iterator;

public class ArrayList {
	
	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		
//		list.add(0, null, 0);
		list.add(1,"Sonal",16);
		list.add(2,"Sushil",15);
		list.add(3,"Sukriti",20);
		list.add(4,"Sonal",20);
		list.add(5,"Sushil",15);
		
		Iterator iterator=list.iterator();
		
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}

	private Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	private void add(int i, Object object, int j) {
		// TODO Auto-generated method stub
		
	}


}
