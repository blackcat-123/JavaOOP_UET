import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
// import your libraries

public class Week8Task2 {

    String s1 = "Lỗi File Not Found";
    String s2 = "Không có lỗi";
    String s3 = "Lỗi IO";

    /**
     * Javadoc.
     */
    public void nullPointerEx() throws NullPointerException {
        throw new NullPointerException();
    }

    public void arrayIndexOutOfBoundsEx() throws ArrayIndexOutOfBoundsException {
        throw new NullPointerException();
    }

    public void arithmeticEx() throws ArithmeticException {
        throw new NullPointerException();
    }

    public void fileNotFoundEx() throws FileNotFoundException {
        throw new FileNotFoundException(s1);
    }

    public void ioEx() throws IOException {
        throw new IOException(s3);
    }

    /**
     * javadoc.
     */
    public String nullPointerExTest() {
        try {
            nullPointerEx();
            return s2;
        } catch (NullPointerException e) {
            return "Lỗi Null Pointer"; //
        }
    }

    /**
     * hi.
     * @return error.
     */
    public String arrayIndexOutOfBoundsExTest() {
        try {
            arrayIndexOutOfBoundsEx();
            return s2;
        } catch (NullPointerException e) {
            return "Lỗi Array Index Out of Bounds";
        }
    }

    /**
     * string.
     */

    public String arithmeticExTest() {
        try {
            arithmeticEx();
            return s2;
        } catch (NullPointerException e) {
            return "Lỗi Arithmetic";
        }
    }

    /**
     * file.
     * @return error.
     */
    public String fileNotFoundExTest() {
        try {
            fileNotFoundEx();
            return s2;
        } catch (FileNotFoundException n) {
            return s1;
        }

    }

    /**
     * io.
     */

    public String ioExTest() {
        try {
            ioEx();
            return s2;
        } catch (IOException e) {
            return "Lỗi IO";
        }
    }

    public static void main(String[] args) {

    }
} 