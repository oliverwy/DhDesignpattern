package ch28_visitorpattern.visitorpatternnormal;

public class ElementTypeA implements ElementType {
	
	private String name;
	private int count;
    @Override
    public void accept(Vistor vistor) {
        // TODO Auto-generated method stub
        vistor.visitElementTypeA(this);
    }
	public ElementTypeA(String name, int count) {
		super();
		this.name = name;
		this.count = count;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
    
}
