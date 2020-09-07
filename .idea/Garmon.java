class Scratch {
    public static void main(String[] args) {


        int mas[];
        mas = new int[]{1, 8, 3, 2, 5};
        double m = 0;
        double i;
        for (i = 1; i < mas.length; i++) {
            m = m + 1/i;
        }
        System.out.println(m);
    }
}