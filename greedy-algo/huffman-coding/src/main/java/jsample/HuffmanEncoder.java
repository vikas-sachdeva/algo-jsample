package jsample;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class HuffmanEncoder {

    public Map<Character, String> encode(String str) {
        Map<Character, HuffmanNode> characterHuffmanNodeMap = new HashMap<>();
        PriorityQueue<HuffmanNode> queue = new PriorityQueue<>();
        for (char ch : str.toCharArray()) {
            if (characterHuffmanNodeMap.containsKey(ch)) {
                characterHuffmanNodeMap.get(ch).incrementFrequency();
            } else {
                HuffmanNode huffmanNode = new HuffmanNode();
                huffmanNode.setCharacter(ch);
                huffmanNode.incrementFrequency();
                characterHuffmanNodeMap.put(ch, huffmanNode);
            }
        }
        for (HuffmanNode huffmanNode : characterHuffmanNodeMap.values()) {
            queue.add(huffmanNode);
        }
        while (queue.size() > 1) {
            HuffmanNode node1 = queue.poll();
            HuffmanNode node2 = queue.poll();
            HuffmanNode parentNode = new HuffmanNode();
            parentNode.setFrequency(node1.getFrequency() + node2.getFrequency());
            parentNode.setLeftChild(node1);
            parentNode.setRightChild(node2);
            queue.add(parentNode);
        }
        HuffmanNode rootNode = queue.poll();
        Map<Character, String> characterCodeMap = new HashMap<>();
        traverseHuffmanTree(rootNode, characterCodeMap, "");
        return characterCodeMap;
    }

    private void traverseHuffmanTree(HuffmanNode rootNode, Map<Character, String> characterCodeMap, String code) {
        if (isLeafNode(rootNode)) {
            characterCodeMap.put(rootNode.getCharacter(), code);
            return;
        }
        traverseHuffmanTree(rootNode.getLeftChild(), characterCodeMap, code + "0");
        traverseHuffmanTree(rootNode.getRightChild(), characterCodeMap, code + "1");
    }

    private boolean isLeafNode(HuffmanNode rootNode) {
        return rootNode.getLeftChild() == null && rootNode.getRightChild() == null;
    }
}
