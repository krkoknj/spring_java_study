package org.example.grade_calculator;

import java.util.List;

public class GradeCalculator {

    private final Courses courses;


    public GradeCalculator(List<Course> courses) {
        this.courses = new Courses(courses);
    }

    /**
     * 요구사항
     * • 평균학점 계산 방법 = (학점수×교과목 평점)의 합계/수강신청 총학점 수
     * • MVC패턴(Model-View-Controller) 기반으로 구현한다.
     * • 일급 컬렉션 사용
     */
    public double calculateGrade() {
        //(학점수×교과목 평점)의 합계
        // 일급 컬렉션에게 위임하여 결과 값을 받아온다
        double multiplyCreditAndCourseGrade = courses.multiplyCreditAndCourseGrade();


        // 수강신청 총 학점 수
        // 일급 컬렉션에게 위임하여 결과 값을 받아온다
        int totalCompletedCredit = courses.calculateTotalCompletedCredit();

        return multiplyCreditAndCourseGrade / totalCompletedCredit;
    }


}
