package one.digitalinnovation.runemaker;

import java.util.EnumMap;
import java.util.Map;

public class RuneMaker {

	private final Map<RuneType, Rune> runes;
	
	public RuneMaker() {
		runes = new EnumMap<>(RuneType.class);
	}
	
	Rune createRune(RuneType type) {
		var rune = runes.get(type);
		if (rune == null) {
			switch(type) {
			case Water:
				rune = new TideRune();
				runes.put(type, rune);
				break;
			case Earth:
				rune = new GroveRune();
				runes.put(type, rune);
				break;
			case Fire:
				rune = new VulcanRune();
				runes.put(type, rune);
				break;
			case Wind:
				rune = new HurricaneRune();
				runes.put(type, rune);
				break;
			default:
				break;
			}
		}
		return rune;
	}
}
