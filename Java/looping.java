public class looping {
    public static void main(String args[]){
        forLoop();
        forEachLoop();
        whileLoop();
        doWhileLoop();
        breakAndContinue();
        forLength();
    }

    // ให้วน loop จนกว่าเงื่อนไขจะเป็นเท็จ
    public static void forLoop(){
        for (int i = 1; i < 5; i++) { //กำหนดเงื่อนไข
            System.out.println("Count at "+i); // ถ้าเงื่อนไขยังเป็นจริง ให้ทำงานตรงนี้ซ้ำ
        }
            System.out.println(""); //เว้นบรรทัด   
    }

    //for-each ใช้สำหรับการวนลูปผ่านคอลเลกชัน (collections) เช่น array, map
    public static void forEachLoop(){
        String[] country = {"Japan", "United States", "Thailand"}; //สร้าง array เก็บชื่อประเทศ

        // วนค่าทั้งหมดใน country array และเก็บไว้ที่ตัวแปร i
        for (String i : country) { //วนค่าใน array จนครบทุกตัว
            System.out.println("My country is "+i); //แสดงค่าของสมาชิกใน array
          }
          System.out.println("");    
    }

    // ทำงานในขณะที่เงื่อนไขเป็นจริง
    public static void whileLoop(){
        int i = 5;
        while (i>=0 ){ //กำหนดเงื่อนไข
            System.out.println("while loop countdown "+i); //ถ้า i ยังไม่น้อยกว่า 0 ให้ทำงานบรรทัดนี้ซ้ำ
            i--; //ลดค่า i รอบละ 1
        }
            System.out.println("");    
    }

    // do-while การทำงานคล้ายกับ while
    public static void doWhileLoop(){
        int i = 1; 
        do{ // ภายใน do block จะมีคำสั่งให้ทำงาน
            System.out.println(i);  //print i ไปเรื่อยๆ
            i++; //เพิ่มขึ้นครั้งละ 1
        }
        // ในขณะที่ i <5 (เงื่อนไขยังเป็นจริง)
        // ถ้า  i = 6 จะหยุดการทำงาน
        while( i <= 5);
        System.out.println("");    

    }

    // function นี้ใช้เพื่อแสดงการใช้งานตัวแปร break และ continue
    public static void breakAndContinue(){
        //นับ 1 ถึง 10
        System.out.println("Count 1 to 10 !");

        //ใช้ for loop  
        for (int i = 1; i<= 10; i++){
            if (i == 7 ){ // ให้เบรคเมื่อนับถึงครั้งที่ 7
            System.out.println("I'm use break");
            break; //ใช้เพื่อให้ออกจาก loop ทันทีโดยไม่สนใจเงื่อนไขของ loop
        }
            System.out.println(i); // print ไปเรื่อยๆจนครบเงื่อนไข
        }
        System.out.println("");    

        System.out.println("Count 1 to 5 !");
        int i = 1;

        //ใช้ while loop  
        while (i <= 5) {
            if (i == 3) { //ข้ามการนับครั้งที่ 3
                System.out.println("I'm using continue");
                i++;
                continue; //ใช้เพื่อข้ามการทำงานบางส่วนของลูป
            }
            System.out.println(i);
            i++;
        }
        System.out.println("");    
    }

    // จะใช้งานคล้ายกับ for-each แต่จะต่างตรงที่ เมื่อวนสมาชิกใน array ต้องทำการเพิ่มเลข index ทุกรอบ
    // คล้ายกับ loop พื้นฐาน กำหนดเงื่อนไขโดยใช้ .length ของ array นั้นๆ
    public static void forLength(){
        //สร้าง array ของยี่ห้อรถยนต์
        String[] cars = { "BMW", "Benz", "Ferrari", "Volvo"};

        System.out.println("Use for loop with my cars array");    
        for(int i = 0; i < cars.length; i++){ // กำหนดเงื่อนไข ให้วนสมาชิกของ array โดยเพิ่มเลข index ทีละ 1
            System.out.println("i have "+cars[i]); //i แสดงถึงตำแหน่ง index ของ array ซึ่งจะชี้ไปที่ value
        }
    }
}

