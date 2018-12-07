package Main;

import java.util.List;
import java.util.Scanner;

import net.jeremybrooks.knicker.AccountApi;
import net.jeremybrooks.knicker.WordApi;
import net.jeremybrooks.knicker.dto.Definition;
import net.jeremybrooks.knicker.dto.Related;
import net.jeremybrooks.knicker.dto.TokenStatus;

public class testingMain {
	public static void main(String[] args) throws Exception {
	    // use your API key here
	    System.setProperty("WORDNIK_API_KEY", "SECRET_API_KEY");


	// check the status of the API key
	TokenStatus status = AccountApi.apiTokenStatus();
	if (status.isValid()) {
	    System.out.println("API key is valid.");
	} else {
	    System.out.println("API key is invalid!");
	    System.exit(1);
	}

	String s = "I threw the car into the street";
	String synSentence = "";
	Scanner scan = new Scanner(s);
	while (scan.hasNext()) {
		String word = scan.next();
		synSentence += Reader.getSyn(word, 0) + " ";
	}
	System.out.println(s);
	System.out.println(synSentence);

	}
}
