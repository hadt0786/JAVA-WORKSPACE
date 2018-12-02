package com.java.lang;

public interface Iterable<t> {
	
	public default void forEach(Consumer<? super T> action) throws NullPinterException {
		for(T t:this) {
			action.accept(t);
		}
	}
	public abstract Iterator<T> iterator();
	public default Spliterator<T> spliterator();
	

}
