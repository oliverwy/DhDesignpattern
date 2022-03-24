package ch13_buildPattern.buildPatternperson;

class PersonDirector {

	private PersonBuilder pb;

    public PersonDirector() {
        super();
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
    public PersonBuilder getPb() {
		return pb;
	}

	public void setPb(PersonBuilder pb) {
		this.pb = pb;
	}

}
