package com.jap.marksevaluation;
public class OakBridgeSchool {
    public int[] calculateTotalMarks(int [] math,int science[],int[] social)
    {
       return null;
    }

    public int[] calculateTotalAverageMarksForEachStudent(int [] totalMarks, int noOfSubjects){
       return null;
    }
    public int calculateAverageScienceMarks (int[] science)
    {
       return 0;
    }
    public int calculateAverageSocialMarks (int[] social)
    {
       return 0;
    }
    public int calculateAverageMathMarks (int[] math) {
      return 0;
    }

    public static void main(String[] args) {
        //Object of OakBridgeSchool class is created
        OakBridgeSchool oakBridgeSchool = new OakBridgeSchool();
        // Initialize the arrays with 10 values of marks for each subject
        int [] math = {};
        int [] science = {};
        int [] social = {};
        // The total number of subjects
        int noOfSubjects = 3;
        // Initialize names of 10 Students
        String[] studentNames = {};
        // Initialize roll numbers of 10 Students
        int [] rollNos = {};
        // Call the methods to calculate total marks and average marks
        int [] totalMarks = oakBridgeSchool.calculateTotalMarks(math,science,social);
        int [] averageMarks = oakBridgeSchool.calculateTotalAverageMarksForEachStudent(totalMarks,noOfSubjects);
        // Display the marks and average marks of each student

        // Call the methods to calculate average marks of science, math and social subjects of the class
        int averageScienceMarks = oakBridgeSchool.calculateAverageScienceMarks(science);
        int averageMathMarks = oakBridgeSchool.calculateAverageMathMarks(math);
        int averageSocialMarks = oakBridgeSchool.calculateAverageSocialMarks(social);

        // Display the average marks scored by the class in subjects


    }
}
