package Ch_1_4_Analysis_Of_Algorithms;

public class Practise_1_4_32 {
    /*
     * 思路 ：
     * 
	 * 数组扩容后的大小序列为 2 4 8 16 32 64 ... n
	 * 数组扩容为 2 时，访问数组 4 + 1 次
	 * 数组扩容为 4 时，访问数组 8 + 1
	 * 数组扩容为 8 时，需要访问数组 16 + 1 = 17 次
	 * 扩容为 16，访问 32 + 1 = 33 次
	 * 扩容为 32, 访问 64 + 1 = 65 次
	 * 因此扩容为 N, 需要访问数组的次数为 N + 4 + 8 + 16 + 32 + ... + 2N = 5N - 4 ~ 5N
	 * 
	 */
}
