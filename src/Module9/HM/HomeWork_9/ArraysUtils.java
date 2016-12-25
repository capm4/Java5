package Module9.HM.HomeWork_9;


import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


import static Module9.HM.HomeWork_9.Currency.UAH;
import static Module9.HM.HomeWork_9.Currency.USD;

/**
 * Created by user on 22.12.2016.
 */
public class ArraysUtils {
    public static List<Order> sortByPrizeDegres (List<Order> a){
        a.sort(Comparator.comparing(Order :: getPrice));
        return a;
    }

    //отсортируйте список за ценой заказа по возрастанию и за городом пользователя
    public static List<Order> sortByPrizeAndCity (List<Order> a){
        a.sort(Comparator.comparing(Order :: getPrice)
                .reversed()
                .thenComparing((order1, order2) -> order1.getUser().getCity().compareTo(order2.getUser().getCity())));
        return a;
    }

    //отсортируйте список за наименованием товара, идентификатором заказа, и городом пользователя

    public static List<Order> sortByItemIdenAndCity(List<Order> a){
        a.sort(Comparator.comparing(Order :: getItemName)
                .thenComparing(Order :: getShopIdentificator)
                .thenComparing((order1, order2) -> order1.getUser().getCity().compareTo(order2.getUser().getCity())));
        return a;
    }

    //удалите дублированные данные со списка
    public static List<Order> delDublicate (List<Order> a){
        a.stream()
        .distinct().forEach((p)-> System.out.println(p));
        return a;
    }

    //удалите объекты, где цена меньше 1500
    public  static  List<Order> delPrize1500 (List<Order> a){
        a.removeIf((p) -> p.getPrice() == 1500);
        a.stream().forEach((p)-> System.out.println(p));
        return  a;
    }

    //разделите список на 2 списка - заказы в долларах и в гривнах
    public static   List<Order> sortUSDandUAH(List<Order> a){
        List<Order> usdList = a.stream()
                .filter((p) -> p.getCurrency().equals(USD))
                .collect(Collectors.toList());
        usdList.forEach((p)-> System.out.println(p));
        System.out.println("");
        List<Order> uahList = a.stream()
                .filter((p)->p.getCurrency().equals(UAH))
                .collect(Collectors.toList());
        uahList.forEach((p)-> System.out.println(p));

        return a;
    }

    //разделите список на столько списков, сколько уникальных городов в User
    public static List<Order> listOfCity (List<Order> a){
        Map<String, List<Order>> ordersByCities = a.stream()
                .collect(Collectors.groupingBy(order -> order.getUser().getCity()));
        System.out.println(ordersByCities.get("LA"));
        System.out.println(ordersByCities.get("NY"));
        System.out.println(ordersByCities.get("Rome"));
        System.out.println(ordersByCities.get("London"));
        return a;
    }

    //проверьте, содержит ли сет заказ, где фамилия пользователя - “Petrov”
    public static List<Order> orderPetrov (List<Order> a){
        List<Order> Pertov = a.stream()
                .filter((p)->p.getUser().getLastName().equals("Petrov"))
                .collect(Collectors.toList());
        Pertov.forEach((p)-> System.out.println(p));

        return Pertov;
    }

    //удалите заказы в USD
    public static List<Order> delUSD (List<Order> a) {
        a.removeIf((p) -> p.getCurrency().equals(USD));
        a.forEach((p) -> System.out.println(p));
        return a;
    }

}
