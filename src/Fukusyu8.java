public class Fukusyu8 {
    public static void main(String[] args) {
        int[] t = {3,5,7,2,8,6};
        int max = t[0];
        int min = t[0];
        for (int i = 0; i < t.length; i++) {
            if (max < t[i]) {
                max = t[i];
            }
            if (min > t[i]) {
                min = t[i];
            }
        }
        System.out.println("最大値"+max+ ",最小値"+min);
    }
}
