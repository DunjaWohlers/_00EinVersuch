public class _00EinVersuch {

    public static void main(String[] args) {
        // Ausgabe Hello World!
        double pinguine = 5;
        double hamster = 23;
        boolean isCool = pinguine < hamster;
        String name = "Boris";
        String name2 = "Boris";
        String[] apfel = new String[15];
        apfel[0] = "Hier könnte Ihre Zeichenkette stehn" + hamster;
        apfel[1] = "Name2";
        int[] arr = {122, 155, 135};
        double zahl;

        if (isCool) {
            zahl = hamster / pinguine;
            System.out.println("Bruch:" + apfel[0]);
        } else {
            zahl = pinguine + hamster;
            System.out.println("Summe" + zahl);
        }
        System.out.println(arr[1] + arr[2]);

        System.out.println("Das war David");
    }
}
