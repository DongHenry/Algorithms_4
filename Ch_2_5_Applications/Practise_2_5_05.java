package Ch_2_5_Applications;

public class Practise_2_5_05 {
    public static void main(String[] args) {
        /*
         * 稳定性指的是排序算法能否保留数组中重复元素的相对位置
         * 
         * 那么证明选择排序是不稳定的，只需要举出一个反例即可
         * 
         * 对于 元素序列 A1 B2 B3 B4 A5 主键是 "A" "B"
         * 
         * 那么在排序过后变成了 A1 A5 B3 B4 B2
         * 
         * 可以看到重复元素的相对顺序已经被改变
         * 
         * 而对于稳定的排序比如归并排序
         * 
         * 排序过后仍然是 A1 A5 B2 B3 B4 保留了重复元素的相对位置
         */
    }
}
