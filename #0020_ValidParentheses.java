/*

stack : stores the most recent open bracket `(`,`{` or `[`
flags : set to 1 if bracket is open else zero

*/

class Solution {
    public boolean isValid(String s) {
        char stack[] = new char[s.length()];
        int top = -1;
        int flag1 = 0, flag2 = 0, flag3 = 0;
        for(int i = 0; i < s.length();i++)
        {
            switch(s.charAt(i))
            {
                case '(':
                    flag1++;
                    top++;
                    stack[top] = '(';
                    break;
                case ')':
                    if (stack[top] == '(')
                    {
                        flag1--;
                        top--;
                    } else return false;
                    break;
                case '{':
                    flag2++;
                    top++;
                    stack[top] = '{';
                    break;
                case '}':
                    if (stack[top] == '{')
                    {
                        flag2--;
                        top--;
                    } else return false;
                    break;
                case '[':
                    flag3++;
                    top++;
                    stack[top] = '[';
                    break;
                case ']':
                    if (stack[top] == '[')
                    {
                        flag3--;
                        top--;
                    } else return false;
                    break;
            }
        }
        return flag1 == 0 && flag2 == 0 && flag3 == 0;
    }
}