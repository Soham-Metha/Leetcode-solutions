class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while(columnNumber>0)
        {
            columnNumber--;
            sb.append((char)(columnNumber%26 + 'A'));
            columnNumber/=26;
            System.out.println(columnNumber);
        }
        return new String(sb.reverse());
    }
}