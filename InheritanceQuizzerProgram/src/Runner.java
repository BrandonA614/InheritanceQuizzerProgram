import java.util.Random;
import java.util.Scanner;
@SuppressWarnings("resource")
public class Runner
	{
		static int Counter;
		static String nameInput2;

		public static void main(String[] args)
			{
				Cabinet x = new Cabinet();
				x.runFurnitureMethod();
				System.out.println(x.runFurnitureMethod2());
				//Greeter and quizsetup are both complete
				greeter();
				quizSetup();
				System.out.println("Your final score is " + Counter );
				if(Counter >= 7){
					System.out.println("You did a good job!");
				}else if(Counter <=7){
					System.out.println("Better luck next time!");
					
				}
				
//				Furniture x = new Furniture();
//				Furniture x = new Cabinet();
//				Cabinet x = new Cabinet();				
//				Cabinet x = new Furniture();
//				
//		s		x.runCabinetMethod();
//				x.runCabinetMethod2();
				
//				x.runFurnitureMethod();
//				x.runFurnitureMethod2();

				
				
			
			}
		
		public static void greeter(){
			//Complete
			System.out.println("Hey there! What is your name?");
			Scanner nameInput = new Scanner(System.in);
			nameInput2 = nameInput.nextLine();
			System.out.println("Nice to meet you " + nameInput2 );
			System.out.println("I am Skynet, that shirt you are wearing really suits you. I like the Mullen Logo.");
			System.out.println("");
			
		}
		public static void quizSetup(){
			//Complete
			
			System.out.println( nameInput2 + ", How many questions would you like to answer?");
			Scanner questionInput = new Scanner(System.in);
			int input = questionInput.nextInt();
			for(int i=0; i < input ; i++){
				quiz();
				
			}
		}
		
		//WIP -- Each question will have it's own method, a little sloppy but incredibly logical. Repeats will happen -- maybe find a way to prevent this from happening -- two random ints?
		public static void quiz(){
			int RandomNumber = new Random().nextInt(12) + 1;
				//
				if(RandomNumber == 1){
					furnitureFurnitureCabinet1();
					
					
				}else if(RandomNumber == 2){
					furnitureFurnitureCabinet2();
				

					
				}else if (RandomNumber == 3){
					System.out.println("-");
					furnitureFurnitureFurniture1();
					

				}else if(RandomNumber == 4){
					System.out.println("-");
					furnitureFurnitureFurniture2();

				}else if(RandomNumber == 5){
					cabinetCabinetCabinet1();

				}else if(RandomNumber == 6){
					System.out.println("-");
					cabinetCabinetCabinet2();
			
				}else if(RandomNumber == 7){
					System.out.println("-");
					cabinetCabinetFurniture1();
					
				}else if(RandomNumber == 8){
					System.out.println("-");
					cabinetCabinetFurniture2();
					
				}else if(RandomNumber == 9){
					System.out.println("-");
					cabinetFurnitureFurniture();
				}else if(RandomNumber == 10){
					System.out.println("-");
					cabinetFurnitureCabinet();
				}else if(RandomNumber == 11){
					System.out.println("-");
					furnitureCabinetCabinet();
					
				
				}else if(RandomNumber == 12){
					System.out.println("-");
				  furnitureCabinetFurniture();
		}

		
	}
		
		public static void possibleAnswers(){

			System.out.println("I am a crafted piece of wood");
			System.out.println("I am skillfully crafted");
			System.out.println("I hold all of your clothing");
			System.out.println("I am in the kitchen too");
			System.out.println("Will Not Work");
			
		}
		public static void furnitureCabinetFurniture(){
			Furniture x = new Cabinet();
	
			System.out.println("Will this run?");
			System.out.println("Furniture x = new Cabinet();");
			System.out.println("Please type : Yes or No" );
			Scanner questionOneInput = new Scanner(System.in);
			String questionOneInput2 = questionOneInput.nextLine();
			if(questionOneInput2.equalsIgnoreCase("Yes")){
				Counter++;
				System.out.println("");
				System.out.println("You got it correct! Your score is now " + Counter );
				System.out.println("");
			}else{
				Counter--;
				System.out.println("Incorrect." +"The correct answers was : Yes"+ " Your score is now " + Counter);
				
			}
			
			System.out.println("If you run Furniture x = new Cabinet(); and call the method - x.runCabinetMethod(); What will print out?");
			System.out.println("Your options are" );
			possibleAnswers();
			Scanner doesntWork = new Scanner(System.in);
			String doesntWork1 = doesntWork.nextLine();
			if(doesntWork1.equalsIgnoreCase("Will not Work")){
				Counter++;
				System.out.println("");
				System.out.println("You got it correct! Your score is now " + Counter );
				System.out.println("");
			}else{
				Counter--;
				System.out.println("Incorrect." + " Your score is now " + Counter);
				
			}
			
		}	
		public static void furnitureCabinetCabinet(){
			Furniture x = new Cabinet();
			System.out.println("Will this run?");
			System.out.println("Furniture x = new Cabinet();");
			System.out.println("Please type : Yes or No" );
			Scanner questionOneInput = new Scanner(System.in);
			String questionOneInput2 = questionOneInput.nextLine();
			if(questionOneInput2.equalsIgnoreCase("Yes")){
				Counter++;
				System.out.println("");
				System.out.println("You got it correct! Your score is now " + Counter );
				System.out.println("");
			}else{
				Counter--;
				System.out.println("Incorrect." +"The correct answers was : Yes"+ " Your score is now " + Counter);
				
			}
			
			System.out.println("If you run Furniture x = new Cabinet(); and call the method - x.runFurnitureMethod(); What will print out?");
			System.out.println("Your options are" );
			possibleAnswers();
			Scanner doesntWork = new Scanner(System.in);
			String doesntWork1 = doesntWork.nextLine();
			if(doesntWork1.equalsIgnoreCase(x.runFurnitureMethod())){
				Counter++;
				System.out.println("");
				System.out.println("You got it correct! Your score is now " + Counter );
				System.out.println("");
			}else{
				Counter--;
				System.out.println("Incorrect." + " Your score is now " + Counter);
				
			}
			
		}
		public static void cabinetFurnitureFurniture(){
			
			System.out.println("Will this run?");
			System.out.println("Cabinet x = new Furniture();" );
			System.out.println("Please type : Yes or No" );
			Scanner questionOneInput = new Scanner(System.in);
			String questionOneInput2 = questionOneInput.nextLine();
			if(questionOneInput2.equalsIgnoreCase("Yes")){
				Counter++;
				System.out.println("");
				System.out.println("You got it correct! Your score is now " + Counter );
				System.out.println("");
			}else{
				Counter--;
				System.out.println("Incorrect." +"The correct answers was : No"+ " Your score is now " + Counter);
				
			}
			
			System.out.println("If you run Cabinet x = new Furniture(); and call the method - x.runFurnitureMethod(); What will print out?");
			System.out.println("Your options are" );
			possibleAnswers();
			Scanner doesntWork = new Scanner(System.in);
			String doesntWork1 = doesntWork.nextLine();
			if(doesntWork1.equalsIgnoreCase("Will Not Work")){
				Counter++;
				System.out.println("");
				System.out.println("You got it correct! Your score is now " + Counter );
				System.out.println("");
			}else{
				Counter--;
				System.out.println("Incorrect." + " Your score is now " + Counter);
				
			}
			
		}
		public static void cabinetFurnitureCabinet(){
			
			System.out.println("Will this run?");
			System.out.println("Furniture x = new Furniture();" );
			System.out.println("Please type : Yes or No" );
			Scanner questionOneInput = new Scanner(System.in);
			String questionOneInput2 = questionOneInput.nextLine();
			if(questionOneInput2.equalsIgnoreCase("No")){
				Counter++;
				System.out.println("");
				System.out.println("You got it correct! Your score is now " + Counter );
				System.out.println("");
			}else{
				Counter--;
				System.out.println("Incorrect." +"The correct answers was : No"+ " Your score is now " + Counter);
				
			}
			
			System.out.println("If you run Cabinet x = new Furniture(); and call the method - x.runFurnitureMethod(); What will print out?");
			System.out.println("Your options are" );
			possibleAnswers();
			Scanner doesntWork = new Scanner(System.in);
			String doesntWork1 = doesntWork.nextLine();
			if(doesntWork1.equalsIgnoreCase("Will Not Work")){
				Counter++;
				System.out.println("");
				System.out.println("You got it correct! Your score is now " + Counter );
				System.out.println("");
			}else{
				Counter--;
				System.out.println("Incorrect." + " Your score is now " + Counter);
				
			}
			
		}
		public static void cabinetCabinetFurniture1(){
			Cabinet x = new Cabinet();
			System.out.println("Will this run?");
			System.out.println("Furniture x = new Furniture();" );
			System.out.println("Please type : Yes or No" );
			Scanner questionOneInput = new Scanner(System.in);
			String questionOneInput2 = questionOneInput.nextLine();
			if(questionOneInput2.equalsIgnoreCase("Yes")){
				Counter++;
				System.out.println("");
				System.out.println("You got it correct! Your score is now " + Counter );
				System.out.println("");
			}else{
				Counter--;
				System.out.println("Incorrect." +"The correct answers was : Yes"+ " Your score is now " + Counter);
				
			}
			x.runFurnitureMethod();
			System.out.println("If you run Cabinet x = new Cabinet(); and call the method - x.runFurnitureMethod(); What will print out?");
			System.out.println("Your options are" );
			possibleAnswers();
			Scanner doesntWork = new Scanner(System.in);
			String doesntWork1 = doesntWork.nextLine();
			if(doesntWork1.equalsIgnoreCase(x.runFurnitureMethod())){
				Counter++;
				System.out.println("");
				System.out.println("You got it correct! Your score is now " + Counter );
				System.out.println("");
			}else{
				Counter--;
				System.out.println("Incorrect." + " Your score is now " + Counter);
				
			}
			
		}
		public static void cabinetCabinetFurniture2(){
			Cabinet x = new Cabinet();
			System.out.println("Will this run?");
			System.out.println("Furniture x = new Furniture();" );
			System.out.println("Please type : Yes or No" );
			Scanner questionOneInput = new Scanner(System.in);
			String questionOneInput2 = questionOneInput.nextLine();
			if(questionOneInput2.equalsIgnoreCase(x.runFurnitureMethod2())){
				Counter++;
				System.out.println("");
				System.out.println("You got it correct! Your score is now " + Counter );
				System.out.println("");
			}else{
				Counter--;
				System.out.println("Incorrect." +"The correct answers was : Yes"+ " Your score is now " + Counter);
				
			}
			
			System.out.println("If you run Cabinet x = new Cabinet(); and call the method - x.runFurnitureMethod2(); What will print out?");
			System.out.println("Your options are" );
			possibleAnswers();
			Scanner doesntWork = new Scanner(System.in);
			String doesntWork1 = doesntWork.nextLine();
			if(doesntWork1.equalsIgnoreCase(x.runFurnitureMethod2())){
				Counter++;
				System.out.println("");
				System.out.println("You got it correct! Your score is now " + Counter );
				System.out.println("");
			}else{
				Counter--;
				System.out.println("Incorrect." + " Your score is now " + Counter);
				
			}
			
		}
		public static void furnitureFurnitureCabinet1(){
			System.out.println("Will this run?");
			System.out.println("Furniture x = new Furniture();" );
			System.out.println("Please type : Yes or No" );
			Scanner questionOneInput = new Scanner(System.in);
			String questionOneInput2 = questionOneInput.nextLine();
			if(questionOneInput2.equalsIgnoreCase("Yes")){
				Counter++;
				System.out.println("");
				System.out.println("You got it correct! Your score is now " + Counter );
				System.out.println("");
			}else{
				Counter--;
				System.out.println("Incorrect." +"The correct answers was : Yes"+ " Your score is now " + Counter);
				
			}
			
			System.out.println("If you run Furniture x = new Furniture(); and call the method - x.runCabinetMethod(); What will print out?");
			System.out.println("Your options are" );
			possibleAnswers();
			Scanner doesntWork = new Scanner(System.in);
			String doesntWork1 = doesntWork.nextLine();
			if(doesntWork1.equalsIgnoreCase("Will Not Work")){
				Counter++;
				System.out.println("");
				System.out.println("You got it correct! Your score is now " + Counter );
				System.out.println("");
			}else{
				Counter--;
				System.out.println("Incorrect." + " Your score is now " + Counter);
				
			}
			
		}
		public static void furnitureFurnitureCabinet2(){
			System.out.println("Will this run?");
			System.out.println("Furniture x = new Furniture();" );
			System.out.println("Please type : Yes or No" );
			Scanner questionOneInput = new Scanner(System.in);
			String questionOneInput2 = questionOneInput.nextLine();
			if(questionOneInput2.equalsIgnoreCase("Yes")){
				Counter++;
				System.out.println("");
				System.out.println("You got it correct! Your score is now " + Counter );
				System.out.println("");
			}
			
			System.out.println("If you run Furniture x = new Furniture(); and call the method - x.runCabinetMethod2(); What will print out?");
			System.out.println("Your options are" );
			possibleAnswers();
			Scanner doesntWork = new Scanner(System.in);
			String doesntWork1 = doesntWork.nextLine();
			if(doesntWork1.equalsIgnoreCase("Will Not Work")){
				Counter++;
				System.out.println("");
				System.out.println("You got it correct! Your score is now " + Counter );
				System.out.println("");
			}else{
				Counter--;
				System.out.println("Incorrect." + " Your score is now " + Counter);
			}
			
			
		}
		
		public static void cabinetCabinetCabinet1(){
			Cabinet x = new Cabinet();
			System.out.println("Will this run?");
			System.out.println("Cabinet x = new Cabinet();" );
			System.out.println("Please type : Yes or No" );
			Scanner questionOneInput = new Scanner(System.in);
			String questionOneInput2 = questionOneInput.nextLine();
			if(questionOneInput2.equals("Yes")){
				Counter++;
				System.out.println("");
				System.out.println("You got it correct! Your score is now " + Counter );
				System.out.println("");
			}
			
			System.out.println("If you run Cabinet x = new Cabinet(); and call the method - x.runCabinetMethod(); What will print out?");
			System.out.println("Your options are" );
			possibleAnswers();
			Scanner doesntWork = new Scanner(System.in);
			String doesntWork1 = doesntWork.nextLine();
			if(doesntWork1.equals(x.runCabinetMethod())){
				
				Counter++;
				System.out.println("You got it correct! Your score is now : " + Counter);
			}else{
				Counter--;
				System.out.println("Incorrect." + " Your score is now " + Counter);
				
			}
		}
			public static void cabinetCabinetCabinet2(){
				Cabinet x = new Cabinet();
				
				System.out.println("Will this run?");
				System.out.println("Cabinet x = new Cabinet();" );
				System.out.println("Please type : Yes or No" );
				Scanner questionOneInput = new Scanner(System.in);
				String questionOneInput2 = questionOneInput.nextLine();
				if(questionOneInput2.equals("Yes")){
					Counter++;
					System.out.println("");
					System.out.println("You got it correct! Your score is now " + Counter );
					System.out.println("");
				}
				
				System.out.println("If you run Cabinet x = new Cabinet(); and call the method - x.runCabinetMethod2(); What will print out?");
				System.out.println("Your options are" );
				possibleAnswers();
				Scanner doesntWork = new Scanner(System.in);
				String doesntWork1 = doesntWork.nextLine();
				if(doesntWork1.equalsIgnoreCase(x.runCabinetMethod2())){
					Counter++;
					System.out.println("You got it correct! Your score is now : " + Counter);
				}else{
					Counter--;
					System.out.println("Incorrect." + " Your score is now " + Counter);
					
				}
			
		
		
		}
		public static void furnitureFurnitureFurniture1(){
			Furniture x = new Furniture();
			System.out.println("Will this run?");
			System.out.println("Furniture x = new Furniture();" );
			System.out.println("Please type : Yes or No" );
			Scanner questionOneInput = new Scanner(System.in);
			String questionOneInput2 = questionOneInput.nextLine();
			if(questionOneInput2.equalsIgnoreCase("Yes")){
				Counter++;
				System.out.println("");
				System.out.println("You got it correct! Your score is now " + Counter );
				System.out.println("");
			}else{
				Counter--;
				System.out.println("Incorrect." +"The correct answers was : Yes"+ " Your score is now " + Counter);
				
			}
			
			System.out.println("If you run Furniture x = new Furniture and call the method - x.runFurnitureMethod(); What will print out?");
			System.out.println("Your options are" );
			possibleAnswers();
			Scanner doesntWork = new Scanner(System.in);
			String doesntWork1 = doesntWork.nextLine();
			if(doesntWork1.equalsIgnoreCase(x.runFurnitureMethod())){
				Counter++;
				System.out.println("");
				System.out.println("You got it correct! Your score is now " + Counter );
				System.out.println("");
			}else{
				Counter--;
				System.out.println("Incorrect." + " Your score is now " + Counter);
				
			}
			
		}
		public static void furnitureFurnitureFurniture2(){
			Furniture x = new Furniture();
			System.out.println("Will this run?");
			System.out.println("Furniture x = new Furniture();" );
			System.out.println("Please type : Yes or No" );
			Scanner questionOneInput = new Scanner(System.in);
			String questionOneInput2 = questionOneInput.nextLine();
			if(questionOneInput2.equalsIgnoreCase(x.runFurnitureMethod2())){
				Counter++;
				System.out.println("");
				System.out.println("You got it correct! Your score is now " + Counter );
				System.out.println("");
			}else{
				Counter--;
				System.out.println("Incorrect." +"The correct answers was : Yes"+ " Your score is now " + Counter);
				
			}
			
			System.out.println("If you run Furniture x = new Furniture and call the method - x.runFurnitureMethod2(); What will print out?");
			System.out.println("Your options are" );
			possibleAnswers();
			Scanner doesntWork = new Scanner(System.in);
			String doesntWork1 = doesntWork.nextLine();
			if(doesntWork1.equalsIgnoreCase("I am a crafted peace of wood")){
				Counter++;
				System.out.println("");
				System.out.println("You got it correct! Your score is now " + Counter );
				System.out.println("");
			}else{
				Counter--;
				System.out.println("Incorrect." + " Your score is now " + Counter);
				
			}
			
		}

	
}



