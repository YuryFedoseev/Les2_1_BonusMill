public class Main {
    public static void main(String[] args) {

        long allbonus = 10; //уже накопленные бонусы хранятся в отдельной таблице, вместо числа выполнить подстановку значения
        int trata = 20; //потраченная стоимость
        int rub = 20; //сумма за которую копятся бонусы
        int mili = 1; //сколько миль начисляется за 1 значение rub
        if (trata >= rub) {
            int newbonus = trata / rub * mili;
            allbonus = allbonus + newbonus;
            System.out.print("Число накопленных бонусных миль за данную покупку: ");
            System.out.println(newbonus);
            System.out.print("Всего бонусных миль накоплено: ");
            System.out.println(allbonus);//когда будет БД, добавить обновление значения в allbonus в случае успешного расчета
        }else {
            System.out.print("Сумма покупки не попадает под бонусную программу. Всего бонусных миль накоплено: ");
            System.out.println(allbonus);
            System.out.println("Если имеются проблемы с начислением миль, обратитесь в поддержку) ");

        }
        System.out.print("Спасибо за обращение!");
    }
}