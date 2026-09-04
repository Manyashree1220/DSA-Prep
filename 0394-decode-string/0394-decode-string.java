class Solution {
    public String decodeString(String s) {

        Stack<Integer> numStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();

        String currentString = "";
        int currentNumber = 0;

        for(int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if(Character.isDigit(ch)) {

                currentNumber = currentNumber * 10 + (ch - '0');
            }

            else if(ch == '[') {

                numStack.push(currentNumber);
                stringStack.push(currentString);

                currentNumber = 0;
                currentString = "";
            }

            else if(ch == ']') {

                int repeat = numStack.pop();
                String previous = stringStack.pop();

                StringBuilder temp = new StringBuilder(previous);

                for(int j = 0; j < repeat; j++) {
                    temp.append(currentString);
                }

                currentString = temp.toString();
            }

            else {

                currentString += ch;
            }
        }

        return currentString;
    }
}