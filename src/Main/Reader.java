package Main;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import net.jeremybrooks.knicker.KnickerException;
import net.jeremybrooks.knicker.WordApi;
import net.jeremybrooks.knicker.Knicker.RelationshipType;
import net.jeremybrooks.knicker.dto.Related;

public class Reader {
	public static String getSyn(String word, int howFar) throws KnickerException {
		Set<RelationshipType> typeOfRelation = new HashSet<RelationshipType>();
		typeOfRelation.add(RelationshipType.synonym);
		List<Related> relSyn = WordApi.related(word, false, typeOfRelation, 20);
		if (relSyn.size() > 0) {
			List<String> synonyms = relSyn.get(0).getWords();
			try {
				// Could be too long
				return synonyms.get(howFar);
			}
			catch (IndexOutOfBoundsException e) {
				// Get the last one
				return synonyms.get(synonyms.size() - 1);
			}
		}
		else {
			return word;
		}
	}
}
