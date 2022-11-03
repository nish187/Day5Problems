public class SumZero {

    public static void main(String[] args) {
        int n[] = {1, 2, 4, -3, -1, 5, 6};

        for (int i = 0; i < n.length; i++) {
            for (int j = i + 1; j < n.length; j++) {
                for (int k = j + 1; k < n.length; k++) {
                    if (n[i] + n[j] + n[k] == 0) {
                        System.out.println("Numbers found : " + n[i] + "," + n[j] + " and " + n[k]);
                    }
                }
            }
        }
    }

}
