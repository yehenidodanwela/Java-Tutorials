package com.Question01;

public class Student {
    private String name;
    private String ID;
    private Module[] modules;
    private int moduleCount; // Keep track of how many modules added

    public Student() {// Default Constructor
        modules = new Module[6];
        moduleCount = 0;
    }
    public Student(String name, String ID) { // Parameterized Constructor
        this.name = name;
        this.ID = ID;
        modules = new Module[6];
        moduleCount = 0;
    }
        public String getName(){
            return this.name;
        }
        public String getID(){
            return this.ID;
        }
        public void setName(String name){
            this.name = name;
        }
        public void setID(String ID){
            this.ID = ID;
    }
    public void addModule(Module module) {
        if (moduleCount < modules.length) {
            modules[moduleCount] = module;
            moduleCount++;
        } else {
            System.out.println("Cannot add more modules. Limit of 6 reached.");
        }
    }
    public void showPass() {
        for (int i = 0; i < moduleCount; i++) {
            Module m = modules[i];
            if (m.pass()) {
                System.out.println("Student passed module: " + m.getModuleCode());
            } else {
                System.out.println("Student failed module: " + m.getModuleCode());
            }
        }
    }

}

