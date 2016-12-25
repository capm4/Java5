package Module9.HM.HomeWork_9;


import java.util.ArrayList;
import java.util.List;


/**
 * Created by user on 22.12.2016.
 */
public class main {
    public static void main(String[] args) {
        //greats Users
        User Ivan = new User(1, "Ivan", "Ivanov", "NY", 1500);
        User Oleg = new User(2, "Oleg", "Krit", "LA", 2000);
        User Max = new User (3, "Max", "Savion", "NY", 3000);
        User Andriy = new User(4, "Andriy", "Bezlik", "LA", 1500);
        User Violeta = new User(5, "Violeta", "Violet", "London", 200);
        User Oleksiy = new User(6, "Oleksiy", "Matchen", "Rome", 1200);
        User Taras = new User(7, "Taras", "Humenuy", "London", 2000);
        User Petro = new User(8, "Petrov", "Petrov", "Rome", 3000);
        User Vita = new User(9, "Vita", "Bogach", "LA", 200);
        User Oksana = new User(10, "Oksana", "Mizera", "London", 1500);

        //greats Orders
        List<Order> orderList = new ArrayList<>();

        orderList.add(new Order(1,100, Currency.USD, "Banan", "111", Ivan));
        orderList.add(new Order(2,200,Currency.UAH, "Apple", "222", Oleg));
        orderList.add(new Order(3,300,Currency.USD, "Bear", "111", Max));
        orderList.add(new Order(4,1500,Currency.USD, "Bread", "333", Andriy));
        orderList.add(new Order(5,200,Currency.EUR, "Bread", "444", Violeta));
        orderList.add(new Order(6,400,Currency.EUR, "Bear", "111", Oleksiy));
        orderList.add(new Order(7,100,Currency.EUR, "Apple", "333", Taras));
        orderList.add(new Order(8,200,Currency.EUR, "Banan", "222", Petro));
        orderList.add(new Order(9,400,Currency.UAH, "Bear", "444", Vita));
        orderList.add(new Order(1,100,Currency.USD, "Banan", "111", Ivan));

        System.out.println("Отсортируйте список за ценой заказа по убыванию\n");
        ArraysUtils.sortByPrizeDegres(orderList);
        orderList.stream().forEach((p)-> System.out.println(p));

        System.out.println("\nОтсортируйте список за ценой заказа по возрастанию и за городом пользователя\n");
        ArraysUtils.sortByPrizeAndCity(orderList);
        orderList.stream().forEach((p)-> System.out.println(p));

        System.out.println("\n отсортируйте список за наименованием товара, идентификатором заказа, и городом пользователя \n");
        ArraysUtils.sortByItemIdenAndCity(orderList);
        orderList.stream().forEach((p) -> System.out.println(p));

        System.out.println("\nудалите дублированные данные со списка\n");
        ArraysUtils.delDublicate(orderList);

        System.out.println("\nудалите объекты, где цена меньше 1500\n");
        ArraysUtils.delPrize1500(orderList);

        System.out.println("\nразделите список на 2 списка - заказы в долларах и в гривнах\n");
        ArraysUtils.sortUSDandUAH(orderList);

        System.out.println("\nразделите список на столько списков, сколько уникальных городов в User\n");
        ArraysUtils.listOfCity(orderList);

        System.out.println("\nпроверьте, содержит ли сет заказ, где фамилия пользователя - “Petrov”\n");
        ArraysUtils.orderPetrov(orderList);

        System.out.println("\nудалите заказы в USD\n");
        ArraysUtils.delUSD(orderList);
    }
}
