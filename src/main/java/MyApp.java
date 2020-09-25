public class MyApp {
    @MyAnnotation
    public void methodToWrap() {
        System.out.println("Normal Java Stuff");
    }

    public static void main(String[] args) {
        new MyApp().methodToWrap();
    }
}
