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
public class Queue {

    Node front, rear;

    void enqueue(String adSoyad, String faturaTipi, Double faturaTutar, int oncelik, int zaman) {
        Node newNode = new Node(adSoyad,faturaTipi,faturaTutar,oncelik,zaman);
        if (front == null) {
            front = rear = newNode;

        } else {
            rear.nextNode = newNode;
            rear = newNode;
        }
    }

    Node dequeue() {
        if (front == null) {
            System.out.println("Liste bos!!");
            return null;
        } else {
            Node temp = front;
            if (front.nextNode == null) {
                front = rear = null;
            } else {
                front = front.nextNode;
            }
            return temp;
        }
    }

    int size() {
        int count = 0;
        if (front != null) {
            Node temp = front;
            while (temp != null) {
                count++;
                temp = temp.nextNode;
            }
        }
        return count;
    }

    void print() {
        Node temp = front;
        while (temp != null) {
            System.out.print(temp + " -> ");
            temp = temp.nextNode;
        }
        System.out.println("null");
    }

}
