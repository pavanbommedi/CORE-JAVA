Static methods are resolved at compile time

Static methods belong to the class, not the object

Method hiding depends on reference type, not object type

Parent p = new Child();
Reference type → Parent

Object type → Child

But since show() is static, JVM does NOT use runtime polymorphism.

It uses compile-time binding (static binding).

1️⃣ Final Variable

You said:

Value cannot be changed.

Better answer:

A final variable can be assigned only once. After initialization, its value cannot be changed.

Example:

final int x = 10;
x = 20; // ❌ Compile-time error


⚠️ Important Interview Twist:

What if it’s a final reference variable?

final List<String> list = new ArrayList<>();
list.add("Hello");  // ✅ Allowed
list = new ArrayList<>(); // ❌ Not allowed


👉 The reference cannot change,
but the object’s internal state can change.

This is very important.

2️⃣ Final Method

You said:

Cannot override.

Correct. But explain why:

If a method is final, it prevents method overriding to maintain original implementation.

Example:

class Parent {
    final void show() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    void show() { }  // ❌ Compile-time error
}

3️⃣ Final Class

You said:

Cannot extend.

Correct.

Example:

final class A { }

class B extends A { } // ❌ Error


Real-world example:

String class is final.

Interviewers love that example.

✅ Improved Interview-Ready Answer

You said:

String is immutable. If not final, we can override and make it mutable.

Correct ✅
Now let’s structure it properly.

🔥 Why is String class final?

String class is final mainly because of:

1️⃣ Security

Strings are heavily used in:

File paths

Database URLs

Network connections

Class loading

Username/password

👉 String is immutable NOT just because it is final.

It is immutable because:

Its internal state (character array) is final.

It does not provide setter methods.

It does not expose its internal reference directly.

The class is final to prevent behavior modification via subclassing.

🔍 Deep Explanation
1️⃣ Internal Implementation (Important)

Internally, String looks like this (simplified):

public final class String {

    private final byte[] value;   // or char[] in older versions

}


Notice:

Class is final

Internal array is private final

String is immutable because its internal state is private and final, and no methods allow modification. The class is made final to prevent subclassing that could break immutability or security.

1️⃣ new ArrayList<>(list)

Creates a new copy

Changes to original list do NOT affect new list

It is still modifiable

List<String> copy = new ArrayList<>(original);
copy.add("New"); // ✅ allowed

2️⃣ Collections.unmodifiableList(list)

Does NOT create deep copy

Just creates a read-only view

If original list changes → unmodifiable view also reflects changes

List<String> view = Collections.unmodifiableList(original);
view.add("New"); // ❌ UnsupportedOperationException


⚠️ But:

original.add("X");  
System.out.println(view); // X will appear!
Java supports multiple inheritance using interfaces because:

Interfaces do not contain state (instance variables).

They only define method declarations (before Java 8).

So there is no ambiguity in state.

If method conflict happens, class must explicitly override.

1️⃣ Constructors are not inherited.
Overriding requires inheritance.

2️⃣ Constructors are called during object creation, not through object reference polymorphism.

3️⃣ They belong to the class itself, not to objects in a polymorphic way.

Constructors are NOT polymorphic.

Even though:

Parent p = new Child();


The object being created is Child.

When a Child object is created:

Step 1️⃣

Memory is allocated for Child object.

Step 2️⃣

Child constructor is called.

Step 3️⃣

Before executing Child constructor body,
Java automatically inserts:

super();


So Parent constructor executes first.

Step 4️⃣

After Parent constructor finishes,
Child constructor executes.