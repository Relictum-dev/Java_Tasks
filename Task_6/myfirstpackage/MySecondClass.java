package myfirstpackage;

public class MySecondClass {
    private int firstField;
    private int secondField;

    // Конструктор
    public MySecondClass() {
        this.firstField = 0;
        this.secondField = 0;
    }

    // Метод для установки значения первого поля
    public void setFirstField(int value) {
        this.firstField = value;
    }

    // Метод для установки значения второго поля
    public void setSecondField(int value) {
        this.secondField = value;
    }

    // Метод для вычисления суммы двух полей
    public int calculateSum() {
        return this.firstField + this.secondField;
    }
}
