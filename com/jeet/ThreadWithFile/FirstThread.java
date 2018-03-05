package com.jeet.coreJava;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class FirstThread implements Runnable{

	@Override
	public void run() {
		List<String> list = Collections.emptyList();
		try {
			list = Files.readAllLines(Paths.get("D:\\JitZ\\File\\myfile.txt"), StandardCharsets.UTF_8);
			System.out.println("======First Thread========");
			for(int i=0;i<=list.size()/2-1;i++) {
				System.out.println(list.get(i));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
