1).give a complete description of AirPurifier class
- สี
- ระบบไล่ยุง
- น้ําหอมปรับอากาศ
- ระบบ ION
instance variables
- String color;
- 
instance methods
void turnOnATmos(){ Atmospower = true;}
void turnOffATmos(){Atmospower = false;}
void turnOnION(){ IONpower = true;}
void turnOffION(){ IONpower= false;}
void turnOnAirFresh() { Airpower = true;}
void turnOffAirFresh() { Airpower= false;}
void Showstatus(){
if(Atmospower == true){
System.out.println("----Anti mosquito working---- ");
}else{
System.out.println("----Anti mosquito stopping---- ");
}
if(IONpower == true){
System.out.println("----Anti ION working---- ");
}else{
System.out.println("----Anti ION stopping---- ");
}
if(Airpower == true){
System.out.println("----Anti Air freshener working---- ");
}else{
System.out.println("----Anti Air freshener stopping---- ");
}

}

2).for each method proposed above, how do you plan to implement it?
ทั้งสามmethod มีหลักการทํางานคล้ายกัน คือ นําเข้าข้อมูลจากผู้ใช้ ในรูปแบบของ
การเปิด-ปิด
และจะ return ค่าเมื่อshowstatus
