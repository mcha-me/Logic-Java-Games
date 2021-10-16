import java.util.*;

public class JavaApplication3 {

			static int mulOne;
			static int num;
			static int sixOne;
			static int div1;
			static int takeOne;

	public static void main(String []args){

		Scanner in = new Scanner(System.in);
		
                           //add instruction to user
	         System.out.println("*****************************");
	         System.out.println("Welcome to The Game!");
	         System.out.println("*****************************");
	         System.out.println("");
	         System.out.println("For playing (magic trick) type [show magic] below");
	         System.out.println("---------------------------------------------------------------------");
	         System.out.println("For playing (Colour guessing) type [colour] ");
	         System.out.println("------------------------------------------------------------");
	         System.out.println("For (quiting) The Game type [stop]");
	         System.out.println("--------------------------------------------");
		String ans = in.nextLine();
   	     //add if statement to see what user want to play  
                              
                                                   
                                               if (ans.equals("show magic")){

				while(true){
			System.out.println("");
			System.out.println("Great choice!");
			System.out.println("*******************");
			System.out.println("Now think of a number from 1 to 10 in your head: ");
			System.out.println("--------------------------------------------------------------------");
			System.out.println("I'll double, mulitply, divide and minus the number and the result ");
			System.out.println("----------------------------------------------------------------------------------------");
			System.out.println("Will be 3!");
			System.out.println("************");
			System.out.println("");

			System.out.println("Try yourself, Type the number you had in mind: ");
			num =Integer.parseInt(in.nextLine());

			System.out.println("multiply it with 2 by typing multiply");
			String mul = in.nextLine();
			if(mul.equals("multiply")){
				mulOne=num*2;
				System.out.println(num+" * 2 = "+mulOne);
			}else{
				System.out.println("Start over because you typed something else not (multiply)");
				break;
				}
			System.out.println("okay now add 6 to the result you got by typing only add");
			String six = in.nextLine();
			
			if(six.equals("add")){
				sixOne=mulOne+6;
				System.out.println("If we add 6 to "+mulOne+" the answear will be "+sixOne);
			}else{
				System.out.println("Start over because you typed something else not (add)");
				break;	
				}
			System.out.println("now we divide the answear by 2, type divide");
			String div = in.nextLine();
			
			if(div.equals("divide")){
				div1=sixOne/2;
				System.out.println(sixOne+" divided by 2 is  "+div1);
			} else{
				System.out.println("Start over because you typed something else not (divide)");
				break;
				}

			System.out.println("now take away the number you first had in mind from the result, type take");
			String take =in.nextLine();
			
			if(take.equals("take")){
				takeOne = div1 - num;
				System.out.println("The number you first had in mind was "+num+" so ");
				System.out.println(num+" - "+div1+" = "+takeOne);
				System.out.println("I told you the answear will be 3!");
				break;
			}else {
				System.out.println("Start over because you typed something else not (take) ");
				break;
			}

			}
		            }else if(ans.equals("LoveYouJAVA")){
				System.out.println("I Love You Too Mcha!");
				
				
						
			}else if(ans.equals("stop")){

					while(true){
			    	System.out.println("Thank You For Trying This Game!");
				break;        }

	   		    }else if(ans.equals("colour")){
					
			System.out.println("");
			System.out.println("Great choice!");
			System.out.println("*******************");
			System.out.println("Now choose a colour between one of colour in below list  ");
			System.out.println("--------------------------------------------------------------------");
			System.out.println("(Red && Yello && Black ) ");
			System.out.println("----------------------------------------------------------------------------------------");
			System.out.println("And i show you what colour you have choise in a mind");
			System.out.println("");
			System.out.println("");

						System.out.println("ARE YOU READY?!! (y/n)");
						String ready = in.nextLine();
						while(ready.equals("y")){
						
						
					//group for black
					System.out.println("Is the colour in this group (y/n)");
					System.out.println("(Green -- White -- Black -- Orange -- Pink)");
					String bb =in.nextLine();
					
				
				//group for yello
				System.out.println("Is the colour in this group(y/n)");
				System.out.println("(Gray -- Yello -- Purple -- Violet -- Black -- Brown)");
				String yy = in.nextLine();

					//group for red
					System.out.println("Is the colour in this group(y/n)");
					System.out.println("(Maroon -- Melon -- Blue -- VioletRed -- SkyBlue -- White)");
					String rr = in.nextLine();
			
					//add conditions to see the right answear
					if(bb.equals("y") && yy.equals("y")){
						System.out.println("The colour you choise was Black!");
						break;


					}else if(yy.equals("y")){
						System.out.println("The colour you choise was Yellow!");
						break;


					 }else if(rr.equals("n")){
						System.out.println("The colour you choise was Red!");
						break;
						
					   } else{
						System.out.println("Thank You For Trying This Game!");
					       }
							break;}

				}else{

				System.out.println("You can type only (show magic or colour or stop) try again!");
			           }
                               				
	      		
	}
}