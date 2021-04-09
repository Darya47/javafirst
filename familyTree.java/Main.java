public class Main {
    public static void main(String[]args){
        Person maksim = new Person("Максим", 73, null,null);
        Person nika = new Person("Ника",73,null,null);
        Person denis = new Person("Денис",75,null,null);
        Person katya = new Person("Екатерина",70,null, null);
        Person oleg = new Person ("Олег", 45, nika, maksim);
        Person olga = new Person("Ольга", 47, katya,denis);
        Person igor = new Person("Игорь", 20, olga, oleg);
        //System.out.println(igor.getMother().getName());
        igor.getInfo();

    }
}
// у человека не может быть более 100 едениц здоровья
class Person {
    private String name;
    private int age;
    private int hp;
    private Person mother;
    private Person father;

    public Person getMother() {
        return mother;
    }

    public Person getFather() {
        return father;
    }

    public Person(String name, int age, Person mother, Person father) {
        this.name = name;
        this.age = age;
        this.hp = 100;
        this.mother = mother;
        this.father = father;

    }

    void setHp(int hp) {
        if (this.hp + hp >= 100) this.hp = 100;
        else this.hp += hp;
    }

    int getHp() {
        return this.hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getInfo() {
        String info = "";
        info += "Меня зовут " + this.name + "\n" +
                "Мне " + this.age + " лет \n";
        if (this.mother != null) {
            info += "Мою маму зовут " + this.mother.name + "\n";
            if(this.mother.mother != null)
                info += "Бабушку по маминой линии зовут "+this.mother.mother.name+ "\n";
            if (this.mother.father != null)
                info += "Дедушку по маминой линии зовут "+this.mother.father.name+ "\n";
        }
        if (this.father != null) {
            info += "Моего папу зовут " + this.father.name + "\n";
            if(this.father.mother != null)
                info += "Бабушку по папиной линии  зовут "+this.father.mother.name+ "\n";
            if (this.father.father != null)
                info += "Дедушку по  папиной линии зовут "+this.father.father.name+ "\n";
        }
        System.out.println(info);
    }
}
