package javaprograms;
class PrivateAccessModifiers {
	
	   private void display()          //only visible inside the class
	    { 
	        System.out.println("You are using private access specifier"); 
	    } 
	} 
	 class Privateaccessmodifier{
		public static void main(String[] args) {
			//private
			System.out.println("Private Access Specifier");
			PrivateAccessModifiers  obj = new PrivateAccessModifiers(); 
	        
			//Below will give error: trying to access private method of another class 
	        //obj.display();

		}
	}



