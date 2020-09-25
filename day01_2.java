package JavaTutoring;

import java.util.*;
import java.io.*;
import java.math.*;

public class day01_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner sc = new Scanner(System.in);
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		BigInteger b1 = new BigInteger(st.nextToken());
		BigInteger b2 = new BigInteger(st.nextToken());
		b1 = b1.multiply(b2);
		System.out.println(b1);

	}

}
