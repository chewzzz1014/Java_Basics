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
