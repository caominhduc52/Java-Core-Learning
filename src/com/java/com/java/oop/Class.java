package com.java.com.java.oop;

/*
    trong thế giới thật, chúng ta sẽ thường xuyên nhìn thấy nhiều đồ
    vât mà cùng loại với nhau.
    vd như : chiếc xe đạp có nhiều loại xe đạp, xe ô tô, vợt cầu lông
    mỗi chiếc xe hay cái vợt đều được xây dựng trên một bản thiết kết
    nào đó. Trong OOP chúng ta gọi chiếc xe đạp là một thể hiện của lớp
    đối tượng xe đạp. Class là một bản thiết kế của đối tượng mà ta khởi
    tạo
 */


// ví dụ về class xe đạp
public class Class {
    private int cadence;
    private int gear;
    private int spped;

    public int getCadence() {
        return cadence;
    }

    public void setCadence(int cadence) {
        this.cadence = cadence;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getSpped() {
        return spped;
    }

    public void setSpped(int spped) {
        this.spped = spped;
    }

    public void getStates() {
        System.out.println("cadence: " + this.cadence + " gear: " + this.gear + " speed: " + this.spped);
    }

    //test methods using main
    public static void main(String[] args) {
        Class xe1 = new Class();
        Class xe2 = new Class();

        xe1.setGear(7);
        xe1.setSpped(20);
        xe1.setCadence(2);

        xe1.getStates();
    }
}
