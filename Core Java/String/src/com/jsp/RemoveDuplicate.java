/*
 * How to remove duplicate characters from String
 */

package com.jsp;

public class RemoveDuplicate {
	public static String removeDuplicate(String s) {
		String res = " ";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ')
				if(res.indexOf(s.charAt(i))<=-1)
					res=res+s.charAt(i);
				else
					res = res+"";
		}
		return res;
	}
	public static void main(String[] args) {
		String name = "Navneet";
		System.out.println(RemoveDuplicate.removeDuplicate(name));
	}
}
