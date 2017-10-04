/*
 * Comments are useful for a few reasons.
 * The first is because they allow you to explain what your code is doing.
 * This is important because when you start working on the same project over a period of time you will not remember 
 * what you were trying to do.
 * Another reason is that they stop code from running.
 * This is helpful for when you have something that you know works, but you want to try something else.
 * It is never a good idea to delete working code. This saves the code for you.
 * 
 * Comments come in 3 forms.
 * 1: Single line comments
 * 		Single line comments are made by 2 slashes (//)
 * 2: Block comments
 * 		Block comments are good for large bodies of text or saving large portions of code.
 * 		They are made by one slash and asterisk (/*) at the beginning and one asterisk and slash (* /) at the end
 * 3: Javadoc
 * 		Javadocs are unique to Java. They go before a method you are writing and contain fields based on what the method contains.
 * 		You can also include a block comment inside a javadoc. Use this to describe the method you are writing.
 * 		Try to keep the description of things after the @ signs concise. This should just briefly describe what they are.
 * 		Javadocs are made with one slash and 2 asterisks (/**) and ended with one asterisk and slash(* /)
 * 		(example below)
 */


public class October5th {
	
	public static void main(String[] args) {
		/*
		 * A variable can contain anything.
		 * These are all examples of variables.
		 * They can be named anything with the exception of being named the same thing as a Java keyword
		 * 		For example, I can not make a variable called Integer.
		 * Variables are called variables because they are changeable.
		 */
		
		String str = "This is a string";
		int integer = 6488;
		double decimal = 6.488;
		char character = 'A';
		boolean yesNo = true;
		
		/*
		 * There are also constants. Those are anything that you do not want to change under any circumstance.
		 * They are generally named in all capital letters with underscores to denote spaces.
		 * This differs from the variables starting with a lower-case letters and being camelcase
		 * 		camelcase is the practice of capitalizing the beginning of a word to replace spaces
		 * Constants are made constant by putting final as the first thing in their declaration.
		 */
		
		final String TEAM_NAME="RoboRams";
		final int FIELD_LENGTH = 54;
		final double PI = 3.14;
		final char CHARACTER ='B';
		final boolean ON = false; // It makes more sense just to use true or false rather than a final boolean
		
		/*
		 * There are 2 types of loops in Java
		 * Each has its own use, although they are interchangeable
		 * 
		 * Boolean expressions are anything that would be true or false, including the keywords true and false
		 * Other expressions contain greater than, less than, and equality.
		 */
		
		while(true) {
			// Do something
			break; //This allows the code to actually run. A break is not needed, nor is it recommended, in loops most of the time.
		}
		
		for(int i=0; i<10; i++) {
			// Do something else
		}
		
		/*
		 * Java is an object oriented programming language. You will sometimes see this abbreviated as OOP
		 * An object is a reference to another class that has its own functions and variables.
		 * The code below will do nothing because it lacks what it needs to make it an object.
		 * Making classes is a little more advanced, so we will not talk about that yet.
		 */
		October5th newObject = new October5th(); 
		
		/*
		 * Java has a few ways to output data to the console.
		 * The main ways are to do a print or a println (pronounced print line)
		 * Print will output a line of data but not start a new line after it is done.
		 * Println will also output a line of data but will start a new line when it is done.
		 * 		A + can be put between variables and strings if you want to see more than one thing per line.
		 * 			EX: System.out.println("The variable a was "+a+" at this point in the code");
		 *			This allows me to use one line to do what I would have needed 3 for if I used print.
		 * Eclipse has the shortcut (syso, ctrl+space, enter) to write the println because it is quite lengthy and prone to typeo's
		 */
		
		System.out.println("This is a print line");
		System.out.print("This is just a print");
		
	}
	
	/**
	 * This method does nothing.
	 * It will return an unchanged integer.
	 * @param i The integer you want unchanged
	 * @return The unchanged integer
	 */
	public static int doNothing(int i) {
		return i;
	}

}
