package baekjoon.class3;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class b2606 {
    public static int nodeCnt;
    public static LinkedList<Integer>[] nodeList;
	static int ans = 0; // ī��Ʈ
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		nodeCnt = sc.nextInt(); //��� ����
		int lineCnt = sc.nextInt(); //���� ����
		
		nodeList = new LinkedList[nodeCnt+1];
        
        for(int i=0; i <= nodeCnt; i++) {
            nodeList[i] = new LinkedList<Integer>();
        }
        
        for(int i=0; i < lineCnt; i++) {
            int node1 = sc.nextInt();
            int node2 = sc.nextInt();
            
            nodeList[node1].add(node2);
            nodeList[node2].add(node1);
            
            Collections.sort(nodeList[node1]);
            Collections.sort(nodeList[node2]);
        }
        
        boolean[] dfsVisited = new boolean[nodeCnt+1];
        
        dfs(1, dfsVisited);
        
        System.out.println(ans-1); // ù��°�� �������
	}
	
	public static void dfs(int node, boolean[] visited) {
        if(visited[node]) return;
        
        visited[node] = true;
        ans++;
        for(int nextNode:nodeList[node]) {
            dfs(nextNode, visited);
        }
    }
}
