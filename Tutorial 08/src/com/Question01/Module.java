package com.Question01;

public class Module {
    private String moduleCode;
    private double marksInClassTest;
    private double marksCoursework;

    public Module (String moduleCode, double marksInClassTest,double marksCoursework){
        this.moduleCode = moduleCode;
        this.marksInClassTest = marksInClassTest;
        this.marksCoursework = marksCoursework;
    }
    private double getFinalMark(){
        double finalMark = (marksInClassTest + marksCoursework)/2;
        return finalMark;
    }
    public boolean pass(){
        if(getFinalMark() >= 40) {
            return true;
        }
        else{
            return false;
        }
    }

    public String getModuleCode(){
        return this.moduleCode;
    }

}
