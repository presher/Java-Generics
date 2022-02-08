package maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Application {

	public static void main(String[] args) {
		// the following maps do not allow duplicate keys
//		HashMap<String, String> dictionary = new HashMap<String, String>();
//		//The map data type needs a complex data type as a key value pair
//		dictionary.put("Brave", "ready to face and endure danger or pain; showing courage.");
//		dictionary.put("Brilliant", "exceptionally clever or talented.");
//		dictionary.put("Joy", "a feeling of great pleasure and happiness.");
//		dictionary.put("Confidence", "the feeling or belief that one can rely on someone or something; firm trust.");
//		dictionary.put("Knowledge", "facts, information, and skills acquired by a person through experience or education; the theoretical or practical understanding of a subject.");
//		//does not retain order of inserted values
		//use .get to retrive the keys value
//		for(String word: dictionary.keySet()) {
//			System.out.println(word);
//		}
		
//		LinkedHashMap<String, String> linkedDictionary = new LinkedHashMap<String, String>();
//		//The map data type needs a complex data type as a key value pair
//		linkedDictionary.put("Brave", "ready to face and endure danger or pain; showing courage.");
//		linkedDictionary.put("Brilliant", "exceptionally clever or talented.");
//		linkedDictionary.put("Joy", "a feeling of great pleasure and happiness.");
//		linkedDictionary.put("Confidence", "the feeling or belief that one can rely on someone or something; firm trust.");
//		linkedDictionary.put("Knowledge", "facts, information, and skills acquired by a person through experience or education; the theoretical or practical understanding of a subject.");
		//retain order of inserted values
		
//		for(String word: linkedDictionary.keySet()) {
//			System.out.println(word + "," + linkedDictionary.get(word));
//		}
		//to get the key and values at the same time
//		for(Map.Entry<String, String> entry: linkedDictionary.entrySet()){
//			System.out.println(entry.getKey());
//			System.out.println(entry.getValue());
//		}
		
		TreeMap<String, String> treeDictionary = new TreeMap<String, String>();
		//The map data type needs a complex data type as a key value pair
		treeDictionary.put("Brave", "ready to face and endure danger or pain; showing courage.");
		treeDictionary.put("Brilliant", "exceptionally clever or talented.");
		treeDictionary.put("Joy", "a feeling of great pleasure and happiness.");
		treeDictionary.put("Confidence", "the feeling or belief that one can rely on someone or something; firm trust.");
		treeDictionary.put("Knowledge", "facts, information, and skills acquired by a person through experience or education; the theoretical or practical understanding of a subject.");
		//sorts keys in natural order alphabetical for words and numerical for numbers
		
//		for(String word: treeDictionary.values()) {
//			System.out.println(word + "," + linkedDictionary.get(word));
//		}
		//to get the key and values at the same time
		for(Map.Entry<String, String> entry: treeDictionary.entrySet()){
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
	}

}
