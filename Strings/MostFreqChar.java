package stringsQuiz;

import java.util.*;

public class MostFreqChar {

	public static void main(String[] args){
		
		String input = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a string");
		input = sc.nextLine();
		
		String result = findMostFrequentChar(input);
		
		System.out.println("The most frequently occured character is: " + result);
		
	}
	
	static String findMostFrequentChar(String inputString) {

        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i < inputString.length(); i++) {
            if (map.containsKey(inputString.charAt(i)))
                map.put(inputString.charAt(i), map.get(inputString.charAt(i)) + 1);
            else 
			    map.put(inputString.charAt(i), 1);
	    }

	    int max = 0;
	    String result = "";
        
	    for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (max < entry.getValue()) {
                result = entry.getKey() + "";
                max = entry.getValue();
            }
	    }

	   return result;
        
    }
}
