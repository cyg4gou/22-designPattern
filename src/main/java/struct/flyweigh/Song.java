package struct.flyweigh;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Song {
    private String name;
    private Singer singer;
}
