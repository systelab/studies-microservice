package com.systelab.studies.model.study;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "result")
public class Result {

    @Id
    @GeneratedValue
    @ApiModelProperty(notes = "The database generated  ID")
    protected Long id;

    private String containerLabel;

    @ManyToOne
    @JoinColumn(name = "testid")
    private Test test;

    @ManyToOne
    @JoinColumn(name = "connectionid")
    private Connection connection;

    private Double value;
    private String resultUser;
    private Instant resultDate;
    private String instrumentAlarms;
    private String pseudoCodeValue;
    private InstrumentTestStatus status;

    @ManyToOne
    @JoinColumn(name = "material_id")
    //TODO change to LIST
    private Material material;

    private String comments;

}
