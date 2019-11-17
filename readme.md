### Task
1. Add custom exceptions (extend Exception and RuntimeException).
2. Create your own AutoClosable class, and try how it works in try-with-resources.
3. Throw some exception in close() method of your AutoClosable class and watch what will happen.

### About
This program prints various figures selected by the user in the console.

#### Exceptions

1. IOException - throws when we try to get an instruction file that doesn't exist.
This exception is handled by the Instruction class, that implements AutoCloseable interface.

2. MyNumberFormatException - custom exception class, that extends NumberFormatException.
Throws when user enters letters instead of numbers - a menu item, and we can't parse it to int type.
