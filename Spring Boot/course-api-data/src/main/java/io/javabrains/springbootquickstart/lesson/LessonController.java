package io.javabrains.springbootquickstart.lesson;

import io.javabrains.payload.ResponsePayload;
import io.javabrains.springbootquickstart.course.Course;
import io.javabrains.springbootquickstart.course.requests.CourseUpdateRequest;
import io.javabrains.springbootquickstart.topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import javax.management.RuntimeErrorException;

@RestController
public class LessonController {
	
	@Autowired
	private LessonService lessonService;
	
	//get all lessons corresponding to course
	@RequestMapping("/topics/{topicId}/courses/{courseId}/lesson")
	public List<Lesson> getAllLessons(@PathVariable String courseId) {
		return lessonService.getAllLessons(courseId);
	}
		
	//get lesson corresponding to course lessonId
	@RequestMapping("/topics/{topicId}/courses/{courseId}/lesson/{lessonId}")
	public Lesson getLesson(@PathVariable String lessonId) {
		return lessonService.getLesson(lessonId);
	}
	
	//add course & topic to lesson class & save to database
	@RequestMapping(method=RequestMethod.POST, value="/topics/{topicId}/courses/{courseId}/lesson")
	public Lesson addLesson(@RequestBody Lesson lesson, @PathVariable String topicId, @PathVariable String courseId) {
		lesson.setCourse(new Course(courseId, "", "", topicId));
		return lessonService.addLesson(lesson);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{topicId}/courses/{courseId}/lesson/{lessonId}")
	public Lesson updateLesson(@RequestBody Lesson lesson, @PathVariable String topicId, @PathVariable String courseId, @PathVariable String lessonId) {		
		lesson.setCourse(new Course(courseId, "", "", topicId));
		return lessonService.updateLesson(lesson);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{topicId}/courses/{courseId}/lesson/{lessonId}")
	public void deleteCourse(@PathVariable String lessonId) {
		lessonService.deleteLesson(lessonId);
	}
	
	@RequestMapping("/lessons")
	public List<Lesson> getCourse() {
		return lessonService.getAllLessons();
	}
}