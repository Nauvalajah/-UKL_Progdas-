public class Output {
    public static void main(String[] args) {
        for (int i = 50; i >= 0; i--) {
            if (i > 0) {
                if ((50 - i) % 3 == 0) {
                    System.out.println(i + ". saya anak moklet");
                } else {
                    System.out.println(i + ". saya anak wikusama");
                }

                
            } else {
                System.out.println(i + ". saya lulus gak pak");
            }
        }
    }
}