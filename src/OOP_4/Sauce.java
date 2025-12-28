package OOP_4;

public class Sauce {
    private final String name;
    private final Hot hot;

    public Sauce(String name, Hot hot) {
        this.name = name;
        this.hot = hot;
    }

    @Override
    public String toString() {
        return "Соус " + name + ": " + hot;
    }
}


enum Hot {
    NOT_HOT("Не острый"), HOT("Острый"), VERY_HOT("Очень острый");

    final String description;

    private Hot(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}