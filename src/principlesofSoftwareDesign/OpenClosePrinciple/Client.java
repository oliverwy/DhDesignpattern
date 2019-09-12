package principlesofSoftwareDesign.OpenClosePrinciple;

//客户端
public class Client {

    public static void main(String[] args) {
        Person person1 = new Person("petter", 20);
        Person person2 = new Person("mery", 21);
        ComparePerson comparePerson = new ComparePerson();
        comparePerson.setData(person1, person2);
        System.out.println("max_person: " + comparePerson.getMax().toString());

        // house
        House house1 = new House(8, 12, " ShangHai ");
        House house2 = new House(10, 11, " ShenZheng ");
        CompareHouse compareHouse = new CompareHouse();
        compareHouse.setData(house1, house2);
        System.out.println("max_House: " + compareHouse.getMax().toString());
    }

}
