package Ch_1_1_Basic_Programming_Model;

import edu.princeton.cs.algs4.*;

public class Practise_1_1_09 {
	public static void main(String[] args) {
		/*
		 * 从位模式低位开始,拼接逐个bit
		 */
		int N = StdRandom.uniform(10000);
		String s = "";
		for(int n = N; n > 0; n /= 2) 
			s = (n % 2) + s;
		System.out.println(s);
	}
	// output :
	/*
	 * 1111111100001

	 */
}
