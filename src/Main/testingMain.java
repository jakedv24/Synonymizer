package Main;

import java.util.List;

import net.jeremybrooks.knicker.AccountApi;
import net.jeremybrooks.knicker.WordApi;
import net.jeremybrooks.knicker.dto.Definition;
import net.jeremybrooks.knicker.dto.Related;
import net.jeremybrooks.knicker.dto.TokenStatus;

public class testingMain {
	public static void main(String[] args) throws Exception {
	    // use your API key here
	    System.setProperty("WORDNIK_API_KEY", "dfae92911e9825354410906c9d906307da77ddfb109f145c7");


	// check the status of the API key
	TokenStatus status = AccountApi.apiTokenStatus();
	if (status.isValid()) {
	    System.out.println("API key is valid.");
	} else {
	    System.out.println("API key is invalid!");
	    System.exit(1);
	}


	System.out.println(Reader.getSyn("car", 4));

	}
}
