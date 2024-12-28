public class Parameters_And_Arguments {
    public static void main(String[] agrs)
    {
        String name="Rahul Kumar";
        int age=20;
        String[] hobbies={"Gamming","Playing Football","Coding"};
//        introduce(name,age,hobbies);
    }
    void introduce(String name, int age,String[] hobbies)
    {
        System.out.println("My Name is "+name);
        System.out.println("I am "+age+"Yearss Old");
        System.out.println("My Hobbies are :");
        for (String Hobby :hobbies)
        {
            System.out.println(" "+hobbies);
        }
    }
}


