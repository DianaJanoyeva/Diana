package day11_JAVA_String_Final_Review;

public class javaHomework {

	public static void main(String[] args) {
		/*TASK 1:
1. Create a String variable to represent your favorite sport and intialize it with a value.
2. Convert favorite sport to all upper case letters.
3. Create the following conditional structure.
If the first letter of the String is equal to 'A' or 'a' then Print "First Letter of alphabet is the first letter of this String"
If the first letter of the String is equal to 'B' or 'b' then Print "First Letter of alphabet is the first letter of this String"
If the first letter of the String is equal to 'B' or 'b' then Print "Second Letter of alphabet is the first letter of this String" 
-If the first letter of the String is equal to 'C' or 'c' then Print "Third Letter of alphabet is the first letter of this String".
If none of the 3 conditions above are true then Print "Expected Alphabet not found in the first letter".*/

		String favoriteSportString = "Figure Skating"; //Immutable
		StringBuilder favoriteSport = new StringBuilder(favoriteSportString.toUpperCase()); //Mutable
		System.out.println(favoriteSport);
		
		if (favoriteSportString.startsWith("A") || favoriteSportString.startsWith("a")){
			System.out.println("First Letter of alphabet is the first letter of this String");
		}else if (favoriteSportString.startsWith("B") || favoriteSportString.startsWith("b")) {
			System.out.println("Second Letter of alphabet is the first letter of this String");
		}else if (favoriteSportString.startsWith("C")|| favoriteSportString.startsWith("c")) {
			System.out.println("Third Letter of alphabet is the first letter of this String");
		}else {
			System.out.println("Expected Alphabet not found in the first letter");
		}
/*TASK 2:

1. Create a String variable to represent your all time favorite quote.
2. Create another String variable called search and set that equal to win.
3. Convert both strings to lower case.
4. Check if the string in step 2 is contained with the string you created in Step 1.
5. If string in step1 is found Print "Search Matched" If string in step1 is not found Print "Search Not Matched"*/
		
	String favoriteQuoteString = "AlWays ThInk Positive thoughts"; //Immutable
	String searchString = "WIn"; //Immutable

	StringBuilder favoriteQuote = new StringBuilder(favoriteQuoteString.toLowerCase()); //Mutable
	StringBuilder search = new StringBuilder(searchString.toLowerCase());
	
	if(favoriteQuoteString.contains(searchString)) {
		System.out.println("Search Matched");
	}else {
		System.out.println("Search Not Matched");
	}
	
/*TASK 3:

1. Create a String variable to represent your favorite Music Artist.
2. Create an If condition statement to check the following:
If the artist's name Starts with 'A', or ends with 'e' then print 'Artist 1 Found'
If the artist's name Starts with 'O', or ends with 'u' then print 'Artist 2 Found'
If the artist's name Starts with 'J', or ends with 'm' then print 'Artist 3 Found'
Add a default condition when none of the above 3 conditions are true and print 'Artist Not Found' */	
	
	String favoriteMusicArtist = "Inna";
	
	if(favoriteMusicArtist.startsWith("A") || favoriteMusicArtist.endsWith("e")) {
		System.out.println("Artist 1 Found");
	}else if (favoriteMusicArtist.startsWith("O") || favoriteMusicArtist.endsWith("u")) {
		System.out.println("Artist 2 Found");
	}else if (favoriteMusicArtist.startsWith("J") || favoriteMusicArtist.endsWith("m")) {
		System.out.println("Artist 3 Found");
	}else {
		System.out.println("Artist Not Found");
	}
/*TASK 4:

1. Create a String literal variable to represent your favorite drink.
2. Create a String object variable to represent your favorite snack.
3. Check if both Strings are equal to each other.
4. Create 2 integer variables are store the length of each string inside of each respective integer variable.
5. Create a String literal variable called 'combineTwoStrings' and set it as empty.
6. Check if the String is empty.
7. re assign combineTwoStrings to Combine both Strings (favorite drink + favorite snack) together as one String.
8. Concatentate "aaaaa" to combineTwoStrings.
9. replace all 'a' values in combineTwoStrings with 'i';*/	
	
	String favoriteDrink = "Sprite";
	String favoriteSnack = new String ("blueberries");
	
	boolean areEqual = favoriteDrink.equals(favoriteSnack);
	System.out.println("Are these two equal?");
	
	int lengthOfDrink = favoriteDrink.length();
	int lengthOfSnack = favoriteSnack.length();
	
	String combineTwoStrings = "";
	
	boolean isEmpty = combineTwoStrings.isEmpty();
	System.out.println("Is this empty?");
	
	combineTwoStrings = favoriteDrink + " " + favoriteSnack + " " + "aaaaa";
	
	StringBuilder valuesInCombineTwoStrings = new StringBuilder(combineTwoStrings.replace("aaaaa", "iiiii"));
	System.out.println(valuesInCombineTwoStrings);
	
/*TASK 5:

1. Create a String literal variable to store the following text. ALWAO,Quick Mart,77 Overpass Ave,Provo,UT,84604, USA,(801)555-7424
2. Split the String by ',' comma as a delimeter. Example
"String myStr = "Split a string by spaces, and also punctuation.";
String[] myArray = myStr.split(",");
for (String s : myArray) {
  System.out.println(s);
}" */	
	
	String text = "ALWAO,Quick Mart,77 Overpass Ave,Provo,UT,84604, USA,(801)555-7424";
	String[] stringArray = text.split(",");
	for (int i = 0; i<stringArray.length; i++) {
		System.out.println(stringArray[i]);
	}
/*TASK 6:

1. Create a String literal variable for the following text. " The Lord of the Rings: The Fellowship of the Ring 2001 ".
2. Get rid of the spaces at the beginning and end of the String.
3. Create an integer variable and set the value equal to the index of 'Ring' within the original string.
4. Create a new String literal variable called movieYear where the value will be just the year within the movie.
(You will need to think of a JAVA string method that can isolate just '2001' from the original String'). */	
	
	String lordOfTheRingsText = " The Lord of the Rings: The Fellowship of the Ring 2001 ";
	
	
	StringBuilder getRidOfSpaces = new StringBuilder(lordOfTheRingsText.trim());
	
	String originalString = "The Lord of the Rings";
	int index = originalString.indexOf("Ring");
	
	System.out.println("The index of Ring is " + index);
	
	String movieYear = getRidOfSpaces.substring(lordOfTheRingsText.indexOf("2")-1,lordOfTheRingsText.indexOf("1"));
	System.out.println(movieYear);
	
	
	}
	}


