import java.util.*;
public class ArrayDemo {
    public static void main(String[] args) {
        //Insert,Update and Remove List Elements
        List<String> name = new ArrayList();
        name.add("mallikarjun");
        name.add("sunil");
        System.out.println(name);
        name.add(1,"rakesh");
        System.out.println(name);
        name.set(1,"Ravi");
        System.out.println(name);
        name.remove(1);
        System.out.println(name);
        name.remove("sunil");
        System.out.println(name);
    }
}
