package com.example.android.reportcard;

/**
 * Created by Jaren Lynch on 6/28/2016.
 */
public class ReportCard {

    //Student name
    private String mStudent;

    //Student chemistry grade
    private String mChemistryGrade;

    //Student calculus grade
    private String mCalculusGrade;

    //Student english grade
    private String mEnglishGrade;


    /**
     * @param student is the name of the student.
     * @param chemistryGrade is the chemistry letter grade.
     * @param calculusGrade is the calculus letter grade.
     * @param englishGrade is the english letter grade
     */
    public ReportCard(String student, String chemistryGrade,
                      String calculusGrade, String englishGrade) {
        mStudent = student;
        mChemistryGrade = chemistryGrade;
        mCalculusGrade = calculusGrade;
        mEnglishGrade = englishGrade;
    }

    /**
     * Sets name to given string.
     * @param name new name
     */
    public void setmStudent(String name) {
        mStudent = name;
    }

    /**
     * Sets chemistry grade to given string.
      * @param grade new grade
     */
    public void setmChemistryGrade(String grade) {
        mChemistryGrade = grade;
    }

    /**
     * Sets calculus grade to given string.
     * @param grade new grade
     */
    public void setmCalculusGrade(String grade) {
        mCalculusGrade = grade;
    }

    /**
     * Sets english grade to given string.
     * @param grade new grade
     */
    public void setmEnglishGrade(String grade) {
        mEnglishGrade = grade;
    }

    /**
     * Get the name of the student.
     * @return name of the student.
     */
    public String getmStudent(){
        return mStudent;
    }

    /**
     * Get the chemistry letter grade
     * @return the chemistry letter grade.
     */
    public  String getmChemistryGrade() {
        return mChemistryGrade;
    }

    /**
     * Get the calculus letter grade.
     * @return the calculus letter grade.
     */
    public String getmCalculusGrade() {
        return mCalculusGrade;
    }

    /**
     * Get the english letter grade.
     * @return the english letter grade.
     */
    public String getmEnglishGrade() {
        return mEnglishGrade;
    }

    /**
     * Returns the string representation of the {@link ReportCard} object.
     */
    @Override
    public String toString() {
        return "ReportCard{" +
                "Name='" + mStudent + '\'' +
                ", Chemistry Grade='" + mChemistryGrade + '\'' +
                ", Calculus Grade='" + mCalculusGrade + '\'' +
                ", English Grade='" + mEnglishGrade + '\'' +
                '}';
    }
}
