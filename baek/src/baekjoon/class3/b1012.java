package baekjoon.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b1012 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		
		while(T-->0) {
			st = new StringTokenizer(br.readLine(), " ");
			int M = Integer.parseInt(st.nextToken()); //가로
			int N = Integer.parseInt(st.nextToken()); //세로
			int len = Integer.parseInt(st.nextToken());
			int[][] field = new int[N][M];
			boolean[][] visited = new boolean[N][M];
			int result = 0;
			
			for(int i=0; i<len; i++) {
				st = new StringTokenizer(br.readLine(), " ");
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				field[y][x] = 1;
			}
			
			for(int y=0; y<N; y++) {
				for(int x=0; x<M; x++) {
					if(dfs(field, visited, N, M, x, y)){
						result++;
					}
				}
			}
			System.out.println(result);
		}
	}
	
	static boolean dfs(int[][] field, boolean[][] visited, int N, int M, int x, int y){
		if (x <= -1 || x >=M || y <= -1 || y >=N) {
            return false;
        }
		
		if(field[y][x] == 1 && !visited[y][x]) {
			visited[y][x] = true;
			
			dfs(field, visited, N, M, x-1, y);
			dfs(field, visited, N, M, x+1, y);
			dfs(field, visited, N, M, x, y+1);
			dfs(field, visited, M, M, x, y-1);
			
			return true;
		}
		return false;
	}
}