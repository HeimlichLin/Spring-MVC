package idv.heimlich.service;

import java.util.ArrayList;
import java.util.List;

public class WebService implements GenericService {
	
	@Override
	public List<String> getMessage(String name) {
		List<String> myWelcomeMessage = new ArrayList<>();
		
		myWelcomeMessage.add("Hello! ");
		myWelcomeMessage.add(name);
		myWelcomeMessage.add(", welcome to theSpring cource. ");
		
		return myWelcomeMessage;
	}

}
