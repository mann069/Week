// Program to calculate average marks in PCM

class AveragePCM {
    public static void main(String[] args) {

        // Marks variables
        String name = "Sam";
        int maths = 94;
        int physics = 95;
        int chemistry = 96;
        int totalSubjects = 3;

        // Calculate total and average
        int totalMarks = maths + physics + chemistry;
        double average = (double) totalMarks / totalSubjects;

        // Display result
        System.out.println(name + "'s average mark in PCM is " + average);
    }
}