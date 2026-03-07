Producer - Consumer Problem


Lets say there two thread groups
Adding into queue -> t1 t2
Removing from queue -> t3 t4

Lets say remove thread t3 gets the first lock to access the method.
But at starting size is 0. There is nothing to remove. Hence the t3 should wait using wait() until other thread adds the elment into queue. It is in blocking state

So other thread 1 gets the key and will add and then notify using notifyall() to tell thread 3 to i have added and you can wake up and resume work. 

In same way for Adding thread first access but the size is full ,then it is needs to wait until removed thread remove the element and notifyAll() , meanwhile if we another adding thread it should be in queue.

q.wait() and q.notifyAll() are overidden methods from java.lang.object, in java every object is child of Object class here Queue.

t3 enters remove()
↓
Queue empty → wait()
↓
LOCK RELEASED
↓
t1 enters add()
↓
adds element
↓
notifyAll()
↓
t3 wakes → BLOCKED
↓
gets lock
↓
condition rechecked(while)
↓
poll() executes

1️⃣ Why wait() is needed

Yes 👍
When t3 (remove thread) enters first and the queue is empty:

while (q.size() == 0) {
    q.wait();
}


t3 releases the lock on q

Enters WAITING state

Does not consume CPU

Waits until some other thread calls notify() / notifyAll() on the same object (q)

2️⃣ How notifyAll() wakes threads

Correct 👍
When t1 or t2 (add thread) adds an element:

q.add(element);
q.notifyAll();


All threads waiting on q are moved to BLOCKED

They compete for the lock again

Only one thread gets it

Condition is re-checked (while, not if) → very important

3️⃣ Why while instead of if

Correct design 👍
Because:

Spurious wakeups

Multiple threads waking together

Condition may no longer be true

Interview line:

"wait() must always be used inside a while loop, never if."

Correct:

wait(), notify(), and notifyAll() are final methods of java.lang.Object

They cannot be overridden

Every object inherits them

That’s why any object can be used as a monitor

What actually happens:

If t1 is waiting because queue is full

And t2 comes, it also enters wait()

Both are waiting on the same monitor (q)

JVM manages a wait set, not a Java Queue

Better interview wording:

“Threads enter the object’s wait set, not a Java queue.”

This is a classic Producer–Consumer implementation using wait() and notifyAll().
When a remove thread enters first and the queue is empty, it calls wait(), which releases the monitor lock on the queue object and puts the thread into the waiting state.
Producer threads can then acquire the lock, add an element, and call notifyAll(), which wakes all waiting threads.
Woken threads compete for the lock again and recheck the condition using a while loop to avoid spurious wakeups.
The same logic applies when the queue is full and producer threads must wait.
wait() and notifyAll() are final methods of Object, which is why any object can be used as a monitor.”