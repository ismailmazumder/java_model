public class impl {
    public static void main(String[] args) {
        // implements (ইমপ্লিমেন্টস) //শব্দের অর্থ: "বাস্তবায়ন করা"।
        // Interface হচ্ছে Java-তে একটা খালি চুক্তিপত্রের মতো –
        //যেটা বলে, “এই এই কাজগুলো করতে হবে”, কিন্তু কাজগুলো করে না।
        //
        //🔸 Interface শুধু method-এর নাম ও কাঠামো (signature) বলে দেয়,
        //কিন্তু body ({} এর ভেতরের কাজ) দেয় না।
        // jate user/programmer pore egulay nijee code dukaite pare. but structure cng na hoy

        interface Animal {
            void eat();
        }

        class Dog implements Animal {
            @Override
            public void eat() {
                System.out.println("Dog is eating");
            }
        }
    }
}

//এখানে method টার body interface-এ ছিল না,
//তুমি নিজের মতো করে কাজ দাও — তাও override বলে গোনা হয়।