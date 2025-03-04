package jave20250304;

import javax.print.attribute.standard.JobName;

public class Main {

	public static void main(String[] args) {
	/*
	 * 	job 클래스 이용해 익명클래스 다루기
	 * 익명클래스 객체를 통해 직업을 입력하고 
	 * myJob메서드 실행하여 내직업출력
	 * 
	 * work인터페이스를 이용해 익명클래스 다루기
	 * working 메서드를 실행하여
	 * 내사 하는일 출력하기 
	 */
		Job j=new Job(){//익명클래스 정의와 객체생성
			@Override
			public void myJob() {
				System.out.println(JobName);
			}
			
		};//익명 클래스 정의와 객체생성
		j.JobName="웹프로그래머";
		j.myJob();
		
	
		Work w=new Work() {
			@Override
			public void working() {
				System.out.println("게시판 CRUD구현");
			}
		};
		w.working();
	}

}
