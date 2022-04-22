/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modal;

/**
 *
 * @author Admin
 */
public class VIPCustomer extends Person{
    private String LocationParty;
    private String Singer;
    public VIPCustomer( String LocationParty, String Name, int Age, String Address,String Singer) {
        super(Name, Age, Address);
        this.LocationParty = LocationParty;
        this.Singer=Singer;
    }

    public String getSinger() {
        return Singer;
    }

    public void setSinger(String Singer) {
        this.Singer = Singer;
    }

    public String getLocationParty() {
        return LocationParty;
    }

    public void setLocationParty(String LocationParty) {
        this.LocationParty = LocationParty;
    }
    public void Event(){
        System.out.println("ca sĩ biểu diễn::"+Singer);
        System.out.println("địa điểm tổ chức:"+LocationParty);
    }
    public void infoVIPCustomer(){
        InDuLieuCaNhan();
        Event();
    }
}
