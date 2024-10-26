/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bus_seat_reg_system;

/**
 *
 * @author Muhammad Noman
 */
public class BSRS {
    static int [] busNo = {1,2,3,4,5};
    static int totalSeats = 30;
    static int resSeats = 13;
    int[] pastResSeats;
    
    void SetResSeats(int[] RS){
        for(int i=0;i<RS.length;i++){
            this.pastResSeats[i]=RS[i];
        }
    }
}
