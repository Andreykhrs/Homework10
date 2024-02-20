public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф.И.О. сотрудника - " + fullName);

        System.out.println();
        System.out.println("Задача №2");
        String upperFullName = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + upperFullName);

        System.out.println();
        System.out.println("Задача №3");

        firstName = "Семён";
        middleName = "Семёнович";
        lastName = "Иванов";
        fullName = lastName + " " + firstName + " " + middleName;
        String fixedFullName = fullName.replace("ё","е");

        System.out.println("Данные Ф. И. О. сотрудника — " + fixedFullName);


    }
}