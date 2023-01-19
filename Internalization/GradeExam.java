// Chew Zi Qing 212360
import java.util.*;
public class GradeExam {
	
  /** Main method */
  public static void main(String[] args){
	 try {
		 // default locale
		 ResourceBundle res = ResourceBundle.getBundle("MyResource");
		 	
		 // to define the available locale code
		 Map <String, String> localeCode = new HashMap<>();
		    localeCode.put("en", "");
		 	localeCode.put("ms", "MY");
		 	localeCode.put("zh", "SG");
		 
		 	// no argument is provided
			if (args.length == 0) {
				System.out.println(res.getString("Locale is not provided"));
				System.exit(0);
			}
			
			String locale = args[0].toLowerCase();
			// locale required by user is not english/malay/chinese
			if (!localeCode.containsKey(locale)) {
		 		System.out.println(res.getString("Invalid locale"));
		 		System.exit(0);
		 	}else{
		 		// if it's not english, convert the locale
		 		if (locale.equals("ms") || locale.equals("zh"))
		 			res = ResourceBundle.getBundle("MyResource_"+locale+"_"+localeCode.get(locale));
		 	}
		 	
			    // Students' answers to the questions
			    char[][] answers = {
			      {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
			      {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
			      {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
			      {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
			      {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
			      {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
			      {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
			      {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
	
			    // Key to the questions
			    char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
	
			    // Grade all answers
			    for (int i = 0; i < answers.length; i++) {
			      // Grade one student
			      int correctCount = 0;
			      for (int j = 0; j < answers[i].length; j++) {
			        if (answers[i][j] == keys[j])
			          correctCount++;
			      }
	
			      System.out.printf("%s %d %s %d %s%s\n", 
			    		  			res.getString("Student"), i, res.getString("has"), 
			    		  			correctCount, res.getString("correct count"), res.getString("."));
		    }
	 	}catch(Exception e) {
	 		e.printStackTrace();
		 }
	 }
  }

