package Creationall.abstractfactory;

public abstract class AbstractFactory {
    abstract IShape getShape(String shap);
    abstract IShape fillColor(String color);
}
