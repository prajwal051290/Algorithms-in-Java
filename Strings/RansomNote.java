/* Given  an  arbitrary  ransom  note  string  and  another  string  containing  letters from  all  the  magazines,  write  a  function  that  will  return  true  if  the  ransom   note  can  be  constructed  from  the  magazines ;  otherwise,  it  will  return  false.  
Each  letter  in  the  magazine  string  can  only  be  used  once  in  your  ransom  note.
*/

//Note:
//You may assume that both strings contain only lowercase letters.
/*
canConstruct("a", "b") -> false
canConstruct("aa", "ab") -> false
canConstruct("aa", "aab") -> true*/

//Logic: USe hashmap nad play with counters of each letter.

public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> magazineMap = new HashMap<Character,Integer>();
        
        for(int i=0; i<magazine.length(); i++){
            if(magazineMap.containsKey(magazine.charAt(i)))
                magazineMap.put(magazine.charAt(i),magazineMap.get(magazine.charAt(i))+1);
            else
                magazineMap.put(magazine.charAt(i),1);
        }
        
        for(int i=0; i<ransomNote.length(); i++){
            if(magazineMap.containsKey(ransomNote.charAt(i)))
                if(magazineMap.get(ransomNote.charAt(i))!=0)
                    magazineMap.put(ransomNote.charAt(i),magazineMap.get(ransomNote.charAt(i))-1);
                else
                    return false;
            else
                return false;
        }
        return true;
    }
}