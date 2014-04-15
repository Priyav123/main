
public class SwitchExample {

	public static void main(String[] args) {
		int i[] = {1,2,3,4,5,6};
		
		int j  = 4;
		
		switch (j) {
		case 1:
			System.out.println("I am 1");
			break;
		case 2 :
			System.out.println("I am 2");
			//break;
		case 3 :
			System.out.println("I am 3");
			//break;
		case 4 :
			if(true) {
				System.out.println("SwitchExample.main()");
			}
			System.out.println("I am 4");
			break;
		case 5 :
			System.out.println("I am 5");
			break;
		default:
			System.out.println("Default Integer");
			break;
		}
		
		/**************************************/
		if(j == 1){
			System.out.println("I am 1");
		}else if(j == 2) {
			System.out.println("I am 2");
		}else if(j == 3) {
			System.out.println("I am 3");
		}else if(j == 4) {
			System.out.println("I am 4");
		}else if(j == 5) {
			System.out.println("I am 5");
		}else{
			System.out.println("Default Integer");
		}
		
		
		
		
		/*for(int j : i){
			
			if(j == 1){
				System.out.println("I am 1");
			}else if(j == 2) {
				System.out.println("I am 2");
			}else if(j == 3) {
				System.out.println("I am 3");
			}else if(j == 4) {
				System.out.println("I am 4");
			}else if(j == 5) {
				System.out.println("I am 5");
			}else{
				System.out.println("Default Integer");
			}
			
			switch (j) {
			case 1:
				System.out.println("I am 1");
				//break;
			case 2 :
				System.out.println("I am 2");
				//break;
			case 3 :
				System.out.println("I am 3");
				//break;
			case 4 :
				System.out.println("I am 4");
				break;
			case 5 :
				System.out.println("I am 5");
				break;
			default:
				System.out.println("Default Integer");
				break;
			}
		}*/
	}
}
