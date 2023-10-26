package p1;

public class main {
    public static void main(String[] args){
        Phone p1 = new Phone();
        p1.setNumber("89001234567");
        p1.setModel("Redmi");
        p1.setWeight(346);
        p1.name = "Ivan";
        p1.info();
        p1.receiveCall();

        Phone p2 = new Phone();
        p2.setNumber("89001234567");
        p2.setModel("Redmi");
        p2.setWeight(346);
        p2.name = "Anna";
        p2.info();
        p2.receiveCall();

        Phone p3 = new Phone();
        p3.setNumber("89001234569");
        p3.setModel("Mi A2");
        p3.setWeight(318);
        p3.name = "Oleg";
        p3.info();
        p3.receiveCall();

        Phone p4 = new Phone("89001234570", "Xiaomi", 420);
        p4.info();

        Phone p5 = new Phone("89001234571", "Apple");
        p5.info();

        Phone p6 = new Phone();
        p6.info();
    }
}
