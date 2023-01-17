public class Main {
    public static void main(String[] args) {

        //System.out.println("Hello world!");
        Landline l1=new Landline("556");
        Landline l2=new Landline("654");
        l1.callNumber("654");
        l2.receiveCall("654");

        System.out.println(l2.answerCall());
    }
}