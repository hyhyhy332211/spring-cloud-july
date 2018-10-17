package com.jk.model.zll.tree;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@lombok.ToString
public class Tree implements Serializable {
    private static final long serialVersionUID = 4032003361356701424L;

    private String id;

    private String text;

    private String href;

    private String pid;

    private Boolean leaf;

    private Boolean selectable;

    private List<Tree> nodes;
}
