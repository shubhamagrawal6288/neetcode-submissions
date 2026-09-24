class Solution {

    public String encode(List<String> strs) {
        StringBuilder str = new StringBuilder();

        for(String s : strs) {
            str.append(s.length());
            str.append("#");
            str.append(s);
        }
        return str.toString();
    }

    public List<String> decode(String s) {

      List<String> result = new ArrayList<>();

        int i = 0;

        while (i < s.length()) {

            int j = i;

            // Find '#'
            while (s.charAt(j) != '#') {
                j++;
            }

            // Get length
            int length = Integer.parseInt(s.substring(i, j));

            // Get actual string
            String word = s.substring(j + 1, j + 1 + length);

            result.add(word);

            // Move to next encoded string
            i = j + 1 + length;
        }

        return result;
    }
}
