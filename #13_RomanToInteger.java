/*

OuterMost For Loop : Iterates through the passed String starting from the right end
Middle For Loop    : Iterates through the Roman Numbers list to find the matching Roman Numeral
InnerMost For Loop : Checks if the value of the previous numeral(from the outermost loop) is less then the current numeral

Problems : bad space complexity as too many loops
           requires 4ms , can be reduced down to 3ms
*/


class Solution {
    public int romanToInt(String s) {
        char RomanNumbers[] = {'I','V','X','L','C','D','M'};
        int DecimalNumbers[] = {1,5,10,50,100,500,1000};
        int val = 0,flag = 1;
        for(int i = s.length()-1;i>=0 ;i--)
        {
            if(flag == 0)
            {
                flag = 1;
                continue;
            }
            for(int j = 0;j<RomanNumbers.length;j++)
            {
                if (s.charAt(i)==RomanNumbers[j])
                {
                    val += DecimalNumbers[j];
                    for(int k = j-1;k>=0;k--)
                    {
                        if(i-1>=0)
                        {
                            if(s.charAt(i-1) == RomanNumbers[k])
                            {
                                val -= DecimalNumbers[k];
                                flag = 0;
                                break;
                            }
                        }
                    }
                    break;
                }
            }
        }
        return val;
    }
}