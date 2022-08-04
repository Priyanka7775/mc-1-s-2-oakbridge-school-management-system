package com.jap.marksevaluation;
public class OakBridgeSchool {
    public int[] calculateTotalMarks(int [] math,int [] science,int[] english)
    {
       int [] totalMarks=new int[math.length];
       if(math.length>0 && science.length>0 && english.length>0){
           for (int i=0;i<math.length;i++){
               totalMarks[i]=math[i]+science[i]+english[i];
           }
       }

        return totalMarks;
    }

    public int[] calculateTotalAverageMarksForEachStudent(int [] totalMarks, int noOfSubjects){
        int [] avgTotalMarks = new int[totalMarks.length];
        if(totalMarks.length>0 && noOfSubjects>0){
            for(int i=0;i<totalMarks.length; i++){
                avgTotalMarks[i]=totalMarks[i]/noOfSubjects;
            }
        }
        return avgTotalMarks;
    }

    public int calculateAverageScienceMarks (int[] science) {
        int averageScienceMarks1 ;
        int sum = 0;
        for(int i = 0; i < science.length; i++) {

            sum = sum+ science[i];

        }
        averageScienceMarks1 = sum / 10;
        return averageScienceMarks1;
    }
    public int calculateAverageEnglishMarks (int[] english)
    {
        int averageEnglishMarks2;
        int sum1 = 0;
        for (int i = 0; i < english.length; i++) {

            sum1= sum1+ english[i];

        }
        averageEnglishMarks2 = sum1 / 10;
        return averageEnglishMarks2;
    }
    public int calculateAverageMathMarks (int[] math) {
        int averageMathMarks3;
        int sum2= 0;
        for (int i = 0; i < math.length;i++) {

            sum2= sum2+ math[i];

        }
        averageMathMarks3=sum2/10;
        return averageMathMarks3;
    }


    public static void main(String[] args) {
        //Object of OakBridgeSchool class is created
        OakBridgeSchool oakBridgeSchool = new OakBridgeSchool();
        // Initialize the arrays with 10 values of marks for each subject
        int [] math = {88,89,100,70,60,80,35,3,25,56};
        int [] science = {80,83,99,67,56,84,38,9,32,65};
        int [] english = {90,98,100,65,54,82,40,13,45,67};
        // The total number of subjects
        int noOfSubjects = 3;
        // Initialize names of 10 Students
        String[] studentNames = {"Michal","Kate","Ann","Tina","Tom","Sam","Ria","Pam","Leena","Leo"};
        // Initialize roll numbers of 10 Students
        int [] rollNos = {102,109,101,103,104,108,110,105,106,107};
        // Call the methods to calculate total marks and average marks
        int [] totalMarks = oakBridgeSchool.calculateTotalMarks(math,science,english);
        int [] averageMarks = oakBridgeSchool.calculateTotalAverageMarksForEachStudent(totalMarks,noOfSubjects);
        // Display the marks and average marks of each student

        // Call the methods to calculate average marks of science, math and social subjects of the class
        int averageScienceMarks = oakBridgeSchool.calculateAverageScienceMarks(science);
        int averageMathMarks = oakBridgeSchool.calculateAverageMathMarks(math);
        int averageEnglishMarks = oakBridgeSchool.calculateAverageEnglishMarks(english);

        // Display the average marks scored by the class in subjects
        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("-----------------------------------------------------------");
            System.out.println("Student Name: "+studentNames[i]+"            Roll no.: "+rollNos[i]  );
            System.out.println("-----------------------------------------------------------");
            System.out.println("The total Marks   - " +totalMarks[i]);
            System.out.println("The average Marks - " + averageMarks[i]);
        }

        System.out.println("-----------------------------------------------------------");
        System.out.println("Average Science Marks scored by class is  - " + averageScienceMarks);
        System.out.println("Average Math Marks scored by class is     - "     + averageMathMarks);
        System.out.println("Average English Marks scored by class is  - " + averageEnglishMarks);
    }
}
