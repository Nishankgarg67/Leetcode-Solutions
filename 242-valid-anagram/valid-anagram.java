class Solution {
    public boolean isAnagram(String s, String t) {
          Map<Character , Integer> list1 = new HashMap<> ();
        Map<Character , Integer> list2 = new HashMap<> ();

        for( char a  : s.toCharArray()){
            list1.put(a,list1.getOrDefault(a,0)+1);
        }
        for(char b : t.toCharArray()){
            list2.put(b,list2.getOrDefault(b,0)+1);
        }
        if(list1.equals(list2)){
            return true;
        }

        return false;

    }
}