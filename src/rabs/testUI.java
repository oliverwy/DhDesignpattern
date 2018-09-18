package rabs;

public class testUI {
	  private String objectstr;
	    public void setselect(String key){
	    	this.objectstr=key;
	    }
	    public String getselect(String key){
	    	return this.objectstr;
	    }
	    public iffactory createobj(){
	    	iffactory iffac = null;
	    	try{
	    		//
	    		iffac=(iffactory) Class.forName(this.getClass().getPackage().getName()+"."+objectstr).newInstance();
	    	}catch(Exception e){
	    		e.printStackTrace();
	    	}
	    	return iffac;
	    }
	    public static void main(String[] args) {
			testUI test=new testUI();
			iffactory iffac=null;
			test.setselect("cppfactory");
			iffac=test.createobj();
			iffac.createob();
		}


}
