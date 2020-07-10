package ThinkingInJavaBruceEckel.chapter_1.examples.example_1;
// Consider the shape example - p. 26
// To demonstrate polymorphism, we want to write a simple program
public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Line line = new Line();

        doSomething(circle);
        doSomething(triangle);
        doSomething(line);
    }

    private static void doSomething(Shape shape) {
        shape.erase();
        shape.draw();
    }
}
