public class wired {
    public class MyClass {
        int x;
       // x = 5; // 🚫 Java syntax error — এটা কোনো method-এর বাইরে

//         Java Class Structure: Declaration vs Execution
//Java class হলো blueprint, যেখানে তুমি কী কী member (variables, methods, constructors) থাকবে সেটা বলে দাও।
//
//Class body-তে তুমি member declare করো, কিন্তু কোড execute করো না।
//
//কোড execute করার জায়গা হলো method বা constructor।
//        b = 10; এইটা একটা statement, অর্থাৎ "আমি b এর মান ১০ রাখছি" — এটা একটা কাজ বা instruction, যা runtime-এ চালানো হয়।
//
//কিন্তু তুমি class body-তে শুধু declaration করো, কাজ করো না।
//
//তাই Java compiler এই জায়গায় error দেয়, কারণ এখন execute করার সময় না, শুধু member declare করার সময়।
//        সঠিক জায়গা:
//
//তুমি এটা রাখতে পারো constructor বা method এর ভিতরে, কারণ সেগুলো চালানো হয় যখন program run হয়।
    }
    public static void main(String[] args) {
        int x;
        x = 0;
        System.out.println(x);
    }
}
