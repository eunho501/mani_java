package java_generic2;

public class Wine extends Alcohol{
	public Wine(String name, String cmp, int abv) {
		super(name, cmp, abv);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return"웨인:"+cmp+","+name+",도수:"+abv+"%";
	}
}
