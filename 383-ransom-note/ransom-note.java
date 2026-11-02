
import java.util.HashMap;

class Solution {
    public boolean canConstruct(String ransom, String magazine) {

        HashMap<Character,Integer> map = new HashMap<>();
        HashMap<Character,Integer> map1 = new HashMap<>();

        for(char ch : ransom.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(char ch : magazine.toCharArray()) {
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }

        for(int i = 0; i < ransom.length(); i++) {

            char ch = ransom.charAt(i);

            if(!map1.containsKey(ch)) {
                return false;
            }

            if(map.get(ch) > map1.get(ch)) {
                return false;
            }
        }

        return true;
    }
}
