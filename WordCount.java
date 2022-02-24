//word counter using HashedMap

package Java_Basics;

import java.util.*;

public class WordCount {
public static void main (String[]args)
{
	Scanner sc = new Scanner (System.in);
	Map <Character,Integer> m = new HashMap <Character,Integer>();

	
	System.out.print("Enter paragraph: ");
	String p = sc.nextLine().trim().toLowerCase();
	
	for (int i=0;i< p.length(); i++)
	{
		if (m.containsKey(p.charAt(i)) )
			m.put(p.charAt(i), m.get(p.charAt(i))+1);
		else
			m.put(p.charAt(i), 0);
	}
	
	System.out.print("\n************************************************\n");
	System.out.print("\nCharacter Count\n");
	System.out.print(m);
	sc.close();
	
}
}
