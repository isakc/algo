package prac;

import java.util.ArrayList;
import java.util.Scanner;

public class dfs23 {
	static ArrayList<Integer>[] list;
	static boolean[] visited;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		list = new ArrayList[N+1];
		visited = new boolean[N+1];
		
		for(int i=0; i<N+1; i++) {
			list[i] = new ArrayList<Integer>();
		}
		
		for(int i=0; i<M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			list[a].add(b);
			list[b].add(a);
		}
		
		int count=0;
		
		for(int i=1; i<N+1;i++) {
			if(!visited[i]) {
				count++;
				dfs(i);
			}
		}
		
		System.out.println(count);
	}
	
	public static void dfs(int N) {
		if(visited[N]) {
			return;
		}
		
		visited[N] = true;
		
		for(int next : list[N]) {
			dfs(next);
		}
 	}
}
