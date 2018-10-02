package ch19Compositepattern.Compositefirstcode;

public class Client {

	public static void main(String[] args) {
		Component c=null;
		Composite root =new Composite("root");
		root.add(new Leaf("Leaf A"));
		root.add(new Leaf("Leaf B"));
		
		Composite comp=new Composite("Composite X");
		comp.add(new Leaf("Leaf XA"));
		comp.add(new Leaf("Leaf XB"));
		
		root.add(comp);
		Composite comp2=new Composite("Composite X");
		comp2.add(new Leaf("Leaf XyA"));
		comp2.add(new Leaf("Leaf XyB"));
		comp.add(comp2);
		root.add(new Leaf("Leaf C"));
		
		Leaf leaf=new Leaf("D");
		root.add(leaf);
		root.display(1);
		System.out.println("");
		root.remove(leaf);
		root.display(1);
	}

}
