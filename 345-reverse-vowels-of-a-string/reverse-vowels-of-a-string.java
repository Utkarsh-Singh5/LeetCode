class Solution {
    public String reverseVowels(String s) {
        
       char[] ar = {'a','e','i','o','u','A','E','I','O','U'};
        char[] f = s.toCharArray();

        int l = 0;
        int r = f.length - 1;

        while (l < r) {

            int c1 = 0, c2 = 0;

            for (int i = 0; i < ar.length; i++) {
                if (f[l] == ar[i]) c1 = 1;
                if (f[r] == ar[i]) c2 = 1;
            }

            // move left if not vowel
            if (c1 == 0) {
                l++;
            }
            // move right if not vowel
            else if (c2 == 0) {
                r--;
            }
            // both are vowels → swap
            else {
                char temp = f[l];
                f[l] = f[r];
                f[r] = temp;
                l++;
                r--;
            }
        }

        return String.valueOf(f);
    }
}