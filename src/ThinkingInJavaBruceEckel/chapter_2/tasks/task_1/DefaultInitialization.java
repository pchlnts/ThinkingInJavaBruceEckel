package ThinkingInJavaBruceEckel.chapter_2.tasks.task_1;

// Create a class containing an int and a char that are not initialized, and print their
// values to verify that Java performs default initialization.

public class DefaultInitialization {
    int a;
    char ch;

    public DefaultInitialization() {
        System.out.println("a = " + a);
        System.out.println("ch = " + ch);
    }

    public static void main(String[] args) {
        new DefaultInitialization();
    }

}
