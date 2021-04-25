
import java.util.Scanner;
public class Main {
	
    public static int cost=0;
   static Scanner sc=new Scanner(System.in);

        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);

            System.out.println("Welcome to Shashwat Restaurant");
            System.out.println();

            //Creating Menu
            while(true){
                System.out.println("To order South Indian Dish, Enter 1");
                System.out.println("To order North Indian Dish, Enter 2");
                System.out.println("To order Rajasthani Dish, Enter 3");
                System.out.println("To order Gujrati Dish, Enter 4");
                System.out.println("To order Bengali Dish, Enter 5");
                System.out.println("To order Desserts, Enter 6");
                System.out.println("To Exit, Enter 9");

                System.out.println();
                System.out.println("Enter your choice::");
                int choice = scan.nextInt();

                switch(choice){
                    case 1: System.out.println("Welcome to South Indian Food Court");
                        southIndianFood();
                        break;
                    case 2: System.out.println("Welcome to North Indian Food Court");
                        northIndianFood();
                        break;
                    case 3: System.out.println("Welcome to Rajasthani Food Court");
                        rajasthaniFood();
                        break;
                    case 4: System.out.println("Welcome to Gujrati Food Court");
                        gujratiFood();
                        break;
                    case 5: System.out.println("Welcome to Bengali Food Court");
                        bengaliFood();
                        break;
                    case 6: System.out.println("Welcome to Desserts Food Court");
                        desserts();
                        break;
                    case 9: System.out.println("Thanks for ordering from our App. Visit again");
                           System.out.println("Total Payable Amount=  "  + cost);
                        System.exit(0);
                        break;
                    default: System.out.println("Incorrect input!!! Please re-enter choice from our menu");
                }
            }

        }


         

        public static void southIndianFood(){
            System.out.println("You get:");
            System.out.println("Idli : 2 Pieces: press 1 to order::cost 50");
            System.out.println("Butter Cheese Dosa : 1 Pieces: press 2 to order::cost 100");
            System.out.println("Vada : 2 Pieces: press 3 to order::cost 50");
		
		System.out.println();

		int a=sc.nextInt();
		switch(a){
		case 1:
			cost+=50;
			break;
		case 2:
			cost+=100;
			break;
		case 3:
                   cost+=50;
			break;
		default:
			System.exit(0);
		}
	       
            
        }

        public static void northIndianFood(){
            System.out.println("You get:");
            System.out.println("Chole Bhature : 2 Pieces:: press 1 to order::cost 80");
            System.out.println("Litti Chokha : 4 Pieces:: press 2 to order::cost 40");

          System.out.println();

		int b=sc.nextInt();
		switch(b){
		case 1:
			cost+=80;
			break;
		case 2:
			cost+=40;
			break;
	
		default:
			System.exit(0);
		}

        }

        public static void rajasthaniFood(){
            System.out.println("You get:");
            System.out.println("Dal Baati Churma press 1 to order::cost 120");
            System.out.println("Laal maas press 2 to order::cost 320");
            System.out.println("Methi Bajra puri press 3 to order::cost 90");

		System.out.println();

		int c=sc.nextInt();
		switch(c){
		case 1:
			cost+=120;
			break;
		case 2:
			cost+=320;
			break;
		case 3:
                   cost+=90;
			break;
		default:
			System.exit(0);
		}

        }

        public static void gujratiFood(){
            System.out.println("You get:");
            System.out.println("Dhokla : 2 pieces press 1 to order::cost 50");
            System.out.println("Khandvi press 2 to order::cost 40");
            System.out.println("Methi ka Thepla press 3 to order::cost 70");

		System.out.println();

		int d=sc.nextInt();
		switch(d){
		case 1:
			cost+=50;
			break;
		case 2:
			cost+=40;
			break;
		case 3:
                        cost+=70;
			break;
		default:
			System.exit(0);
		}
        }

        public static void bengaliFood(){
            System.out.println("You get:");
            System.out.println("Maach Bhaat press 1 to ordert::cost 180");
            System.out.println("Aalu Luchi press 2 to order::cost 60");
    
		System.out.println();

		int e=sc.nextInt();
		switch(e){
		case 1:
			cost+=180;
			break;
		case 2:
			cost+=60;
			break;
	
		default:
			System.exit(0);
		}
        }

        public static void desserts(){
            System.out.println("You get:");
            System.out.println("Rasmalai");
            System.out.println("Rasgulla : 2 Pieces press 1 to order ::cost 30");
            System.out.println("Emarti : 2 Pieces press 2 to order::cost 50");
            System.out.println("Gajar ka halwa press 3 to order::cost 100");

		System.out.println();

		int f=sc.nextInt();
		switch(f){
		case 1:
			cost+=30;
			break;
		case 2:
			cost+=50;
			break;
		case 3:
                        cost+=50;
			break;
		default:
			System.exit(0);
        }
    }
}
