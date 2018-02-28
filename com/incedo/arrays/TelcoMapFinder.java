package com.incedo.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TelcoMapFinder {

	public static void main(String[] args) {
		String input = "18009875000-Airtel#18009875001-Airtel#18009876000-Idea#18009876001-Idea";
		Map<String, List<String>> output = findTelcoMap(input);
		System.out.println(output);
	}
	public static Map<String, List<String>> findTelcoMap(String input)
	{
		if(input == null || input.trim().equals(""))
		{
			return null;
		}
		String[] splitInput = input.split("#");
		Map<String, List<String>> map = new TreeMap<String, List<String>>();
		for(String string : splitInput)
		{
			String[] keyAndValue = string.split("-");
			if(map.containsKey(keyAndValue[1]))
			{
				map.get(keyAndValue[1]).add(keyAndValue[0]);
			}
			else
			{
				List<String> tempList = new ArrayList<String>();
				tempList.add(keyAndValue[0]);
				map.put(keyAndValue[1], tempList);
			}
		}
		return map;
	}
}
