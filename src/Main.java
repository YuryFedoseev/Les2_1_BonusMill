public class Main {
    public static void main(String[] args) {
        int trata = 19; //потраченная стоимость
        int rub = 20; //сумма за которую копятся бонусы
        int mili = 1; //сколько миль начисляется за 1 значение rub
        if (trata >= rub) {
            int newbonus = trata / rub * mili;
            System.out.print("Число накопленных бонусных миль за данную покупку: ");
            System.out.println(newbonus);
        }else {
            System.out.print("Сумма покупки не попадает под бонусную программу. Всего бонусных миль накоплено: ");
        }
        System.out.print("Спасибо за обращение!");
    }
}