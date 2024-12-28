public class String_builder {
    public static void main(String[] args)
    {
        StringBuilder str= new StringBuilder("I love Programming");
        str.append(" and Gaming ");
        System.out.println(str);

        str.insert(30,"or drinking coffee");
        System.out.println(str);

        str.delete(2,6);
        System.out.println(str);

        str.replace(0,1,"Rahul like ");
        System.out.println(str);



    }
}
