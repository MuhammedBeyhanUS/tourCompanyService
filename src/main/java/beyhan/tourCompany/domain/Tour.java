package beyhan.tourCompany.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
public class Tour {
    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private String title;

    @Column (length = 2000)
    private String bullets;

    @Column
    private String[] keywords;

    @ManyToOne
    private TourPackage tourPackage;

    @Column
    @Enumerated
    private Difficulty difficulty;

    @Column
    @Enumerated
    private Region region;


    @Column
    private String description;

    @Column
    private String blurb; // long description

    @Column
    private Integer price;

    @Column
    private String duration;

    protected Tour(){}

}
