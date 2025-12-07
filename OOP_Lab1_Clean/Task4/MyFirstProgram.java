class MyFirstClass {
    public static void main(String[] s) {
        // Создаем объект MySecondClass
        MySecondClass o = new MySecondClass(0, 0);
        
        int i, j;
        for (i = 1; i <= 8; i++) {
            for(j = 1; j <= 8; j++) {
                // Устанавливаем значения полей
                o.setFirst(i);
                o.setSecond(j);
                
                // Выводим результат умножения
                System.out.print(o.multiply());
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

class MySecondClass {
    // Приватные поля
    private int first;
    private int second;
    
    // Конструктор
    public MySecondClass(int first, int second) {
        this.first = first;
        this.second = second;
    }
    
    // Методы для установки значений
    public void setFirst(int value) {
        this.first = value;
    }
    
    public void setSecond(int value) {
        this.second = value;
    }
    
    // Метод для получения результата (умножение)
    public int multiply() {
        return this.first * this.second;
    }
}