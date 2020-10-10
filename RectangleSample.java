public class RectangleSample {

	public static void main(String[] args) {
		MyRectangle mr1 = new MyRectangle();
		mr1.printMyRectangle();
		MyRectangle mr2 = new MyRectangle(30, 50);
		mr2.printMyRectangle();
		System.out.println("mr1の面積="+mr1.getHeight()+"*"+mr1.getWidth()+"="+mr1.getArea());
	}
}
