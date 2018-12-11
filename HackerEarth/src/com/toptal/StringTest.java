package com.toptal;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTest {

	public int solution(String[] T, String[] R) {

		Map<String, Integer> map = new HashMap<String, Integer>();

		String reg = "\\d+";
		Pattern p = Pattern.compile(reg);
		Matcher m;

		for (int i = 0; i < T.length; i++) {
			System.out.println(T[i]);
			m = p.matcher(T[i]);
			int val = 1;
			if (m.find()) {
				if(map.containsKey(m.group())) {
					val = map.get(m.group());
				}else {
					map.put(m.group(), val);
				}
			}
			if(R[i].charAt(0)!='O') val = 0;
			map.replace(m.group(), val);
		}
		int count=0,tot=0;
		for (Map.Entry<String, Integer> entry : map.entrySet())
		{
			
			count++;
			tot+=entry.getValue();
		}

		int res = (tot/count)*100;
		return res;
	}
}
