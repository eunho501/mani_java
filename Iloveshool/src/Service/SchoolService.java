package Service;

import java.util.ArrayList;
import java.util.Scanner;

import DAO.SchoolDAO;
import VO.School;

public class SchoolService implements ActiveService{
	private SchoolDAO dao;
	public SchoolService() {dao=new SchoolDAO();}

	public void searchSchool(String id) {
		System.out.println("\n==========나의학교찾기======\n");
		
	int schoolNum=search();//검색
	dao.saveData(id,schoolNum);			//등록(데이터베이스 -테이블에 저장
	
	
	
	}

	private int search() {
		Scanner scan=new Scanner(System.in);
		System.out.println("검색(학교명):");
		String searchWord=scan.nextLine();
		//검색어를 데이터베이스에 조회하고 조회한 결과가 있다면 화면에 모두출력
		//검색결과 몇개 있는지 모르고 모두 출력 해야하니까 ArrayList를사용
		ArrayList<School>list= dao.searchSelect(searchWord);
		for(School school:list) {
			System.out.println(school.getId()+". "+ 
		school.getSchoolName()+" , " +school.getAddress()
					);
		}
		System.out.println("내학교선택");
		int num=scan.nextInt();
		return 0;
	}

	public void myReunion() {
		System.out.println("나의 동창회");
		
	}

	public void smallGather() {
		System.out.println("잉어킹 소모임");
		
		
	}

}
