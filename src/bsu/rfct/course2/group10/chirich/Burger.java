package bsu.rfct.course2.group10.chirich;

public class Burger  extends Food{
    private String size;
    public Burger(String size) {
        super("Бургер");
        this.size = size;
    }
    public void consume() {
        System.out.println(this + " съедено");
    }
    // Селектор для доступа к полю данных РАЗМЕР
    public String getSize() {
        return size;
    }
    // Модификатор для изменения поля данных РАЗМЕР
    public void setSize(String size) {
        this.size = size;
    }
    public boolean equals(Object arg0) {
        if (super.equals(arg0)) { // Шаг 1
            if (!(arg0 instanceof Burger)) return false; // Шаг 2
            return size.equals(((Burger)arg0).size); // Шаг 3
        } else
            return false;
    }
    public String toString() {
        return super.toString() + " размера '" + size.toUpperCase() + "'"; //функция, выз.родительский конструктор(объект)
    }
}

