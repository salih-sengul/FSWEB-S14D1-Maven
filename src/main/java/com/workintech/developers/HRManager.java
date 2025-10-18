package com.workintech.developers;

import java.util.Arrays;

public class HRManager extends Employee{
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(long id, String name, double salary){
        super(id,name,salary);
    }
    public HRManager(long id, String name, double salary,JuniorDeveloper[] juniorDevelopers,MidDeveloper[] midDevelopers,SeniorDeveloper[] seniorDevelopers){
        this(id,name,salary);

        this.juniorDevelopers = juniorDevelopers;
        this.midDevelopers = midDevelopers;
        this.seniorDevelopers = seniorDevelopers;
    }

    @Override
    public void work(double salary){
        System.out.println(getName()+" starts to working");
        setSalary(salary);
    }

    public void addEmployee(int index,JuniorDeveloper juniorDeveloper){
        if(index<0||index>juniorDevelopers.length){
            System.out.println("Index Out of bounds!!!");
        } else if (juniorDevelopers[index]==null) {
            juniorDevelopers[index] = juniorDeveloper;

        }else{
            System.out.println("Index is full!!!");
        }
    }

    public void addEmployee(int index,MidDeveloper midDeveloper){
        if(index<0||index>midDevelopers.length){
            System.out.println("Index Out of bounds!!!");
        } else if (midDevelopers[index]==null) {
            midDevelopers[index] = midDeveloper;

        }else{
            System.out.println("Index is full!!!");
        }
    }

    public void addEmployee(int index,SeniorDeveloper seniorDeveloper){
        if(index<0||index>seniorDevelopers.length){
            System.out.println("Index Out of bounds!!!");
        } else if (seniorDevelopers[index]==null) {
            seniorDevelopers[index] = seniorDeveloper;

        }else{
            System.out.println("Index is full!!!");
        }
    }

    @Override
    public String toString() {
        return "HRManager{" +
                "juniorDevelopers=" + Arrays.toString(juniorDevelopers) +
                ", midDevelopers=" + Arrays.toString(midDevelopers) +
                ", seniorDevelopers=" + Arrays.toString(seniorDevelopers) +
                '}';
    }
}
