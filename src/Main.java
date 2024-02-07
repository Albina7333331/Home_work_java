//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
import java.util.HashSet;
import java.util.Set;

public class Main{
    public static void main(String[] args) {


        Laptop Apple = new Laptop();
        Apple.brend = "Apple";
        Apple.RAM = "8";
        Apple.HDD = "256";
        Apple.OS = "macOS";
        Apple.Colour = "pink";


        Laptop Lenovo = new Laptop();
        Lenovo.brend = "Lenovo";
        Lenovo.RAM = "16";
        Lenovo.HDD = "512";
        Lenovo.OS = "Windows11";
        Lenovo.Colour = "black";


        Laptop Huawei = new Laptop();
        Huawei.brend = "Huawei";
        Huawei.RAM = "16";
        Huawei.HDD = "256";
        Huawei.OS = "Windows10";
        Huawei.Colour = "black";


        Laptop Honor = new Laptop();
        Honor.brend = "Honor";
        Honor.RAM = "16";
        Honor.HDD = "512";
        Honor.OS = "Windows11";
        Honor.Colour = "grey";


        Laptop Asus = new Laptop();
        Asus.brend = "Asus";
        Asus.RAM = "16";
        Asus.HDD = "512";
        Asus.OS = "Linux";
        Asus.Colour = "white";


        Set<Laptop> laptops = new HashSet<>();
        laptops.add(Apple);
        laptops.add(Lenovo);
        laptops.add(Huawei);
        laptops.add(Honor);
        laptops.add(Asus);


        Set<Laptop> userSelection = laptops;
        try (Scanner scanner = new Scanner(System.in)) {
            int option;
            while (true) {
                System.out.println("“Введите цифру, соответствующую необходимому критерию:\n" +
                        "1 - Бренд\n" +
                        "2 - ОЗУ\n" +
                        "3 - Объем ЖД\n" +
                        "4 - Операционная система\n" +
                        "5 - Цвет\n" +
                        "6 - Распечатайте найденные модели\n" +
                        "7 - Сбросить фильтры ");
                String input = scanner.nextLine();
                option = Integer.parseInt(input);
                if (option == 1) {
                    System.out.println("Введите параметр бренд: ");
                    String brend = scanner.nextLine();
                    userSelection = filterAsBrend(userSelection, brend);
                } else if (option == 2) {
                    System.out.println("Введите параметр ОЗУ: ");
                    String ram = scanner.nextLine();
                    userSelection = filterAsRAM(userSelection, ram);
                } else if (option == 3) {
                    System.out.println("Введите параметр Объем ЖД: ");
                    String hdd = scanner.nextLine();
                    userSelection = filterAsHDD(userSelection, hdd);
                } else if (option == 4) {
                    System.out.println("Введите параметр ОП: ");
                    String os = scanner.nextLine();
                    userSelection = filterAsOS(userSelection, os);
                } else if(option == 5) {
                    System.out.println("Введите параметр цвет: ");
                    String color = scanner.nextLine();
                    userSelection = filterAsColor(userSelection, color);
                } else if(option == 6) {
                    break;
                } else if(option == 7) {
                    System.out.println("Фильтры сброшены");
                    userSelection = laptops;
                } else {
                    System.out.println("Введена неизвестная опция");
                    break; // выйти
                }
                System.out.println("Количество подходящих моделей " + userSelection.size());
            }
        } catch (NumberFormatException e) {
            System.out.println("Введена неверная опция");
            System.exit(-1);
        }
        userSelection.forEach(System.out::println);


    }
    static Set<Laptop> filterAsHDD(Set<Laptop> laptops, String HDD) {
        Set<Laptop> set = new HashSet<>();
        for (Laptop laptop : laptops) {
            if (Objects.equals(laptop.HDD, HDD)) {
                set.add(laptop);
            }
        }
        return set;
    }

    static Set<Laptop> filterAsRAM(Set<Laptop> laptops, String RAM) {
        Set<Laptop> set = new HashSet<>();
        for (Laptop laptop : laptops) {
            if (Objects.equals(laptop.RAM, RAM)) {
                set.add(laptop);
            }
        }
        return set;
    }

    static Set<Laptop> filterAsBrend(Set<Laptop> laptops, String Brend) {
        Set<Laptop> set = new HashSet<>();
        for (Laptop laptop : laptops) {
            if (Objects.equals(laptop.brend, Brend)) {
                set.add(laptop);
            }
        }
        return set;
    }

    static Set<Laptop> filterAsOS(Set<Laptop> laptops, String OS) {
        Set<Laptop> set = new HashSet<>();
        for (Laptop laptop : laptops) {
            if (Objects.equals(laptop.OS, OS)) {
                set.add(laptop);
            }
        }
        return set;
    }

    static Set<Laptop> filterAsColor(Set<Laptop> laptops, String Colour) {
        Set<Laptop> set = new HashSet<>();
        for (Laptop laptop : laptops) {
            if (Objects.equals(laptop.Colour, Colour)) {
                set.add(laptop);
            }
        }
        return set;
    }

}

