package extend_lesson.relationship.service;

import extend_lesson.relationship.data.Database;
import extend_lesson.relationship.entities.Classroom;

public class ClassroomService {
    public Classroom findById(int id){
        for (Classroom classroom: Database.classrooms){
            if(classroom.getId() == id)
                return classroom;

        }
        return null;
    }
}
