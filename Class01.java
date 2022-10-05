
class Cal_area {
	double pi = 3.14;
	int radius;
	int length;
	int width;
	int height;

	void volume() {
		System.out.println("球形體積=" + pi * radius * radius * radius * 4 / 3);
	}

	void surfArea() {
		System.out.println("立方體表面積=" + (length * width + length * height + width * height) * 2);
	}

	void showData1() {
		System.out.println("半徑=" + radius);
	}

	void showData2() {
		System.out.println("長=" + length + ",寬=" + width + ",高=" + height);

	}

	void showAll() {
		showData1();
		volume();
		showData2();
		surfArea();
	}
}

public class Class01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cal_area area = new Cal_area();
		area.radius = 10;
		area.length = 4;
		area.width = 5;
		area.height = 6;
		area.showAll();
	}

}
