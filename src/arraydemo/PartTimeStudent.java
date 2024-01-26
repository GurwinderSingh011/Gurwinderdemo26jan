/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraydemo;

/**
 *
 * @author Gurwinder Singh
 */
public class PartTimeStudent extends Student {
    private int NumOfCourses;

    public int getNumOfCourses() {
        return NumOfCourses;
    }

    public void setNumOfCourses(int NumOfCourses) {
        this.NumOfCourses = NumOfCourses;
    }

    public PartTimeStudent(int NumOfCourses, String sName, int sID) {
        super(sName, sID);
        this.NumOfCourses = NumOfCourses;
    }
    
    
}
