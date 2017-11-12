package 第一章_Union_Find_算法;

public class Text_UF_QuickFind extends Text_UF {
	public Text_UF_QuickFind(int N) { super(N); }
	public int find(int p) { return id[p]; }
	public boolean connected(int p, int q) { return find(p) == find(q); }
	public void union(int p, int q) {
		int pID = find(p);
		int qID = find(q);
		if (pID == qID) return;
		for (int i = 0; i < id.length; i++)
			if (id[i] == pID) id[i] = qID;
		count--;
	}
	public static void main(String[] args) {
		int N = 10, pairCount = 20;
		Text_UF.test(new Text_UF_QuickFind(N), N, pairCount);
	}
	// output
	/*
	 *
	 *	--------------------------------
		索引 :	0 1 2 3 4 5 6 7 8 9 
				0 1 2 3 4 5 6 7 8 9       连通分量 : 10
		--------------------------------
		
		连接 3 8
		--------------------------------
		索引 :	0 1 2 3 4 5 6 7 8 9 
				0 1 2 8 4 5 6 7 8 9       连通分量 : 9
		--------------------------------
		
		连接 0 9
		--------------------------------
		索引 :	0 1 2 3 4 5 6 7 8 9 
				9 1 2 8 4 5 6 7 8 9       连通分量 : 8
		--------------------------------
		
		连接 3 2
		--------------------------------
		索引 :	0 1 2 3 4 5 6 7 8 9 
				9 1 2 2 4 5 6 7 2 9       连通分量 : 7
		--------------------------------
		
		连接 0 5
		--------------------------------
		索引 :	0 1 2 3 4 5 6 7 8 9 
				5 1 2 2 4 5 6 7 2 5       连通分量 : 6
		--------------------------------
		
		连接 9 4
		--------------------------------
		索引 :	0 1 2 3 4 5 6 7 8 9 
				4 1 2 2 4 4 6 7 2 4       连通分量 : 5
		--------------------------------
		
		连接 6 2
		--------------------------------
		索引 :	0 1 2 3 4 5 6 7 8 9 
				4 1 2 2 4 4 2 7 2 4       连通分量 : 4
		--------------------------------
		
		2  6 已连通
		0  9 已连通
		连接 1 4
		--------------------------------
		索引 :	0 1 2 3 4 5 6 7 8 9 
				4 4 2 2 4 4 2 7 2 4       连通分量 : 3
		--------------------------------
		
		连接 9 3
		--------------------------------
		索引 :	0 1 2 3 4 5 6 7 8 9 
				2 2 2 2 2 2 2 7 2 2       连通分量 : 2
		--------------------------------
		
		连接 5 7
		--------------------------------
		索引 :	0 1 2 3 4 5 6 7 8 9 
				7 7 7 7 7 7 7 7 7 7       连通分量 : 1
		--------------------------------
		
		0  3 已连通
		7  9 已连通
		9  4 已连通
		9  4 已连通
		6  5 已连通
		6  9 已连通
		1  2 已连通
		7  2 已连通
		7  2 已连通

	 */
}