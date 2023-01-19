import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
import java.io.*;

public class XMLParser {
	
	public static void main (String[]args) {
		LinkedList<String> tags = new LinkedList<>();
        LinkedList<String>  textBetween = new LinkedList<>();
        LinkedList<String> attributes = new LinkedList<>();
        LinkedList<String> values = new LinkedList<>();
	}
/*
 * <element | attribute1="value1" |  …  | attributeN="valueN" |/>
 * 
 * 
 * <node>
    <child name = "child_name1" type = "child_type1">
        <subchild id = "1" auth="auth1">Value1</subchild>
    </child>
    <child name = "child_name2" type = "child_type2">
        <subchild id = "2" auth="auth1">Value2</subchild>
        <subchild id = "3" auth="auth2">Value3</subchild>
        <subchild id = "4" auth="auth3"></subchild>
        <subchild id = "5" auth="auth3"/>
    </child>
</node>


Element:
path = grand_parent, ... , parent
value = element_value [ null if it’s empty ]
attributes: [ Only if element contain attributes ]
attributeN = valueN

Element:
path = grand_parent, ... , parent
attributes: [ Only if element contain attributes ]
attributeN = valueN

Also, you should not rely on new lines, because they are only there to make the code more readable to a human. Take a look at the last output example: the initial XML file doesn't have any new lines. Everything is presented in a single line although the content is the same as in the last but one example.

You should read from the file named test.txt. If you want to test your program, you should check it on some other file, because the contents of this file will be overwritten during testing and after testing the file will be deleted.


Some unexplained rules of this excercise:
* If a tag is of the type <tag/> its value should be null.
* If a tag is of the type <tag></tag> its value should be empty ("").
* If a tag is of the type <tag>text</tag> its value should be "text".
* 
* 
* 1. Nested
* 	<nonattr/>
    <nonattr></nonattr>
    <nonattr>text</nonattr>
* 
* 2. No nested
* - <grandparent>
*    ...
*    <children>
 */
}
