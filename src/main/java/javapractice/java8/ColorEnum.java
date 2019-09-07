package javapractice.java8;

/**
 * @author 16033
 */

public enum ColorEnum {
    /**
     * 颜色
     */
    RED("red"),BLUE("blue"),YELLOW("yellow"),GRAY("gray");
    private String color;

    ColorEnum(String color) {
        this.color = color;
    }

    public String getColor(){
        return color;
    }
}
