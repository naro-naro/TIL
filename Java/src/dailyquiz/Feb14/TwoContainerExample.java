package dailyquiz.Feb14;

public class TwoContainerExample {
    public static void main(String[] args) {
        TwoContainer<String, String> container = new TwoContainer<>();
        container.set("홍길동", "도적");
        String name = container.getKey();
        String job = container.getValue();

        TwoContainer<String, Interger> secondContainer = new TwoContainer<>();
        secondContainer.set("홍길동", 35);
        String name2 = secondContainer.getKey();
        Interger age = secondContainer.getValue();
    }
}
