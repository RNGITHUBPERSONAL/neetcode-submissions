class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
       int[] answ = new int[temperatures.length];
int res = 0;

for (int i = 0; i < temperatures.length - 1; i++) {

    for (int j = i + 1; j < temperatures.length; j++) {

        if (temperatures[i] < temperatures[j]) {
            res = j - i;
            break;
        }
    }

    if (res != 0) {
        answ[i] = res;
        res = 0;
    } else {
        answ[i] = 0;
    }
} 
return answ;
    }
}
