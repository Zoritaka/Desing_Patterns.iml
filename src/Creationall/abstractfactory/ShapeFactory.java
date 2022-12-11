package Creationall.abstractfactory;

public class ShapeFactory extends AbstractFactory {
    @Override
    IShape getShape(String shap) {
        if(shap == null){
            return null;
        }
        if(shap.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if (shap.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        } else if (shap.equalsIgnoreCase("Ellipse")) {
            return new Ellipse();
        }
        return null;
    }

    @Override
    IShape fillColor(String color) {
        return null;
    }
}
