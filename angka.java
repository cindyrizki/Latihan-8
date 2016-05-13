/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan8;

/**
 *
 * @author Lenovo
 */
public class angka implements I1, D1{

    @Override
    public void methodI1() {
        System.out.println("Termasuk Bilangan INTEGER");
    }

    @Override
    public void methodD1() {
        System.out.println("Termasuk Bilangan DOUBLE");
    }
    
}
