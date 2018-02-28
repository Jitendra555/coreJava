package com.jeet.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;

public class Demo implements Cloneable,Serializable{
	private static Demo d=null;
	private Demo()
	{
		if(d!=null)
		{
			throw new IllegalStateException("Object already created");
		}
	}
	public synchronized static Demo getInstance()
	{
		if(d==null)
		{
			d=new Demo();
		}
	return d;
}

	public Object clone()
	{
		return d;
	}
	public Object readResolve()
	{
		return d;
	}
}
	class Test{
	public static void main(String[] args)throws Exception {
		//Demo d1 = new Demo();
		Demo d1 = Demo.getInstance();
		System.out.println("1_getInstance1:"+d1.hashCode());
		d1.clone();
		System.out.println("2_clone:"+d1.hashCode());
		//System.out.println(d1.hashCode());
		Demo d2 = Demo.getInstance();
		System.out.println("3_getInstance2:"+d2.hashCode());
		
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Demo d4 = (Demo)ois.readObject();
		System.out.println("4_FileInputStream:"+d4.hashCode());
		
		Class c = Class.forName("com.jeet.singleton.Demo");
		Constructor[] c1 = c.getDeclaredConstructors();
		Constructor c2 = c1[0];
		c2.setAccessible(true);
		Demo d5 = (Demo)c2.newInstance();
		System.out.println("5_reflection:"+d5.hashCode());
	}
	}
	