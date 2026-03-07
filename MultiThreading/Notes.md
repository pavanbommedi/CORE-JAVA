Thread scheduling is handled by JVM + OS, so output order is NOT guaranteed when multiple threads are involved.

✅ Rule to Remember (INTERVIEW GOLD)

If a class implements Runnable, it cannot be started directly.
It must be passed to a Thread object.


“Deadlock occurs because both threads acquire locks in opposite order.
Each thread holds one lock and waits for the other, forming a circular dependency.
Using String literals as locks is unsafe due to string interning, so dedicated lock objects should be used.”