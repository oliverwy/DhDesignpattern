package ch13buildPattern.buildPatternperson;

class PersonDirector {
    private PersonBuilder pb;

    public PersonDirector(PersonBuilder pb) {
        super();
        this.pb = pb;
    }

    public void CreatePerson() {
        pb.buildHead();
        pb.buildBody();
        pb.buildArmLeft();
        pb.buildArmRight();
        pb.buildLegLeft();
        pb.buildLegRight();
        pb.buildTail();
    }
}
