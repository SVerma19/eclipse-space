package Milestone1;

import java.util.List;
import java.util.Map;

/**
 * Implements the HeuristicsInterface Class.
 */

public interface HeuristicsInterface {
    public float getRichVocab(Map<String, Integer> map, float wordCount);
    public Boolean comparePositiveNegative(List<String> data);
}
