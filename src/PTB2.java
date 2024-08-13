import java.util.Scanner;

public class PTB2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        * Tiên biến: techmasterSchool  Từ tiếng anh có nghĩa
        * Class: Từ tiếng anh có nghĩa và là danh từ, TechmasterSchool
        * Packgae: viết thường hết hoặc cách nhau bằng _ techmaster_service*/


        int arrA [][]= new int[2][2];
        int arrB [][]= new int[2][2];
        int arrC [][]= new int[2][2];
        // vì sao arrA.length = 2?
        System.out.println(arrA.length);
        // Nhập giá trị cho mảng A
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("arA["+i+"]["+j+"] = ");
                arrA[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arrA[i][j]+"\t");
            }
            System.out.println();
        };
        System.out.println("OK fine, hãy nhập giá trị cho mảng B: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("arB["+i+"]["+j+"] = ");
                arrB[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arrB[i][j]+"\t");
            }
            System.out.println();
        };

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                arrC[i][j] = arrA[i][j]+ arrB[i][j];
            }
        }
        System.out.println("Mảng C là: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arrC[i][j]+"\t");
            }
            System.out.println();
        };

        // BTVn: + Thực hiện cho ng dùng nhập và kích thước mảng k được hardcode
            //   + Thực hiện tách hàm( cách tách hàm -> Tự nghiên cứu )

    }
}
