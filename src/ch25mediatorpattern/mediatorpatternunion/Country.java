/**
 * 
 */
package ch25mediatorpattern.mediatorpatternunion;

/**
 * @author oliver
 *
 */
public abstract class Country {
	public UnitedNations getMediator() {
		return mediator;
	}

	public void setMediator(UnitedNations mediator) {
		this.mediator = mediator;
	}

	protected UnitedNations mediator;

	public Country(UnitedNations mediator) {
		super();
		this.mediator = mediator;
	}
	public abstract void declare(String message);
	public abstract void getMessage(String message);
	
}
