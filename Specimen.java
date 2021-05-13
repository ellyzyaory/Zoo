package com.mycompany.zoo;

import java.util.LinkedList;

public class Specimen
{
    private String name;
    private int cageNumber;
    private Species toa; // "Type Of Animal"
    public Specimen( String a, int c, Species s)
    {
        setName(a);
        setCage(c);
        setTOA(s);
    }
    public void setName(String a){
        name = a;
    }
    public void setCage(int c){
        cageNumber = c;
    }
    public void setTOA(Species s){
        toa = s;
    }
    public String getName(){
        return name;
    }
    public int getCage(){
        return cageNumber;
    }
    public Species getTOA(){
        return toa;
    }

    public int countSpecimen(LinkedList<Specimen> animals, Species s) {
        int n = 0;
        for(int i = 0; i < animals.size(); i++) {
            if(s.equals(animals.get(i).getTOA())) {
                n++;
            }
        }
        return n;
    }

    public LinkedList<Specimen> makeList(LinkedList<Specimen> animals) {
        LinkedList<Specimen> list = new LinkedList<Specimen>();
        for(int i = 0; i < animals.size(); i++) {
            list.add(animals.get(i));
        }
        return list;
    }

    public LinkedList<Species> makeSpeciesList(LinkedList<Specimen> animals) {
        LinkedList<Species> list = new LinkedList<Species>();
        for (int i = 0; i < animals.size(); i++) {
            list.add(animals.get(i).getTOA());
        }
        return list;
    }

    public LinkedList<Species> makeSpeciesListUnique(LinkedList<Specimen> allSpecies) {
        LinkedList<Species> list= new LinkedList<Species>();
        for(int i = 0; i < allSpecies.size(); i++) {
            if(list.contains(allSpecies.get(i).getTOA()) == false) {
                list.add(allSpecies.get(i).getTOA());
            }
        }
        return list;
    }

    public String toString()
    {
        return name + " is a " + toa + " in cage " + cageNumber;
    }
}
