package ch1.normalfactory;

public class OperationAddfactory implements OperationFactory {

	@Override
	public Operation getOperation() {
		// TODO Auto-generated method stub
		return new OperationAdd();
	}

}
