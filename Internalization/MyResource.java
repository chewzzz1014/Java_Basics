import java.util.ListResourceBundle;

public class MyResource extends ListResourceBundle{
	protected Object[][] getContents(){
		return new Object[][] {
			{"Student", "Student"},
			{"has", "has"},
			{"correct count", "correct count"},
			{".", "."},
			{"Locale is not provided", "Locale is not provided"},
			{"Invalid locale", "Invalid locale"}
		};
	}
}
