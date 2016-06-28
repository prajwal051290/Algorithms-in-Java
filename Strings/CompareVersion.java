/*Compare two version numbers version1 and version2.
If version1 > version2 return 1, if version1 < version2 return -1, otherwise return 0.

You may assume that the version strings are non-empty and contain only digits and the . character.
The . character does not represent a decimal point and is used to separate number sequences.
For instance, 2.5 is not "two and a half" or "half way to version three", it is the fifth second-level revision of the second first-level revision.*/

public class Solution {
    public int compareVersion(String version1, String version2) {
        
        String[] str1 = version1.split("\\.");
 		String[] str2 = version2.split("\\.");
 		
 		int l1 = str1.length, l2 = str2.length;
 		int n = Math.max(l1, l2);

 		for (int i = 0; i < n; i++) {
 			int v1 = i < l1? Integer.parseInt(str1[i]):0;
 			int v2 = i < l2? Integer.parseInt(str2[i]):0;
 			if (v1 > v2) 
 				return 1;
 			if (v2 > v1)
 				return -1;
 		}

 		return 0;
    }
}