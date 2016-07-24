public class Solution {

    public boolean isHappy(int n) {

        int num = n;
        List list = new ArrayList<Integer>();
        while (num != 1 ) {

            if (list.contains(num)) {
                return false;
            } else {
                list.add(num);
            }


            int sum = 0;
            while (num != 0)
            {
                int a = num%10;
                sum += Math.pow(a, 2);
                num /= 10;
            }
            num = sum;
        }

        return true;
    }

}
