## Enum
- Enum is a special keyword short for enumeration that allows us to create a list of constants grouped by their content: seasons, colors, states, etc.
- By convention, constants in an enum are written in uppercase letters.
- All constants should be separated with commas
- It is possible to declare an enum inside the class. In this case, we don't need to use public modifier in the enum declaration.

```
public enum Season{
    SPRING, SUMMER, AUTUMN, WINTER // four instances
}
```

## Methods for Processing Enums
```
public enum UserStatus {
    PENDING, ACTIVE, BLOCKED
}
```
```
UserStatus active = UserStatus.ACTIVE;
System.out.println(active.name()); // ACTIVE
```
```
UserStatus blocked = UserStatus.valueOf("BLOCKED"); // BLOCKED
```
```
UserStatus[] statuses = UserStatus.values(); // [PENDING, ACTIVE, BLOCKED]
```

```
System.out.println(active.ordinal()); // 1 (starting with 0)
System.out.println(UserStatus.BLOCKED.ordinal()); // 2
```

```
System.out.println(active.equals(UserStatus.ACTIVE)); // true
System.out.println(active == UserStatus.ACTIVE); // true
```

## In Loop
```
    for (UserStatus status : UserStatus.values()) {
        System.out.println(status);
    }
/* the output is
PENDING 
ACTIVE
BLOCKED
*/
```





