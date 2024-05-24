package Lesson8;

public class StudentStatic {
        String name;
        int course;

    // u menya est STATICHNYI VARIABlE
        static int count;

    // u menya est NE STATICHNYI VARIABLE
        int a;

    // u menya est KONSTRUKTOR
        public StudentStatic(String name2, int course2){
            count++;
            name = name2;
            course = course2;
            System.out.println("Student # "+count+ " sozdan");
        }

    // u menya est STATICHNYI METHOD
        public static void showCount(){
            System.out.println("Vsego sozdano Studentov "+count);
        }

    // u menya est NE STATICHNYI METHOD
        public  void showInfo(){
            System.out.println("Welcome to the Student class!!!");
        }

        void abc(){
            a++; // NON-STATIC & INSTANCE variable vnutri NON-STATIC methoda vyzyvaetsya ZAPROSTO...
            count++; // STATIC & INSTANCE variable vnutri NON-STATIC methoda vyzyvaetsya TOJE...
        }

        static void abcd(){
            // a++; A VOT NON-STATIC variable vnutri STATIC methoda vyzyvatsya NE MOJET NIKAK...
            //CHTOBY vse taki vyzvat' ETOT NON_STATIC VARIABLE 'a', mne nujno ubedit' compilyator ctho ob'ekt sozdan...
            // Vnutri etogo STATIC metoda mogu sozdat" ob'ekt:
            StudentStatic st2 = new StudentStatic("Petr", 1);
            // i uje posle uvelichivat.peremennuyu etogo ob'ekta...
            st2.a++;
            //t.o. NET OB"EKTA - NET INSTANCE PEREMENNOY - vot takoe vot PRAVILO.

            count++; // STATIC variable vnutri STATIC methoda vyzyvaetsya ZAPROSTO...
        }

  /*  obratite vnimanie chto MAIN toje yavlyaetsya STATICHNYM METHOD-om...
  Pochemy MAIN - samyi glavnyi method yavlyaetsya statichnymm? Potomu chto on yavlyaetsya TOCHKOI ZAPUSKA VSEI PROGRAMMY.
  S nego nachinaetsya rabota. v TOCHKE ZAPUSKA U NAS NICHEGO NET, nikakih ob'ektov net. A chtoby metod srabotal bez ob'ektov,
  my isspol'zuem statichnyi metod... V dannom slluchae poetomu metod main yavlyaetsya static, a NE NON-STATIC. Esli by on byl
  NON-STATIC, pered nim prishlos' by sozdavat' eshe OB"EKTY... A esli pered nim eshe prishlos' be sozdavat' OB"EKTY s pomoshyu
   kotoryh on by vyzyvalsya, kaakoi tofda on pervyi metod-samyi glavnyi metod s kotorogo nnachinaetsya zapusk programmy?
   Togda by zapusk programmy nachinalsya by s sozdaniya ob'ektov dlya metoda MAIN...
  */

    public static void main(String[] args) {
        /*Tochno takje i s NON_STATIC methodom abc(), smojem vyzvat ego vnutri STATIC MAIN, tol'ko esli
        sozdanim dlya nego ob'ekt pered ispol'zovaniem vnutri samogo STATIC MAIN metoda...
        * */
        StudentStatic st3 = new StudentStatic("Diana", 3);
        st3.abc();

        // a metod abcd ne prinadlejit nikokomy ob'ekty, poetomy vyzyvaetsya bez problem bez sozdaniya ob'ekta..
         abcd();

    }
}
