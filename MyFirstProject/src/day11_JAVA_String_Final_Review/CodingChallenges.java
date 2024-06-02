package day11_JAVA_String_Final_Review;

public class CodingChallenges {


	public static void main (String[] args) {
		
		
	System.out.println(baseHeight(6,5));	
		
	System.out.println(voltageCurrent(230, 10));	
		
	System.out.println(lessThanOrEqual(3));	
	
	System.out.println(remainderFromTwoNum(2 , 4));
	
	System.out.println(giveMeSomething("something" , "something Bob Jane"));
	
	System.out.println(convertAgeInYears(65));
	
	System.out.println(sum(6,5));
	
	System.out.println(helloName("Tom"));
	
	System.out.println(divisibleByFive(10));
	
	System.out.println(fullName("First", "Last"));
	
	System.out.println(str("b"));
	
	System.out.println(count("AB", "CD"));
	
	System.out.println(bridge("### ####"));
	
	System.out.println(stri("6"));
	
	System.out.println(plural("car"));
	
	System.out.println(match("venom", "VENOM"));
	
	System.out.println(isEvenOrOdd(6));
	
	System.out.println(getMonthName(3)); //March
	
	System.out.println(sayHelloBye("Diana",1));
	
	System.out.println(value(true));
	
	System.out.println(variableValid("result"));
	
	System.out.println(howManyTimes(5));
	
	System.out.println(spaceMeOut("space"));
	
	System.out.println(capToFront("hApPy"));
	
	}
	
//	Write a function that takes the base and height of a triangle and return its area.
//
//			Examples
//			triArea(3, 2) ➞ 3
//			triArea(7, 4) ➞ 14
//			triArea(10, 10) ➞ 50
	
	static int baseHeight(int num1, int num2) {
		int area = (num1 * num2) / 2;
		return area;
		
	}
	
	//Power Calculator
//	Create a function that takes voltage and current and returns the calculated power.
//	Examples
//	power(230, 10) ➞ 2300
//	power(110, 3) ➞ 330
//	power(480, 20) ➞ 9600
	
	static int voltageCurrent(int voltage, int current) {
		int power = voltage * current;
		return power;
		
	}
	
//	Is the Number Less than or Equal to Zero?
//			Create a method that takes an integer as its only argument and returns true if it's less than or equal to zero, otherwise return false.
//			Examples
//			lessThanOrEqualToZero(5) ➞ false
//			lessThanOrEqualToZero(0) ➞ true
//			lessThanOrEqualToZero(-2) ➞ true
	
	static boolean lessThanOrEqual(int a) {
		if(a<=0) {
		return true;
		}else {
			return false;
		}
	}	
//		Return the Remainder from Two Numbers
//		There is a single operator in Java, capable of providing the remainder of a division operation. Two numbers are passed as parameters.
//		The first parameter divided by the second parameter will have a remainder, possibly zero. Return that value.
//		Examples
//		remainder(1, 3) ➞ 1
//		remainder(3, 4) ➞ 3
//		remainder(-9, 45) ➞ -9
//		remainder(5, 5) ➞ 0		
		
	
	
	static int remainderFromTwoNum(int b, int c) {
		int remainder = b % c;
		return remainder;
		
	}
	
//	Return Something to Me!
//	Write a function that returns the string "something" joined with a space " " and the given argument a.
//	Examples
//	giveMeSomething("is better than nothing") ➞ "something is better than nothing"
//	giveMeSomething("Bob Jane") ➞ "something Bob Jane"
//	giveMeSomething("something") ➞ "something something"	
	
	
	static String giveMeSomething(String str1, String str2) {
		String something = str2 + ' ' + str1;
		return something;
		
	}
	
//	Convert Age to Days
//	Create a function that takes the age in years and returns the age in days.
//	Examples
//	calcAge(65) ➞ 23725
//	calcAge(0) ➞ 0
//	calcAge(20) ➞ 7300
	
	
	static int convertAgeInYears(int age) {
		int convert = age * 365;
		return convert;
	}
	
/*Less Than 100?
Given two numbers, return true if the sum of both numbers is less than 100. Otherwise return false.
Examples
lessThan100(22, 15) ➞ true
// 22 + 15 = 37
lessThan100(83, 34) ➞ false
// 83 + 34 = 117
lessThan100(3, 77) ➞ true	*/
	
	static boolean sum(int num1, int num2) {
		int sumOfTwoNum = num1 + num2;
		if(sumOfTwoNum<100) {
			return true;
		}else {
			return false;
		}
/*Name Greeting!
Create a function that takes a name and returns a greeting in the form of a string.
Examples
helloName("Gerald") ➞ "Hello Gerald!"
helloName("Tiffany") ➞ "Hello Tiffany!"
helloName("Ed") ➞ "Hello Ed!"*/	
	
	}
	 static String helloName(String name){
			String greeting = "Hello " + name;
			return greeting;
	
	}
	
/*Check if an Integer is Divisible By Five
Create a function that returns true if an integer is evenly divisible by 5, and false otherwise.
Examples
divisibleByFive(5) ➞ true
divisibleByFive(-55) ➞ true
divisibleByFive(37) ➞ false */	 
	 
	 static boolean divisibleByFive(int randomNum) {
		 
		 if(randomNum % 5 == 0 ) {
			 return true;
		 }else {
			 return false;
		 }
/*Concatenate First and Last Name into One String
Given two strings, firstName and lastName, return a single string in the format "last, first".
Examples
concatName("First", "Last") ➞ "Last, First"
concatName("John", "Doe") ➞ "Doe, John"
concatName("Mary", "Jane") ➞ "Jane, Mary" */		 
		 
		 }
	 
	 static String fullName(String name1, String name2) {
		 String name = name1 + name2;
		 return name;
	 }
/*Is the String Empty?
Create a function that returns true if a string is empty and false otherwise.
Examples
isEmpty("") ➞ true
isEmpty(" ") ➞ false
isEmpty("a") ➞ false
Notes
A string containing only whitespaces " " does not count as empty.*/	 
	 

	
		static boolean str(String value) {
			if(value.isEmpty()) {
			return true;
			}else {
			return false;

}
/*Compare Strings by Count of Characters
Create a function that takes two strings as arguments and return either true or false depending on whether the total number of characters in the
first string is equal to the total number of characters in the second string.
Examples
comp("AB", "CD") ➞ true
comp("ABC", "DE") ➞ false
comp("hello", "edabit") ➞ false */	 
			
	
	}
			static boolean count(String char1, String char2) {
			if(char1.length() == char2.length()) {
				return true;
			}else {
				return false;

}
	
			
/*Broken Bridge
Create a function which validates whether a bridge is safe to walk on (i.e. has no gaps in it to fall through).
Examples
isSafeBridge("####") ➞ true
isSafeBridge("## ####") ➞ false
isSafeBridge("#") ➞ true
isSafeBridge("### ####") ➞ false
isSafeBridge("#####") ➞ true	*/		
	 
			}
			static boolean bridge(String bridgeSafety) {
			boolean notSafe = bridgeSafety.contains(" ");
			if (notSafe) {
				return true;
			}else {
				return false;
			}
		
	/*Return a String as an Integer
Create a function that takes a string and returns it as an integer.
Examples
stringInt("6") ➞ 6
stringInt("1000") ➞ 1000
stringInt("12") ➞ 12 */	
			
			}
			static int stri(String number) {
				Integer convertToNum = Integer.valueOf(number);
				return convertToNum;
		} 

/*Create a function that takes in a word and determines whether or not it is plural. A plural word is one that ends in "s".
Examples
isPlural("changes") ➞ true
isPlural("change") ➞ false
isPlural("dudes") ➞ true
isPlural("magic") ➞ false */
				
	
	static boolean plural(String word) {
		if (word.endsWith("s")) {
			return true;
		}else {
			return false;
		}
/*Case Insensitive Comparison
Write a function that validates whether two strings are identical. Make it case insensitive.
Examples
match("hello", "hELLo") ➞ true
match("motive", "emotive") ➞ false
match("venom", "VENOM") ➞ true
match("mask", "mAskinG") ➞ false */		
	
		}
		static boolean match(String word1, String word2) {
		if(word1.equalsIgnoreCase(word2)){
			return true;
		}else {
			return false;	
	
		}
	/*Is the Number Even or Odd?
	Create a method that takes an integer as an argument and returns"even" for even integers and "odd" for odd integers.
	Examples
	isEvenOrOdd(3) ➞ "odd"
	isEvenOrOdd(146) ➞ "even"
	isEvenOrOdd(19) ➞ "odd" */
		
		
		}
		
		static String isEvenOrOdd(int n) {
			String e = "even";
			String o = "odd";
			if((n % 2) == 0) {
			return e;
			}
			return o;
	}

/*Convert Number to Corresponding Month Name
Create a function that takes a number (from 1 to 12) and returns its corresponding month name as a string. For example, if you're given 3 as input, your function should return "March",
because March is the 3rd month.
Number	Month Name
1	January
2	February
3	March
4	April
5	May
6	June
7	July
8	August
9	September
10	October
11	November
12	December
Examples
monthName(3) ➞ "March"
monthName(12) ➞ "December"
monthName(6) ➞ "June" */		
	
		
		static String getMonthName(int monthNumber) {
			String[] months = {
					"January", "February", "March", "April", "May", "June",
					"July", "August", "September", "October", "November", "December"

		};
		return months[monthNumber - 1]; 
		
		}
/*Say "Hello" Say "Bye"
Write a function that takes a string name and a number num (either 0 or 1) and return "Hello" + name if num is 1, otherwise return "Bye" + name.
Examples
sayHelloBye("alon", 1) ➞ "Hello Alon"
sayHelloBye("Tomi", 0) ➞ "Bye Tomi"
sayHelloBye("jose", 0) ➞ "Bye Jose"*/	
		
		static String sayHelloBye(String name, int num) {
			if (num == 1) {
				return "Hello " + name;
			}
			return "Bye " + name;
			
		}
/*Flip the Boolean
Create a function that reverses a boolean value.
Examples
reverse(true) ➞ false
reverse(false) ➞ true */		
		
		static boolean value(boolean isTrue) {
			return !isTrue;
		}
/*Valid Variable Names
When creating variables, the variable name must always start with a letter and cannot contain spaces, though numbers and underscores are allowed to be contained in it also.
Create a function which returns true if a given variable name is valid, otherwise return false.
Examples
variableValid("result") ➞ true
variableValid("odd_nums") ➞ true
variableValid("2TimesN") ➞ false
Notes
Inputs are given as strings.
Variable names with spaces are not allowed.
Although this question may seem like otherwise, you can't actually assign words with quotes around them as variables.*/		
		
	static boolean variableValid(String variableName) {
		boolean startsWithDigit = Character.isDigit(variableName.charAt(0));
		if(!variableName.contains(" ")&& !startsWithDigit) {
			return true;
		} else {
			return false;
		}
/*Edaaaaabit
Write a function that takes an integer and returns a string with the given number of "a"s in Edabit.
Examples
howManyTimes(5) ➞ "Edaaaaabit"
howManyTimes(0) ➞ "Edbit"
howManyTimes(12) ➞ "Edaaaaaaaaaaaabit"
Notes
The string must start with "Ed" and end with "bit".
You'll only be given integers as test input.	 */		
		
	}
	static String howManyTimes(int number) {
		String beginningName = "Ed";
		String endingName = "bit";
		String result = beginningName + "a".repeat(number) + endingName;

		return result;
}

/*Spaces Between Each Character
Create a function that takes a string and returns a string with spaces in between all of the characters.
Examples
spaceMeOut("space") ➞ "s p a c e"
spaceMeOut("far out") ➞ "f a r   o u t"
spaceMeOut("elongated musk") ➞ "e l o n g a t e d   m u s k"
Notes
Treat a space as its own character (i.e. leave three spaces between words).*/
	

	static String spaceMeOut(String word) {
	String spacedCharacters = word.replace("", " ").trim();
	return spacedCharacters;
}	
/*Move Capital Letters to the Front
Create a function that moves all capital letters to the front of a word.
Examples
capToFront("APphy") ➞ "APhpy"
capToFront("moveMENT") ➞ "MENTmove"
capToFront("shOrtCAKE") ➞ "OCAKEshrt"
Notes
Keep the original relative order of the upper and lower case letters the same.*/	

	static String capToFront(String word) {
		char[] chars = word.toCharArray();
		
		
		int leftIndex = 0;
		int rightIndex = 1;
		
		while(rightIndex < chars.length) {
			if(Character.isUpperCase(chars[rightIndex])){
				char temp = chars[rightIndex];
				chars[rightIndex] = chars[leftIndex];
				chars[leftIndex] = temp;
				rightIndex++;
				leftIndex++;
			} else {
				rightIndex++;
				
				
			}
		}
		return String.valueOf(chars);
		
	}
		
}




