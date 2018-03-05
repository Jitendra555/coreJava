package com.jeet.coreJava;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class SecondThread implements Runnable{
	@Override
	public void run() {
		List<String> list = Collections.emptyList();
		try {
			
			list = Files.readAllLines(Paths.get("D:\\JitZ\\File\\myfile.txt"));
			System.out.println("======Second Thread========");
			for(int i=list.size()/2;i<=list.size()-1;i++) {
					System.out.println(list.get(i));
				}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
