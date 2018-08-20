package hackerearth;
import java.util.*;

public class stackandqueues {

public static void main(String args[]) {
	Scanner scan = new Scanner(System.in);
	int entries=0;
	int entry = scan.nextInt();
	int maxRemovableElements = scan.nextInt();
	if(entry >0 && entry <100000) {
	    	entries = entry;
	}
	int arrayElements []  = new int[entries] ;
	
	for(int i=0;i<entries;i++) {
		
		int x = scan.nextInt();
		if(x<100000000 && x >0) {
			arrayElements[i] = x;
		}
	}
	int result = findMaxSum(arrayElements,maxRemovableElements,entries);
	System.out.println(result);
}
private static int findMaxSum(int[] arrayElements, int maxRemovableElements,int entries) {
	int maxSum = 0;
	int last = entries-1;
	int maxLast = 0;
	int maxFront =0;
	int x=0;
	if(x ==0) {  
		int maxSumTemp = 0;
		for (int j=entries-1;j>=entries-1-x;j--) {
			maxSumTemp = maxSumTemp + arrayElements[j];
		
			
		}
		for(int i =0;i<(maxRemovableElements-x-1);i++) {
			maxSumTemp = maxSumTemp + arrayElements[i];
		
		}
		maxSum = maxSumTemp;
		
		x++;
	}
	for(int l = 1;l < maxRemovableElements ;l++) {  
		int maxSumTemp = 0;
		for (int j=entries-1;j>=entries-1-l;j--) {
			maxSumTemp = maxSumTemp + arrayElements[j];
		
		}
		for(int i =0;i<(maxRemovableElements-l-1);i++) {
			maxSumTemp = maxSumTemp + arrayElements[i];
		
		    
		}
		
		if(maxSum < maxSumTemp) {
			maxSum = maxSumTemp;
		}
		
	}
	return maxSum;
	
}
}
