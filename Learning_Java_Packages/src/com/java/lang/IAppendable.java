package com.java.lang;

import java.io.IOException;

public interface IAppendable {
	
	public Appendable append(char c) throws IOException;
	public Appendable append(CharSequence csq) throws IOException;
	public Appendable append(CharSequence csq, int start, int end) throws IOException;

}
		