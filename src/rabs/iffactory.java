package rabs;

public interface iffactory {
	public void createob();
}

//javafactory
class javafactory implements iffactory{

	@Override
	public void createob() {
		// TODO Auto-generated method stub
		System.out.println("create java object");
	}
    
}

//cppfactory
class cppfactory  implements iffactory{

	@Override
	public void createob() {
		// TODO Auto-generated method stub
		System.out.println("create c++ object");
	}
  
}

class csharpfactory implements iffactory{

	@Override
	public void createob() {
		// TODO Auto-generated method stub
		System.out.println("create a csharp object");
	}
   
}