/**
 * 题目描述
 * 对于一个字符串，请设计一个算法，判断其是否为一个合法的括号串
 * 给定一个字符串A和它的长度n，请返回一个bool值代表它是否为一个合法的括号串
 */

import java.util.*;

public class Parenthesis {
    public boolean chkParenthesis(String A, int n) {
        // write code here
        if(null == A || 0 == n) {
            return true;
        }

        int count = 0;
        char[] ret = A.toCharArray();
        for(int i = 0;i<n;++i) {
            char tmp = ret[i];
            switch(tmp) {
                case '(':
                    ++count;
                    break;
                case ')':{
                    if(0 == count)
                        return false;
                    else
                        --count;
                }
                break;
                default:
                    return false;
            }
        }
        if(0 == count)
            return true;
        else
            return false;
    }
}