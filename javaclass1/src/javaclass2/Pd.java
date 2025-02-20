package javaclass2;

public class Pd {
	String pdName;//상품명
	String pdBrand;//브랜드
	int num;//수량 
	Pd(){}//기본생성자메서드 매개변수 X
	Pd(String pdName,String pdBrand){
		this.pdName=pdName;
		this.num=num;
	}
	Pd(String pdName, String pdBrand , int num){
		this.pdName=pdName;
		this.pdBrand=pdBrand;
		this.num=num;
		
		
	}
}
