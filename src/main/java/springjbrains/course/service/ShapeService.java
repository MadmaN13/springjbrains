package springjbrains.course.service;

import springjbrains.course.core.model.DrawableShape;

import java.util.List;

/**
 * Created by NM.Rabotaev on 02.08.2017.
 */
public class ShapeService {
    private List<DrawableShape> shapes;


    //ACCESSORS
    public List<DrawableShape> getShapes() {
        return shapes;
    }
    public void setShapes(List<DrawableShape> shapes) {
        this.shapes = shapes;
    }
}
