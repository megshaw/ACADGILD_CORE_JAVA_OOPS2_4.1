/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PackageTwo;

import PackageOne.PackageOneClass1;

/**
 *
 * @author meghana
 */
public class PackageOneClass2 extends PackageOneClass1 {

    public static void main(String[] args) {
        PackageOneClass2 oPackageOneClass2 = new PackageOneClass2();
        oPackageOneClass2.PackageOneClass1ProtectedMethod();
    }

}
