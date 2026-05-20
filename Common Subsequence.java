Given two strings a and b. Check whether they contain any common subsequence (non empty) or not.

Time: O(n + m)
Space: O(n)

class Sol {
    Boolean commonSubseq(String a, String b) {
        // your code here
        HashSet<Character> set = new HashSet<>();
        
        for (int i = 0; i < a.length(); i++) {
            set.add(a.charAt(i));
        }
        
        for (int i = 0; i < b.length(); i++) {
            if (set.contains(b.charAt(i))) {
                return true;
            }
        }
        return false;
    }
}
