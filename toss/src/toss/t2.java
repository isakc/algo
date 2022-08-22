package toss;

public class t2 {
	public static void main(String[] args) {
		int answer = 0;
		int[] levels = {1,2,3,4,5,6,7,8,9};
		
		double len=levels.length;
		
		for(int i=0; i<len; i++) {
			double a = ((i+1)/len*100);
			
			if(a >= 75) {
				answer=levels[i+1];
				break;
			}
		}
		
		System.out.println(answer);
	}
}
