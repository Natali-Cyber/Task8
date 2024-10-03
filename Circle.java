/**
 * Класс, представляющий круг.
 */
public class Circle {

    private  double radius;

    /**
     * Конструктор, который инициализирует круг с заданным радиусом.
     *
     * @param radius радиус круга, должен быть больше 0.
     * @throws IllegalArgumentException если радиус не больше 0.
     */
    public Circle(double radius) {
        setRadius(radius);
    }

    /**
     * Устанавливает радиус круга.
     *
     * @param radius новый радиус круга, должен быть больше 0.
     * @throws IllegalArgumentException если радиус не больше 0.
     */
    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Радиус должен быть больше 0");
        }
        this.radius = radius;
    }

    /**
     * Возвращает радиус круга.
     *
     * @return радиус круга.
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Вычисляет и возвращает площадь круга.
     *
     * @return площадь круга.
     */
    public double getArea() {
        return Math.PI * radius * radius; // Вычисление площади.
    }
}