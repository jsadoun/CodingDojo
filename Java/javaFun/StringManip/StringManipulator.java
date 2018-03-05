public class StringManipulator {
    public String trimAndConcat(String word1, String word2) {
            String newString = word1.trim().concat(word2.trim());
            return newString;
    }

    public Integer getIndexOrNull(String word1, char x) {
        int result = word1.indexOf(x);
            if(result < 1){
                return null;
            } else {
                return result;
            }
        }
    

    public Integer getIndexOrNull(String word1, String subword1) {
        int result = word1.indexOf(subword1);
            if(result < 1){
                return null;
            } else {
                return result;
            }
        }
    
    
    public String concatSubstring(String word1, int x, int y, String subword1) {
		String subStringWord = word1.substring(x,y);
		String newString = subStringWord.concat(subword1);
		return newString;
	}
}