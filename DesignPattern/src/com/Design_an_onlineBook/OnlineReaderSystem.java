package com.Design_an_onlineBook;

public class OnlineReaderSystem {

	private Library library;
	private UserManager userManager;
	private Display display;
	private Book activeBook;
	private User activeUser;

	public OnlineReaderSystem() {
		userManager = new UserMangaer();
		libraray = new Libraray();
		display = new Display();
	}

	public Library getLibrary() {
		return library;
	}

	public void setLibrary(Library library) {
		this.library = library;
	}

	public UserManager getUserManager() {
		return userManager;
	}

	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}

	public Display getDisplay() {
		return display;
	}

	public void setDisplay(Display display) {
		this.display = display;
	}

	public Book getActiveBook() {
		return activeBook;
	}

	public void setActiveBook(Book activeBook) {
		this.activeBook = activeBook;
	}

	public User getActiveUser() {
		return activeUser;
	}

	public void setActiveUser(User activeUser) {
		this.activeUser = activeUser;
	}

}
