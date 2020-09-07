public class scratch {
    public static void main(String[] args) {


        int mas[];
        mas = new int[]{1, 8, 3, 2, 5};
        int sum = 0;
        for (int i = 0; i < mas.length; i++) {
            sum = sum + mas[i];
        }
        System.out.println(sum);
    }
}