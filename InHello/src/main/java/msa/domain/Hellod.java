package msa.domain;

import java.util.*;
import lombok.*;
import msa.domain.*;
import msa.infra.AbstractEvent;

@Data
@ToString
public class Hellod extends AbstractEvent {

    private Long id;
    private String hello;

    public Hellod(Hello aggregate) {
        super(aggregate);
    }

    public Hellod() {
        super();
    }
}
