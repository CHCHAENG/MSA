package msa.domain;

import java.util.*;
import lombok.*;
import msa.domain.*;
import msa.infra.AbstractEvent;

@Data
@ToString
public class Worded extends AbstractEvent {

    private Long id;

    public Worded(World aggregate) {
        super(aggregate);
    }

    public Worded() {
        super();
    }
}
