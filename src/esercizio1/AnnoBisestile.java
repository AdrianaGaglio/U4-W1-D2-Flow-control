package esercizio1;

public class AnnoBisestile {

    public static boolean annoBisestile(int anno) {
        if (anno % 4 == 0) {
            if (anno % 100 == 0) {
                return anno % 400 == 0;
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int anno1 = 2024;
        int anno2 = 2025;
        System.out.println("L'anno " + anno1 + " è bisestile? " + annoBisestile(anno1));
        System.out.println("L'anno " + anno2 + " è bisestile? " + annoBisestile(anno2));
    }
}
