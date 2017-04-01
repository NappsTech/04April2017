package collectionRev1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteRevision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyOnWriteArrayList<Object> list = new CopyOnWriteArrayList<>(Arrays.asList(new String[] { "a", "b" }));
		list.add("A");
		System.out.println(list);
		Iterator<Object> iterator = list.iterator();
		while (iterator.hasNext()) {
			Object next = iterator.next();
			if (next.equals("b")) {
				list.remove(next);
			}
		}
		System.out.println(list);

		List<String> arrayList = new ArrayList<>(Arrays.asList(new String[] { "1", "2", "3", "4", "5" }));
		Iterator<String> iterator2 = arrayList.iterator();
		while (iterator2.hasNext()) {
			String next = iterator2.next();
			if (next.equals("2")) {
				iterator2.remove();
			}
		}
		System.out.println(arrayList);
	}
}
