public class Main{
    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student();
        Student  st3 = new Student();


        st1.setName("Joshua");
        st1.setAge("21");
        st1.setGender("male");
        st1.setheight("178");
        st1.setweight("57");

        st2.setName("Annie");
        st2.setAge("20");
        st2.setGender("female");
        st2.setheight("167");
        st2.setweight("48");

        st3.setName("Jame");
        st3.setAge("21");
        st3.setGender("male");
        st3.setheight("182");
        st3.setweight("74");

        System.out.println("姓名:"+st1.getName());
        System.out.println("年齡:"+st1.getAge());
        System.out.println("性別:"+st1.getGender());
        System.out.println("身高:"+st1.getheight());
        System.out.println("體重:"+st1.getweight());
        System.out.print("\n");

        System.out.println("姓名:"+st2.getName());
        System.out.println("年齡:"+st2.getAge());
        System.out.println("性別:"+st2.getGender());
        System.out.println("身高:"+st2.getheight());
        System.out.println("體重:"+st2.getweight());
        System.out.print("\n");

        System.out.println("姓名:"+st3.getName());
        System.out.println("年齡:"+st3.getAge());
        System.out.println("性別:"+st3.getGender());
        System.out.println("身高:"+st3.getheight());
        System.out.println("體重:"+st3.getweight());

    }
}