public class Main {
    public static void main(String[] args) throws Exception {
// Создать справочник сотрудников
// Необходимо:
// Создать класс справочник сотрудников, который содержит внутри
// коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
// Табельный номер
// Номер телефона
// Имя
// Стаж
// Добавить метод, который ищет сотрудника по стажу (может быть список)
// Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
// Добавить метод, который ищет сотрудника по табельному номеру
// Добавить метод добавление нового сотрудника в справочник

Employee emp1 = new Employee(1, "Artrem", "+79684258595", 1.3);
Employee emp2 = new Employee(2, "Petr", "+79054256325", 2.0);
Employee emp3 = new Employee(3, "Ivan", "+79158575632", 5.1);
Employee emp4 = new Employee(4, "Kolya", "+7965325874", 4.2);
Employee emp5 = new Employee(5, "Sergey", "+7965326581", 1.3);


Handbook.handbookAdd(Handbook.employees,emp1);
Handbook.handbookAdd(Handbook.employees,emp2);
Handbook.handbookAdd(Handbook.employees,emp3);
Handbook.handbookAdd(Handbook.employees,emp4);
Handbook.handbookAdd(Handbook.employees,emp5);

Handbook.findEmployeeByExp(Handbook.employees, 1.3);

Handbook.findPhoneByEmployeeName(Handbook.employees, "Kolya");

Handbook.findEmployeeByBadgeNumber(Handbook.employees, 2);




    }
}
