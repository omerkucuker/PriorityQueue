/*
* @file Dosya adı:BLM202_Proje2_OmerKucuker.jar
* @description Öncelikli Kuyruk Yapısının Kullanıldığı Java Swing uygulaması. 
* @assignment 2.Proje Ödevi
* @date 24.12.2019
* @author Ömer Faruk KÜÇÜKER - omerfaruk.kucuker@stu.fsm.edu.tr
 */
package QueueJframe;

/**
 *
 * @author küçüker
 */
public class Node {

    String AdSoyad;
    String FaturaTipi;
    Double FaturaMiktari;
    int oncelik;
    int zaman;
    Node nextNode;

    public Node(String AdSoyad, String FaturaTipi, Double FaturaMiktari, int oncelik, int zaman) {
        this.AdSoyad = AdSoyad;
        this.FaturaTipi = FaturaTipi;
        this.FaturaMiktari = FaturaMiktari;
        this.oncelik = oncelik;
        this.zaman = zaman;
    }

    public Node() {
        this.AdSoyad = AdSoyad;
        this.FaturaTipi = FaturaTipi;
        this.FaturaMiktari = FaturaMiktari;
        this.oncelik = oncelik;
        this.zaman = zaman;
    }

    @Override
    public String toString() {
        return "AdSoyad= " + AdSoyad + ", FaturaTipi= " + FaturaTipi + ", FaturaMiktari= " + FaturaMiktari + ", oncelik= " + oncelik + ", zaman= " + zaman;
    }

}
