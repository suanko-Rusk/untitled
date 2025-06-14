package Review;

public class Review26 {
    public static void main(String[] args) {
        int[] numArray = {1, 8, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 6;
        int count = 0;
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] == target) {
                count++;
            }
        }
        System.out.println("探索した値:" + target);
        System.out.println("一致した数:" + count);
    }
}
