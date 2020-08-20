package com.pnm.annonymous;

import java.util.*;
import java.lang.*;
import java.io.*;

public class LongDictionaryWord {
    public static int fun(String s1,String s2,int n,int m)
    {
        int dp[][] = new int[n+1][m+1];
        for(int i=0;i<=n;i++)
        {
            dp[i][0] = 0;
        }
        for(int i=0;i<=m;i++)
        {
            dp[0][i] = 0;
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                if(s1.charAt(i-1) == s2.charAt(j-1))
                    dp[i][j] = 1+dp[i-1][j-1];
                else
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[n][m];
    }
    public static void main (String[] args) throws IOException {
        //code
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        for(int v=0;v<t;v++)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String[] s = br.readLine().trim().split("\\s+");
            String s1 = br.readLine().trim();
            String res = "";
            int r1 = 0;
            for(int i=0;i<n;i++)
            {
                String k = s[i];
                int r = fun(k,s1,k.length(),s1.length());
                if(r == k.length() && r>r1)
                {
                    res = k;
                    r1 = r;
                }
            }
            System.out.println(res);
        }
    }
}