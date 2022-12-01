package chap03.sec01;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		int x =10;
		int y = 10;
		int z;
		x++;
		++x;
		System.out.println("x:12 " + x);
		
		System.out.println("----------");
		y--;
		--y;
		System.out.println("y:8 "+y);
		
		System.out.println("----------");
		z = x++;
		System.out.println("z:12 "+z);
		System.out.println("x:13 "+x);
		
		System.out.println("----------");
		z =++x;
		System.out.println("z:14 "+z);
		System.out.println("x:14 "+x);
		System.out.println("y:8 "+y);
	}

}
