//User function Template for Java


class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        // Reverse the string str
        int n = str.length();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            sb.append(str.charAt(n-1-i));
        }
        return sb.toString();
    }
}
