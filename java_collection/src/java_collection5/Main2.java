package java_collection5;

import java.util.LinkedList;
import java.util.Queue;

public class Main2 {

	public static void main(String[] args) {
		//FIFO
		Queue<Integer> q=new LinkedList<>();
		q.offer(100);
		q.offer(20);
		q.offer(343);
		System.out.println(q);
		//큐에서 내보내기 -먼저 들어온순서대로 
		q.poll();
		System.out.println(q);

	}

}
