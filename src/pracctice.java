import java.util.ArrayList;
import java.util.Arrays;

public class pracctice {

	public static void main(String[] args) {
		
		//Arrayler fixed size. //ArrayListler ise dynamic size.
		//Arrayler 2 �ekilde olu�turulur.
		//1nci Yol:
		
		String[] newArray = new String[3];
		
		newArray[0] = "Alican";
		newArray[1] = "Ke�eci";
		
		
		for(int i=0;i<newArray.length;i++) {
			
			System.out.println(newArray[i]);
			
		}
		
		System.out.println("*********************");
		
		//2nci Yol:
		String[] brands = {"Nokia","Ericsson"};
		
		for(int i=0;i<brands.length;i++) {
			
			System.out.println(brands[i]);
			
		}

		//ArrayLists
		System.out.println("*********************");
		
		ArrayList<String> items = new ArrayList<String>();
		items.add("Coconut");
		items.add("Brocolli");
		
		for(int i=0;i<items.size();i++) {
			
			System.out.println(items.get(i)); //G�rd���n gibi ArrayListlerde methodlar da farkl�.
			
		}
		
		//ArrayLists 2nci yol:
		System.out.println("*********************");
		ArrayList<String> obj = new ArrayList<String>(Arrays.asList("Lolo","Lala"));
		System.out.println(obj);
	}

}
