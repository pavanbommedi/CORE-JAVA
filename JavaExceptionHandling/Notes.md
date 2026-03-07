What is an Exception in Java?
✅ Answer

An exception is an abnormal event that occurs during program execution and disrupts the normal flow.

Example:

int a = 10 / 0; // ArithmeticException

2️⃣ Difference between Error and Exception?
Error	Exception
Caused by JVM	Caused by application
Not recoverable	Recoverable                                                                                                                                
Example: OutOfMemoryError	Example: NullPointerException

3️⃣ Checked vs Unchecked Exceptions?
✅ Checked Exception

Checked at compile time

Must be handled or declared

Example:

FileReader fr = new FileReader("file.txt"); // IOException

✅ Unchecked Exception

Checked at runtime

Extends RuntimeException

Example:

int x = 10 / 0; // ArithmeticException

5️⃣ Can we have multiple catch blocks?
✅ Yes
try {
    String s = null;
    System.out.println(s.length());
} catch (NullPointerException e) {
    System.out.println("Null value");
} catch (Exception e) {
    System.out.println("Generic exception");
}

6️⃣ What happens if exception is not handled?
✅ Answer

Program terminates abnormally

JVM prints stack trace

int x = 10 / 0;
Exception in thread "main" java.lang.ArithmeticException

7️⃣ What is finally block?
✅ Answer

Used to execute cleanup code, always runs except JVM crash.

try {
    int x = 10 / 2;
} finally {
    System.out.println("Finally always executes");
}


8️⃣ Will finally execute if return is present?
✅ Yes
static int test() {
    try {
        return 10;
    } finally {
        System.out.println("Finally");
    }
}

🖨 Output
Finally

9️⃣ Can we have try without catch?
✅ Yes (with finally)
try {
    int x = 10 / 2;
} finally {
    System.out.println("Cleanup");
}

🔟 Can we have catch without try?
❌ No

catch must always follow try.

1️⃣1️⃣ What is throw keyword?
✅ Answer

Used to explicitly throw an exception.

throw new ArithmeticException("Invalid input");

1️⃣2️⃣ What is throws keyword?
✅ Answer

Used to declare exception to calling method.

void readFile() throws IOException {
    FileReader fr = new FileReader("file.txt");
}

1️⃣3️⃣ Difference between throw and throws?
throw	                     throws
Used inside method	         Used in method signature
Throws one exception	     Declares multiple exceptions

1️⃣4️⃣ What is custom exception?
✅ Answer

User-defined exception by extending Exception or RuntimeException.

class InvalidAgeException extends RuntimeException {
    InvalidAgeException(String msg) {  //Constructor chaining
        super(msg);
    }
}

if (age < 18) {
    throw new InvalidAgeException("Not eligible");
}


1️⃣5️⃣ Can we override a method and throw exception?
✅ Rules

Cannot throw broader checked exception

Can throw same or child exception

Unchecked exceptions → no restriction

class Parent {
    void test() throws IOException {}
}

class Child extends Parent {
    void test() throws FileNotFoundException {}

    1️⃣6️⃣ What is Exception Propagation?
✅ Answer

If exception is not handled, it propagates up the call stack.

void m1() {
    int x = 10 / 0;
}

void m2() {
    m1();

}

Exception propagates from m1 → m2 → main.

1️⃣8️⃣ Difference between final, finally, finalize()?
Keyword	Purpose
final	Prevent inheritance/modification
finally	Cleanup block
finalize()	GC cleanup (deprecated)


1️⃣9️⃣ Can we catch multiple exceptions in single catch?
✅ Yes (Java 7+)
try {
    int[] a = new int[5];
    System.out.println(a[10]);
} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
    System.out.println("Exception occurred");
}

2️⃣0️⃣ Tricky Output Question (🔥 Interview Favorite)
try {
    System.out.println(10 / 0);
} catch (Exception e) {
    System.out.println("Catch");
} finally {
    System.out.println("Finally");
}

🖨 Output
Catch
Finally

Q1️⃣ finally vs return (MOST ASKED)
static int test() {
    try {
        return 10;
    } catch (Exception e) {
        return 20;
    } finally {
        return 30;
    }
}

public static void main(String[] args) {
    System.out.println(test());
}

✅ Output
30

🧠 Explanation

finally overrides return from try/catch

Last return wins

Q3️⃣ finally with System.exit()
public static void main(String[] args) {
    try {
        System.exit(0);
    } finally {
        System.out.println("Finally");
    }
}

✅ Output
(No output)

🧠 Explanation

System.exit() terminates JVM

finally does not execute

Q5️⃣ Exception in finally block (VERY TRICKY)
public static void main(String[] args) {
    try {
        int x = 10 / 2;
    } finally {
        int y = 10 / 0;
    }
}

✅ Output
Exception in thread "main" java.lang.ArithmeticException

🧠 Explanation

Exception in finally overrides everything

Original try result is lost

Q6️⃣ Multiple catch order
public static void main(String[] args) {
    try {
        String s = null;
        System.out.println(s.length());
    } catch (Exception e) {
        System.out.println("Exception");
    } catch (NullPointerException e) {
        System.out.println("NPE");
    }
}

❌ Compile-Time Error
Unreachable catch block

🧠 Explanation

Parent exception must be after child

NullPointerException is subclass of Exception


Q8️⃣ Exception propagation
static void m1() {
    int x = 10 / 0;
}

static void m2() {
    m1();
}

public static void main(String[] args) {
    try {
        m2();
    } catch (ArithmeticException e) {
        System.out.println("Caught in main");
    }
}

✅ Output
Caught in main


🔥 Q🔟 return inside finally (object mutation)
static StringBuilder test() {
    StringBuilder sb = new StringBuilder("Java");
    try {
        return sb;
    } finally {
        sb.append(" Stream");
    }
}

public static void main(String[] args) {
    System.out.println(test());
}

✅ Output
Java Stream

🧠 Explanation

Object reference returned

Object modified in finally