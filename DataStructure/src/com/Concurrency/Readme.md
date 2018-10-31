# Concurrency in Java

1. Application run on One Machine
2.  Threading is allowing a Sequence of instruction on one machine to run on one core and any sequence can be swap in and out of single core.

## Multi Core Architecture

3.  Building blocks 
    -   CPU - Brain of computer
        -   Instruction are Executed
        -   Most CPUs are Microporocessor (Single processing unit) , which means that they consist of a single , integrated circuit
        INTEL(Intel Inside) and AMD are CPU manufacturing companies -- CHIPS Giants

4.  But In recent years a lot of the speed imporvements have also come from processing have multiple cores that can execute instructions in parallel

5. So has Clous Computing, where operation are run on many machine quite far each from each other and send then in aggregate manner

6.  Parallelism - > Ability to perform number of operations at the same time on different core. heavy duty computing.

## java And All Programming 

1.  Done through THREAD - is a sequence of operation on a single thread or a single instance.

2.  By Default - implicity uses one thread -- > Means all instruction were executed one- after - another(Serially)

3. The Main thread - Default thread - single thread

## Processes vs Thread

4.  In a progra, different thread have instruction that may be executed simulataneously. But all of threads are controlled by the same process

5. Every program runs inits own Process. A Process can 'Spawn Off' multiple threads

6. Thread can do anything that can Process. However Threads shares ADDRESS Base(sharing information in Threads is very easy Because they have access to same memory location ). However Process run its own memory and address base and its not possible for process.

7. Program : Process:: 1:1 one 

8.  Process : Threads :: 1:many

9.  For Instance two Threads might Both change the value of a variable simulataneously and Strange bugs could result.

10. Hard to understand, find, debugg

11. Concurrency is a act where multiple threads acts on same piece of memory ( Concurrent access of memory)

```

##      OLD School                              New School

12.   **Runnable** Interface                              **Callable** interface
        Implemented by a class with the                 Implemented by a class with the            
        operations to be carried 
        out on other thread
                                                        operations to be carried 
                                                        out on other thread

13.   **Thread** in Built class                         **Executors** 
        Objects of the thread class take                Java implememts helper Objects which know how to MANAGE, Stop, and Start 
        in the runnable objects and run them             Thread
        on the individual threads

14.   **Thread.JOIN()** o thread to                     **Future.get()**
          wait for all result                           Futures are Object which will hold the result in the future(i.e once the 
          The Main class calss the Join method on       once the callable interfaces finishes whatever stuffs it there had to 
          each thread which will waut until the         do on other Thread)
          thread finishes

          cons - Shared memory

```

## Which of the these methods wait for the above thread to finish running?
Thread t = new Thread();


t.join(), t.stop(), t.get(), t.sleep()

## Thread Objects

15.     Each Thread is associated with a Instance of the class Thread.
16.     The static Thread.get current Thread method will return the currently executing thread at any point in time.
    
17.     In Old school

  -     2 ways of starting a new Thread
  -     
  1.    write a class that implements the runnable interface.
  2.    Instantiate a Thread object and pass in the runnable object in the constructor
  3.    call the .start() method on th thread object.

 1.    Write a sub-class of thread and overwrite  the RUN method
 2.    Call the .start() method to start

Prefer : creating a Runnable object is the preffered solution because it nicely separates the thread from the task to be run on the thread.

## Thread.sleep()

18.     It is a suggestion not a gurranttee thar=t your thread will going to sleep got this time. It is upto the Operating sytem
19.     the static thread.sleep() methos can be used to pause the execution for a specified timeim (ms or ns)
20.     Putting a thread to sleep is an ineffiecinet way to wait (for instamce thiela nother taks completes)
21.     BTW, there is no gurrantee that te thread will sleep for eactly the specified period - that's controlled by the system
22.     Thread.sleep throws an Excepton .
        interuptedException which is throw if some other thread wakes up the sleeping thread.
## thread interruption

23.     Check thread to interrupts other threads. and to check if they themselves have been interrupted
24.     to interrupt another thread . Call the .Interrupt() memeberfunction on that thread
25.     checks you and your thread interrupts
        1.      catch an interruption exception
        2.      call the static thread interruptes memebr funtion to see if the current thread has been interrupted(return true or false)

## thread join

26.     the join of a thread class is a way of waiting until the thread finsih execution of its run method.
27.     calling Join on another thread is similar to calling sleep on the current thread until that other threat fnishes
28.     throws InterruptedException before it finishes 

## In the below code what is MyTestclass?
```
MyTestClass myTestCLass1 = new MyTestClass();
Thread t1 = new Thread(myTestClass1);
```
1.      A class which implements the Runnable interface.
2.      A  class which implements the Executor interface
3.      Any class
4.      A class which implements th Callable interface.

Ans - 1.

## Consucrrency issues and Synchronisation

### Synchronisation

29.     In java threading support, thread mostly communicate with each other via shared objects or shred member variable within the same object.

        Three type of complication
 **Thread interference** Different threads access the same data
 
 if two threads access the same variable its possible or them to get in each others way

 Solution : Make sure a section of code is only accessed by one threas a time
 Restrictin access to an object or a varibale so only 

 Locking variable correctly can eliminate thread interference and memory consitency errors.
 Slows down performance.

 LOCKING - **SYNCHRONNIZED**
 Intinsc lock or monitor -- restric access
 
 
 **Memory consistency errors** A Thread sees  stale(inconsistent) value of a variable
 **Thread Contention** Thread gets in each other way and slowly down - sometime evenhave to be killed by java

## Synchronised LiveLock , DeadLock, StarVation

```

public class SynchronizedCounter {

        // remember however that the only "only-1-thread-at-a-time" only applies to the same method of the same object


        private int c =0;

        public synchronized void increment(){
                c++;
        }

        public synchronized void decrement(){
                c--;

        }

        public synchronized int value(){

// so if for intance the method does something to a static class variable to static class variable (Not an object variable) errors can still result



                return c; 
        }
}

```

Doing so means that only one thread can be executing this member function on this object at a given point in time

Since every object in java has an intrinsic lock associate with it. it is actually ossible to lock any section of code by making it as synchronzed

```

public void addName(String name){
        synchronized(this){
                lastname = name;
                nameCount++;
        }
        nameList.add(name); BTW, Threads ever block itself, which means that one synchronized
}


```

## Thread Contention

Synchrization and lock are very powerful and any power can be misused

1.      DeadLock - two threads , each is blocked on a lock held by other 
2.      LoveLock - two threads don;t deadlock but keep blocking on locks held by ech other. neither really can progress.
3.      Starvation - some threads keep aquiring locks greedily and cause other threads to be unable to get anything done.