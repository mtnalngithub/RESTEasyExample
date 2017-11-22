package service;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

public class RegisterApplication extends Application {

	private Set<Object> singletons = new HashSet<Object>();
	
	public RegisterApplication() {
		singletons.add(new MovieService());
	}
	
	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}
}
