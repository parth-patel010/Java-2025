// This is class named Solution which matchest leetcode file name because class should match with file name
class Solution {
    // we are created method with public access type and return type is string the passing parameters are list of array string named scrs
    public String longestCommonPrefix(String[] srcs){
        // Checking if input is empty, if condition is true it will return empty string
        if(srcs == null || srcs.length == 0){
            return " ";
        }
        String prefix = srcs[0] // Flow

        // Using for loop to checking prefix one by one
        for(int i = 1;i<srcs.length;i++){
            while(srcs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length() - 1 ); // Flowe
                // If there is no prefix it will return empty string
                if(prefix.isEmpty()){
                return "";
                }
            }
        }
        return prefix; // If fl = fl by checking it will return prefix is fl
    }
}