## Processing strings 
As you already know, a string is a sequence of characters with a single data type, and so is an array. Strings are similar to arrays in many ways: in some sense, a string looks like an array of characters. Moreover, you can iterate over both strings and arrays. Sometimes you may need to process a string and convert it into an array, and in this topic we'll learn how to do that.

## Strings and arrays

It's possible to convert between strings and character arrays using special methods like valueOf() and toCharArray().

```
char[] chars = { 'A', 'B', 'C', 'D', 'E', 'F' };

String stringFromChars = String.valueOf(chars); // "ABCDEF"

char[] charsFromString = stringFromChars.toCharArray(); 
// { 'A', 'B', 'C', 'D', 'E', 'F' }

String theSameString = new String(charsFromString); // "ABCDEF"
```

There is another way to turn a string into an array. Take a look:

```
String text = "Hello";
String[] parts = text.split(""); // {"H", "e", "l", "l", "o"}
```

Here we used a much more concise method that splits a string into parts. Let's explore it in more detail!

## Splitting the string

A string can be divided into an array of strings based on a delimiter. To perform this, we call the split method, which divides the string into substrings by a separator. In the previous example, we used the "" delimiter, which automatically splits a string into smaller elements (substrings) that consist of one char.

If the delimiter is specified, the method returns an array of all the substrings. Note that the delimiter itself is not included in any of the substrings:

```
String sentence = "a long text";
String[] words = sentence.split(" "); // {"a", "long", "text"}
```

Let's try to split an American phone number into the country code, the area code, the central office code, and other remaining digits:

```
String number = "+1-213-345-6789";
String[] parts = number.split("-"); // {"+1", "213", "345", "6789"}
```

Keep in mind that all these parts are still strings no matter what they look like!

Choose your delimiter wisely, otherwise you might get some sentences that start with a space:

```
String text = "That's one small step for a man, one giant leap for mankind.";
String[] parts = text.split(","); 
// {"That's one small step for a man", " one giant leap for mankind."}
```

You can choose any delimiter you prefer, including a combination of spaces and words:

```
String text = "I'm gonna be a programmer";
String[] parts = text.split(" gonna be "); // {"I'm", "a programmer"}
```

As you can see here, the split method is also a good tool to get rid of something you don't need or don't want to use.

## Iterating over a string

It's possible to iterate over the characters of a string using a loop (while, do-while, for-loop).

See the following example:

```
String scientistName = "Isaac Newton";

for (int i = 0; i < scientistName.length(); i++) {
    System.out.print(scientistName.charAt(i) + " ");
}
```

In strings, like in arrays, indexing begins from 0. In our example, the for-loop iterates over the string "Isaac Newton" . With each iteration, the charAt method returns the current character at the i index, and that character is then printed to the console, followed by a blank space.

Here is what the code outputs as a result:

```
I s a a c   N e w t o n 
```
