package testMain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class nonono12 {

	public static void main(String[] args) throws ParseException {
		Date today=new Date();
		System.out.println(today);
		//년도 추출 
		System.out.println(today.getYear()+1900);
		//월 출출
		System.out.println(today.getMonth()+1);
		//일 추출 Date 일 day 요일 
		System.out.println(today.getDate());
		//2025.02.27 우리나라 표기법
		//시 분 초
		System.out.println(today.getHours()+":"+today.getMinutes()+":"+today.getSeconds());
		
		//날짜와 시간 포멧 지정하는방법 
		//2025.2.27
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy.MM.dd");
		String myDate=sdf.format(today);
		System.out.println(myDate);
		
		
		SimpleDateFormat time= new SimpleDateFormat("hh시 mm분 ss초");
		String myTime=time.format(today);
		System.out.println(myTime);
		
		
		//날짜차이 구하기 
		//2024.12.18부터 오늘까지 몇일인지 구하기 
		Date start =new SimpleDateFormat("yyyy.MM.dd").parse("2024.12.18");
		
		long difsec =(today.getTime() - start.getTime())/ 1000;
		System.out.println(difsec);
		long difmin=difsec/60;//분
		System.out.println(difmin);
		
		long difhour=difmin/60;//시간
		System.out.println(difhour);
		
		long difDays=difhour/24;//일
		System.out.println(difDays);
		
	}

}
