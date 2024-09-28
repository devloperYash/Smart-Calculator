# Smart-Calculator

This is a basic calculator application implemented in Java. It allows users to perform basic arithmetic operations such as addition, subtraction, multiplication, and division. The program runs in a loop, allowing continuous calculations until the user chooses to exit.

## Features

- Supports the following arithmetic operations:
  - Addition (`+`)
  - Subtraction (`-`)
  - Multiplication (`*`)
  - Division (`/`) with error handling for division by zero.
- Interactive console input for numbers and operations.
- Continuously performs calculations until the user exits.

## How to Use
1. The program will prompt you to enter the first number.
2. Then, you will be asked to enter the operation you wish to perform. The supported operations are:
    - Addition (+)
    - Subtraction (-)
    - Multiplication (*)
    - Division (/)
3. Finally, input the second number.
4. The result will be displayed, and you can choose to perform another calculation or exit the program.

### Division by Zero
If you attempt to divide by zero, the program will display an error message and will not perform the operation.

## Example
```
Enter first number: 5
Enter operation (+, -, *, /): *
Enter second number: 4
Result: 20.0
Do you want to perform another calculation? (yes/no): no
```

## Requirements
- Java Development Kit (JDK) 8 or higher
- You must have Java installed on your system. You can download it from [here](https://www.oracle.com/java/technologies/javase-downloads.html).
- A terminal or IDE to run the Java program

## Running the Program
To run the calculator program:
1. Save the code in a file named `Calculator.java`.
2. Open a terminal and navigate to the directory where the file is saved.
3. Compile the program using the following command:
   ```
   javac Calculator.java
   ```
4. Run the compiled program:
   ```
   java Calculator
   ```

## License
This project is licensed under the MIT License.


