package hackerearth;

import java.util.*;
class Main{
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		int entries = scan.nextInt();
		int arrayElements []  = new int[entries] ;
		if(entries >=1) {
		for(int i=0;i<entries;i++) {
			arrayElements[i] = scan.nextInt();
			}
		}
		int noOfQueriesTemp = scan.nextInt();
		int noOfQueries=0;
		if(noOfQueriesTemp >0 && noOfQueriesTemp <=500000) {
			noOfQueries = noOfQueriesTemp;
		}
		
		int noOfQueriesArray []  = new int[noOfQueries] ;
		
		
		for(int j=0;j<noOfQueries;j++) {
			noOfQueriesArray[j] = scan.nextInt();
		}
		int [] result = new int[noOfQueriesArray.length];
		for(int k=0;k<noOfQueriesArray.length;k++)
		{
			if(noOfQueriesArray[k]<=1000000000 && noOfQueriesArray[k]>0) {
				result[k] = solve(arrayElements,noOfQueriesArray[k]);
				 System.out.println(result[k]);	
			}
			 
		}
	}

	private static int solve(int[] arr, int k) {
		
		int n = arr.length;
		float sum = 0;
        int cnt = 0, maxcnt = 0;
        for (int i = 0; i < n; i++) {
            if ((sum + arr[i])/(i+1) < k) {
                sum =sum+ arr[i]; 
                cnt++;
            } 
            else if(sum!=0)
           {
            sum = sum - arr[i - cnt] + arr[i];
           }
            maxcnt = Math.max(cnt, maxcnt); 
        }
        return maxcnt;
  	
	}
}

