package AtSchool;

import org.junit.Test;

public class Kotik {
    @Test
    public void example1() {
        Kotik kotik = new Kotik();
        kotik.prettiness = 9999;
        kotik.name = "Рыжый";
        kotik.weight = 6327;//в граммах

    }

    @Test
    public void example2() {
        Kotik kotik1; // Объявление переменной
        Kotik kotik2; // Объявление переменной
        kotik1 = new Kotik(); // инициализация переменной
        kotik2 = kotik1; //Переприсваивание ссылки
        kotik1.prettiness = 9999;
        kotik1.name = "Рыжый";
        kotik1.weight = 6327;//в граммах
        System.out.println(kotik2.name + " - " + kotik2.prettiness);
    }

    @Test
    public void example3() {
        Kotik kotik1; // Объявление переменной
        kotik1 = new Kotik(); // инициализация переменной
        kotik1.prettiness = 9999;
        kotik1.name = "Рыжый";
        kotik1.weight = 6327;//в граммах
        kotik1.meow = "Кря кря";
        kotik1.sayMeow();
    }

    int prettiness;
    int weight;
    String name;
    String meow;

    //Случайная сытость котика по-умолчанию[-30,10]
    int satiety = (int)(Math.random()*(40+1)) - 30;

    //Массив еды, для метода eat()
    String[] eatForCatArray = new String[]{"рыбку","телятинку","сухой корм","консервы","молоко"};


    //Конструктор без параметров, он идентичен конструктору по умолчанию, 
    //который сюда бы подставила Java,    
    // Но она его не подставит, по той причине, 
    //что ниже определяется другой конструктор, с параметрами.
    public Kotik() {
    }

    public Kotik(int prettiness, int weight, String name, String meow) {
        this.prettiness = prettiness;
        this.weight = weight;
        this.name = name;
        this.meow = meow;
    }


    void setKotik(int prettiness, String name, int weight, String meow) {
        this.prettiness = prettiness;
        this.weight = weight;
        this.name = name;
        this.meow = meow;
    }

    int giveMeMoney() {
        return 100;
    }

    void sayMeow() {
        System.out.println(name + " говорит " + meow);
    }

    void play() {
        if (satiety > 0) {
            System.out.println("Котик играет");
        } else {
            System.out.println("Котик не хочет играть, он голодный, покормим его");
            eat();
            System.out.println("Теперь сытость котика = "+ satiety);
        }
    }

    void sleep() {
        if (satiety > 0) {
            System.out.println("Котик спит");
        } else {
            System.out.println("Котик не хочет спать, он голодный, покормим его");
            eat();
            System.out.println("Теперь сытость котика = "+ satiety);
        }
    }

    void chaseMouse() {
        if (satiety > 0) {
            System.out.println("Котик гоняет мышку");
        } else {
            System.out.println("Котик не хочет гонять мышку, он голодный, покормим его");
            eat();
            System.out.println("Теперь сытость котика = "+ satiety);
        }
    }

    void meow() {
        if (satiety > 0) {
            System.out.println("Котик мяукает");
        } else {
            System.out.println("Котик не хочет мяукать, он голодный, покормим его");
            eat();
            System.out.println("Теперь сытость котика = "+ satiety);
        }
    }

    void run() {
        if (satiety > 0) {
            System.out.println("Котик бегает");
        } else {
            System.out.println("Котик не хочет бегать, он голодный, покормим его");
            eat();
            System.out.println("Теперь сытость котика = "+ satiety);
        }
    }

    void vomitsWallpaper() {
        if (satiety > 0) {
            System.out.println("Котик портит обои");
        } else {
            System.out.println("Котик не хочет портить обои , он голодный, покормим его");
            eat();
            System.out.println("Теперь сытость котика = "+ satiety);
        }
    }


    void eat(Integer eat) {
        satiety = satiety + eat;
        System.out.println("Котик кушает, +"+eat+" к сытости, текущая сытость: "+satiety);
    }

    void eat(Integer eat, String nameEat) {
        satiety = satiety + eat;
        System.out.println("Котик кушает " + nameEat + ", +"+eat+" к сытости");
    }

    void eat() {

        //Генерируем случайный очко сытости[1,5]
        int randomNumber = (int) (Math.random() * 5 + 1);

        //Генерируем случайный вид пищи для кота из массива eatForCatArray
        String randomEat = eatForCatArray[randomNumber-1];

        eat(randomNumber, randomEat);
    }

    void liveAnotherDay() {
        System.out.println("Начальная сытость котика: "+ satiety);
        for (int i = 0; i<24; i++){
            int randomAction = (int) (Math.random() * 6);
            switch (randomAction){
                case 0: play(); break;
                case 1: sleep(); break;
                case 2: chaseMouse(); break;
                case 3: meow(); break;
                case 4: run(); break;
                case 5: vomitsWallpaper(); break;
            }
        }
        if (satiety>0){
            System.out.println("Котик сытый, итоговый показатель сытости: " + satiety);
        }
        else {
            System.out.println("Котик остался голодным, итоговый показатель сытости: " + satiety);
        }
    }
}
