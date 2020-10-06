import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		
		Stack<Integer> stack = new Stack<>();
		Queue<Integer> queue = new LinkedList<>();
		PriorityQueue<Integer> pQ = new PriorityQueue<>();
		HashMap<String, String> hM = new HashMap<>();
		
		// 기본적으로 값 하나를 삭제할때는 remove, 전부 삭제할떄는 clear사용
		//Stack 
		stack.push(1);   //삽입
		stack.peek();    //삭제하지않고 확인
		stack.pop();     //삭제하면서 확인
		stack.empty();   //스택이 비었으면 true, 차있으면 false
		stack.search(1); //값 찾기
		
		//Queue
		queue.offer(1);
		queue.peek();
		queue.poll();
		queue.isEmpty();
		
		//PrioirityQueue
		pQ.add(1);
		pQ.peek();
		pQ.poll();
		pQ.isEmpty();
		
		//HashMap
		hM.put("apple", "사과");
		hM.put("banana", "바나나");
		System.out.println("apple = "+ hM.get("apple")); //삭제하고싶을땐 hM.remove("apple") // 전체 제거 hM.clear(); // 
	}

}
