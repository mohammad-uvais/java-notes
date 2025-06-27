
public class Main {
    public static void main(String[] args) {
        // Operators are used to perform operations on variables and values.
        int sum1 = 100 + 50;
        int sum2 = sum1 + 250;
        int sum3 = sum2 + sum2;

        // Java divides the operators into the following groups;
        // 1. Arithmetic Operators
        // 2. Assignment Operators
        // 3. Comparison Operators
        // 4. Logical Operators
        // 5. Bitwise Operators
        // 6. Unary Operators
        // 7. Ternary Operators

        // 1. Arithmetic Operators
        // Arithmetic operators are used to perform basic mathematical operations.
        int a = 10;
        int b = 20;
        int sum = a + b; // Addition
        int difference = a - b; // Subtraction
        int product = a * b; // Multiplication
        int quotient = a / b; // Division
        int remainder = a % b; // Modulus (Remainder)
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        // 2. Assignment Operators
        // Assignment operators are used to assign values to variables.
        int c = 5;
        c += 3; // c = c + 3
        System.out.println("c after += 3: " + c);
        c -= 2; // c = c - 2
        System.out.println("c after -= 2: " + c);
        c *= 2; // c = c * 2
        System.out.println("c after *= 2: " + c);
        c /= 2; // c = c / 2
        System.out.println("c after /= 2: " + c);
        c %= 3; // c = c % 3
        System.out.println("c after %= 3: " + c);
        c &= 1; // c = c & 1 (Bitwise AND)
        System.out.println("c after &= 1: " + c);
        c |= 2; // c = c | 2 (Bitwise OR)
        System.out.println("c after |= 2: " + c);
        c ^= 1; // c = c ^ 1 (Bitwise XOR)
        System.out.println("c after ^= 1: " + c);
        c <<= 1; // c = c << 1 (Left Shift)
        System.out.println("c after <<= 1: " + c);
        c >>= 1; // c = c >> 1 (Right Shift)
        System.out.println("c after >>= 1: " + c);

        // 3. Comparison Operators
        // Comparison operators are used to compare two values.
        int x = 10;
        int y = 20;
        boolean isEqual = (x == y); // Equal to
        boolean isNotEqual = (x != y); // Not equal to
        boolean isGreater = (x > y); // Greater than
        boolean isLess = (x < y); // Less than
        boolean isGreaterOrEqual = (x >= y); // Greater than or equal to
        boolean isLessOrEqual = (x <= y); // Less than or equal to
        System.out.println("x is equal to y: " + isEqual);
        System.out.println("x is not equal to y: " + isNotEqual);
        System.out.println("x is greater than y: " + isGreater);
        System.out.println("x is less than y: " + isLess);
        System.out.println("x is greater than or equal to y: " + isGreaterOrEqual);
        System.out.println("x is less than or equal to y: " + isLessOrEqual);

        // 4. Logical Operators
        // Logical operators are used to combine multiple boolean expressions.
        boolean condition1 = true;
        boolean condition2 = false;
        boolean andCondition = condition1 && condition2; // Logical AND
        boolean orCondition = condition1 || condition2; // Logical OR
        boolean notCondition = !condition1; // Logical NOT
        System.out.println("Logical AND: " + andCondition);
        System.out.println("Logical OR: " + orCondition);
        System.out.println("Logical NOT: " + notCondition);

        // 5. Bitwise Operators
        // Bitwise operators are used to perform operations on bits.
        int bitwiseA = 5; // 0101 in binary
        int bitwiseB = 3; // 0011 in binary
        int bitwiseAnd = bitwiseA & bitwiseB; // Bitwise AND
        int bitwiseOr = bitwiseA | bitwiseB; // Bitwise OR
        int bitwiseXor = bitwiseA ^ bitwiseB; // Bitwise XOR
        int bitwiseNot = ~bitwiseA; // Bitwise NOT
        int leftShift = bitwiseA << 1; // Left Shift
        int rightShift = bitwiseA >> 1; // Right Shift
        System.out.println("Bitwise AND: " + bitwiseAnd);
        System.out.println("Bitwise OR: " + bitwiseOr);
        System.out.println("Bitwise XOR: " + bitwiseXor);
        System.out.println("Bitwise NOT: " + bitwiseNot);
        System.out.println("Left Shift: " + leftShift);
        System.out.println("Right Shift: " + rightShift);

        // 6. Unary Operators
        // Unary operators operate on a single operand.
        // They can be used to increment or decrement a value, or to negate it.
        int unaryA = 5;
        unaryA++; // Increment
        System.out.println("Unary Increment: " + unaryA);
        unaryA--; // Decrement
        System.out.println("Unary Decrement: " + unaryA);
        boolean unaryB = true;
        unaryB = !unaryB; // Negation
        System.out.println("Unary Negation: " + unaryB);
        // Unary plus and minus
        int unaryPlus = +unaryA; // Unary plus (no effect)
        int unaryMinus = -unaryA; // Unary minus (negation)
        System.out.println("Unary Plus: " + unaryPlus);
        System.out.println("Unary Minus: " + unaryMinus);

        // 7. Ternary Operator
        // The ternary operator is a shorthand for an if-else statement.
        int ternaryA = 10;
        int ternaryB = 20;
        int max = (ternaryA > ternaryB) ? ternaryA : ternaryB; // Ternary operator
        System.out.println("Maximum value: " + max);
    }
}
