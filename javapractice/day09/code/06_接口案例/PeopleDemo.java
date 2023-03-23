//˵Ӣ��Ľӿ�
interface SpeakEnglish {
    public abstract void speak();
}

//��������
abstract class People {
    private String name;
    private int age;

    public People() {
    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void sleep() {
        System.out.println("sleep");
    }

    public abstract void eat();
}

//����Ľ�����
abstract class Coach extends People {
    public Coach() {
    }

    public Coach(String name, int age) {
        super(name, age);
    }

    public abstract void teach();
}

//������˶�Ա��
abstract class Player extends People {
    public Player() {
    }

    public Player(String name, int age) {
        super(name, age);
    }

    public abstract void study();
}

//ƹ���������
class PingPangCoach extends Coach implements SpeakEnglish {
    public PingPangCoach() {
    }

    public PingPangCoach(String name, int age) {
        super(name, age);
    }

    public void speak() {
        System.out.println("ƹ�������ѧ˵Ӣ��");
    }

    public void eat() {
        System.out.println("ƹ��������԰ײ˶���");
    }

    public void teach() {
        System.out.println("ƹ�����������η���ͽ���");
    }
}

//�������
class BasketBallCoach extends Coach {
    public BasketBallCoach() {
    }

    public BasketBallCoach(String name, int age) {
        super(name, age);
    }

    public void eat() {
        System.out.println("��������Ժ�����");
    }

    public void teach() {
        System.out.println("�����������δ����Ͷ��");
    }
}

//ƹ�����˶�Ա��
class PingPangPlayer extends Player implements SpeakEnglish {
    public PingPangPlayer() {
    }

    public PingPangPlayer(String name, int age) {
        super(name, age);
    }

    public void speak() {
        System.out.println("ƹ�����˶�Աѧ˵Ӣ��");
    }

    public void eat() {
        System.out.println("ƹ�����˶�Ա������������");
    }

    public void study() {
        System.out.println("ƹ�����˶�Աѧ��η���ͽ���");
    }
}

//�����˶�Ա
class BasketBallPlayer extends Player {
    public BasketBallPlayer() {
    }

    public BasketBallPlayer(String name, int age) {
        super(name, age);
    }

    public void eat() {
        System.out.println("�����˶�Ա��ţ��");
    }

    public void study() {
        System.out.println("�����˶�Աѧ��δ����Ͷ��");
    }
}

class PeopleDemo {
    public static void main(String[] args) {
        //����
        PingPangCoach ppc = new PingPangCoach("������", 50);
        ppc.eat();
        ppc.teach();
        ppc.speak();
        System.out.println("---------------------------");

        PingPangPlayer ppp = new PingPangPlayer("����", 30);
        ppp.eat();
        ppp.study();
        ppp.speak();
        System.out.println("---------------------------");

        BasketBallCoach bbc = new BasketBallCoach("�ǵ�", 60);
        bbc.eat();
        bbc.teach();
        System.out.println("---------------------------");

        BasketBallPlayer bbp = new BasketBallPlayer("�Ų���", 30);
        bbp.eat();
        bbp.study();
    }
}