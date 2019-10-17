package enums;

public enum EnumTest {

    ONE("1"), TWO("2"), THREE();
    private String number;
    EnumTest (String number) {
        this.number = number;
    }
    EnumTest () {}
}
