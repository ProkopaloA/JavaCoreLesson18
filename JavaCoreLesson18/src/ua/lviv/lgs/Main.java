package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Integer> listInteger = new ArrayList<>();
		listInteger.add(12);
		// listInteger.add("12");
		String str1 = "1261";
		listInteger.add(Integer.parseInt(str1));

		// Так як ми задаємо тип значень які можуть бути в масиві, логічно що ми не
		// можемо вписати тудт об’єкт чи стрінгу проте, якщо стрінга має чисельне
		// значенння її можна перевести у числове значення.
		
		Map<Integer, List<Integers>> newMap = new Map<>(20, new ArrayList<Integers>(Arrays.asList(new Integers("1"))));
		newMap.addNewEntry(5, new ArrayList<Integers>(Arrays.asList(new Integers("7"))));
		newMap.addNewEntry(7, new ArrayList<Integers>(Arrays.asList(new Integers("5"))));
		newMap.addNewEntry(40, new ArrayList<Integers>(Arrays.asList(new Integers("10"))));
		newMap.addNewEntry(33, new ArrayList<Integers>(Arrays.asList(new Integers("0"))));
		newMap.viewMap();
		newMap.removeEntry(5);
		newMap.viewMap();
		newMap.removeValue(40);
		newMap.viewKeysSet();
		newMap.viewValuesList();
		newMap.viewMap();
		
		Map<String, Integer> newMap1 = new Map<>("2", 11);

		newMap1.addNewEntry("30", 2);
		newMap1.addNewEntry("4", 13);
		newMap1.viewMap();
		newMap1.removeEntry("7");
		newMap1.viewMap();
		newMap1.removeValue("9");
		newMap1.viewKeysSet();
		newMap1.viewValuesList();
		newMap1.viewMap();

	}

		
		
		 public static class Integers {
		        Integer integer;

		        public Integers(String integer) {
		            this.integer = Integer.parseInt(integer);
		        }

		        public Integer getInteger() {
		            return integer;
		        }

		        public void setInteger(Integer integer) {
		            this.integer = integer;
		        }

	}
	

}
