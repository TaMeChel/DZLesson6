package p1;

public class Phone {
    private String number;
    private String model;
    private int weight;
    public String name;
    void info() {
        System.out.printf("Number: %s\t Model: %s Weight: %d\n", number, model, weight);
    }
    void receiveCall(){
        System.out.printf("Звонит: %s\n", name);
    }

    public Phone(String number, String model, int weight){
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String n, String m){
        number = n;
        model = m;
    }

    public Phone(){
        this("Number error", "model not found ", 0);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
