package iCoding;

import java.util.*;

public class NthSuperUglyNumber {
	
	public static void main(String[] args){
		int[] primes = {2, 7, 13, 19};
		int n = 12;
		int val = nthSuperUglyNumber(n, primes);
		System.out.println(val);
	}
	
	public static int nthSuperUglyNumber(int n, int[] primes) {
		if(n <= 0)
			return -1;
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        int len = primes.length;
        int[] a = new int[len];
        int[] value = new int[len];
        for(int i=0; i<len; i++)
            a[i] = 0;
        int num = 1;
        while(num < n){
            for(int i=0; i<len; i++)
                value[i] = primes[i] * list.get(a[i]);
            int min=Integer.MAX_VALUE, pos=0;
            for(int i=0; i<len; i++){
                if(value[i] < min){
                    min = value[i];
                    pos = i;
                }
            }
            if(list.get(num-1) == min)
                a[pos]++;
            else{
                list.add(min);
                num ++;
            }
        } //end while
        
        return list.get(n-1);
    }
}
