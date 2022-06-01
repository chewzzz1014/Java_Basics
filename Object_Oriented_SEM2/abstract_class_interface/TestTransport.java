package abstract_class_interface;
import java.util.*;

public class TestTransport {
	public static void main (String[]args) {
		
		ArrayList <Transport> t = new ArrayList<>();
		t.add(new Van("V212345", 12000, 7));
		t.add(new Van("V424567", 35000, 10));
		
		t.add(new Lorry("L345632", 75000, 4000));
		t.add(new Lorry("L230485", 123000, 8000));
		
		for (Transport vl:t) {
			System.out.print(vl.toString());
			
			if (vl instanceof Van)
				System.out.printf("Value After 25 Percent Discount: RM %.2f\n", vl.valueAfterDiscount());
			else if (vl instanceof Lorry)
				System.out.printf("Value After 25 Percent Discount: RM %.2f\n", vl.valueAfterDiscount());
		}
		
	}
}
