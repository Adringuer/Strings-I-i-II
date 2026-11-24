public class ex5_s2 {
    public static void main(String[] args) {
        String[] paraules = {"casa", "ordinador", "sol", "programació", "java"};

        String mesLlarga = paraules[0];

        for (int i = 1; i < paraules.length; i++) {
            if (paraules[i].length() > mesLlarga.length()) {
                mesLlarga = paraules[i];
            }
        }

        System.out.println("La paraula més llarga és: " + mesLlarga);
        System.out.println("La seva longitud és: " + mesLlarga.length());
    }
}