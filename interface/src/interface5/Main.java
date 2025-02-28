package interface5;

public class Main {

	public static void main(String[] args) {
		
		CRUD member=new MemberService();
		CRUD board=new BoardService();
		member.save();
		
		DBConnect mem=new MemberService();
//		mem.save();//부모 클래스인 DBDonnect에는 save메서드가 없다 
	}

}
