package principlesofSoftwareDesign.SingleResponsibility;

//单一职责
class Animal {
    public void breathe(String animal) {
        System.out.println(animal+"呼吸空气");
    }
}
public class DipClientProtetype {
    public static void main(String[] args){
        Animal animal = new Animal();
        animal.breathe("牛");
        animal.breathe("羊");
        animal.breathe("猪");
    }
}