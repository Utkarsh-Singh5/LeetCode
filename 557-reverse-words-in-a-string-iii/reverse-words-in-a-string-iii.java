class Solution {
    public String reverseWords(String s) {
        

        String s1[]= s.split(" ");

        StringBuilder sb= new StringBuilder("");
        for(String w:s1)
        {
            sb.append((new StringBuilder(w).reverse()).append(" "));
        }return sb.toString().trim();



    }
}