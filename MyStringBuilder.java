package test;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class MyStringBuilder {
	// ---------- DO NOT Change ----------------
	ArrayList<Character> buff;
	
	public MyStringBuilder() {
		buff=new ArrayList<>();
	}
	
	public MyStringBuilder(char...ts) {
		buff=new ArrayList<>();
		for(char t : ts)
			buff.add(t);
	}

	public MyStringBuilder append(String str) {
		for(int i=0; i<str.length(); i++)
		{
			char c=str.charAt(i); 
			buff.add(c);
		}
		
		return this;
		
		

	}

	public MyStringBuilder reverse() {
		ArrayList<Character> buffRev= new ArrayList<Character>(buff);
		buff.clear();
		ListIterator<Character> c= buffRev.listIterator(buffRev.size());
		while(c.hasPrevious())
			{
				buff.add(c.previous());
			}
		return this;
		}

	public String toString()
	{
		String sb = new String();
		for(char c : buff)
		{
			sb+=c;
		}

		return sb;
		
	}

	// -----------------------------------------

	public MyStringBuilder apply(Function<Character,Character> fun) {
		for(int i=0; i<buff.size();i++)
		{
			buff.set(i, fun.apply(buff.get(i)));
		}

        return this;

	}
	
	// implement append
	
	// implement reverse
	
	// implement apply
	
	// implement toString

	


	}
