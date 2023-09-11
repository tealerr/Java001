package callFunc;

// File2.java
public class file2 {
    public static void main(String[] args) {
        // สร้างอ็อบเจ็กต์ของคลาสใน File1
        file1 file1Object = new file1();
        
        // เรียกใช้เมทอด myFunction() จาก File1
        file1Object.myFunction();
    }
}

