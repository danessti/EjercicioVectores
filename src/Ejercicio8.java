public class Ejercicio8 {

    //Diseñe la figura de una mariposa empleando una secuencia de arreglos. Simbolo a emplear principal : ¶

    public static void main(String[] args) {

        String[] vector = new String[16];

        vector[0] = "                 ¶¶_    ¶¶ ";
        vector[1] = "     ¶¶¶¶¶¶       ¶¶   ¶¶ ";
        vector[2] = "    ¶¶¶¶¶¶¶¶¶      ¶  ¶";
        vector[3] = "   ¶¶¶¶¶¶¶¶¶¶¶¶    ¶_¶ ";
        vector[4] = "  ¶¶¶______¶¶¶¶   ¶    ¶¶¶¶¶";
        vector[5] = "  ¶¶¶_________¶¶_¶__¶¶¶¶¶¶¶¶¶¶ ";
        vector[6] = "  ¶¶¶_________¶¶__¶¶¶¶¶¶¶¶¶¶¶¶ ";
        vector[7] = "  ¶¶¶_________¶¶¶¶¶¶______¶¶¶¶ ";
        vector[8] = "   ¶¶_________¶¶¶_________ ¶¶¶ ";
        vector[9] = "   ¶¶________¶¶¶__________¶¶¶ ";
        vector[10] = "    ¶¶______¶¶¶__________¶¶¶ ";
        vector[11] = "     ¶¶¶___¶¶¶________ ¶¶¶¶ ";
        vector[12] = "    ¶¶¶¶¶¶_¶_  ¶   ¶¶¶¶¶¶ ";
        vector[13] = " ¶¶¶¶_ ¶¶¶      ¶¶¶ ¶¶¶¶ ";
        vector[14] = " ¶¶¶¶¶¶¶¶        ¶¶¶¶¶¶¶¶¶ ";
        vector[15] = "  ¶¶¶¶¶            ¶¶¶¶¶¶ ";

        for (int i = 0; i < 16; i++) {
            System.out.println(vector[i]);
        }

    }

}