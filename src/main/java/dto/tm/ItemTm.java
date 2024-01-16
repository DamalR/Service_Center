package dto.tm;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ItemTm {
    private String itemId;
    private String name;
    private String fault;
    private String itemCategory;
    private byte[] img;
}
