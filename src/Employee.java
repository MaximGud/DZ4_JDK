public class Employee {
  private double exp;
  private String name;
  private String phone;
  private int tabNum;

  public Employee(int tabNum, String name, String phone, double exp ) {
    this.tabNum = tabNum;
    this.phone = phone;
    this.name = name;
    this.exp = exp;
}

  public double getExp() {
    return exp;
  }

  public void setExp(double exp) {
    this.exp = exp;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public int getTabNum() {
    return tabNum;
  }

  public void setTabNum(int tabNum) {
    this.tabNum = tabNum;
  }

  @Override
  public String toString() {
    return "Служащий [Таб.номер=" + tabNum + ", Имя=" + name + ", Телефон=" + phone + ", Стаж=" + exp + "]";
  }
}
