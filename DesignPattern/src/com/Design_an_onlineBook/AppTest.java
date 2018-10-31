package com.Design_an_onlineBook;


/**
 * 
 * Design an online book reader system
Design an online book reader system (Object Oriented Design).

Asked In: Amazon, Microsoft, and many more interviews

Solution: Let’s assume we want to design a basic online reading system which provides the following functionality:

• Searching the database of books and reading a book.
• User membership creation and extension.
• Only one active user at a time and only one active book by this user

The class OnlineReaderSystem represents the body of our program. We could implement
the class such that it stores information about all the books, deals with user management, and refreshes the display, but that would make this class rather hefty.Instead, we’ve chosen to tear off these components into Library, UserManager, and Display classes.



The classes:

1. User
2. Book
3. Library
4. UserManager
5. Display
6. OnlineReaderSystem
 * 
 * ****/


public class AppTest {
	
	public static void main(String[] args)
	{
		OnlineReaderSystem onlineReaderSystem = new OnlineReaderSystem(); 
		  
        Book dsBook = new Book(1, "It contains Data Structures", "Ds"); 
        Book algoBook = new Book(2, "It contains Algorithms", "Algo"); 
  
        onlineReaderSystem.getLibrary().addBook(dsBook); 
        onlineReaderSystem.getLibrary().addBook(algoBook); 
  
        User user1 = new User(1, " ", "Ram"); 
        User user2 = new User(2, " ", "Gopal"); 
  
        onlineReaderSystem.getUserManager().addUser(user1); 
        onlineReaderSystem.getUserManager().addUser(user2); 
  
        onlineReaderSystem.setActiveBook(algoBook); 
        onlineReaderSystem.setActiveUser(user1); 
  
        onlineReaderSystem.getDisplay().turnPageForward(); 
        onlineReaderSystem.getDisplay().turnPageForward(); 
        onlineReaderSystem.getDisplay().turnPageBackward(); 
    } 
	}
}
