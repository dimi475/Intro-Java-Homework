import java.util.ArrayList;                                     
import java.util.Collections;                                   
import java.util.List;                                          
                                                                
                                                                
public class arrayOfStrings {                                   
	public static void main(String[] args){                     
		int num=3;                                              
		List <String> town=new ArrayList();                     
		town.add("Varna");                                      
		town.add("Plovdiv");                                    
		town.add("Sofia");                                      
		Collections.sort(town, String.CASE_INSENSITIVE_ORDER);  
		System.out.println(town);                               
	}                                                           
}                                                               
