package io.javabrains.springbootquickstart.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
//	private List<Course> courses = new ArrayList<>(Arrays.asList(
//			new Course("Spring", "Spring Framework", "Spring Framework Description"),
//			new Course("Java", "Core Java", "Core Java Description"),
//			new Course("JavaScript", "Core JavaScript", "JavaScript Description")));
	
	public List <Course> getAllCourses(String topicId) {
		//return topics;
		List<Course> courses = new ArrayList<>();
		courseRepository.findByTopicId(topicId).forEach(courses::add);
		return courses;
	}
	
	public Course getCourse(String id) {
		//return topics.stream().filter(topic -> topic.getId().equalsIgnoreCase(id)).findFirst().get();
		return courseRepository.findById(id).orElse(null);
	}

	public void addCourse(Course course) {
		courseRepository.save(course);
	}

	public void updateCourse(Course course) {
//		for (int i=0; i < topics.size(); i++) {
//			Topic temp = topics.get(i);
//			if(temp.getId().equals(id)) {
//				topics.set(i, topic);
//				return;
//			}
//		}
		courseRepository.save(course);
	}

	public void deleteCourse(String id) {
//		for (int i = 0; i < topics.size(); i++) {
//			Topic temp = topics.get(i);
//			if(temp.getId().equals(id)) {
//				topics.remove(i);
//			}
//		}
		courseRepository.deleteById(id);
	}
}
