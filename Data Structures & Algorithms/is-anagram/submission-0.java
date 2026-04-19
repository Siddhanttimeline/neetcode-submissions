class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        HashMap<Character, Integer> s_map = new HashMap<>();
        HashMap<Character, Integer> t_map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            if (s_map.containsKey(ch)) {
                s_map.put(ch, s_map.get(ch) + 1);
            } else {
                s_map.put(ch, 1);
            }
        }

        for (char ch : t.toCharArray()) {
            if (t_map.containsKey(ch)) {
                t_map.put(ch, t_map.get(ch) + 1);
            } else {
                t_map.put(ch, 1);
            }
        }

        return s_map.equals(t_map);
    }
}
