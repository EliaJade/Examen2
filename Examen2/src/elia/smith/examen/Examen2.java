package elia.smith.examen;

import java.util.Scanner;

public class Examen2 {
	
	//PARTE 1
	
	public static void parte1(int number) {
		
		
		if(number%2==0) {
			System.out.print(number + " is even");
		} else {
			System.out.print(number + " is odd");
		}
		
		if (number<0) {
			System.out.println(" and negative");
		}
	}
	
	
	
	//PARTE 2
	
	public static int[] parte2(int numberAmount) {
		int i=0;
		int totalAdd = 0;
		int max=-1000000;
		int min=1000000;
		Scanner scan = new Scanner(System.in);
		
		int[] listOfNumbers = new int[numberAmount];
		for(int number : listOfNumbers) {
			System.out.println("Choose a number for space " + (i+1));
			int numbers = scan.nextInt();
			listOfNumbers[i] = numbers;
//			System.out.println(numbers);
			i++;
		}
//		System.out.println(listOfNumbers[0]);
		for(int number : listOfNumbers) {
			totalAdd = totalAdd + number;
			if (number<min) {
				min=number;
			}
			if (number>max) {
				max=number;
			}
		}
		System.out.println("Adding all the nebers gives a total of" + totalAdd);
		System.out.println("The biggest number is " + max);
		System.out.println("The smallest number is " + min);
		
		
		return listOfNumbers;			//unnecessary for now
	}
	
	
	///PARTE 3
	
	public static void parte3(String something) {
		int vowelCounter = 0;
		int letterCounter = 0;
//		int wordCounter = 0;

//		String word = "";
		
		String somethingBackwards = "";
		String somethingLowerCase= something.toLowerCase();
//		String wordLongest = "";
//		int wordLength = 0;
		
//		String somethingWordArray[] = new String[something.indexOf(" ")];
		char somethingLetterArray[] = new char[something.length()];
		
		
		for (char letter : somethingLetterArray) {
			somethingLetterArray[letterCounter] = something.charAt(letterCounter);
			letter = somethingLetterArray[letterCounter];
			letterCounter++;
			if((letter==('a'))||(letter==('e'))||(letter==('o'))||(letter==('i'))||(letter==('u'))) {
				vowelCounter++;
			}
			
		
		}
		System.out.println("Your something contains " + vowelCounter + " vowels");
		

//		something += (" ");
//		while(something.length()>0) {
//			int positionWhite = something.indexOf(" ");
//			word = something.substring(0,positionWhite);
//			System.out.println(word);
//			if(word.length()>wordLongest.length()) {
//				wordLongest = word;
//			}
//			
//		}
		
		
		for(int i=something.length()-1 ; i>=0 ; i-- ) {
			somethingBackwards = somethingBackwards + something.charAt(i);
		}

		System.out.println(somethingBackwards);
	}
	
	
	
	
	
	
	//PARTE 4
	
//	public static void parte4(int numberAmount2) {
//		int i= 0;
//		int j= 0;
//		int x = 0;
//		int counterNotRepeated =0;
//		int counterRepeated = 0;
//		Scanner scan = new Scanner(System.in);
//		
//		int[] listOfNumbers = new int[numberAmount2];
//		for(int number : listOfNumbers) {
//			System.out.println("Choose a number for space " + (i+1));
//			int numbers = scan.nextInt();
//			listOfNumbers[i] = numbers;
//			if(i>0) {
//			int numberBefore = listOfNumbers[j-1];
//
//			int[] listOfNumbersNotDuplicated = new int[numberAmount2];
//			for(int number2:listOfNumbersNotDuplicated) {
//
//				number2 = listOfNumbers[x];
//				if(numbers==number2) {
//					counterRepeated++;
//					x++;
//					
//					
//				}
//				break;
//			}
////			
////			counterNotRepeated= numberAmount2-counterRepeated;
////			int[] 
//			System.out.println("There are " + counterRepeated + " repeated numbers");
//			}
////			System.out.println(numbers);
//			i++;
//			j++;
//			
//		}
//	}
	
	public static void parte4(int numberAmount) {
		int i = 0;
		int numbers = 0;
		Scanner scan = new Scanner(System.in);
		int[] array1 = new int [numberAmount];
		
		for(int place : array1) {
			System.out.println("Choose a number for space " + (i+1));
			int number = scan.nextInt();
//			place = number;
			int[] array2 = new int [number];
			for(int place2 : array2) {
				place2 = number;
				
			}
			
			
			
			
		}
	}
	
	

	public static void main(String[]args) {
//		System.out.println("Choose a number");
		Scanner scan = new Scanner(System.in);
//		int number = scan.nextInt();
//		parte1(number);
//
//		System.out.println("\nHow many numbers?");
//		scan = new Scanner(System.in);
//		int numberAmount = scan.nextInt();
//		parte2(numberAmount);
//		
//		System.out.println("Write something");
//		scan = new Scanner(System.in);
//		String something = scan.nextLine();
//		parte3(something);
		
		System.out.println("\nHow many numbers?");
		scan = new Scanner(System.in);
		int numberAmount2 = scan.nextInt();
		parte4(numberAmount2);
		
		}
}
