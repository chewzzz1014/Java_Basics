package aaaa;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
import java.io.*;

public class JsonXmlConverterPhase2 {
	public static void main(String[] args) {
        Scanner scanner;
        try {
            scanner = new Scanner(new File("test.txt"));
        } catch (IOException e) {
            scanner = new Scanner(System.in);
        }
        StringBuilder sb = new StringBuilder();
        while (scanner.hasNext()) {
            sb.append(scanner.nextLine());
        }
        scanner.close();

        String input = sb.toString();
			
	  if (input.charAt(0) == '<')
		         System.out.println(xmlToJson(input));
	  else 
		         System.out.println(jsonToXml(input));

		
 }

    public static String xmlToJson(String xml){
//    	<employee department = "manager">Garry Smith</employee>
//
//    	{
//    	    "employee" : {
//    	        "@department" : "manager",
//    	        "#employee" : "Garry Smith"
//    	    }
//    	}
//
//    	<person rate = "1" name = "Torvalds" />
//    	{
//    	    "person" : {
//    	        "@rate" : "1",
//    	        "@name" : "Torvalds",
//    	        "#person" : null
//    	    }
//    	}
        String json = "{";
        
        String tagName = "N";
        LinkedList<String> attributes = new LinkedList<>();
        LinkedList<String> values = new LinkedList<>();
        Pattern tagNameRegex = Pattern.compile("[<]\\w*");
        Matcher tagNameMatcher = tagNameRegex.matcher(xml);
        if (tagNameMatcher.find()) {
         tagName = tagNameMatcher.group().substring(1);
         System.out.println(tagName);
        }
        
        Pattern attRegex = Pattern.compile("(\\b\\w+\\b)\\s*=");
        Matcher attMatcher = attRegex.matcher(xml);
        
        // non-greedy regex
        Pattern valueRegex = Pattern.compile("\"(.*?)\"");
        Matcher valueMatcher = valueRegex.matcher(xml);
        while(attMatcher.find()) {
        	attributes.add("@"+attMatcher.group(1));
        }
       while(valueMatcher.find()) {
       	values.add(valueMatcher.group(1));
       }
        
       attributes.add(("#"+tagName));
       System.out.println(attributes);
       System.out.println(values);
        String value="null";
        
        if ( xml.indexOf("/") < xml.indexOf(">")) {
        	// single tag
        	value = "null";
        } else {
        	Matcher findContent = Pattern.compile(">(.+)<").matcher(xml);
        	if (findContent.find())
        		value = findContent.group(1);
        }
       
        values.add(value);
        json += "\"" + tagName + "\" : {" ;
        for (int j=0; j<attributes.size(); j++) {
        	if (!values.get(j).equals("null"))
        		json += "\"" + attributes.get(j) + "\" : \"" + values.get(j) + "\"";
        	else
        		json += "\"" + attributes.get(j) + "\" : " + values.get(j);
        	if (j<attributes.size()-1)
        		json += ", ";
       }
        json += "}}";
      return json;
    }

    public static String jsonToXml(String json){
        String xml = "";
        
        // get tag name
       String tagName = "N";
        LinkedList<String> attributes = new LinkedList<>();
        LinkedList<String> values = new LinkedList<>();
        Pattern tagNameRegex = Pattern.compile("#(.*?)\"");
        Matcher tagNameMatcher = tagNameRegex.matcher(json);
     
        if (tagNameMatcher.find()) {
        	tagName = tagNameMatcher.group(1).trim();
       } 
  
       

    	// get attributes
           Pattern attRegex = Pattern.compile("\"[@#](.*?)\"");
           Matcher attMatcher = attRegex.matcher(json);
           while(attMatcher.find()) {
           	if (!attMatcher.group(1).equals(""))
           		attributes.add(attMatcher.group(1).trim());
           }
        
          
          // get attributes' values
          Pattern valueRegex = Pattern.compile(":\\s*\"*([\\w\\s]*)\"*,*");
          Matcher valueMatcher = valueRegex.matcher(json);
          while(valueMatcher.find()) {
       	   if (!valueMatcher.group(1).equals(""))
       		   values.add(valueMatcher.group(1).trim());
          }

       
        // if the json has att and value
        if (!json.contains("null")) {
        	String betweenTag = values.get(values.size()-1);
        	xml = "<" + tagName + " ";
        	for (int i=0; i<values.size()-1; i++) {
        		xml += attributes.get(i) + "=\"" + values.get(i) + "\"";
        		if (i==values.size()-2)
        			xml += ">";
        	}
        	xml += betweenTag + "</" + tagName + ">";
        }else {
        	xml = "<" + tagName + " ";
        	for (int i=0; i<values.size()-1; i++) {
        		xml += attributes.get(i) + "=\"" + values.get(i) + "\"";
        		if (!(i==values.size()-2))
        			xml += " ";
        	}
        	xml += "/>";
        }
       
       
        System.out.println(tagName);
        System.out.println(attributes);
        System.out.println(values);
       // System.out.println(valueBetweenTag);
        System.out.println((json.contains("null")));
        return xml;
    } 

}

