import static java.lang.Integer.parseInt;

/**
 * Created by Rudster on 7/25/2016.
 */
public class ReportCard {

    public final String mNameOfStudent;
    public final int mGeometryGrade;
    public final int mChemistryGrade;
    public final int mEnglishGrade;
    public final int mHistoryGrade;
    public final int mPhysicalFitnessGrade;


    public ReportCard(String nameOfStudent, int geometryGrade, int chemistryGrade, int englishGrade,
                      int historyGrade, int physicalFitnessGrade) {
        this.mNameOfStudent = nameOfStudent;
        this.mGeometryGrade = geometryGrade;
        this.mChemistryGrade = chemistryGrade;
        this.mEnglishGrade = englishGrade;
        this.mHistoryGrade = historyGrade;
        this.mPhysicalFitnessGrade = physicalFitnessGrade;

    }

    public void setNameOfStudent(String mNameOfStudent) {
    }

    public void setGeometryGrade(int geometryGrade) {
    }

    public void setChemistryGrade(int chemistryGrade){

    }

    public void setEnglishGrade(int englishGrade){

    }

    public void setHistoryGrade(int historyGrade){

    }

    public void setPhysicalFitnessGrade(int physicalFitnessGrade){

    }

    public String getNameOfStudent(){
        return mNameOfStudent;
    }

    public int getGeometryGrade(){
        return mGeometryGrade;
    }

    public int getChemistryGrade(){
        return mChemistryGrade;
    }

    public int getEnglishGrade(){
        return mEnglishGrade;
    }

    public int getHistoryGrade(){
        return mHistoryGrade;
    }

    public int getPhysicalFitnessGrade(){
        return parseInt(null);
    }

    @Override
    public String toString(){
        String studentGrades = getNameOfStudent() + "grades:"
                + "\nGeometry: " + getGeometryGrade()
                + "\nChemistry: " + getChemistryGrade()
                + "\nEnglish: " + getEnglishGrade()
                + "\nHistory: " + getHistoryGrade()
                + "\nPhysical Fitness: " + getPhysicalFitnessGrade();

        return studentGrades;
    }
}
