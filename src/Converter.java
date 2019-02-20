public class Converter {
    private int[] convertArray;
    private int result;

    public int[] getConvertArray() {
        return convertArray;
    }

    public int getResult() {
        return result;
    }

    public void transform(String st) {
        convertArray = new int[st.length()];
        st = st.toUpperCase();

        for (int i = 0; i < st.length(); i++) {
            switch (st.charAt(i)) {
                case 'I': {
                    convertArray[i] = 1;
                    break;
                }
                case 'V': {
                    convertArray[i] = 5;
                    break;
                }
                case 'X': {
                    convertArray[i] = 10;
                    break;
                }
                case 'L': {
                    convertArray[i] = 50;
                    break;
                }
                case 'C': {
                    convertArray[i] = 100;
                    break;
                }
                case 'D': {
                    convertArray[i] = 500;
                    break;
                }
                case 'M': {
                    convertArray[i] = 1000;
                    break;
                }
                default:
                    convertArray[i] = 0;
            }
        }
    }

    public void takeArabianNumber(int[] ar) {
        int count = 0;
        result = 0;

        for (int i = 0; i < ar.length - 1; i++) {
            if (ar[i] >= ar[i + 1]) {
                result += ar[i];
                count++;
            } else {
                result += ar[i + 1] - ar[i];
                if (ar[i + 1] == 50 || ar[i + 1] == 100 || ar[i + 1] == 500 || ar[i + 1] == 1000) {
                    i++;
                    count += 2;
                }
            }
        }
        if (count == ar.length - 1) {
            result += ar[ar.length - 1];
        }
    }
}