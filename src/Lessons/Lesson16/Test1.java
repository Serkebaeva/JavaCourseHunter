package Lessons.Lesson16;

public class Test1 {
    public static void main(String[] args) {
       // String s1 = "Hello World";
       // String s2 = "Urrraaaaaa!!!";
       // String s3 = s1.concat(s2).trim().replace("Urrraaaaaa!!!", "Ура").substring(6, 10);
        //System.out.println(s3); //Worl -> substring(6, 10) from Hello WorldУра...

        String s1 = "Drink wine. This is life eternal. This is all that youth will give you. It is the season for wine, " +
                "roses and drunken friends. Be happy for this moment. This moment is your life";
        String s2 = s1.toUpperCase();
        char c1;
        char c2;
        for(int i = 0; i < s1.length(); i++) {
            c1 = s1.charAt(i);
            c2 = s2.charAt(i);
            if(c1 != ',' && c1 != ':' && c1 != ' ' && c1 != '.' && c1 == c2) {
                System.out.println();
                System.out.print(c1);
                continue;
            }
            System.out.print(c1);
        }
        System.out.println();
    }
}


