package project2;

public class BruteForceSearch {
	
	public static int bruteForce(String[] text, String tobematched){
		int length = text.length;
		int plength = tobematched.length();

		for(int i=0;i<length-plength;i++){
			int j=0;
			while((j < plength) && (text.length == tobematched.charAt(j))){
				j++;
			}
			if(j == plength){
				return i;
			}
		}

		return -1;
	}
	
}
