/* This is a comment. */

/**
 * Comments are a way to write notes in plain English in order to explain things
 * more clearly to someone reading your code. They will be ignored by the 
 * computer when you run your program. 
 */

// You can also use a double-slash to write a comment on a single line. 
// However, multi-line comments are always written with the /* star + slash */

/* Remember! Any text between these markers --> /* is a comment! */

/**----------------------------------------------------------------------------
 * INSTUCTIONS
 * ----------------------------------------------------------------------------
 * 
 * This is an example of the simplest possible Java program you can write.
 * 
 * Here, we are creating a 'class' called HelloWorld. The file it is written in
 * is called 'HelloWorld.java.' The '.java' extension is just like we learned 
 * in ICT class back in PCE -- it tells your operating system which program 
 * should be used to open this file. If it were a '.txt' extension, you might
 * use Notepad to open it. To run this file, you are going to have to call the
 * Java program on your computer. The Java program on your computer is called
 * the Java Virtual Machine, or JVM for short. 
 * 
 * The JVM is the program that knows how to interpret the codes you write and 
 * follow the instructions in your program. As you may recall again from ICT 
 * class, a program is a set of instructions given to a computer which a 
 * computer then reads and follows in the order they are given. As you know,
 * a computer will follow a set of instructions EXACTLY as written, and will do
 * no more, and no less. This is what makes it difficult for human beings to
 * write computer programs. Human beings use very vague langauge to describe 
 * how to do things, and because we are smarter than computers, we can 
 * understand vague language and act accordingly. Because we can do this, we
 * automatically think the computer will know what we mean, but this is not the
 * case. Computers have no way of interpreting any kind of ambiguity. They are 
 * only capable of interpreting exact instructions, exactly as written, with 
 * only a single possible interpretation. When you write a program, you will 
 * tell a computer exactly what to do, according to the types and combinations
 * of instructions available that the computer can meaningfully understand and
 * execute. 
 * 
 * In this way, programming languages like Java are just like human languages.
 * They are a set of words which can be understood and combined in different 
 * ways according to grammatical rules. This defines the set of things we are
 * able to tell a computer. 
 * 
 * Unfortunately, computers still need additional help in understanding the
 * written instructions we given them in programming languages like Java. It is
 * for this reason that we have another program called a 'compiler' which is 
 * used to translate from Java into binary machine instructions which can be 
 * given directly to a CPU. So the step in between writing a program and telling
 * a computer to follow the instructions in the program is called 'compilation.'
 * 
 * ----------------------------------------------------------------------------
 * RUN THE PROGRAM
 * ----------------------------------------------------------------------------
 * 
 * In order to run this file, do the following things...
 * 
 * 1.)	Open the command prompt. It's called cmd.exe on Windows 
 * 		
 * 2.)  Navigate to the folder location of this HelloWorld.java file on your 
 * 	computer. For example, if the file is on the Desktop, you can type the 
 * 	following command and press Enter:
 * 
 * 	cd C:\Users\(username)\Desktop
 * 
 * 	...Where you have to replace (username) with your Windows username. The 
 * 	C:\Users\(username)\Desktop is the folder location and 'cd' is a command
 * 	for 'change directory.'
 * 
 * 3.) 	If you want to be sure the file is in this folder location, you can type:
 * 
 * 	dir
 * 
 * 	...And press Enter. This will list the files in the directory. You 
 * 	should see HelloWorld.java in the directory. 
 * 
 * 4.) 	To COMPILE the Java file, type the following and press Enter:
 * 
 * 	javac HelloWorld.java
 * 
 * 5.) 	'javac' is the Java compiler. This will create a file called: 
 * 
 * 	HelloWorld.class 
 * 
 * 	This is the compiled binary file that the JVM will use to run your 
 * 	program. These are the real machine instructions that your CPU can 
 * 	understand. Type 'dir' again to see that it was created. When you are 
 * 	ready to run the program for real, simply type the following and press 
 * 	Enter:
 * 
 * 	java HelloWorld
 * 
 * 6.)	The program should run if you have not made mistakes, and you should see
 * 	the following output on the screen:
 * 
 * 	Hello, world!
 * 
 * ----------------------------------------------------------------------------
 * USING GITHUB
 * ----------------------------------------------------------------------------
 * 
 * If you want to commit this file to a GitHub repository, you need to do the
 * following. I have used Desmond's 'onedezzie' account as an example. 
 * 
 * See his page here if you need an example:
 * 
 * https://GitHub.com/onedezzie/Hello-World
 * 
 * 1.)	Install Git-Bash on Windows. Go here: 
 * 		
 * 	https://git-for-windows.GitHub.io/
 * 
 * 2.) 	Follow the tutorial linked below. Do ONLY Steps 1-3. DO NOT go on to 
 * 	Step 4.  
 * 
 * 	http://code.tutsplus.com/tutorials/git-on-windows-for-newbs--net-25847
 * 
 * 3.) 	Go to your GitHub profile page and click on 'Repositories'... Desmond 
 * 	has a repository called 'Hello-World'. Look for the HTTPS button at the 
 * 	top and you will see a repository link like so:
 * 
 * 	https://github.com/onedezzie/Hello-World.git
 * 
 * 	Click the HTTPS button to find the 'Clone with SSH' option. Select the
 * 	SSH link. It should look like this:
 * 
 * 	git@github.com:onedezzie/Hello-World.git
 * 
 * 	This is your GitHub repository link. Copy it. I will refer to this as
 * 	<your_repository> in the next steps...
 * 
 * 4.)	Find the folder where you want to keep your java codes and other things.
 * 	Then right-click and open 'Git Bash Here'... This will open another 
 * 	command prompt.  
 * 
 * 5.)	Type the following command and press Enter:
 * 
 * 	git clone <your_repository>
 * 
 * 	Example:
 * 
 * 	git clone https://github.com/onedezzie/Hello-World.git
 * 
 * 	This will initialize the repository on your computer and give you a link
 * 	to your GitHub repository. You should only have to do this ONCE.
 * 
 * 6.)	Copy or move your .java files into the repository folder created in the 
 * 	last step. To add the file to the repository, type the following and 
 * 	press Enter: 
 * 
 * 	git add *.java
 * 
 * 	Now all .java files are being tracked by git. You could alternatively do:
 * 	
 *	git add * 
 * 	
 * 	This would add all files of all types. The * is a 'wild-card' which means
 * 	to add all files of any kind. Alternatively, you could do:
 * 	
 *	git add .
 * 	
 * 	This means to add all files in the current directory. I use this most
 * 	often for simplicity.
 * 
 * 7.) 	Once you have made some changes to the code, type the following to 
 * 	"commit" them to the repository and press Enter:
 * 
 * 	git commit -m 'First commit!'
 *  
 *  	The -m for "message" portion is important. This is a note to yourself to 
 *  	remind you what you did to change the file. If it's something important,
 *  	you should describe what you did, but often times people don't write 
 *  	very useful information. Just type anything.  
 *  	
 *  	This basically means that your local git repository on your computer 
 *  	will keep track and backup of ALL changes you make to the added files. 
 *  
 * 8.)	To send the files to the remote repository on the Internet so other 
 * 	people can see what you did or use it themeslves, simply type the 
 * 	following and press Enter:
 * 
 * 	git push origin master
 * 
 * 	In the future, you don't have to add the 'origin master' portion, but
 * 	for the first time, you will need it. That's it! Your files are 
 * 	committed, and you can check them out on your GitHub repository and
 * 	share it with me!
 * 
 * 9.) 	If someone else makes a change (like me) or you download your repository
 * 	on another computer, you will do the same procedure as above. Steps 1-8
 * 	are for initializing a repository from scratch. Steps 6-8 are for adding
 * 	new files and pushing them to your GitHub repository. If you are 
 * 	changing files you have ALREADY added, just use steps 7-8. If there's a
 * 	possible change added by someone else (or yourself) on another computer,
 * 	simply type the following and press Enter:
 * 
 *   	git pull
 *   
 *   	This will grab any other changes anyone has made and add them to your 
 *   	repository. When in doubt, ALWAYS do a git pull. 
 * 	
 * 9.) 	Ask questions when you have them. Remember confusion is a good thing, 
 * 	because it means you are L-E-A-R-N-I-N-G!
 * 
 * 10.) Git summary: In practice, you do the following:
 * 
 *  	git pull
 *  	git add .
 *  	git commit -m "Some message"
 *  	git push
 * 
 * 11.) Use this guide if you get lost:
 * 
 * 	http://rogerdudler.github.io/git-guide/
 * 
 * 		
 * ----------------------------------------------------------------------------
 * ABOUT THIS PROGRAM
 * ----------------------------------------------------------------------------
 * 
 * See the class file written below. 
 * 
 * Classes are what Java uses to package code into separable, easily usable 
 * pieces. They are heirarchical, and can contain code, data, and the methods 
 * used to operate on data. 
 * 
 * When you write a program in Java, you will always create a class first. When
 * your program is run, Java will use your class file to create an individual
 * program chunk, which can be used directly by the CPU. 
 * 
 * Classes let us refer to a collection of related code and information with 
 * one simple name. In this case, this chunk will be called 'HelloWorld'. 
 * 
 * Look inside the code for further explanations.
 * 
 * @author nwolfe
 * ---------------------------------------------------------------------------*/

/**-----------------------------------------------------------------------------
 * JAVA CLASS
 * -----------------------------------------------------------------------------
 * 
 * 'public' means that any other Java program or class that knows about this
 * file can use it.
 * 
 * 'class' means we are defining a class, and the name follows: 'HelloWorld'
 * 
 * The curly-brackets { } define the boundaries of the class definition.
 *
 */
public class HelloWorld { /* The class description starts here */

	/**
	 * This thing below called 'public static void main(String[] args)' is an
	 * example of a 'method.' A method is a way of containing a related set of
	 * instructions for a computer and giving it a name. 
	 *
	 * Instead of writing how to do a specific thing over and over, we can 
	 * simply make a method that says how to complete an operation once, and 
	 * package the instructions together with a name. Classes can contain many 
	 * methods to describe all the operations they are able to perform.
	 * 
	 * This 'method' which is called 'public static void main' or more simply
	 * the 'main method' is something that, for the time being, you can feel
	 * free to memorize. In order to run any program -- a set of instructions
	 * given to a computer -- your instruction set needs a starting point,
	 * right? Yes. So, this is the starting point for all Java programs. Any
	 * program you write in Java will need at least one of these 'main methods'
	 * in order to operate.
	 * 
	 * For now, the '(String[] args)' thing we can mostly leave aside. It is a
	 * required part of this 'main' method, so it is always included. We will
	 * explain this more soon. For now, you should know that sometimes a method
	 * needs some additional things in order for it to operate. We call these
	 * things 'parameters' or 'arguments' typically. For instance, if you can
	 * imagine a method to add two numbers, the method needs to be given the two
	 * numbers to add, right? Yes. We would then say that the two numbers that
	 * the method needs to perform addition are the two parameters of the
	 * method. In this case, we are saying that this method needs something
	 * called 'args', which is short for 'arguments.' 
	 * 
	 * In this example, the arguments to this method are not numbers, but are 
	 * rather of type String[], which is actually the way you would describe a 
	 * list of words to a computer in the Java language. Don't worry about this 
	 * too much for now, ha ha! It's a lot of information at first, right?
	 * 
	 * Again, if you do not understand what a 'String[]' is yet, don't worry. We
	 * will explain it later...
	 */
	public static void main(String[] args) { /* The method starts here */

		/**
		 * This is an example of an instruction to a computer. In this case, the
		 * way we have written 'System.out.println' is a direction to the
		 * computer to write something onto the screen. Into brackets () we have
		 * written "Hello, world!", which is the text which we would like to
		 * write out to the screen. Text is always enclosed in double-quotes ""
		 * in Java.
		 * 
		 * Remember that methods can take arguments or parameters. What we are
		 * doing here is actually telling the computer to run a method called
		 * 'System.out.println' and passing that method an argument, which is a
		 * piece of text in this case specified as "Hello, world!". Arguments to
		 * methods are always enclosed in brackets (). If a method takes no
		 * arguments at all, you will simply see an open and closed set of
		 * brackets like so: ()
		 * 
		 * When this program is run, Java will compile the HelloWorld class,
		 * then it will find the HelloWorld.class compiled binary file, then it
		 * will look for a main method, then it will run the main method and
		 * follow the instructions to call the System.out.println() method, and
		 * pass the argument "Hello, world!" to that method. The computer will
		 * then follow the instruction, and print "Hello, world!" to the screen
		 * of the computer.
		 */
		System.out.println("Hello, world!");

	} /* The method ends here */

} /* The class description ends here */

