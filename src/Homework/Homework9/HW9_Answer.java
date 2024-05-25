package Homework.Homework9;
// ScopeOfVariablesAAssignment-Answer : That's how I supposed to decide this assignment...

public class HW9_Answer {
    public static void abc() {
        String s1 = new String("ABC");
        String s2 = new String("DEF");
    }

    public static void main(String[] args){
        HW9_Answer a1 = new HW9_Answer();
        abc(); // variables s1 & s2 inside this method not alive, cause these are LOCAL VARIABLES....
        abc(); // variables s1 & s2 inside this method not alive, cause these are LOCAL VARIABLES....
        String s1 = new String("ABC");
        abc(); // same here....
        System.out.println(" " + a1 + " "+ s1);
    }
}
