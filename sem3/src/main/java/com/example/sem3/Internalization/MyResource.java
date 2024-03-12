package com.example.sem3.Internalization;// Chew Zi Qing 212360
import java.util.ListResourceBundle;

// default locale
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
