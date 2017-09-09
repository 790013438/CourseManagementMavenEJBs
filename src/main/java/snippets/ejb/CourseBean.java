package snippets.ejb;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import snippets.dto.CourseDTO;

/**
 * Session Bean implementation class CourseBean
 */
@Stateless
@Remote(CourseBeanRemote.class)
@LocalBean
public class CourseBean implements CourseBeanRemote {

    /**
     * Default constructor. 
     */
    public CourseBean() {
        // TODO Auto-generated constructor stub
    }

    public List<CourseDTO> getCourses() {
        return new ArrayList<CourseDTO>();
    }

}
