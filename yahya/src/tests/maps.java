/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import entities.Departement;
import entities.Employe;
import entities.SocieteHashMap;
import entities.SocieteTreeMap;

/**
 *
 * @author bhk
 */
public class maps {
    public static void main(String[] args) {
        Departement d1 = new Departement(1, "dep1");
        Departement d2 = new Departement(2, "dep2");
        
        Employe e1 = new Employe("1", "1", "nom emp1", "prenom emp1");
        Employe e2 = new Employe("2", "1", "nom emp1", "prenom emp1");
        Employe e3 = new Employe("3", "1", "nom emp1", "prenom emp1");
        Employe e4 = new Employe("4", "1", "nom emp1", "prenom emp1");
        
        SocieteTreeMap societe = new SocieteTreeMap();
        
        societe.ajouterEmployeDepartement(e1, d1);
        societe.ajouterEmployeDepartement(e2, d2);
        societe.ajouterEmployeDepartement(e3, d2);
        societe.ajouterEmployeDepartement(e4, d2);
        
        societe.afficherDepartement(e1);
        
    }
    
}
