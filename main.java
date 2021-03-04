// here shows my approach with list
// l tried hashset and map, but arrlist is the one l am most comfortable with
// there's one approach(SCII) by starting an [256] array filled up with -1, it was amazing

class Solution {
    public int lengthOfLongestSubstring(String s) {
        ArrayList<String> str = new ArrayList<String>();
        int size=s.length();
        int largest=0;
        for(int i=0;i<size;i++){

          char a=s.charAt(i);
          String ok=String.valueOf(a);

          
          while(str.contains(ok)){
            str.remove(0);
            //System.out.print("List after remove: "+str+"\n");
            }

          str.add(ok);
          largest=Math.max(largest,str.size());
          
          }
     
          
          
         
         

          
        
        
        return largest;
    }
}
