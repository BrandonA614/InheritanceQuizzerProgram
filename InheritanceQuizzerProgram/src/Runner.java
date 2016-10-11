import java.util.Random;
import java.util.Scanner;
@SuppressWarnings("resource")
public class Runner
	{
		
		static String nameInput2;

		public static void main(String[] args)
			{
				//Greeter and quizsetup are both complete, theorycraft on setting up the actual quizzes.
				
				greeter();
				quizSetup();
				
//				Furniture f = new Cabinet();	
//				Furniture x = new Furniture();
//				Cabinet c = new Cabinet();
				
				/*c.runCabinetMethod();
				c.runCabinetMethod2();
				c.runFurnitureMethod();
				c.runFurnitureMethod2();
				
				
				f.runFurnitureMethod();
				f.runFurnitureMethod2();
				x.runFurnitureMethod();
				x.runFurnitureMethod2();*/
				
				
			
			}
		
		public static void greeter(){
			//Complete
			System.out.println("Hey there! What is your name?");
			Scanner nameInput = new Scanner(System.in);
			nameInput2 = nameInput.nextLine();
			System.out.println("Nice to meet you " + nameInput2 + " I am Skynet, that shirt you are wearing really suits you. I like the Mullen Logo." );
			
			
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
		
		//WIP -- Basically self explanatory at this point.
		public static void quiz(){
			int RandomNumber = new Random().nextInt(5) + 1;
				//
				if(RandomNumber == 1){
					System.out.println("Test 1");
					
					
				}else if(RandomNumber == 2){
					
					System.out.println("Test2");
					
				}else if (RandomNumber == 3){
					System.out.println("Test3");
					
				
				}else if(RandomNumber == 4){
					System.out.println("Test4");
					
					
				}else if(RandomNumber == 5){
					System.out.println("test5");
					
				
			
			
		}

		}
}
