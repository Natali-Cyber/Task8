public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Площадь круга: " + circle.getArea());

        TestCircle test = new TestCircle();
        test.test();
    }
}