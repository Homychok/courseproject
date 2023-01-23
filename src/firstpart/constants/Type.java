package firstpart.constants;

public enum Type {
    WORK("Рабочая"),
    PERSONAL("Личная");
    public String type;
    Type(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }
}
