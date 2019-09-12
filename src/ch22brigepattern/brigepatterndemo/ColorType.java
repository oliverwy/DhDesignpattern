package ch22brigepattern.brigepatterndemo;

public interface ColorType {
    public String setColorType(String color);
}

class Red implements ColorType {

    public String setColorType(String color) {
        return "红色";
    }
}

class Yellow implements ColorType {

    public String setColorType(String color) {
        return "黄色";
    }

}

class Green implements ColorType {

    public String setColorType(String color) {
        return "绿色";
    }
}

class Blue implements ColorType {

    public String setColorType(String color) {
        return "蓝色";
    }
}
