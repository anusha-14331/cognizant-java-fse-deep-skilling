import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CourseCard } from '../../components/course-card/course-card';

@Component({
  selector: 'app-course-list',
  imports: [CommonModule, CourseCard],
  templateUrl: './course-list.html',
  styleUrl: './course-list.css'
})
export class CourseList {

  selectedCourseId:number | null = null;

  courses = [

    {
      id:1,
      name:'Java Programming',
      code:'JAVA101',
      credits:4
    },

    {
      id:2,
      name:'Angular',
      code:'ANG201',
      credits:3
    },

    {
      id:3,
      name:'Spring Boot',
      code:'SPR301',
      credits:4
    },

    {
      id:4,
      name:'SQL',
      code:'SQL401',
      credits:2
    },

    {
      id:5,
      name:'Microservices',
      code:'MS501',
      credits:4
    }

  ];

  onEnroll(courseId:number){

    console.log("Enrolling in course:",courseId);

    this.selectedCourseId = courseId;

  }

}