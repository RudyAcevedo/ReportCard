/**
 * Created by Rudster on 7/25/2016.
 */
public class ReportCard {

    public String mNameOfStudent;
    public int mGeometryGrade;
    public int mChemistryGrade;
    public int mEnglishGrade;
    public int mHistoryGrade;
    public int mPhysicalFitnessGrade;
    public static final String schoolName = "Android High";


    public ReportCard(String nameOfStudent, int geometryGrade, int chemistryGrade, int englishGrade,
                      int historyGrade, int physicalFitnessGrade) {
        mNameOfStudent = nameOfStudent;
        mGeometryGrade = geometryGrade;
        mChemistryGrade = chemistryGrade;
        mEnglishGrade = englishGrade;
        mHistoryGrade = historyGrade;
        mPhysicalFitnessGrade = physicalFitnessGrade;

    }

    public void setNameOfStudent(String name) {
        this.mNameOfStudent = name;
    }

    public void setGeometryGrade(int geoGrade) {
        this.mGeometryGrade = geoGrade;
    }

    public void setChemistryGrade(int chemGrade) {
        this.mChemistryGrade = chemGrade;

    }

    public void setEnglishGrade(int engGrade) {
        this.mEnglishGrade = engGrade;

    }

    public void setHistoryGrade(int histGrade) {
        this.mHistoryGrade = histGrade;

    }

    public void setPhysicalFitnessGrade(int phyGrade) {
        mPhysicalFitnessGrade = phyGrade;

    }

    public String getNameOfStudent() {
        return mNameOfStudent;
    }

    public int getGeometryGrade() {
        return mGeometryGrade;
    }

    public int getChemistryGrade() {
        return mChemistryGrade;
    }

    public int getEnglishGrade() {
        return mEnglishGrade;
    }

    public int getHistoryGrade() {
        return mHistoryGrade;
    }

    public int getPhysicalFitnessGrade() {return mPhysicalFitnessGrade;}

    @Override
    public String toString() {
        String studentGrades = getNameOfStudent() + ", " + schoolName +  "grades:"
                + "\nGeometry: " + getGeometryGrade()
                + "\nChemistry: " + getChemistryGrade()
                + "\nEnglish: " + getEnglishGrade()
                + "\nHistory: " + getHistoryGrade()
                + "\nPhysical Fitness: " + getPhysicalFitnessGrade();

        return studentGrades;
    }
}
