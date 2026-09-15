class Solution {
    public String longestCommonPrefix(String[] strs) {

        StringBuilder result =new StringBuilder();//used because we are adding char one by one

        Arrays.sort(strs);//sorts array

        char[] first =strs[0].toCharArray();//converts first string to char
        char[] last =strs[strs.length-1].toCharArray();

        //comparison of char or first stirng to last string of sorted array

        for(int i =0;i <first.length;i++){
            if (first[i] != last[i])
            break;
            result.append(first[i]);
        }
        
        return result.toString();

    }
}