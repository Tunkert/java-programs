public class Binary {
    public static void main(String[] args) {
        int j = 0;
        int k = 2;
        int nums = 30;

        int numsArr[] = new int[nums];

        for (int i = 0; i < nums; i++) {
            if (i == j) {
                numsArr[i] = 0;
                j = j + k;
                k++;
            } else {
                numsArr[i] = 1;
            }
        }
        for (int x = 0; x < nums; x++) {
            System.out.println(numsArr[x]);
        }
    }
}
