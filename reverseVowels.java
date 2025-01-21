class Solution {
    public String reverseVowels(String s) {

        String vowels ="aeiouAEIOU";
        List<Integer> vowelIndex = new ArrayList<>();
        char[] word = s.toCharArray();

        for(int i = 0;i<word.length;i++){
            if(vowels.indexOf(word[i])!=-1)
            vowelIndex.add(i);
        }
        int first =0;
        int last = vowelIndex.size()-1;

        while(first<last){
            int fIndex = vowelIndex.get(first);
            int lIndex = vowelIndex.get(last);
            char temp = word[fIndex];
            word[fIndex] = word[lIndex];
            word[lIndex] = temp;
            first++;
            last--;
        }

        return new String(word);
    }
}
