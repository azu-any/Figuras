// Azuany Mila - 177068
// Examen Parcial 1

package Package1;

public class Examen {
	
	public String primeraMayuscula(String word) {
		String newWord = word.replace(word.substring(0,1), word.substring(0,1).toUpperCase());
		return newWord;
	}
	
	public String invertirCadena(String word) {
		String newWord = "";
		
		for(int i = word.length(); i > 0; i = i-1) {
			newWord = newWord + word.substring(i-1,i);
		}
		return newWord;
	}
	
	public String vocalesMayuscula(String word) {
		String newWord = "";
		
		for(int i = 0; i < word.length(); i = i+1) {
			if(word.substring(i,i+1).contains("a") || word.substring(i,i+1).contains("e") || word.substring(i,i+1).contains("i") || word.substring(i,i+1).contains("o") || word.substring(i,i+1).contains("u")) {
				newWord = newWord + word.substring(i,i+1).toUpperCase();
			} else {
				newWord = newWord +word.substring(i,i+1);
			}
		}
		return newWord;
	}
	
	public void fizzBuzz() {
		for(int i = 1; i <=100; i=i+1) {
			if((i%3==0) && (i%5==0)) {
				System.out.println("FizzBuzz");
			} else if(i%3==0) {
				System.out.println("Fizz");
			} else if(i%5==0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
	}
	
	public boolean palindromo(String word) {
		String newWord = "";
		String original = "";
		int length = word.length();
		
		for(int i = 0; i<length; i=i+1) {
			if(word.substring(i,i+1).contains(" ")) {
				continue;
			} else {
				original = original + word.substring(i,i+1).toLowerCase();
			}
		}
		
		for(int i = original.length(); i > 0; i = i-1) {
			newWord = newWord + original.substring(i-1,i).toLowerCase();
		}
		
		if(original.equals(newWord)) {
			return true;
		} else {
			return false;
		}
		
	}
}