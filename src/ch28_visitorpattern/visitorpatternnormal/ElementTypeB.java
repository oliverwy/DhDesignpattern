package ch28_visitorpattern.visitorpatternnormal;

public class ElementTypeB implements ElementType {

	private String feeName;
	private double feeCount;
	@Override
    public void accept(Vistor vistor) {
        // TODO Auto-generated method stub
        vistor.visitElementTypeB(this);
    }

	public ElementTypeB(String feeName, double feeCount) {
		super();
		this.feeName = feeName;
		this.feeCount = feeCount;
	}

	public String getFeeName() {
		return feeName;
	}
	public void setFeeName(String feeName) {
		this.feeName = feeName;
	}
	public double getFeeCount() {
		return feeCount;
	}
	public void setFeeCount(double feeCount) {
		this.feeCount = feeCount;
	}
}
