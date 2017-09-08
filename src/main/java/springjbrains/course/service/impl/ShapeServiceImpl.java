package springjbrains.course.service.impl;

import springjbrains.course.core.model.DrawableShape;
import springjbrains.course.service.ShapeService;

import java.util.List;

/**
 * Created by NM.Rabotaev on 02.08.2017.
 */
public class ShapeServiceImpl implements ShapeService {
    private List<DrawableShape> shapes;
    //ACCESSORS
    public List<DrawableShape> getShapes() {
        return shapes;
    }
    public void setShapes(List<DrawableShape> shapes) {
        this.shapes = shapes;
    }
}
