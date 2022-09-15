## matches
- Built-in method of string
- `str.matches(regex)`

## .
- Any character, except \n unless specified
- `"Hello World".matches("Hello.World") // true` 
- `"Hello.World".matches("Hello.World") // true`
- `"HelloWorld".matches("Hello.World")  //false`

## ?
- The character before ? can appear zero or one time
- `"pale".matches("p?ale"); // true`
- `"ale".matches("p?ale"); // true`

## \
- Escape character for special symbol
- `\\` in regex means single backslash in matching string (need \ to escape \, so when using backslash we should use \\)

```
String endRegex = "The End\\.";

"The End.".matches(endRegex); // true
"The End?".matches(endRegex); // false
```

```
// regular expression for any five-character sequence that ends with a dot

String pattern = ".....\\.";

"a1b2c.".matches(pattern); // true
"Wrong.".matches(pattern); // true
"Hello!".matches(pattern); // false
```


## [] (Set of characters)
- Matches any sinle character in the [ ]

```
String pattern = "[bcr]at"; // it matches strings "bat", "cat", "rat", but not "fat"

"rat".matches(pattern); // true
"fat".matches(pattern); // false
```

## [a-b] (Range of characters)
- specify a range of number/character in [ ]

```
String anyDigitPattern = "[0-9]"; // matches any digit from 0 to 9
String anyLetterPattern = "[a-zA-Z]"; // matches any letter "a", "b", ..., "A", "B", ...
```


## ^
- Excluding character after ^


```
String regex = "[^abc]"; // matches everything except for "a", "b", "c"

"a".matches(regex); // false
"b".matches(regex); // false
"c".matches(regex); // false
"d".matches(regex); // true
```

## Escaping characters in sets
- do not need to escape special characters within sets if they are used in their literal meaning. 
- `[.?!]` will match a single period, a question mark, an exclamation mark, and nothing else.


- to match the dash character itself, we should put it in the first or in the last position in the set: `[-a-z]` matches lowercase letters and the dash, and `[A-Z-]` matches uppercase letters and the dash;
- hat ^ does not need to be escaped if placed anywhere but the beginning. This way, the set `[^a-z^]` matches everything except for lowercase letters and the hat character;
- square brackets should always be escaped:

```
String pattern = "[\\[\\]]"; // matches "[" and "]
```

## |
- match character sequences either before or after the symbol.

```
String pattern = "yes|no|maybe"; // matches "yes", "no", or "maybe", but not "y" or "e"

"no".matches(pattern); // true
```

```
String pattern = "(b|r|go)at"; // matches "bat", "rat" or "goat"
String answer = "The answer is definitely (yes|no|maybe)";
```
