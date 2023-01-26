package com.contries;

public class Countries {

	public Countries(int pr, int ti) {
	cost(pr, ti);
	}

	public Countries(int[] i, int[] j) {
	//Summary cost of all calls
	costs(i, j);
	
	}
	
	public static int cost(int i, int j) {
	return i*j;
	}

	public static int costs (int[] i, int[] j) {
	int costs = 0;
	for(int a = 0; a < i.length; a++  ) {
	
	costs = costs + cost(i[a],j[a]) ;
	}
	return costs;
	
	}

}
