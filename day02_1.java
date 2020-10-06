package JavaTutoring;
import java.util.*;
import java.io.*;

//sort : 데이터가 적을수록 빠르다
//parellel? sort : 데이터가 많을수록 빠르다

public class day02_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		int n = Integer.parseInt(br.readLine());
		int a[] = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(a);
		
		int m = Integer.parseInt(br.readLine());
		StringTokenizer str = new StringTokenizer(br.readLine());
		for(int i=0; i<m; i++) {
			int key = Integer.parseInt(str.nextToken());
			
			if(Arrays.binarySearch(a, key) >= 0) System.out.println(1);
			else System.out.println(0);
		}
	}

}
