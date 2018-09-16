

class Person implements Cloneable {
    String name;
    String password;
    String[] arrFavor;

    public Person(String name, String password, String[] arrFavor) {
        this.name = name;
        this.password = password;
        this.arrFavor = arrFavor;
    }

    @Override
    protected Object clone() {
        Person person = null;
        try {
            person = (Person) super.clone();
            //person.arrFavor = arrFavor.clone();
            return person;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}

public class test4 {
    public static void main(String[] args) {
        String[] arrFavor = { "basketball", "football" };
        Person person = new Person("Jay", "123", arrFavor);
        Person p = (Person) person.clone();
        System.out.println(p.name);
        System.out.println(p.password);
        p.name = "Jolin";
        p.password = "555";
        p.arrFavor[0] = "valiball";
        for (String favor : p.arrFavor) {
            System.out.print(favor + " ");
        }
        System.out.println();
        for (String favor : person.arrFavor) {
            System.out.print(favor + " ");
        }
        System.out.println();
    }
}
// 结果
// Jay
// 123
// valiball football
// valiball football