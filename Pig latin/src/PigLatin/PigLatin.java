package PigLatin;

import java.util.Arrays;

public class PigLatin {
	public static void main(String[] args) {
		// just a proof of concept that the encoding and decoding works
		System.out.println(makeString(decodePigLatin(makeString(createPigLatin("Dictators free themselves but they enslave the people Now let us fight hi")))));
		
	}
	
	private static String createPigLatin(String toPigLatin) {
		String[] createPigLatin = toPigLatin.toLowerCase().split("\\s");
		char[] vowels = {'a', 'e', 'i', 'o', 'u'};
		System.out.println(Arrays.toString(createPigLatin));
		for(int i = 0; i < createPigLatin.length; i++) {
			for(int x = 0; x < vowels.length; x++) {
				if((createPigLatin[i].charAt(0) == (vowels[x]))) {
					createPigLatin[i] = createPigLatin[i] + "yay";
				}
			}
		if(createPigLatin.length <= 2) {
			createPigLatin[i] = createPigLatin[i].substring(1) + createPigLatin[i].charAt(0) + "ay";
		}
	}
		System.out.println(Arrays.toString(createPigLatin));
		return Arrays.toString(createPigLatin);
	}
	
	private static String decodePigLatin(String decodePigLatin) {
		String[] decodedPigLatin = decodePigLatin.split("\\s");
		for(int i = 0; i < decodedPigLatin.length; i++) {
			if(decodedPigLatin[i].substring(decodedPigLatin[i].length() - 3).equals("yay")) {
				decodedPigLatin[i] = decodedPigLatin[i].substring(0, decodedPigLatin[i].length() - 3);
				//System.out.println(decodedPigLatin[i]);
			}else if(decodedPigLatin[i].substring(decodedPigLatin[i].length() - 2).equals("ay")){
				decodedPigLatin[i] = decodedPigLatin[i].charAt(decodedPigLatin[i].length() - 3)+
						decodedPigLatin[i].substring(0, decodedPigLatin[i].length() - 3);
			}
		}
		//System.out.println(Arrays.toString(decodedPigLatin));
		return Arrays.toString(decodedPigLatin);
	}
	
	private static String makeString(String oml) {
		String output = "";
		String[] becomeString = oml.split(",");
		becomeString[0] = becomeString[0].substring(1);
		becomeString[becomeString.length - 1] = becomeString[becomeString.length - 1].substring(0, becomeString[becomeString.length - 1].length() - 1);
		for(int  i = 0; i < becomeString.length; i++) {
			output = output + becomeString[i];
		}
		//System.out.println(output);
		return output;
	}
}
