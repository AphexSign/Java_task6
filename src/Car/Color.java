package Car;

public enum Color {
    BLACK("Черный"), WHITE("Белый"), GREEN("Зеленый"), RED("Красный"), GRAY("Серый"), BLUE("Голубой");
    private String title;

    Color(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
