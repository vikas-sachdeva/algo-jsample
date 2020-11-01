package jsample;

import org.assertj.core.api.AssertionsForInterfaceTypes;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class HuffmanEncoderTest {

    private HuffmanEncoder huffmanEncoder = new HuffmanEncoder();

    @Test
    public void encodeTest1() {
        Map<Character, String> characterCodeMap = new HashMap<>();
        characterCodeMap.put('a', "1100");
        characterCodeMap.put('b', "1101");
        characterCodeMap.put('c', "100");
        characterCodeMap.put('d', "101");
        characterCodeMap.put('e', "111");
        characterCodeMap.put('f', "0");
        AssertionsForInterfaceTypes.assertThat(huffmanEncoder.encode(
                "aaaaabbbbbbbbbccccccccccccdddddddddddddeeeeeeeeeeeeeeeeffffffffffffffffffffffffffffffffffffffffffffff"))
                                   .containsExactlyInAnyOrderEntriesOf(characterCodeMap);
    }

    @Test
    public void encodeTest2() {
        Map<Character, String> characterCodeMap = new HashMap<>();
        characterCodeMap.put('A', "11");
        characterCodeMap.put('B', "100");
        characterCodeMap.put('C', "0");
        characterCodeMap.put('D', "101");
        AssertionsForInterfaceTypes.assertThat(huffmanEncoder.encode("DDDBCCCCCCAAAAA"))
                                   .containsExactlyInAnyOrderEntriesOf(characterCodeMap);
    }

    @Test
    public void encodeTest3() {
        Map<Character, String> characterCodeMap = new HashMap<>();
        characterCodeMap.put('i', "00");
        characterCodeMap.put('s', "01");
        characterCodeMap.put('e', "10");
        characterCodeMap.put('u', "1100");
        characterCodeMap.put('t', "11010");
        characterCodeMap.put('o', "11011");
        characterCodeMap.put('a', "111");
        AssertionsForInterfaceTypes.assertThat(huffmanEncoder.encode("aaaaaaaaaaeeeeeeeeeeeeeeeiiiiiiiiiiiiooouuuussssssssssssst"))
                                   .containsExactlyInAnyOrderEntriesOf(characterCodeMap);
    }
}
