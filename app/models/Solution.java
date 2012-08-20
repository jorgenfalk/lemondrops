package models;

import org.codehaus.jackson.JsonNode;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 */
@Entity
public class Solution {
    @Id
    public Long id;

    public String moves;
    public int size;
    public int score;



    public Solution(int size, String moves) {
        this.size = size;
        this.moves = moves;
    }

    @Override
    public String toString() {
        return "Solution{" +
                "moves='" + moves + '\'' +
                ", size=" + size +
                ", score=" + score +
                '}';
    }

    public void solve() {
        score = 10;
    }
}
