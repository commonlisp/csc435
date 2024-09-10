import static org.junit.jupiter.api.Assertions.assertEquals;

import edu.depaul.csc435.hw1.IPChecksum;

import org.junit.jupiter.api.Test;

class IPChecksumTest {
    @Test
    void testNullChecksumField() {
        assertEquals(0xd677, IPChecksum.calculate(new byte[] { 
            (byte)0x45, (byte)0x00, (byte)0x00, (byte)0x34, (byte)0xae, (byte)0x2f, (byte)0x40, (byte)0x00, 
            (byte)0x72, (byte)0x06, (byte)0x00, (byte)0x00, (byte)0x14, (byte)0xbd, (byte)0xad, (byte)0x07,
            (byte)0xc0, (byte)0xa8, (byte)0x01, (byte)0xb0 }));
    }

    @Test
    void test1() {
        assertEquals(0x35e1, IPChecksum.calculate(new byte[] {
            (byte)0x45, (byte)0x00, (byte)0x00, (byte)0x75, (byte)0x4a, (byte)0x3d, (byte)0x40, (byte)0x00,
            (byte)0x36, (byte)0x11, (byte)0x35, (byte)0xe1, (byte)0x01, (byte)0x01, (byte)0x01, (byte)0x01,
            (byte)0xc0, (byte)0xa8, (byte)0x01, (byte)0xb0}));
    }

    @Test
    void testPopulatedChecksumField() {
        assertEquals(0xd677, IPChecksum.calculate(new byte[] {
            (byte)0x45, (byte)0x00, (byte)0x00, (byte)0x34, (byte)0xae, (byte)0x2f, (byte)0x40, (byte)0x00, 
            (byte)0x72, (byte)0x06, (byte)0xd6, (byte)0x77, (byte)0x14, (byte)0xbd, (byte)0xad, (byte)0x07,
            (byte)0xc0, (byte)0xa8, (byte)0x01, (byte)0xb0 }));
    }

    @Test
    void test2() {
        assertEquals(0x0c8f, IPChecksum.calculate(new byte[] {
            (byte)0x45, (byte)0x00, (byte)0x00, (byte)0x35, (byte)0x6a, (byte)0xcf, (byte)0x40, (byte)0x00,
            (byte)0x3f, (byte)0x11, (byte)0x0c, (byte)0x8f, (byte)0xc0, (byte)0xa8, (byte)0x01, (byte)0xb0,
            (byte)0x01, (byte)0x01, (byte)0x01, (byte)0x01 }));
    }
}
