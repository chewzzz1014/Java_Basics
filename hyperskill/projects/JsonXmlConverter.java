import java.util.Arrays;
import java.util.Scanner;

public class JsonXmlConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String input = sc.nextLine().trim();
        if (input.charAt(0) == '<'){
            System.out.println(xmlToJson(input));
        }
        else{
            System.out.println(jsonToXml(input));
        }
    }

    public static String xmlToJson(String xml){
        String json = "";
        int firstOpenTag= 0;
        if ( xml.indexOf("/") < xml.indexOf(">") ){
            // single tag
            int firstCloseTag = xml.indexOf(">");

            String tagName = xml.substring(1, firstCloseTag-1);
            String value = "null";

            json = "{\""+ tagName +"\": " + value + "}";
        }else{
            // have opening tag and closing tag
            int firstCloseTag = xml.indexOf(">");
            String tagName = xml.substring(firstOpenTag+1, firstCloseTag);

            String[] strs = xml.split(">|<");
            String value = strs[2].trim();
       //     System.out.print(Arrays.toString(strs));
            json = "{\""+ tagName +"\": \"" + value + "\"}";
        }
        return json;
    }

    public static String jsonToXml(String json){
        String xml = "";
        

        int firstOpenBraces = 0;
        int firstOpenQuote = 1;
        int firstCloseQuote = json.substring(2, json.length()).indexOf("\"")+2;
        String tagName = json.substring(2, firstCloseQuote);

        if (!json.contains("null")) {
        	// not null
        	
        	String[] strs  = json.split("\"");
        	String value = strs[3].trim();
          xml = "<" + tagName + ">" + value + "</" + tagName + ">";
        }
       
        else {
       	// value is null
        	xml = "<" + tagName + "/>";
       }
   

        return xml;
    }
}
