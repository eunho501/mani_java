package exception6;

public class Main {

	public static void main(String[] args) {
		String keyword="찬양";
		String content="나는 어제술마심 "+"찬양이";
		
		try {
		if(!content.contains(keyword)) {
			throw new Search("검색결과 업숭ㅁ","111");
		}
	}catch(Search s) {
		s.keywordMis();
		s.printStackTrace();
	}
	}
}

