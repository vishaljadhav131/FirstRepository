package com.vishal.service;

import java.util.ArrayList;
import java.util.List;

import com.vishal.entity.Faculty;
import com.vishal.entity.Subject;

public class FacultyService {
	
	public List<Faculty> getListOfFaculty(){
		
		//Faculty of Science
	    Faculty science = new Faculty(1,"Faculty of Science");
	    List<Subject> scienceSub = new ArrayList<Subject>();
	    scienceSub.add(new Subject(1,"Biology"));
	    scienceSub.add(new Subject(2,"Chemistry"));
	    scienceSub.add(new Subject(3,"Physics"));
	    science.setSubjects(scienceSub);
	    
	 //Faculty of Arts
        Faculty arts = new Faculty(2, "Faculty of Arts");
        List<Subject> artsSub = new ArrayList<>();
        artsSub.add(new Subject(4, "History"));
        artsSub.add(new Subject(5, "Literature"));
        artsSub.add(new Subject(6, "Philosophy"));
        arts.setSubjects(artsSub);

        //Faculty of Engineering
        Faculty engineering = new Faculty(3, "Faculty of Engineering");
        List<Subject> engineeringSub = new ArrayList<>();
        engineeringSub.add(new Subject(7, "Mechanical Engineering"));
        engineeringSub.add(new Subject(8, "Electrical Engineering"));
        engineeringSub.add(new Subject(9, "Civil Engineering"));
        engineering.setSubjects(engineeringSub);

        List<Faculty> faculties = new ArrayList<Faculty>();
        faculties.add(science);
        faculties.add(arts);
        faculties.add(engineering);

		return faculties;
	}

}
