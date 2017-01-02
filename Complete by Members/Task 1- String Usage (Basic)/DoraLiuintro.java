//Coded by Dora Liu
//Marked as 'checked' by Shunzhe Ma
//Compiled Successfully in Java
//Passed Testings

public class DeclareAVariable {

	public static void main(String[] args) 
	{
	// TODO Auto-generated method stub
        String name = " Dora ";
	String like = "optimistic";
        int yearComing = 2017;
	String[] feeling = {"enthusiastic", "cool", " cute", " and perceptual"};
	//String parnter = "Dora";
	//Int is used to declear a number variable
	
        String combination = like + name + "wants a " ;
	for(String item:feeling)
	{
		combination+=item;
	}
        combination+= yearComing;
		
	System.out.print(combination);
		
	}

}
