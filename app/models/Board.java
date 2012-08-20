package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

/**
 *
 */
@Entity
public class Board {
    @Id
    public Long id;

    public Integer size;

    public List<Integer> map;

    public Board(int size, List<Integer> map) {
        this.size = size;
        this.map = map;
    }
}
