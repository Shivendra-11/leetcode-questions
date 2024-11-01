class Solution {
    public String addStrings(String num1, String num2) {
        
        int index1 = num1.length() - 1;
        int index2 = num2.length() - 1;
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        int carry = 0;

        while (index1 >= 0 && index2 >= 0) {
            sum = (num1.charAt(index1) - '0') + (num2.charAt(index2) - '0') + carry;
            carry = sum / 10;
            char ch = (char) ((sum % 10) + '0'); // Convert remainder to char
            sb.append(ch);
            index1--;
            index2--;
        }

        while (index1 >= 0) {
            sum = (num1.charAt(index1) - '0') + carry;
            carry = sum / 10;
            char ch = (char) ((sum % 10) + '0'); // Convert remainder to char
            sb.append(ch);
            index1--;
        }

        while (index2 >= 0) {
            sum = (num2.charAt(index2) - '0') + carry;
            carry = sum / 10;
            char ch = (char) ((sum % 10) + '0'); // Convert remainder to char
            sb.append(ch);
            index2--;
        }

        if (carry != 0) {
            sb.append((char) (carry + '0'));
        }

        return sb.reverse().toString();
    }
}
