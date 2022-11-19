/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import interfaces.InterfaceSociete;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author bhk
 */
public class SocieteTreeMap implements InterfaceSociete {

    TreeMap<Employe, Departement> map;

    public SocieteTreeMap() {
        map = new TreeMap<>();
    }

    @Override
    public void ajouterEmployeDepartement(Employe e, Departement d) {
        map.put(e, d);
    }

    @Override
    public void supprimerEmploye(Employe e) {
        map.remove(e);
    }

    @Override
    public void afficherLesEmployesLeursDepartements() {
        for (Map.Entry<Employe, Departement> e : map.entrySet()) {
            System.out.println("Employé: " + e.getKey() + "\n   Departement: " + e.getValue());
        }

    }

    @Override
    public void afficherLesEmployes() {
        for(Employe e : map.keySet())
            System.out.println(e);
    }

    @Override
    public void afficherLesDepartements() {
        for(Departement d : map.values())
            System.out.println(d);
    }

    @Override
    public void afficherDepartement(Employe e) {
            System.out.println(map.get(e));
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        return map.containsKey(e);
    }

    @Override
    public boolean rechercherDepartement(Departement e) {
        return map.containsValue(e);
    }

}
