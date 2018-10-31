# Test Driven Development

## Test -- > Drives -- > Devlopment

1.  Create interface for arithmetic oeration
2.  Create a Class to implement those interfaces
3.  Create JUNIT test cases
4.  Write Code to pass the test cases.

## Create a project in eclipse

1.  create a package `src/com.leranJava`
2.  create an interface (requirements) `Adder.java` and `Subractor.java`
   
   `Subractor.java`
 ```
 public interface Subractor {
     long subract(long... operands);
 }

 ```  


   `Adderr.java`
 ```
 public interface Adderr {
     long add(long... operands);
 }

 ```

3. Implementation class
   `src/Mathreader.java`

```
public class Mathreader implements Adder, Subractor{
    public long subract(long... operands){

    }

    public long add(long... operands){

    }
}

```

4. Write test code first -- thats why its called test driven approach
5. Separate test folder `TDD/src/testsrc` junit then Build path-- source folder
6. Select `Mathreader.java` create a Junit test case 4.0 and Source folder - `testsrc` click setup() and select the method want to test
7. 
8. 