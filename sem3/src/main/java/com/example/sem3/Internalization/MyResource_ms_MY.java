package com.example.sem3.Internalization;// Chew Zi Qing 212360
import java.util.ListResourceBundle;

// Malaysia Malay locale
public class MyResource_ms_MY extends ListResourceBundle{
	protected Object[][] getContents(){
		return new Object[][] {
			{"Student", "Pelajar"},
			{"has", "mempunyai"},
			{"correct count", "jawapan betul"},
			{".", "."},
			{"Locale is not provided", "Makluman locale tidak dibekalkan"},
			{"Invalid locale", "Makluman locale tidak sah"}
		};
	}
}
