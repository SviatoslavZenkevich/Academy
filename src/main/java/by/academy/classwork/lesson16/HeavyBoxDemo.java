package by.academy.classwork.lesson16;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class HeavyBoxDemo {
    public static void main(String[] args) {
        ArrayList<HeavyBox> arrayList = new ArrayList<>();
        arrayList.add(new HeavyBox(12, 10, 13, 100));
        arrayList.add(new HeavyBox(15, 10, 13, 200));
        arrayList.add(new HeavyBox(20, 20, 25, 150));
        arrayList.add(new HeavyBox(25, 21, 11, 80));
        arrayList.add(new HeavyBox(9, 12, 17, 800));

        for (HeavyBox c : arrayList) {
            System.out.println(c);
        }
        arrayList.get(0).setWeight(15);
        arrayList.remove(5);
        arrayList.removeAll(arrayList);
        arrayList.toArray();

        //Создать TreeSet содержащий HeavyBox.
        // HeavyBox должен реализовать интерфейс Comparable.
        // Распечатать содержимое с помощью for each. (по весу)

        SortedSet<HeavyBox> treeSet = new TreeSet<>(new Comparator<HeavyBox>() {
            int i = 0;

			@Override
			public int compare(HeavyBox h1, HeavyBox h2) {

				return i++;
			}
		});


        treeSet.add(new HeavyBox(12, 10, 13, 100));
        treeSet.add(new HeavyBox(15, 10, 13, 200));
        treeSet.add(new HeavyBox(20, 20, 25, 150));
        treeSet.add(new HeavyBox(25, 21, 11, 80));
        treeSet.add(new HeavyBox(9, 12, 17, 800));

    }
}
