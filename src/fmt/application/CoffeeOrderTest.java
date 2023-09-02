package fmt.application;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CoffeeOrderTest {

    private final InputStream originalInput = System.in;
    private final PrintStream originalOutput = System.out;

    private ByteArrayOutputStream outputStream;
    private ByteArrayInputStream inputStream;

    @BeforeEach
    public void setUpStreams() {
        
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        
        String input = "7\n"; // Kullanıcı 7 numaralı kahveyi seçer
        inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
    }

    @AfterEach
    public void restoreStreams() {
        
        System.setIn(originalInput);
        System.setOut(originalOutput);
    }

    @Test
    public void testMainMethod() {
        
        Main.main(new String[]{});

        // Beklenen çıktı
        String expectedOutput =
                                "Kahve Menüsü:\r\n"
                                + "1. Espresso - 20 ₺\r\n"
                                + "2. Double Espresso - 29 ₺\r\n"
                                + "3. Cappuccino - 27 ₺\r\n"
                                + "4. Caffe Latte - 27 ₺\r\n"
                                + "5. Mocha - 32 ₺\r\n"
                                + "6. Americano - 25 ₺\r\n"
                                + "7. Hot Water - 5 ₺\r\n"
                                + "Lütfen içmek istediğiniz kahvenin numarasını giriniz: \r\n"
                                + "Teşekkürler kahveniz hazırlanıyor.\r\n"
                                + "Hot Water seçtiniz. Bu içeceğimiz 5 doz sıcak su içermektedir. Afiyet Olsun.\r\n"
                                + "" 
                                ;

        // Gerçek çıktı
        String actualOutput = outputStream.toString();

        // Beklenen çıktı ile gerçek çıktının karşılaştırılması
        assertEquals(expectedOutput, actualOutput, "Beklenen değer ile gerçek değer eşleşmiyor");
    }
}
