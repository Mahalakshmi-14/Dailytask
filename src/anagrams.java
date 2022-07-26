public class anagrams {
    public static boolean areAnagram(
                String first, String second) {

            if (first == null || second == null || first.length() != second.length())
                return false;

            final int englishalphabet = 26;
            int[] frequencies = new int[englishalphabet];

            first = first.toLowerCase();
            for (var i = 0; i < first.length(); i++)
                frequencies[first.charAt(i) - 'a']++;

            second = second.toLowerCase();
            for (var i = 0; i < second.length(); i++) {
                var index = second.charAt(i) - 'a';
                if (frequencies[index] == 0)
                    return false;

                frequencies[index]--;
            }

            return true;
        }

        public static void main(String[] args) {
            anagrams result = new anagrams();
            var anagram_result = areAnagram("dog", "car");
            System.out.println(anagram_result);
        }

    }


