class MyDate04 {
	int year;
	int month;
	int day;

	public MyDate04() {
		year = 2006;
		month = 4;
		day = 1;
	}
// this: 내부 레퍼런스 변수
	public MyDate04(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public void print() {
		System.out.println(year + "/" + month + "/" + day);
	}
}// MyDate end

public class ConstructorTest04 {
	public static void main(String[] args) {
		MyDate04 d = new MyDate04();
		d.print();

		MyDate04 d2 = new MyDate04(2007, 7, 19);
		d2.print();
	}
}