package exception2;

public class Main {

	public static void main(String[] args) {
//		int[] arr=new int[] {1,2,3,4};
//	try {	System.out.println(arr[9]);
//	}catch(Exception e) {
//		System.out.println("범위벗어남");
//		e.printStackTrace();
//	}
//	}

	try {	
		String name=null;
	if(name!=null || name.equals("리순신")) {
		
		 System.out.println("리순신이다");
	}else {
		System.out.println("아니다");
	}
	}catch(Exception e) {
		System.out.println("아룸입력");
		System.out.println(e.getMessage());
	}
	
}
}
