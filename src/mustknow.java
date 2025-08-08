public class mustknow {
    public static void main(String[] args) {
         class MyClass {
            int x;

            // constructor
            public MyClass() {
                x = 10;
                System.out.println("Constructor called");
            }
            static {
                System.out.println("hlw from static i just run one time when class load even if you create multiple obj");
            }
        }
        MyClass myObject = new MyClass(); // call kora chara run hobe constructor এটা object তৈরি হওয়ার সময় অটোমেটিক চালায়
        MyClass myObject2 = new MyClass(); // second time run hobe but static run hobe na

    }
}
