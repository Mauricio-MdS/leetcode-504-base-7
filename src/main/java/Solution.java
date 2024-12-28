class Solution {
    public String convertToBase7(int num) {
        if (num == 0) return "0";

        boolean isNegative = num < 0;

        num = Math.abs(num);

        StringBuilder stringBuilder = new StringBuilder();

        while (num != 0) {
            stringBuilder.append(num % 7);
            num /= 7;
        }

        if (isNegative) stringBuilder.append("-");

        return stringBuilder.reverse().toString();
    }
}