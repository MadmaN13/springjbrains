package springjbrains.course.service;

import springjbrains.course.core.model.DrawableShape;

import java.util.List;

/**
 * Created by NM.Rabotaev on 08.09.2017.
 */
public interface ShapeService {
    List<DrawableShape> getShapes();
}
