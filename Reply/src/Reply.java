import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Reply {
	public static void main(String[] args) {
		ArrayList<String> citiesList = new ArrayList<>();
		citiesList.add("Denver");
		citiesList.add("Chicago");
		citiesList.add("New York");
		citiesList.add("Denver");
		
		Set<String> citiesSet = new HashSet<>();
		citiesSet.add("Denver");
		citiesSet.add("Chicago");
		citiesSet.add("New York");
		citiesSet.add("Denver");
		
		System.out.println("List:");
		System.out.println(citiesList + "\n");
		System.out.println("Set:");
		System.out.println(citiesSet);
	}
}