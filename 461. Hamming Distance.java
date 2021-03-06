/*
* 461. Hamming Distance
* https://leetcode.com/problems/hamming-distance/#/description
*/
/* [Solution 1] */
public class Solution {
    public int hammingDistance(int x, int y) {
        int xor = x ^ y, count = 0;  // 對x, y做xor
        while( xor != 0 ) {
            count++;
            xor &= xor - 1; // 算出結束次數的技巧, 逐步將最右邊的bit變成0, 有幾個1就需執行幾次loop
        }
        return count;
    }
}

/* [Solution 2] */
public class Solution {
    public int hammingDistance(int x, int y) {
        int xor = x ^ y, count = 0;   // 對x, y做xor
        while( xor != 0) {
            count += xor & 1; // 每次只累計尾數是1的次數
            xor >>= 1;        // 計算完後往右shift
        }
        return count;
    }
}
