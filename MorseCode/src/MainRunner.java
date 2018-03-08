import java.util.HashMap;
import java.util.Scanner;

public class MainRunner {
	public static void main(String[] args) {

		System.out.println(translateMorseCode(".... . .-.. .-.. --- / -.. .- .. .-.. -.-- / .--. .-. --- --. .-. .- -- -- . .-. / --. --- --- -.. / .-.. ..- -.-. -.- / --- -. / - .... . / -.-. .... .- .-.. .-.. . -. --. . ... / - --- -.. .- -.--"));
	}

	static Scanner s = new Scanner(System.in);

	public static String translateMorseCode(String input) {
		HashMap<String, String> morseTranslator = new HashMap<>();

		morseTranslator.put(".-", "a");
		morseTranslator.put("-...", "b");
		morseTranslator.put("-.-.", "c");
		morseTranslator.put("-..", "d");
		morseTranslator.put(".", "e");
		morseTranslator.put("..-.", "f");
		morseTranslator.put("--.", "g");
		morseTranslator.put("....", "h");
		morseTranslator.put("..", "i");
		morseTranslator.put(".---", "j");
		morseTranslator.put("-.-", "k");
		morseTranslator.put(".-..", "l");
		morseTranslator.put("--", "m");
		morseTranslator.put("-.", "n");
		morseTranslator.put("---", "o");
		morseTranslator.put(".--.", "p");
		morseTranslator.put("--.-", "q");
		morseTranslator.put(".-.", "r");
		morseTranslator.put("...", "s");
		morseTranslator.put("-", "t");
		morseTranslator.put("..-", "u");
		morseTranslator.put("...-", "v");
		morseTranslator.put(".--", "w");
		morseTranslator.put("-..-", "x");
		morseTranslator.put("-.--", "y");
		morseTranslator.put("--..", "z");
		//morseTranslator.put("/", " ");
	
		String ans = "";
	
		String[] wordArray = input.split(" / ");
		
		for (int i = 0; i < wordArray.length; i++) {
			String[] letterArray = wordArray[i].split(" ");
			for (int j = 0; j < letterArray.length; j++) {
				ans = ans + morseTranslator.get(letterArray[j]);
			}
			ans = ans + " ";
		}
		return ans;
	
	}
	

}
