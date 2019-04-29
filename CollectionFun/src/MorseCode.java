import java.util.Map;
import java.util.TreeMap;

public class MorseCode {
	
	private static Map<Character,String> letterToMorse = new TreeMap<Character,String>();

	public MorseCode() {
		letterToMorse.put('B', "_...");
		letterToMorse.put('I', "..");
		letterToMorse.put('E', ".");
		letterToMorse.put('N', "_.");
		letterToMorse.put('V', "..._");
	}
	
	public String encodeWord(String word) {
		String result = "";
		
		for (int i=0; i<word.length(); i++) {
			
			result += letterToMorse.get(word.charAt(i)) + "   ";
			
		}
		
		return result;
	}
	
}
