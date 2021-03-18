/**
 *
 */
package ch28_visitorpattern.simpleObjectoriented;

import java.util.ArrayList;
import java.util.List;

/**
 * @author oliver
 *
 */
public class Client {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<Person> persons = new ArrayList<Person>();
        Person man1 = new Man();
        man1.action = "成功";
        persons.add(man1);
        Person woman1 = new Woman();
        woman1.action = "成功";
        persons.add(woman1);

        Person man3 = new Man();
        man3.action = "失败";
        persons.add(man3);
        Person woman3 = new Woman();
        woman3.action = "失败";
        persons.add(woman3);

        Person man4 = new Man();
        man4.action = "恋爱";
        persons.add(man4);
        Person woman4 = new Woman();
        woman4.action = "恋爱";
        persons.add(woman4);
        for (Person item : persons) {
            item.getConclusion();
        }
    }

}
