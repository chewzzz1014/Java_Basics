import java.util.ListResourceBundle;

public class MyResource_ms extends ListResourceBundle{
	protected Object[][] getContents(){
		return new Object[][] {
			{"Student", "Pelajar"},
			{"has", "mempunyai"},
			{"correct count", "jawapan betul"},
			{".", "."},
			{"Locale is not provided", "Makluman locale tidak dibekalkan"}
		};
	}
}
