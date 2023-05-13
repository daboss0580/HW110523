package HW110523;

public class Dergree {
    /*
    Create a class 'Degree' having a method 'getPrerequisite' that prints ""To get a degree you need high school diploma"".
Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters’. In Masters class override method 'getPrerequisite'.
Call the method by creating an object of each of the three classes.

     */
     void getPrerequisite(){
        System.out.println("To get a degree you need high school diploma");
    }
    static class Bachelors extends Dergree{

    }
    static class Masters extends Dergree{
        void getPrerequisite(){
            super.getPrerequisite();
            System.out.println("To get a Masters degree you need a Bachelor's degree");
        }

    }
}
class DegreeTester{
    public static void main(String[] args) {
            Dergree.Bachelors bachelors=new Dergree.Bachelors();
            Dergree.Masters masters=new Dergree.Masters();
            bachelors.getPrerequisite();
            masters.getPrerequisite();

}
}