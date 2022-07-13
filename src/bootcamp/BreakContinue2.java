package bootcamp;

public class BreakContinue2 {

    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            if (i == 6) {
                continue;
//                break;
            }

            System.out.println(i + " " + "Hola Mundo");
        }
        System.out.println("Fin");
    }

}
