package org.example;

import proxy.BanqueController;
import proxy.BanqueWS;
import proxy.Compte;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        BanqueController proxy = new BanqueWS().getBanqueControllerPort();
        System.out.println(proxy.conversionEuroToDh(7500));
        Compte cp = proxy.getCompteByCode(5);
        System.out.println("----------------------");
        System.out.println(cp.getSolde());
        System.out.println(cp.getDateCration());
        System.out.println(cp.getCode());
        System.out.println("-----------------------");
        List<Compte> compteList = proxy.listComptes();
        compteList.forEach(c->{
            System.out.println("----------------------");
            System.out.println(c.getSolde());
            System.out.println(c.getDateCration());
            System.out.println(c.getCode());
            System.out.println("-----------------------");
        });
    }
}