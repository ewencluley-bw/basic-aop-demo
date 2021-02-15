public class MyApp {

      private int indentedWRONG = 12;

    @MyAnnotation
    public void methodToWrap() {
        System.out.println("Sooooo looooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooong so so lonnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnng. Normal Java Stuff");
    }

    public static void main(String[] args) {
        new MyApp().methodToWrap();
    }
}
